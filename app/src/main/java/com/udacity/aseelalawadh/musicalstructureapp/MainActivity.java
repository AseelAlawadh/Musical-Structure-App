package com.udacity.aseelalawadh.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    public Button episode;
    public Button music;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        music = (Button) findViewById(R.id.button_music);
        music.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ArtistActivity.class);
                startActivity(intent);
            }
        });

        episode = findViewById(R.id.button_podcast);
        episode.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PodcastActivity.class);
                startActivity(intent);
            }
        });
    }
}
