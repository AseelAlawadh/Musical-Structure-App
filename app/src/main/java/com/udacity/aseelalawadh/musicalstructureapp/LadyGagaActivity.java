package com.udacity.aseelalawadh.musicalstructureapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by aseelalawadh on 11/04/2018.
 */

public class LadyGagaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);


        ArrayList<LadyGagaSong> songs = new ArrayList<LadyGagaSong>();
        songs.add(new LadyGagaSong("1", "Just Dance"));
        songs.add(new LadyGagaSong("2", "LoveGame"));
        songs.add(new LadyGagaSong("3", "Paparazzi"));
        songs.add(new LadyGagaSong("4", "Poker Face"));
        songs.add(new LadyGagaSong("5", "Eh, Eh (Nothing Else I Can Say)"));
        songs.add(new LadyGagaSong("6", "Beautiful, Dirty, Rich"));
        songs.add(new LadyGagaSong("7", "The Fame"));
        songs.add(new LadyGagaSong("8", "Money Honey"));
        songs.add(new LadyGagaSong("9", "Starstruck"));
        songs.add(new LadyGagaSong("10", "Boys Boys Boys"));
        songs.add(new LadyGagaSong("11", "Paper Gangsta"));
        songs.add(new LadyGagaSong("12", "Brown Eyes"));
        songs.add(new LadyGagaSong("13", "I Like It Rough"));
        songs.add(new LadyGagaSong("14", "Summerboy"));


        LadyGagaSongAdapter adapter = new LadyGagaSongAdapter(this, songs);


        ListView listView = findViewById(R.id.list);


        listView.setAdapter(adapter);

    }
}
