package com.example.android.tour_guide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView hp = (TextView) findViewById(R.id.historical_places);
        hp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, HistoricalPlacesActivity.class);
                startActivity(i);
            }
        });

        TextView pp = (TextView) findViewById(R.id.public_places);
        pp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, PublicPlacesActivity.class);
                startActivity(i);
            }
        });

        TextView r = (TextView) findViewById(R.id.restaurants);
        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, RestaurantsActivity.class);
                startActivity(i);
            }
        });

        TextView rp = (TextView) findViewById(R.id.religious_places);
        rp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ReligiousPlacesActivity.class);
                startActivity(i);
            }
        });

    }
}
