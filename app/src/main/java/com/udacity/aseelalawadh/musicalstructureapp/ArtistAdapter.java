package com.udacity.aseelalawadh.musicalstructureapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by aseelalawadh on 11/04/2018.
 */

public class ArtistAdapter extends ArrayAdapter<Artist> {

    public ArtistAdapter(ArtistActivity context, ArrayList<Artist> artists) {
        super(context, 0, artists);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Artist item = getItem(position);
        TextView id = listItemView.findViewById(R.id.song_number);
        id.setText(String.valueOf(position + 1));
        TextView songName = listItemView.findViewById(R.id.song_name);
        songName.setText(item.getName());
        return listItemView;
    }

}
