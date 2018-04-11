package com.udacity.aseelalawadh.musicalstructureapp;

/**
 * Created by aseelalawadh on 11/04/2018.
 */

public class Music {

    private String name;
    private String details;
    private String artist;


    public Music(String name, String details, String artist) {
        this.name = name;
        this.details = details;
        this.artist = artist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
}
