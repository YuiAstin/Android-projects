package com.example.foodrecipe;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import static android.support.v4.content.ContextCompat.startActivity;

public class MainActivity extends AppCompatActivity {

    ListView _myList;
    Integer[] bum={R.drawable.ima1,R.drawable.ima2,R.drawable.ima3,R.drawable.ima4,R.drawable.ima5,R.drawable.ima6,R.drawable.ima7,R.drawable.ima8,R.drawable.ima9,R.drawable.ima10};
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] a={"Chocolate pudding","pudding", "Blue Berry Cake","Chocolate River","Chicken and Dumplings","Meat buns","Cockatrice","Blue Cheese","Green veto","Kapprea"};
        _myList = (ListView) findViewById(R.id.Risto);
        adapter = new CustomIconLabelAdapter(this,
                R.layout.mahrayout,a, bum );
        _myList.setAdapter(adapter);
        _myList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(getApplicationContext(), DisplayHiresPic.class);
                i.putExtra("position",position);
                startActivity(i);
            }
        });

    }
}
