package com.example.abdur.lahorelocations;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Abdur on 21-Sep-17.
 */

public class LocationsAdapter extends ArrayAdapter<Location> {

    public LocationsAdapter(@NonNull Context context, @NonNull ArrayList<Location> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View rootView, @NonNull ViewGroup parent) {

        if (rootView == null) {
            rootView = LayoutInflater.from(getContext())
                    .inflate(R.layout.locations_list, parent, false);
        }

        Location location = getItem(position);

        TextView headingTextView = (TextView) rootView.findViewById(R.id.location_heading_text_view);
        headingTextView.setText(location.getLocationName());

        ImageView locationImageView = (ImageView) rootView.findViewById(R.id.location_image_view);
        locationImageView.setImageResource(location.getImageResourceId());

        TextView descriptionTextView = (TextView) rootView.findViewById(R.id.location_description_text_view);
        descriptionTextView.setText(location.getLocationAddress());

        return rootView;
    }
}
