package com.udacity.aseelalawadh.musicalstructureapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by aseelalawadh on 11/04/2018.
 */

public class SelenaActivity extends AppCompatActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);


        ArrayList<SelenaSong> songs = new ArrayList<SelenaSong>();
        songs.add(new SelenaSong("1", "The Heart Wants What It Wants"));
        songs.add(new SelenaSong("2", "Come & Get It"));
        songs.add(new SelenaSong("3", "Love You Like a Love Song"));
        songs.add(new SelenaSong("4", "Tell Me Something I Don't Know"));
        songs.add(new SelenaSong("5", "Who Says"));
        songs.add(new SelenaSong("5", "My Dilemma 2.0"));
        songs.add(new SelenaSong("7", "Round & Round"));
        songs.add(new SelenaSong("8", "Forget Forever (Boy Lightning remix)"));
        songs.add(new SelenaSong("9", "Slow Down"));
        songs.add(new SelenaSong("10", "A Year Without Rain (Dave Audé Radio remix)"));
        songs.add(new SelenaSong("11", "Naturally (Dave Audé Radio Remix)"));
        songs.add(new SelenaSong("12", "Más (More - Spanish version)"));
        songs.add(new SelenaSong("13", "Bidi Bidi Bom Bom"));
        songs.add(new SelenaSong("14", "Falling Down"));
        songs.add(new SelenaSong("15", "Do It"));


        SelenaSongAdapter adapter = new SelenaSongAdapter(this, songs);




        ListView listView = findViewById(R.id.list);


        listView.setAdapter(adapter);

    }


}
