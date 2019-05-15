package com.example.checkup;

import android.Manifest;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.checkup.Model.person;
import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.SimpleFormatter;

import static java.util.Calendar.getInstance;

public class MainActivity extends AppCompatActivity {

    EditText idnamba;
    Button submitButt,ButtCam, creCol;
    List<person> MarkedPeers = new ArrayList<person>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActivityCompat.requestPermissions(MainActivity.this,
                new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},
                1);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            ActivityCompat.requestPermissions(MainActivity.this,
                    new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},
                    1);
        }
        idnamba = findViewById(R.id.editText);
        submitButt = findViewById(R.id.Submit);
        ButtCam = findViewById(R.id.ButtonCamera);
        creCol = findViewById(R.id.createCol);
        creCol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                    String KQ="baffa\n";
                    File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS)+"/diemdanh.csv");
                    FileOutputStream fise = null;
                    FileInputStream fisein = null;
                    InputStreamReader inpt = null;
                    OutputStreamWriter otpt = null;
                    Date date = Calendar.getInstance().getTime();
                    SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/YYYY");
                    String dante = formatter.format(date);
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

                    try {
                        br.readLine();
                        while ((buf = br.readLine()) != null) {
                            line = buf.split(",");
                            if (line[0].contentEquals("MSSV")) {
                                if(line[line.length-1].contentEquals(dante))
                                {
                                    return;
                                }
                                for (int to = 0; to < line.length; to++)
                                    KQ += line[to] + ",";
                                KQ += dante + "\n";

                            }
                            else
                            {
                                KQ += buf+",v\n";
                            }
                        }
                    }catch (IOException e)
                    {
                        e.printStackTrace();
                    }
                    KQ+="\n";
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
                        CharSequence toat="Saved to file";
                        Toast.makeText(MainActivity.this,toat,Toast.LENGTH_LONG);
                    }catch (IOException e)
                    {
                        e.printStackTrace();
                    }

            }
        });


        idnamba.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                idnamba.setText("");
            }
        });
        submitButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String id = idnamba.getText().toString();
                ShowFaceDia(id);
            }
        });
        ButtCam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IntentIntegrator integrator = new IntentIntegrator(MainActivity.this);
                integrator.setDesiredBarcodeFormats(IntentIntegrator.ALL_CODE_TYPES);
                integrator.setPrompt("Scan your code");
                integrator.setCameraId(0);
                integrator.setBeepEnabled(false);
                integrator.setBarcodeImageEnabled(true);
                integrator.initiateScan();

            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        IntentResult result = IntentIntegrator.parseActivityResult(requestCode,resultCode,data);
        if(result != null){
            if(result.getContents() == null) {
                Toast.makeText(this, "You cancel the scanning", Toast.LENGTH_SHORT).show();
            }
            else {
                Toast.makeText(this, "You have successfully scanned the code", Toast.LENGTH_SHORT).show();
                idnamba.setText(result.getContents());
            }

        }
        else {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }
    public person readPerson(String ID)
    {
        InputStream inpt = getResources().openRawResource(R.raw.diemdanh);
        BufferedReader br = new BufferedReader(
                new InputStreamReader(inpt, Charset.forName("UTF-8"))
        );
        person peer=null;
        String line="";
        try {
            while ((line = br.readLine())!=null)
            {
                String[] tok = line.split(",");
                if(tok[0].contentEquals("MSSV"))
                {

                }else {
                    if (ID.contentEquals(tok[0])) {
                        peer = new person((tok[0]),
                                tok[1],
                                tok[2],
                                tok[3]);
                        break;
                    }
                }
            }

        }catch(IOException e){
            Log.wtf("My Activity","An Error haz okkued while reading files "+line,e);
            e.printStackTrace();
        }
            return peer;
    }
    public person readEPerson(String ID)
    {
        Context context = getApplicationContext();
        person peer =null;
        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS)+"/diemdanh.csv");
        FileInputStream fise = null;
        InputStreamReader inpt = null;
        try {
            fise = new FileInputStream(file.getPath());

        }catch(FileNotFoundException e)
        {
            return peer;
        }
        inpt = new InputStreamReader(fise, Charset.forName("UTF-8"));
        BufferedReader br = new BufferedReader(inpt);
        String line="";
        try {
            while ((line = br.readLine())!=null)
            {
                String[] tok = line.split(",");
                if(tok[0].contentEquals("MSSV"))
                {

                }else {
                    if (ID.contentEquals(tok[0])) {
                        peer = new person(tok[0],
                                tok[1],
                                tok[2],
                                tok[3]);
                        Date calen = Calendar.getInstance().getTime();
                        SimpleDateFormat formatter = new SimpleDateFormat("MM/DD/YYYY");
                        formatter.format(calen);
                        peer.setMarked(calen);
                        MarkedPeers.add(peer);
                        break;
                    }
                }
            }

        }catch(IOException e){
            Log.wtf("My Activity","An Error haz okkued while reading files "+line,e);
            e.printStackTrace();
        }
        try {
            inpt.close();
            br.close();
            fise.close();
        }catch (IOException e)
        {
            Log.wtf("My Activity","An error haz okkued while closing files connections");
            e.printStackTrace();
        }
        return peer;
    }
    public void setStuff(Dialog dia, person peer)
    {

    }
    public void ShowFace(String ID)
    {
        person peer = readPerson(ID);
        if(peer!=null)
        {
            Intent intent = new Intent(getApplicationContext(),Shower.class);
            intent.putExtra("id",peer.getMSSV());
            intent.putExtra("bd",peer.getBirthdate());
            intent.putExtra("namae",peer.getName());
            intent.putExtra("face",peer.getFace());
            this.startActivity(intent);
        }
        else
        {
            AlertDialog.Builder aDia = new AlertDialog.Builder(this);
            aDia.setTitle("Cảnh báo");
            aDia.setMessage("Không tìm thấy người có mã số "+ID+" này trong danh sách");
            aDia.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    // do nothing
                }
            });
            aDia.show();
        }
    }
    public void ShowFaceDia(String ID)
    {
        person peer = readEPerson(ID);
        if(peer!=null)
        {
            Dialog mDia = new Dialog(this);
            //inflater.finlate(mDia,this);
            mDia.setContentView(R.layout.dialog_layout);
            mDia.setTitle(peer.getName());
            TextView greet = mDia.findViewById(R.id.Greetings);
            ImageView face = mDia.findViewById(R.id.Face);
            greet.setText("Chào mừng "+peer.getName()+"\n"+
                    "MSSV: "+peer.getMSSV()+"\n"+
                    "Sinh ngày: "+peer.getBirthdate());
            LoadImageFromWebOperations chan = new LoadImageFromWebOperations();
            try {
                chan.execute(peer.getFace()).get(3000, TimeUnit.MILLISECONDS);
            }catch(TimeoutException e)
            {

            }catch (InterruptedException e)
            {

            }catch (ExecutionException e)
            {

            }
            face.setImageBitmap(chan.d);
            mDia.show();
            MarkAsArrived marker = new MarkAsArrived(MarkedPeers,this);
            marker.start();
            try {
                marker.join();
                Toast.makeText(this,"Saved To File",Toast.LENGTH_LONG).show();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        else
        {
            AlertDialog.Builder aDia = new AlertDialog.Builder(this);
            aDia.setTitle("Cảnh báo");
            aDia.setMessage("Không tìm thấy người có mã số "+ID+" này trong danh sách");
            aDia.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    // do nothing
                }
            });
            aDia.show();
        }

    }
}
