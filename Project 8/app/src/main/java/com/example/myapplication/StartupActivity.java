package com.example.myapplication;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class StartupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startup);

        splashScreen();
    }

    private void splashScreen() {

        long timeDelay = 3000;
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {

                Intent i = new Intent(StartupActivity.this, SignUpActivity.class);
                startActivity(i);

                finish();
            }
        }, timeDelay);

    }
}
