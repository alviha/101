package com.example.myapplication;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowId;
import android.view.WindowManager;

public class StartupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /** Remove notification bar */
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_startup);

        splashScreen();
    }

    private void splashScreen() {

        long timeDelay = 1000; // 1 second delay
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
