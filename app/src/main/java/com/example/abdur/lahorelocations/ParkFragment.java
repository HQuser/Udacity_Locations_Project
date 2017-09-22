package com.example.abdur.lahorelocations;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ParkFragment extends Fragment {


    public ParkFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = LayoutInflater.from(getActivity()).inflate(R.layout.list_view, container, false);

        // List of locations
        ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location("Jallo Park", R.drawable.jallo_park, "Jallo Park (sometimes called Jallo Wildlife Park), established in 1978, is a public recreation and wildlife site located in Lahore District, Punjab, Pakistan. "));
        locations.add(new Location("Botnical Park", R.drawable.botnical_park, "Botnical Park (sometimes called Jallo Wildlife Park), established in 1978, is a public recreation and wildlife site located in Lahore District, Punjab, Pakistan. "));
        locations.add(new Location("Shalimar Park", R.drawable.shalimar_park, "Shalimar Park (sometimes called Jallo Wildlife Park), established in 1978, is a public recreation and wildlife site located in Lahore District, Punjab, Pakistan. "));


        // Setting up ListView and adding adapter
        ListView listView = (ListView) rootView.findViewById(R.id.list_view);
        listView.setAdapter(new LocationsAdapter(getActivity(), locations, R.color.alpha_green));

        return rootView;
    }

}
