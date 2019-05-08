package com.example.rssfeed;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.rssfeed.Adapter.feedAdapter;
import com.example.rssfeed.Common.HTTPDataHandler;
import com.example.rssfeed.Model.RSSObject;
import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    RecyclerView recyclerView;
    RSSObject rssObject;

    private String RSS_link="http://rss.cnn.com/rss/edition.rss";
    private final String RSS2JSON="https://api.rss2json.com/v1/api.json?rss_url=";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            toolbar.setTitle("News");
        }
        setSupportActionBar(toolbar);

        recyclerView = findViewById(R.id.recyclerview);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getBaseContext(),LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);

        loadRSS();
    }
    private void loadRSS()
    {
        AsyncTask<String,String,String> loadRSSAsync = new AsyncTask<String, String, String>() {
            ProgressDialog mDialog = new ProgressDialog(MainActivity.this);

            @Override
            protected void onPreExecute() {
                mDialog.setMessage("Xin vui long cho trong giay lat...");
                mDialog.show();
            }

            @Override
            protected String doInBackground(String... strings) {
                String result;
                HTTPDataHandler http = new HTTPDataHandler();
                result = http.getHTTPData(strings[0]);
                return result;
            }

            @Override
            protected void onPostExecute(String s) {
                mDialog.dismiss();
                rssObject = new Gson().fromJson(s,RSSObject.class);
                feedAdapter adapter = new feedAdapter(rssObject,getBaseContext());
                recyclerView.setAdapter(adapter);
                adapter.notifyDataSetChanged();
            }
        };
        StringBuilder url_get_data = new StringBuilder(RSS2JSON);
        url_get_data.append(RSS_link);
        loadRSSAsync.execute(url_get_data.toString());

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.menu_refresh)
        {
            loadRSS();
        }
        if(item.getItemId() == R.id.WW)
        {
            RSS_link="http://rss.cnn.com/rss/edition_world.rss";
            loadRSS();
        }
        if(item.getItemId() == R.id.TS)
        {
            RSS_link="http://rss.cnn.com/rss/edition.rss";
            loadRSS();
        }
        if(item.getItemId() == R.id.MDE)
        {
            RSS_link="http://rss.cnn.com/rss/edition_meast.rss";
            loadRSS();
        }
        return true;
    }
}
