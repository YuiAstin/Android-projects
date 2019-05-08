package com.example.checkup;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;




public class LoadImageFromWebOperations extends AsyncTask<String, Void, Bitmap>
{
    private Exception exception;
    Bitmap d;
    @Override
    protected Bitmap doInBackground(String... url) {
        try {
            java.net.URL uril = new java.net.URL(url[0]);
            HttpURLConnection connection = (HttpURLConnection) uril
                    .openConnection();
            connection.setDoInput(true);
            connection.connect();
            InputStream input = connection.getInputStream();
            Bitmap myBitmap = BitmapFactory.decodeStream(input);
            d=myBitmap;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return d;
    }
}
