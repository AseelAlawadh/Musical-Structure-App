package com.udacity.aseelalawadh.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.view.View.OnClickListener;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            Button adele = (Button) findViewById(R.id.button_adele);
            adele.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this , ArtistActivity.class);
                    startActivity(intent);

                }
            });

        Button ladyGaga = (Button) findViewById(R.id.button_ladyGaga);
        ladyGaga.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ladyGagaIntent = new Intent(MainActivity.this , LadyGagaActivity.class);
                startActivity(ladyGagaIntent);

            }
        });


        Button selena = (Button) findViewById(R.id.button_selena);
        selena.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent selenaIntent = new Intent(MainActivity.this , SelenaActivity.class);
                startActivity(selenaIntent);

            }
        });

        Button ariana = findViewById(R.id.button_ariana);
        ariana.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent arianaIntent = new Intent(MainActivity.this , ArianaActivity.class);
                startActivity(arianaIntent);
            }
        });
    }
}
