package com.udacity.aseelalawadh.musicalstructureapp;

/**
 * Created by aseelalawadh on 11/04/2018.
 */

public class LadyGagaSong {
    private String id;
    private String nameSong;

    public LadyGagaSong(String id, String nameSong) {
        this.id = id;
        this.nameSong = nameSong;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameSong() {
        return nameSong;
    }

    public void setNameSong(String nameSong) {
        this.nameSong = nameSong;
    }
}
