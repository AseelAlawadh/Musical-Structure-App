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

public class LadyGagaSongAdapter extends ArrayAdapter<LadyGagaSong> {


    public LadyGagaSongAdapter(LadyGagaActivity context, ArrayList<LadyGagaSong> songs) {
        super(context, 0, songs);
    }


    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);

        }


        LadyGagaSong currentSong = getItem(position);

        TextView id = (TextView) listItemView.findViewById(R.id.song_number);
        id.setText(currentSong.getId());

        TextView songName = (TextView) listItemView.findViewById(R.id.song_name);
        songName.setText(currentSong.getNameSong());
        return listItemView;
    }


}
