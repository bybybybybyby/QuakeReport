package com.example.android.quakereport;

public class Earthquake {

    private float mMagnitude;
    private String mPlace;
    private int mTime;

    public Earthquake(float magnitude, String place, int time){
        mMagnitude = magnitude;
        mPlace = place;
        mTime = time;
    }

    public float getMagnitude() {
        return mMagnitude;
    }

    public String getPlace() {
        return mPlace;
    }

    public int time() {
        return mTime;
    }

}
