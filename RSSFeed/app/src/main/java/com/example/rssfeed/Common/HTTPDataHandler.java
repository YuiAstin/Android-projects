package com.example.rssfeed.Common;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class HTTPDataHandler {
    static String stream = null;
    public HTTPDataHandler(){

    }
    public String getHTTPData(String urlString)
    {
        try{
            URL url = new URL(urlString);
            HttpsURLConnection urlConnection = (HttpsURLConnection)url.openConnection();
            if(urlConnection.getResponseCode() == HttpsURLConnection.HTTP_OK)
            {
                InputStream inputStream = new BufferedInputStream(urlConnection.getInputStream());

                BufferedReader r = new BufferedReader(new InputStreamReader(inputStream));
                StringBuilder sb = new StringBuilder();
                String line;
                while ((line = r.readLine())!=null)
                    sb.append(line);
                stream = sb.toString();
                urlConnection.disconnect();
            }
        }catch (MalformedURLException e)        {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        return stream;
    }
}
