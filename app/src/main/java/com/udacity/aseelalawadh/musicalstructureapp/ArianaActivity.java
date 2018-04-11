package com.udacity.aseelalawadh.musicalstructureapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by aseelalawadh on 11/04/2018.
 */

public class ArianaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);


        ArrayList<ArianaSong> songs = new ArrayList<ArianaSong>();
        songs.add(new ArianaSong("1", "Break Free"));
        songs.add(new ArianaSong("2", "Problem"));
        songs.add(new ArianaSong("3", "Baby I"));
        songs.add(new ArianaSong("4", "Into You"));
        songs.add(new ArianaSong("5", "Bang Bang"));
        songs.add(new ArianaSong("6", "Side to Side"));
        songs.add(new ArianaSong("7", "One Last Time"));
        songs.add(new ArianaSong("8", "The Way"));
        songs.add(new ArianaSong("9", "Be Alright"));
        songs.add(new ArianaSong("10", "Love Me Harder"));
        songs.add(new ArianaSong("11", "Everyday"));
        songs.add(new ArianaSong("12", "Right There"));
        songs.add(new ArianaSong("13", "Greedy"));
        songs.add(new ArianaSong("14", "Piano"));
        songs.add(new ArianaSong("15", "Dangerous Woman"));
        songs.add(new ArianaSong("16", "Best Mistake"));
        songs.add(new ArianaSong("17", "Faith"));
        songs.add(new ArianaSong("18", "Beauty and the Beast"));


        ArianaSongAdapter adapter = new ArianaSongAdapter(this,songs);





        ListView listView = findViewById(R.id.list);


        listView.setAdapter(adapter);

    }
}
