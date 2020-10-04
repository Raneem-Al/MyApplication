package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
/*
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;*/

public class Order_Placed extends AppCompatActivity {
    Button PlaceOrderB;
    TextView TextTotal;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_order);

        listView =findViewById(R.id.OrderList);
        TextTotal=findViewById(R.id.total);
        PlaceOrderB=findViewById(R.id.Place_Order);


    }



    public void OrderAccepted(View view) {
     /*    int total=0;
       for(Order order: Order_Placed)
        {
            total=+Integer.parseInt(order.getPrice());
        }
    }*/
    }}
