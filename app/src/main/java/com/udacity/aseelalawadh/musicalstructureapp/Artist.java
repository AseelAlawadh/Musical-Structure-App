package com.udacity.aseelalawadh.musicalstructureapp;

import java.util.ArrayList;

/**
 * Created by aseelalawadh on 11/04/2018.
 */

public class Artist {

    public String name;
    public ArrayList<String> songs;

    public Artist(String name, ArrayList<String> songs) {
        this.name = name;
        this.songs = songs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getSongs() {
        return songs;
    }

    public void setSongs(ArrayList<String> songs) {
        this.songs = songs;
    }
}
