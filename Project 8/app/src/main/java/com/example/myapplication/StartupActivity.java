package com.example.myapplication;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;

public class StartupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Remove notification bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_startup);

        splashScreen();

    }

    /**
     * Displays the logo for one second and starts the next activity
     */
    private void splashScreen() {

        // true when the app is launched for the first time; otherwise, false
        final boolean firstTime = getSharedPreferences("PREFERENCE", MODE_PRIVATE)
                .getBoolean("firstTime", true);

        long timeDelay = 1000; // 1 second delay

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {

                Intent i;

                if(firstTime) {

                    i = new Intent(StartupActivity.this, SignUpActivity.class);

                    getSharedPreferences("PREFERENCE", MODE_PRIVATE).edit()
                            .putBoolean("firstTime", false).apply();
                }
                else {

                    // TODO: change SignUpActivity to the sign in activity once that activity is created
                    i = new Intent(StartupActivity.this, SignUpActivity.class);
                }

                startActivity(i);

                finish();
            }
        }, timeDelay);

    }
}
