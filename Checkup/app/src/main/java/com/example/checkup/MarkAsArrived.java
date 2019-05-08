package com.example.checkup;

import android.content.Context;
import android.os.Environment;
import android.os.Looper;
import android.widget.Toast;

import com.example.checkup.Model.person;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class MarkAsArrived extends Thread implements Runnable
{
    List<person> people;
    Context context;
    public MarkAsArrived(List<person> people, Context context) {
        this.people = people;
        this.context = context;
    }

    public MarkAsArrived(List<person> people) {
        this.people = people;
    }

    @Override
    public void run() {
        Marking();
        super.run();
    }

    protected void Marking() {

        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS)+"/diemdanh.csv");
        FileOutputStream fise = null;
        FileInputStream fisein = null;
        InputStreamReader inpt = null;
        OutputStreamWriter otpt = null;
        try{
            fisein = new FileInputStream(file);
            inpt = new InputStreamReader(fisein,Charset.forName("UTF-8"));

        }catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }

        BufferedReader br = new BufferedReader(inpt);
        String[] line;
        String buf;
        String KQ="";
        Date date = Calendar.getInstance().getTime();
        SimpleDateFormat formatter = new SimpleDateFormat("MM/DD/YYYY");
        String dante = formatter.format(date);
        try {
            while ((buf = br.readLine()) != null) {
                line = buf.split(",");
                if(line[line.length-1].contentEquals(dante)) {
                    if (people.size() > 0) {
                        for (int i = 0; i < people.size(); i++) {
                            String id = people.get(i).getMSSV();
                            if (line[0].contentEquals(id)) {
                                String vergil = formatter.format(people.get(i).getMarked().getTime());
                                if (vergil.contentEquals(dante)) {
                                    line[line.length - 1] = "x\n";
                                    for (int to = 0; to < line.length - 1; to++)
                                        KQ += line[to] + ",";
                                    KQ += line[line.length - 1];
                                }
                            } else {
                                KQ += buf + "\n";
                            }
                        }

                    }
                }
                else
                {
                    KQ+=buf+"\n";
                }
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fise = new FileOutputStream(file,false);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        otpt = new OutputStreamWriter(fise, Charset.forName("UTF-8"));
        BufferedWriter bw = new BufferedWriter(otpt);
        try {
            bw.write(KQ);
            bw.flush();
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            if (fise != null) {
                fise.close();
            }
            if (fisein != null) {
                fisein.close();
            }
            if (inpt != null) {
                inpt.close();
            }
            if (otpt != null) {
                otpt.close();
            }
            br.close();
            bw.close();
        }catch (IOException e)
        {
            e.printStackTrace();
        }
        Looper.prepare();
    }

}
