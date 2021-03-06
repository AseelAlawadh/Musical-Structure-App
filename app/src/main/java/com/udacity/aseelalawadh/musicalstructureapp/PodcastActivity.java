package com.udacity.aseelalawadh.musicalstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class PodcastActivity extends AppCompatActivity {


    public ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_podcast);

        ArrayList<Song> episodes = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            int episode_number = i + 1;
            Song item = new Song("Episode :" + episode_number, "details");
            episodes.add(item);
        }

        PodcastAdapter adapter = new PodcastAdapter(this, episodes);
        listView = findViewById(R.id.list_view);
        listView.setAdapter(adapter);

    }


}
