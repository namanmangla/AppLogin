package com.example.lowerorhigher;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button naman , mangla;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
        naman = findViewById(R.id.button2);
        mangla = findViewById(R.id.button);
        mangla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent B = new Intent(getApplicationContext(),Main3Activity.class);
                startActivity(B);
            }
        });
       naman.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent I = new Intent (getApplicationContext(),Main2Activity.class);
               startActivity(I);
           }
       });
    }
}
