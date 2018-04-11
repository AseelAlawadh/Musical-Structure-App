package com.udacity.aseelalawadh.musicalstructureapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by aseelalawadh on 12/04/2018.
 */

public class PodcastAdapter extends ArrayAdapter<String> {

    public PodcastAdapter(PodcastActivity context, ArrayList<String> episodes) {
        super(context, 0, episodes);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        String item = getItem(position);
        TextView id = listItemView.findViewById(R.id.id_textView);
        id.setText(String.valueOf(position + 1));

        TextView songName = listItemView.findViewById(R.id.title_textView);
        songName.setText(item);
        return listItemView;
    }
}
