package com.udacity.aseelalawadh.musicalstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MusicActivity extends AppCompatActivity {


    public ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);

        Bundle extras = getIntent().getExtras();
        ArrayList<Song> songs = extras.getParcelableArrayList("SONGS");

        MusicAdapter adapter = new MusicAdapter(this, songs);
        listView = findViewById(R.id.list_view);
        listView.setAdapter(adapter);

    }

}
