package com.example.android.randaquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AboutMe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);
    }
     public void finish(android.view.View view) {
        startActivity(new android.content.Intent(this, firstScreen.class));
    }

}
