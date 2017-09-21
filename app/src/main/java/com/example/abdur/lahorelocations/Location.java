package com.example.abdur.lahorelocations;

import android.support.annotation.NonNull;

/**
 * Created by Abdur on 21-Sep-17.
 */

public class Location {
    private String mLocationName;
    private int mImageResourceId;
    private String mLocationAddress;

    // Constructor to initialize all member variables only once
    public Location(@NonNull String mLocationName,
                    @NonNull int mImageResourceId,
                    @NonNull String mLocationAddress) {
        this.mLocationName = mLocationName;
        this.mImageResourceId = mImageResourceId;
        this.mLocationAddress = mLocationAddress;
    }

    public String getLocationName() {
        return mLocationName;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public String getLocationAddress() {
        return mLocationAddress;
    }
}
