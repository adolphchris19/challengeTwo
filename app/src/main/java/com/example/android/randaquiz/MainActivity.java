package com.example.android.randaquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {

                Intent mInHome = new Intent (MainActivity.this, firstScreen.class);
                MainActivity.this.startActivity(mInHome);
                MainActivity.this.finish();
            }
        }, 4000);

    }
}
