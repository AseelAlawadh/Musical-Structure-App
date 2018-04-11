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

        //Adding First Artist songs
        ArrayList<String> adeleSongs = new ArrayList<>();
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
        Artist adele = new Artist("Adele", adeleSongs);
        artists.add(adele);

        //Adding second Artist songs
        ArrayList<String> ladySongs = new ArrayList<>();
        ladySongs.add("Just Dance");
        ladySongs.add("LoveGame");
        ladySongs.add("Paparazzi");
        ladySongs.add("Poker Face");
        ladySongs.add("Eh, Eh (Nothing Else I Can Say");
        ladySongs.add("Beautiful, Dirty, Rich ");
        ladySongs.add("The Fame");
        ladySongs.add("Money Honey");
        ladySongs.add("Starstruck");
        ladySongs.add("Boys Boys Boys");
        ladySongs.add("Paper Gangsta");
        ladySongs.add("Brown Eyes");
        ladySongs.add("I Like It Rough");
        ladySongs.add("Summerboy");
        Artist ladyGaga = new Artist("Lady Gag", ladySongs);
        artists.add(ladyGaga);

        //Adding third Artist songs
        ArrayList<String> selenaSongs = new ArrayList<>();
        selenaSongs.add("The Heart Wants What It Wants");
        selenaSongs.add("Come & Get It");
        selenaSongs.add("Love You Like a Love Song");
        selenaSongs.add("Tell Me Something I Don't Know");
        selenaSongs.add("Who Says");
        selenaSongs.add("My Dilemma 2.0");
        selenaSongs.add("Round & Round");
        selenaSongs.add("Forget Forever (Boy Lightning remix");
        selenaSongs.add("Slow Down");
        selenaSongs.add("A Year Without Rain (Dave Audé Radio remix");
        selenaSongs.add("Naturally (Dave Audé Radio Remix");
        selenaSongs.add("Más (More - Spanish version)");
        selenaSongs.add("Bidi Bidi Bom Bom");
        selenaSongs.add("Falling Down");
        selenaSongs.add("Do It");
        Artist selena = new Artist("Selena Gomez", selenaSongs);
        artists.add(selena);

        //Adding third Artist song
        ArrayList<String> arianaSongs = new ArrayList<>();
        arianaSongs.add("Break Free");
        arianaSongs.add("Problem");
        arianaSongs.add("Baby I");
        arianaSongs.add("Into You");
        arianaSongs.add("Bang Bang");
        arianaSongs.add("Side to Side");
        arianaSongs.add("One Last Time");
        arianaSongs.add("The Way");
        arianaSongs.add("Be Alright");
        arianaSongs.add("Love Me Harder");
        arianaSongs.add("Everyday");
        arianaSongs.add("Right There");
        arianaSongs.add("Greedy");
        arianaSongs.add("Piano");
        arianaSongs.add("Dangerous Woman");
        arianaSongs.add("Best Mistake");
        arianaSongs.add("Faith");
        arianaSongs.add("Beauty and the Beast");
        Artist ariana = new Artist("Ariana Grande", arianaSongs);
        artists.add(ariana);


        ArtistAdapter adapter = new ArtistAdapter(this, artists);
        listView = findViewById(R.id.list_view);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent intent = new Intent(ArtistActivity.this, MusicActivity.class);
                Artist item = artists.get(position);
                intent.putExtra("SONGS", item.getSongs());
                startActivity(intent);
            }
        });
    }
}
