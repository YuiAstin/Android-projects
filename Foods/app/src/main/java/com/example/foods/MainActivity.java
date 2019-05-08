package com.example.foods;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Button butt;
    TextView Street_txt ,Size_txt,Tort_txt ,Fill_txt ,Bev_txt, Sore;
    Button Butt;
    RadioButton radSizeL, radSizeM, radTortF, radTortC;
    CheckBox Beef_F ,Chicken_F ,WhiteF_F ,Cheese_F ,SeaFood_F ,Rice_F ,Beans_F ,Pico_F ,Gua_F ,LBT_F ,Soda_Bev ,Pepsi_Bev ,Coke_Bev ,Teq_Bev;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        butt = (Button)findViewById(R.id.Order_But);
        ignit();
        butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                orderSending();
            }
        });



    }
    public void ignit()
    {
        Street_txt = findViewById(R.id.Street_txt);
        Size_txt = findViewById(R.id.Size);
        Tort_txt = findViewById(R.id.Tortill);
        Fill_txt = findViewById(R.id.Filling_txt);
        Bev_txt = findViewById(R.id.Beverage_txt);
        Butt = findViewById(R.id.Order_But);
        radSizeL = findViewById(R.id.Large_size);
        radSizeM = findViewById(R.id.Small_size);
        radTortF = findViewById(R.id.flour_T);
        radTortC = findViewById(R.id.Corn_T);
        Beef_F = findViewById(R.id.Beef_F);
        Chicken_F = findViewById(R.id.Chicken_F);
        WhiteF_F = findViewById(R.id.WhiteF_F);
        Cheese_F = findViewById(R.id.Cheese_F);
        SeaFood_F = findViewById(R.id.SeaFood_F);
        Rice_F = findViewById(R.id.Rice_F);
        Beans_F = findViewById(R.id.Beans_F);
        Pico_F = findViewById(R.id.Pico_F);
        Gua_F = findViewById(R.id.Gua_F);
        LBT_F = findViewById(R.id.LBT_F);
        Soda_Bev = findViewById(R.id.Soda_Bev);
        Pepsi_Bev = findViewById(R.id.Pepsi_Bev);
        Coke_Bev = findViewById(R.id.Coke_Bev);
        Teq_Bev = findViewById(R.id.Teq_Bev);

        Soda_Bev.setText("Soda");
        Pepsi_Bev.setText("Pepsi");
        Coke_Bev.setText("Coke");
        Teq_Bev.setText("Teq");
        Beef_F.setText("Beef");
        Chicken_F.setText("Chicken");
        WhiteF_F.setText("White Fish");
        Cheese_F.setText("Cheese");
        SeaFood_F.setText("Seafood");
        Rice_F.setText("Rice");
        Beans_F.setText("Beans");
        Pico_F.setText("Pico");
        Gua_F.setText("Gua");
        LBT_F.setText("LBT");
        radTortC.setText("Corn");
        radTortF.setText("Flour");
        radSizeL.setText("Large");
        radSizeM.setText("Small");
        Butt.setText("Order nao");
        Bev_txt.setText("Beverages");
        Fill_txt.setText("Fillings");
        Street_txt.setText("312 Ventnor Avenue");
        Size_txt.setText("Size");
        Tort_txt.setText("Tortilla");
    }
    public void orderSending()
    {
        String boody = new String();
        boody += "I want to order a ";
        RadioGroup Sizerd = findViewById(R.id.Size_rd);
        RadioGroup Tortrd = findViewById(R.id.Tortill_rd);
        int a = 0;
        if(radSizeL.isChecked())
        a = 1 ;
        else  a = 2;
        if(a == 1)
        {
            boody += "Large taco ";
        }
        else { boody += "Smoll taco "; }
        if(radTortC.isChecked())
            a = 1 ;
        else  a = 2;
        if (a == 1)
        { boody += "with a Corn tort "; } else { boody += "with a Flour tort "; }
        boody += "as for filling i want ";
        int flag=1;
        if (Beef_F.isChecked()) { boody += "Beef, "; flag=0;}
        if (Chicken_F.isChecked()) { boody += "Chicken, "; flag=0;}
        if (WhiteF_F.isChecked()) { boody += "White Fish, "; flag=0;}
        if (Cheese_F.isChecked()) { boody += "Cheese, "; flag=0;}
        if (SeaFood_F.isChecked()) { boody += "SeaFood, "; flag=0;}
        if (Rice_F.isChecked()) { boody += "Rice, "; flag=0;}
        if (Beans_F.isChecked()) { boody += "Beans, "; flag=0;}
        if (Pico_F.isChecked()) { boody += "Pico, "; flag=0;}
        if (Gua_F.isChecked()) { boody += "Gua, "; flag=0;}
        if (LBT_F.isChecked()) { boody += "LBT, "; flag=0;}
        boody += "and finally i want some ";
        if (Soda_Bev.isChecked()) { boody += "Soda, "; }
        if (Pepsi_Bev.isChecked()) { boody += "Pepsi, "; }
        if (Coke_Bev.isChecked()) { boody += "Coke, "; }
        if (Teq_Bev.isChecked()) { boody += "Teq, "; }
        boody += "to go with it";
        if(flag==0) {
            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage("0946244726", null, boody,
                    null, null);
        }
        if(flag==1)
        Toast.makeText(this, "Please choose a filling",Toast.LENGTH_LONG).show();
    }
}
