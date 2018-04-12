package com.udacity.aseelalawadh.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ArtistActivity extends AppCompatActivity {

    public ListView listView;
    public ArrayList<Artist> artists = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist);

        for (int i = 0; i < 4; i++) {
            ArrayList<Song> songs = new ArrayList<>();
            for (int j = 0; j < 10; j++) {
                Song song = new Song("song" + (j + 1), "song details" + j + 1);
                songs.add(song);
            }
            Artist item = new Artist("artist" + (i + 1), songs);
            artists.add(item);
        }

        ArtistAdapter adapter = new ArtistAdapter(this, artists);
        listView = findViewById(R.id.list_view);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent intent = new Intent(ArtistActivity.this, MusicActivity.class);
                Artist item = artists.get(position);
                intent.putParcelableArrayListExtra("SONGS", item.songs);
                startActivity(intent);
            }
        });

    }
}