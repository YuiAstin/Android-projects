package com.example.mappu;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = findViewById(R.id.textView1);
        t2 = findViewById(R.id.textView2);
        t3 = findViewById(R.id.textView3);
        t4 = findViewById(R.id.textView4);
        t5 = findViewById(R.id.textView5);
        t6 = findViewById(R.id.textView6);
        t7 = findViewById(R.id.textView7);
        t8 = findViewById(R.id.textView8);
        t9 = findViewById(R.id.textView9);
        t10 = findViewById(R.id.textView10);

        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadInfo("Đại học Khoa học Tự nhiên Tp. HCM","https://www.hcmus.edu.vn","10.762889","106.682068");
            }
        });
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadInfo("Đại Học Sài Gòn","sgu.edu.vn","10.759943","106.682259");
            }
        });
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadInfo("Trường Đại học Sư Phạm TP. HCM","http://www.hcmup.edu.vn","10.761181","106.682221");
            }
        });
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadInfo("Chợ Hoa Hồ Thị Kỷ","http://chohoahothiky.com","10.764457","106.677342");
            }
        });
        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadInfo("Nhà Sách Nguyễn Văn Cừ - An Dương Vương","http://nhasachnguyenvancu.com","10.760134","106.681040");
            }
        });
        t6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadInfo("Chamichi Vietnam","https://www.chamichi.com.vn","10.760553","106.679721");
            }
        });
        t7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadInfo("Hotel Equatorial Ho Chi Minh City","https://hochiminhcity.equatorial.com/vi/","10.763343","106.679057");
            }
        });
        t8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadInfo("Nhà khách Chính phủ","https://www.facebook.com/pages/Nhà-Khách-Chính-Phủ-108-Nguyễn-Du/289639394381482","10.765385","106.679176");
            }
        });
        t9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadInfo("CLB Bơi lội Lam Sơn","http://phuong4quan5.gov.vn/ho-boi-lam-son-tran-binh-trong/","10.762034","106.680733");
            }
        });
        t10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadInfo("Trường trung học Thực Hành Sài Gòn","http://thuchanhsaigon.edu.vn","10.760929","106.679794");
            }
        });
    }
    public void loadInfo(String name,final String uri,final String lat,final String longi)
    {
        final AlertDialog.Builder mDia = new AlertDialog.Builder(this);
        mDia.setTitle(name);
        AlertDialog dia = mDia.create();
        final float longitude = Float.parseFloat(longi);
        final float latitude = Float.parseFloat(lat);
        mDia.setPositiveButton("Moar info", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                startActivity(intent);
            }
        });
        mDia.setNegativeButton("Map it", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String urine = String.format(Locale.ENGLISH,"https://www.google.com/maps/place/%f+%f",latitude,longitude);
                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse(urine));
                startActivity(intent);
            }
        });
        mDia.show();
    }
}
