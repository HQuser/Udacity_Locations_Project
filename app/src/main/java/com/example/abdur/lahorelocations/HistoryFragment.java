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
public class HistoryFragment extends Fragment {


    public HistoryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = LayoutInflater.from(getActivity()).inflate(R.layout.list_view, container, false);

        // List of locations
        ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location("Lahore Museum", R.drawable.lahore_museum, "he Lahore Museum (Punjabi: لاہور میوزیم, Urdu: لاہور عجائب گھر\u200E), was originally established in 1865-66 on the site of the hall or building of the 1864 Punjab Exhibition"));
        locations.add(new Location("Science & Technology Museum", R.drawable.science_and_technology_museum, "(NMST) National museum of science & Technology is a non-profit, permanent institution in the service of society and its development, open to the public"));
        locations.add(new Location("Fakir Khana Museum", R.drawable.fakir_khanna_museum, "Fakir Khana is the private museum of the Fakir Family of Lahore."));


        // Setting up ListView and adding adapter
        ListView listView = (ListView) rootView.findViewById(R.id.list_view);
        listView.setAdapter(new LocationsAdapter(getActivity(), locations, R.color.alpha_brown));

        return rootView;
    }
}
