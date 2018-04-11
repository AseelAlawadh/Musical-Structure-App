package com.udacity.aseelalawadh.musicalstructureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MusicActivity extends AppCompatActivity {


    public ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);


        /*ArrayList<Music> songs = new ArrayList<>();
        for (int i=0; i< 10; i++) {
            Music item = new Music(" name " + i, "details " + i, "Adele");
            songs.add(item);
        }*/

        Bundle extras = getIntent().getExtras();
        ArrayList<String> songs = extras.getStringArrayList("SONGS");

        MusicAdapter adapter = new MusicAdapter(this, songs);
        listView = findViewById(R.id.list_view);
        listView.setAdapter(adapter);

    }

}
