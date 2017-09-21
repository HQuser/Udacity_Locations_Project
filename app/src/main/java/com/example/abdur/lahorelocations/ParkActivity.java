package com.example.abdur.lahorelocations;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Abdur on 21-Sep-17.
 */

public class ParkActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        // List of locations
        ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location("Jallo Park", R.drawable.jallo_park, "Jallo Park (sometimes called Jallo Wildlife Park), established in 1978, is a public recreation and wildlife site located in Lahore District, Punjab, Pakistan. "));
        locations.add(new Location("Botnical Park", R.drawable.botnical_park, "Botnical Park (sometimes called Jallo Wildlife Park), established in 1978, is a public recreation and wildlife site located in Lahore District, Punjab, Pakistan. "));
        locations.add(new Location("Shalimar Park", R.drawable.shalimar_park, "Shalimar Park (sometimes called Jallo Wildlife Park), established in 1978, is a public recreation and wildlife site located in Lahore District, Punjab, Pakistan. "));


        // Setting up ListView and adding adapter
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(new LocationsAdapter(this, locations));
    }
}
