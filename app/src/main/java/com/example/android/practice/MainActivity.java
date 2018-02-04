package com.example.android.practice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import static com.example.android.practice.R.id.drivers;
import static com.example.android.practice.R.id.teams;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        TextView Driver = (TextView) findViewById(drivers);
        Driver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, driversActivity.class);
                startActivity(i);
            }
        });
        TextView Teams = (TextView) findViewById(teams);
        Teams.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(MainActivity.this, teamActivity.class);
                startActivity(j);
            }
        });
    }
}
