package com.example.abdur.lahorelocations;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Abdur on 21-Sep-17.
 */

public class RestaurantActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        // List of locations
        ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location("Tabaq Restaurant", R.drawable.tabaq_restaurant, "Brunch, Lunch, Dinner, Accepts Mastercard, Accepts Visa, Buffet, Delivery, Highchairs"));
        locations.add(new Location("Casa Restaurant", R.drawable.casa_restaurant, "With an ambience of Victorian England and a highly unique cuisine that is bound to get you salivating, Lahore’s new restaurant, Casa Bianca"));
        locations.add(new Location("Ginoy Restaurant", R.drawable.ginsoy_restaurant, "Ginsoy is a contemporary fine dining Chinese restaurant that serves flavorful Chinese cuisine in a sleek and colorful environment."));


        // Setting up ListView and adding adapter
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(new LocationsAdapter(this, locations));
    }
}
