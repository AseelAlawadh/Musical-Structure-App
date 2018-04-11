package com.udacity.aseelalawadh.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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



        ArrayList<String> adeleSongs = new ArrayList<>();
        adeleSongs.add("Song");
        adeleSongs.add("Hello");
        adeleSongs.add("Send My Love (To Your New Lover)");
        adeleSongs.add("I Miss you ");
        adeleSongs.add("When We Were Young");
        adeleSongs.add("Remedy");
        adeleSongs.add("Water Under the Bridge");
        adeleSongs.add("River Lea");
        adeleSongs.add("Love in the Dark");
        adeleSongs.add("Million Years Ago");
        adeleSongs.add("All I Ask");
        adeleSongs.add("Sweetest Devotion");
        Artist adele = new Artist("Adele" , adeleSongs);


        ArrayList<String> ladySongs = new ArrayList<>();
        ladySongs.add("Song");
        ladySongs.add("Hello");
        Artist ladyGaga = new Artist("Lady Gag" , ladySongs);

        artists.add(adele);
        artists.add(ladyGaga);

        /*
        for (int i=0; i< 4; i++) {
            ArrayList<String> songs = new ArrayList<>();
            for (int j=0; j<10; j++) {
                //Music item = new Music(" name " + i, "details " + i, "Adele");
                String item = new String("name" + i);
                songs.add(item);
            }

            Artist artist = new Artist("Artist" + i, songs);
            artists.add(artist);
        }*/


        ArtistAdapter adapter = new ArtistAdapter(this, artists);
        listView = findViewById(R.id.list_view);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent intent = new Intent(ArtistActivity.this , MusicActivity.class);
                Artist item = artists.get(position);
                intent.putExtra("SONGS", item.getSongs());
                startActivity(intent);
            }
        });

    }
}
