package com.example.myapplication;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ProfileActivity extends AppCompatActivity implements View.OnClickListener {

    TextView header;
    Button progress, achievements, reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        header = findViewById(R.id.text_ProfileHeader);

        progress = findViewById(R.id.button_Progress);
        progress.setOnClickListener(this);
        achievements = findViewById(R.id.button_Achievements);
        achievements.setOnClickListener(this);
        reset = findViewById(R.id.button_Reset);
        reset.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v == progress) {
            // TODO
        }
        else if(v == achievements) {
            hideProfileMainOptions();
            showAchievementsScreen();
        }
        else if(v == reset) {
            // TODO
        }
    }

    private void showAchievementsScreen() {

        header.setText("Achievements");
        header.setTypeface(Typeface.DEFAULT);
    }

    private void hideProfileMainOptions() {

        progress.setVisibility(View.GONE);
        achievements.setVisibility(View.GONE);
        reset.setVisibility(View.GONE);
    }
}
