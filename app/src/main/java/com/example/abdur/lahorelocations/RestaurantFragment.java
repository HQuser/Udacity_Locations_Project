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
public class RestaurantFragment extends Fragment {


    public RestaurantFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = LayoutInflater.from(getActivity()).inflate(R.layout.list_view, container, false);

        // List of locations
        ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location("Tabaq Restaurant", R.drawable.tabaq_restaurant, "Brunch, Lunch, Dinner, Accepts Mastercard, Accepts Visa, Buffet, Delivery, Highchairs"));
        locations.add(new Location("Casa Restaurant", R.drawable.casa_restaurant, "With an ambience of Victorian England and a highly unique cuisine that is bound to get you salivating, Lahore’s new restaurant, Casa Bianca"));
        locations.add(new Location("Ginoy Restaurant", R.drawable.ginsoy_restaurant, "Ginsoy is a contemporary fine dining Chinese restaurant that serves flavorful Chinese cuisine in a sleek and colorful environment."));


        // Setting up ListView and adding adapter
        ListView listView = (ListView) rootView.findViewById(R.id.list_view);
        listView.setAdapter(new LocationsAdapter(getActivity(), locations, R.color.alpha_red));

        return rootView;
    }

}
