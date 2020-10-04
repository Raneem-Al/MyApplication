package com.example.myapplication;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import static com.example.myapplication.R.layout.shopper_order_status;

public class DatabaseR extends AppCompatActivity {

    ListView List;
    TextView a,b,c;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(shopper_order_status);
        List = findViewById(R.id.list);
        a = findViewById(R.id.textViewPersonName2);
        b = findViewById(R.id.textViewPersonNum);
        c = findViewById(R.id.textLocation);

        DatabaseReference rootRef = FirebaseDatabase.getInstance().getReference();
        final DatabaseReference userD = rootRef.child("User");
        ValueEventListener eventListener = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                    String username = dataSnapshot.child("username").getValue(String.class);
                    String phone = dataSnapshot.child("phone").getValue(String.class);
                    String address = dataSnapshot.child("address").getValue(String.class);

                    a.setText(username);
                    b.setText(phone);
                    c.setText(address);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {}
        };
        userD.addListenerForSingleValueEvent(eventListener);
    }
}
