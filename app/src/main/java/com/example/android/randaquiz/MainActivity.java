package com.example.android.randaquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the Mathematics category
        android.widget.TextView mathematics = (android.widget.TextView) findViewById(R.id.mathematics);

        // Set a click listener on that View
        mathematics.setOnClickListener(new android.view.View.OnClickListener() {

            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(android.view.View view) {
                android.content.Intent mathematicsIntent = new android.content.Intent(MainActivity.this, MathematicsActivity.class);
                startActivity(mathematicsIntent);
            }
        });


        // Find the View that shows the English category
        android.widget.TextView english = (android.widget.TextView) findViewById(R.id.english);

        // Set a click listener on that View
        english.setOnClickListener(new android.view.View.OnClickListener() {

            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(android.view.View view) {
                android.content.Intent englishIntent = new android.content.Intent(MainActivity.this, EnglishActivity.class);
                startActivity(englishIntent);
            }
        });


        // Find the View that shows the Mathematics category
        android.widget.TextView physics = (android.widget.TextView) findViewById(R.id.physics);

        // Set a click listener on that View
        physics.setOnClickListener(new android.view.View.OnClickListener() {

            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(android.view.View view) {
                android.content.Intent physicsIntent = new android.content.Intent(MainActivity.this, PhysicsActivity.class);
                startActivity(physicsIntent);
            }
        });


        // Find the View that shows the Mathematics category
        android.widget.TextView chemistry = (android.widget.TextView) findViewById(R.id.chemistry);

        // Set a click listener on that View
       chemistry.setOnClickListener(new android.view.View.OnClickListener() {

            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(android.view.View view) {
                android.content.Intent chemistryIntent = new android.content.Intent(MainActivity.this, ChemistryActivity.class);
                startActivity(chemistryIntent);
            }
        });



    }
}
