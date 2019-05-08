package com.example.foodrecipe;

import android.app.Activity;
import android.arch.core.util.Function;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

import static android.support.v4.content.ContextCompat.startActivity;


public class CustomIconLabelAdapter extends ArrayAdapter<String> {
    Context context;
    Integer[] thumbnail;
    String[] items;

    public CustomIconLabelAdapter(Context context, int layoutTobeInflated, String[] items, Integer[] thumbnail)
    {
        super(context, R.layout.mahrayout, items);
        this.context = context;
        this.thumbnail = thumbnail;
        this.items = items;
    }
    @Override
    public View getView(final int position, View convertView, final ViewGroup parent) {
        LayoutInflater inflater = ((Activity) context).getLayoutInflater();
        final View row = inflater.inflate(R.layout.mahrayout, null);
        TextView label = (TextView) row.findViewById(R.id.textView);
        final TextView rabel = (TextView) row.findViewById(R.id.textView3);
        ImageView icon = (ImageView) row.findViewById(R.id.icron);
        label.setText(items[position]);
        icon.setImageResource(thumbnail[position]);
        final Button hres = row.findViewById(R.id.Butto);
        icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hmmm = new Intent(parent.getContext(),CookingDetail.class);
                hmmm.putExtra("position",position);
                parent.getContext().startActivity(hmmm);
            }
        });
        label.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hmmm = new Intent(parent.getContext(),CookingDetail.class);
                hmmm.putExtra("position",position);
                parent.getContext().startActivity(hmmm);
            }
        });
        hres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hmmm = new Intent(parent.getContext(),DisplayHiresPic.class);
                hmmm.putExtra("position",position);
                parent.getContext().startActivity(hmmm);
            }
        });
        return row;
    }
}
