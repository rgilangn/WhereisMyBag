package com.example.alanupermana.whereismybag;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;



public class Home extends AppCompatActivity {
    ImageView buttonscanme;
    ImageView buttonaboutus;
    ImageView buttonhelp;
    ImageView buttonfeedback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        buttonscanme = findViewById(R.id.buttonscanme);
        buttonscanme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home.this,scanme.class);
                startActivity(i);

            }
        });
        buttonaboutus = findViewById(R.id.buttonaboutus);
        buttonaboutus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home.this,AboutUs.class);
                startActivity(i);

            }
        });
        buttonhelp = findViewById(R.id.buttonhelp);
        buttonhelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home.this,help.class);
                startActivity(i);

            }
        });
        buttonfeedback = findViewById(R.id.buttonfeedback);
        buttonfeedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home.this,feedback.class);
                startActivity(i);

            }
        });

    }
}
