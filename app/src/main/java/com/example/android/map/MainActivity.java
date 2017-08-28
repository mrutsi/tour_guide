package com.example.android.map;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        getSupportActionBar().setSubtitle("Welcome");

        Button hotel = (Button) findViewById(R.id.hotel);
        Button resort = (Button) findViewById(R.id.resort);
        Button taxi = (Button) findViewById(R.id.taxi);
        Button flight = (Button) findViewById(R.id.flight);
        Button entertainment = (Button) findViewById(R.id.entertainment);
        Button stadium = (Button) findViewById(R.id.stadium);


        hotel.setOnClickListener(new View.OnClickListener()
        {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view)
            {
                // Create a new intent to open the {@link NumbersActivity}
                Intent numbersIntent = new Intent(MainActivity.this, Hotels.class);

                // Start the new activity
                startActivity(numbersIntent);
            }
        });

        resort.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent numbersIntent = new Intent(MainActivity.this, Resort.class);

                // Start the new activity
                startActivity(numbersIntent);
            }
        });
        taxi.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent numbersIntent = new Intent(MainActivity.this, Taxi.class);

                // Start the new activity
                startActivity(numbersIntent);
            }
        });
        flight.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent numbersIntent = new Intent(MainActivity.this, Flight.class);

                // Start the new activity
                startActivity(numbersIntent);
            }
        });
        entertainment.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent numbersIntent = new Intent(MainActivity.this, Entertainment.class);

                // Start the new activity
                startActivity(numbersIntent);
            }
        });
        stadium.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent numbersIntent = new Intent(MainActivity.this, Stadium.class);

                // Start the new activity
                startActivity(numbersIntent);
            }
        });
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }


}



