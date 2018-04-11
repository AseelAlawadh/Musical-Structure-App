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

            Button music = (Button) findViewById(R.id.button_music);
        music.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this , ArtistActivity.class);
                    startActivity(intent);

                }
            });


        Button book = findViewById(R.id.button_book);
        book.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent arianaIntent = new Intent(MainActivity.this , ArianaActivity.class);
                startActivity(arianaIntent);
            }
        });
    }
}
