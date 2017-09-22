package com.example.abdur.lahorelocations;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Abdur on 21-Sep-17.
 */

public class HistoryActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        // List of locations
        ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location("Lahore Museum", R.drawable.lahore_museum, "he Lahore Museum (Punjabi: لاہور میوزیم, Urdu: لاہور عجائب گھر\u200E), was originally established in 1865-66 on the site of the hall or building of the 1864 Punjab Exhibition"));
        locations.add(new Location("Science & Technology Museum", R.drawable.science_and_technology_museum, "(NMST) National museum of science & Technology is a non-profit, permanent institution in the service of society and its development, open to the public"));
        locations.add(new Location("Fakir Khana Museum", R.drawable.fakir_khanna_museum, "Fakir Khana is the private museum of the Fakir Family of Lahore."));


        // Setting up ListView and adding adapter
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(new LocationsAdapter(this, locations, R.color.alpha_brown));
    }
}
