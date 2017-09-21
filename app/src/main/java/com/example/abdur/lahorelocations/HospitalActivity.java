package com.example.abdur.lahorelocations;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Abdur on 21-Sep-17.
 */

public class HospitalActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        // List of locations
        ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location("Ghurki Hospital", R.drawable.ghurki_hospital, "Ghurki Trust Teaching Hospital is the first purpose built Charitable project of \"Haji Muhammad Asghar Ghurki Trust\""));
        locations.add(new Location("Services Hospital", R.drawable.services_hospital, "Services Hospital is located on Jail Road Lahore, Punjab, Pakistan just next to the race course park and is the teaching hospital of Services Institute of Medical"));
        locations.add(new Location("Shalimar Hospital", R.drawable.shalimar_park, "troduction. Businessmen Hospital Trust was conceived in 1974. The Trust initially comprised of Chaudhry Nazar Mohammad, Mr. Naseem Saigol. "));


        // Setting up ListView and adding adapter
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(new LocationsAdapter(this, locations));
    }
}
