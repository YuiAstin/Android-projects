package com.example.foodrecipe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class DisplayHiresPic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_hires_pic);
        Bundle extra=getIntent().getExtras();
        int pos = extra.getInt("position");
        display(pos);
    }
    public void display(int pos)
    {
        ImageView a = findViewById(R.id.intent2_image);
        if(pos==0)
            a.setImageResource(R.drawable.ima1);
        if(pos==1)
            a.setImageResource(R.drawable.ima2);
        if(pos==2)
            a.setImageResource(R.drawable.ima3);
        if(pos==3)
            a.setImageResource(R.drawable.ima4);
        if(pos==4)
            a.setImageResource(R.drawable.ima5);
        if(pos==5)
            a.setImageResource(R.drawable.ima6);
        if(pos==6)
            a.setImageResource(R.drawable.ima7);
        if(pos==7)
            a.setImageResource(R.drawable.ima8);
        if(pos==8)
            a.setImageResource(R.drawable.ima9);
        if(pos==9)
            a.setImageResource(R.drawable.ima10);

    }

}
