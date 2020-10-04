package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;




public class Shopper_statu extends AppCompatActivity{
Button btn;
TextView textOrder;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shopper_order_status);
        textOrder=findViewById(R.id.textOrder);
        btn = findViewById(R.id.backbutton);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Shopper_statu.this, MainActivity.class));
            }
        });
    }

    public void OrderAccepted(View view) {
        String s="0";
        Intent intent=new Intent(Shopper_statu.this,Order_Status.class);
        intent.putExtra("orderStatus",s);
        startActivity(intent);
    }

    public void OrderPreparing(View view) {
        String s="1";
        Intent intent=new Intent(Shopper_statu.this,Order_Status.class);
        intent.putExtra("orderStatus",s);
        startActivity(intent);
    }


    public void OrderDeliverd(View view) {
        String s="2";
        Intent intent=new Intent(Shopper_statu.this,Order_Status.class);
        intent.putExtra("orderStatus",s);
        startActivity(intent);
    }
}

