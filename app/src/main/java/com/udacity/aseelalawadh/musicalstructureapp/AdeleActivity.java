package com.udacity.aseelalawadh.musicalstructureapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import java.util.ArrayList;

/**
 * Created by aseelalawadh on 11/04/2018.
 */

public class AdeleActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);


//        ArrayList<AdeleSong> songs = new ArrayList<AdeleSong>();
//        songs.add(new AdeleSong("1", "Hello"));
//        songs.add(new AdeleSong("2", "Send My Love (To Your New Lover)"));
//        songs.add(new AdeleSong("3", "I Miss you "));
//        songs.add(new AdeleSong("4", "When We Were Young"));
//        songs.add(new AdeleSong("5", "Remedy"));
//        songs.add(new AdeleSong("6", "Water Under the Bridge"));
//        songs.add(new AdeleSong("7", "River Lea"));
//        songs.add(new AdeleSong("8", "Love in the Dark"));
//        songs.add(new AdeleSong("9", "Million Years Ago"));
//        songs.add(new AdeleSong("10", "All I Ask"));
//        songs.add(new AdeleSong("11", "Sweetest Devotion"));


        ArrayList<AdeleSong> songs = new ArrayList<AdeleSong>();
        songs.add(new AdeleSong("1", "Hello"));
        songs.add(new AdeleSong("2", "Send My Love (To Your New Lover)"));
        songs.add(new AdeleSong("3", "I Miss you "));
        songs.add(new AdeleSong("4", "When We Were Young"));
        songs.add(new AdeleSong("5", "Remedy"));
        songs.add(new AdeleSong("6", "Water Under the Bridge"));
        songs.add(new AdeleSong("7", "River Lea"));
        songs.add(new AdeleSong("8", "Love in the Dark"));
        songs.add(new AdeleSong("9", "Million Years Ago"));
        songs.add(new AdeleSong("10", "All I Ask"));
        songs.add(new AdeleSong("11", "Sweetest Devotion"));


        /*for (int i=0 ; i < songs.size() ; i++) {
        for (AdeleSong adeleSong;songs.get(i).getId())
        {
            adeleSong.setId();
        }*/

        AdeleSongAdapter adapter = new AdeleSongAdapter(this, songs);




        ListView listView = findViewById(R.id.list);


        listView.setAdapter(adapter);

    }
}