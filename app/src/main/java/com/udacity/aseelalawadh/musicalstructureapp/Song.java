package com.udacity.aseelalawadh.musicalstructureapp;

/**
 * Created by aseelalawadh on 12/04/2018.
 */

import android.os.Parcel;
import android.os.Parcelable;

public class Song implements Parcelable {

    public static final Creator<Song> CREATOR = new Creator<Song>() {
        @Override
        public Song createFromParcel(Parcel in) {
            return new Song(in);
        }

        @Override


        public Song[] newArray(int size) {
            return new Song[size];
        }

    };
    private String name;
    private String details;


    public Song(String name, String details) {

        this.name = name;
        this.details = details;
    }


    protected Song(Parcel in) {
        name = in.readString();
        details = in.readString();
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


    @Override
    public int describeContents() {
        return 0;
    }


    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.getName());
        parcel.writeString(this.getDetails());
    }

}