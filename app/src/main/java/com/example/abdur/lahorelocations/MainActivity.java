package com.example.abdur.lahorelocations;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Setting onclick listener to {@link: activity_main.xml}
        // Setting Park TextView
        TextView parkTextView = (TextView) findViewById(R.id.park_text_view);
        parkTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent parkActivityIntent = new Intent(getApplicationContext(), ParkActivity.class);

                startActivity(parkActivityIntent);
            }
        });

        // Setting onclick listener to {@link: activity_main.xml}
        // Setting Hospital TextView
        TextView hospitalTextView = (TextView) findViewById(R.id.hospital_text_view);
        hospitalTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hospitalActivityIntent = new Intent(getApplicationContext(), HospitalActivity.class);

                startActivity(hospitalActivityIntent);
            }
        });

        // Setting onclick listener to {@link: activity_main.xml}
        // Setting Hospital Restaurant TextView
        TextView restaurantTextView = (TextView) findViewById(R.id.restaurant_text_view);
        restaurantTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent restaurantActivityIntent = new Intent(getApplicationContext(), RestaurantActivity.class);

                startActivity(restaurantActivityIntent);
            }
        });

        // Setting onclick listener to {@link: activity_main.xml}
        // Setting History TextView
        TextView historyTextView = (TextView) findViewById(R.id.history_text_view);
        historyTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent historyActivityIntent = new Intent(getApplicationContext(), HistoryActivity.class);

                startActivity(historyActivityIntent);
            }
        });
    }
}
