package com.example.myapplication;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

import static com.example.myapplication.R.layout.activity_main;


public class Order_Status extends AppCompatActivity {
    View vieoDivider,viewOrderplaced,viewPlacedSupporter,viewOrderRemaining,viewOrderdeliverd,view1,view2;
    ImageView imageOrderremaining,imageOrderPlaced,imageOrderdeliverd;
    TextView textorderPlaced,textOrderPreparing,textOrderD,textOrder;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main);

textOrder = findViewById(R.id.textOrder);



        vieoDivider=findViewById(R.id.vieoDivider);
        viewOrderplaced=findViewById(R.id.viewOrderplaced);
        viewPlacedSupporter=findViewById(R.id.viewPlacedSupporter);
        viewOrderRemaining=findViewById(R.id.viewOrderRemaining);
        viewOrderdeliverd=findViewById(R.id.viewOrderdeliverd);
        view1=findViewById(R.id.view1);
        view2=findViewById(R.id.view2);
        //for images
        imageOrderremaining=findViewById(R.id.imageOrderremaining);
        imageOrderPlaced=findViewById(R.id.imageOrderPlaced);
        imageOrderdeliverd=findViewById(R.id.imageOrderdeliverd);
        //for text
        textorderPlaced=findViewById(R.id.textorderPlaced);
        textOrderPreparing=findViewById(R.id.textOrderPreparing);
        textOrderD=findViewById(R.id.textOrderD);

        Intent intent=getIntent();
        String s=intent.getStringExtra("orderStatus");
        if (s != null) {
            getOrderStatus(s);

          btn =findViewById(R.id.btn);
          btn.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  startActivity(new Intent(Order_Status.this,MyOrder.class));
              }
          });


    }}
    //0 for complete, 1 for preparing, 2 for delivery

    @SuppressLint("UseCompatLoadingForDrawables")
    private void getOrderStatus(String orderStatus) {
        switch (orderStatus) {
            case "0": {
                float v=(float)0.25;
                float alfa = (float) 1;
                viewOrderplaced.setBackground(getResources().getDrawable(R.drawable.shape_status_complete));
                viewOrderRemaining.setBackground(getResources().getDrawable(R.drawable.shape_status_remaining));
                imageOrderPlaced.setAlpha(alfa);
                textorderPlaced.setAlpha(alfa);
                textOrderPreparing.setAlpha(v);
                viewOrderdeliverd.setAlpha(v);
                imageOrderremaining.setAlpha(v);
                imageOrderdeliverd.setAlpha(v);
                viewOrderdeliverd.setBackground(getResources().getDrawable(R.drawable.shape_status_remaining));
                textOrderD.setAlpha(v);

                break;
            }
            case "1": {
                float v = (float) 0.25;
                float alfa = (float) 1;
                viewOrderplaced.setBackground(getResources().getDrawable(R.drawable.shape_status_complete));
                viewOrderRemaining.setBackground(getResources().getDrawable(R.drawable.shape_status_complete));
                imageOrderremaining.setAlpha(alfa);
                imageOrderdeliverd.setAlpha(v);
                textOrderPreparing.setAlpha(alfa);
                textorderPlaced.setAlpha(alfa);
                textOrderD.setAlpha(v);
                viewOrderdeliverd.setBackground(getResources().getDrawable(R.drawable.shape_status_remaining));
                textOrderPreparing.setAlpha(alfa);
                view1.setBackground(getResources().getDrawable(R.drawable.shape_status_complete));

                break;
            }
            case "2": {
                float alfa = (float) 1;
                viewOrderplaced.setBackground(getResources().getDrawable(R.drawable.shape_status_complete));
                viewOrderRemaining.setBackground(getResources().getDrawable(R.drawable.shape_status_complete));
                imageOrderremaining.setAlpha(alfa);
                textOrderPreparing.setAlpha(alfa);
                viewOrderdeliverd.setBackground(getResources().getDrawable(R.drawable.shape_status_complete));
                textOrderD.setAlpha(alfa);
                view1.setBackground(getResources().getDrawable(R.drawable.shape_status_complete));
                view2.setBackground(getResources().getDrawable(R.drawable.shape_status_complete));
                break;
            }

        }}}
