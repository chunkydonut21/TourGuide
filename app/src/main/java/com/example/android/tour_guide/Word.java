package com.example.android.tour_guide;

import android.media.Image;


public class Word {
    private String mName;
    private String mDetails;
    private int mImage = -1;

    public Word(String names, String Details, int Image) {
        mName = names;
        mDetails = Details;
        mImage = Image;
    }

    public Word(String names, String Details) {
        mName = names;
        mDetails = Details;
    }

    public String getName() {
        return mName;
    }

    public String getDetails() {
        return mDetails;
    }

    public int getImage() {
        return mImage;
    }

    public boolean hasImage() {
        return mImage != -1;
    }
}
