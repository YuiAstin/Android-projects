package com.example.checkup;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class Shower extends AppCompatActivity {

    ImageView facu;
    TextView greet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shower);
        greet = findViewById(R.id.bleh);
        facu = findViewById(R.id.mage);
        Bundle bundle = getIntent().getExtras();
        greet.setText("Chào mừng "+bundle.getString("namae")+"\n"+
                "MSSV: "+bundle.getInt("id")+"\n"+
                "Sinh ngày: "+bundle.getString("bd"));
        LoadImageFromWebOperations chan = new LoadImageFromWebOperations();
        try {
            chan.execute(bundle.getString("face")).get(3000, TimeUnit.MILLISECONDS);
        }catch(TimeoutException e)
        {

        }catch (InterruptedException e)
        {

        }catch (ExecutionException e)
        {

        }
        facu.setImageBitmap(chan.d);
    }

}
