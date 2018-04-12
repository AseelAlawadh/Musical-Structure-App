package com.udacity.aseelalawadh.musicalstructureapp;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

/**
 * Created by aseelalawadh on 11/04/2018.
 */
public class Artist implements Parcelable {

    public static final Creator<Artist> CREATOR = new Creator<Artist>() {
        @Override
        public Artist createFromParcel(Parcel in) {
            return new Artist(in);
        }

        @Override
        public Artist[] newArray(int size) {
            return new Artist[size];
        }
    };
    public String name;
    public ArrayList<Song> songs;

    public Artist(String name, ArrayList<Song> songs) {
        this.name = name;
        this.songs = songs;
    }

    protected Artist(Parcel in) {
        name = in.readString();
        songs = in.createTypedArrayList(Song.CREATOR);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public void setSongs(ArrayList<Song> songs) {
        this.songs = songs;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeTypedList(this.songs);
    }


}