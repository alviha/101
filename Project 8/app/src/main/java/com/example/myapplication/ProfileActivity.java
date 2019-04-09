package com.example.myapplication;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

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
            hideProfileMainOptions();
            showProgressScreen();
        }
        else if(v == achievements) {
            hideProfileMainOptions();
            showAchievementsScreen();
        }
        else if(v == reset) {
            // TODO
        }
        else if(v == findViewById(R.id.image_certificateOfCompletion)) {
            Bitmap image = BitmapFactory.decodeResource(getResources(), R.drawable.certificate_of_completion);

            // path to downloads directory
            File path = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
            File file = new File(path, "certificate_of_completion.png");

            // save image to downloads directory
            OutputStream outputStream = null;
            try {
                outputStream = new FileOutputStream(file);
                image.compress(Bitmap.CompressFormat.PNG, 100, outputStream);
                outputStream.flush();
                outputStream.close();
                Toast.makeText(ProfileActivity.this, "Saved successfully", Toast.LENGTH_SHORT);
            } catch (java.io.IOException e) {
                Toast.makeText(ProfileActivity.this, "Saved failed. Please try again.", Toast.LENGTH_SHORT);
                return;
            }
        }
    }

    @Override
    public void onBackPressed() {

        // back to homepage
        if(header.getText().toString().equals(getResources().getString(R.string.Profile))) {
            finish();
        }

        // back to profile screen
        else {
            this.recreate();

            // reset faq and feedback/bug reporting screen
            if(header.getText().toString().equals(getResources().getString(R.string.achievements))) {
                findViewById(R.id.scrollView_achievements).scrollTo(0, 0);
            }
        }

    }

    private void showProgressScreen() {

        header.setText(getResources().getString(R.string.progress));
        header.setTypeface(Typeface.DEFAULT);

        findViewById(R.id.image_certificateOfCompletion).setVisibility(View.VISIBLE);
        findViewById(R.id.image_certificateOfCompletion).setOnClickListener(this);
        findViewById(R.id.text_saveImagePrompt).setVisibility(View.VISIBLE);

        // save image code in OnClick()
    }

    private void showAchievementsScreen() {

        header.setText(getResources().getString(R.string.achievements));
        header.setTypeface(Typeface.DEFAULT);

        findViewById(R.id.scrollView_achievements).setVisibility(View.VISIBLE);

        // TODO: set alpha of ImageViews based on progress
    }

    private void hideProfileMainOptions() {

        progress.setVisibility(View.GONE);
        achievements.setVisibility(View.GONE);
        reset.setVisibility(View.GONE);
    }
}
