package com.example.myapplication;

import android.Manifest;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.media.MediaScannerConnection;
import android.os.Environment;
import android.provider.ContactsContract;
import android.support.v4.app.ActivityCompat;
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
            resetProgress();
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
        findViewById(R.id.text_saveImagePrompt).setVisibility(View.VISIBLE);

        // certificate image is clicked
        findViewById(R.id.image_certificateOfCompletion).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // request permission to save files
                ActivityCompat.requestPermissions(ProfileActivity.this, new String[] {Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1);

                // setup dialog
                AlertDialog.Builder builder = new AlertDialog.Builder(ProfileActivity.this);
                builder.setTitle("Save Certificate?");
                builder.setMessage("Would you like to save your certificate of completion?");

                // save image
                builder.setPositiveButton("Save", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Bitmap image = BitmapFactory.decodeResource(getResources(), R.drawable.certificate_of_completion);

                        // path to downloads directory
                        File path = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
                        File file = new File(path, "certificate_of_completion.png");
                        MediaScannerConnection.scanFile(ProfileActivity.this, new String[] { file.getPath() }, new String[] { "image/png" }, null);

                        // save image to downloads directory
                        OutputStream outputStream = null;
                        try {
                            outputStream = new FileOutputStream(file);
                            image.compress(Bitmap.CompressFormat.PNG, 100, outputStream);
                            outputStream.flush();
                            outputStream.close();
                            Toast.makeText(ProfileActivity.this, "Saved successfully", Toast.LENGTH_SHORT).show();
                        } catch (java.io.IOException e) {
                            Toast.makeText(ProfileActivity.this, "Saved failed. Please try again.", Toast.LENGTH_SHORT).show();
                            return;
                        }
                    }
                });

                // do nothing
                builder.setNegativeButton("Don't Save", null);

                // show dialog
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });
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

    private void resetProgress() {

        // setup dialog
        AlertDialog.Builder builder = new AlertDialog.Builder(ProfileActivity.this);
        builder.setTitle("Reset Progress?");
        builder.setMessage("Are you sure you want to reset your progress?");

        // save image
        builder.setPositiveButton("Confirm", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // TODO: reset progress data
                Toast.makeText(ProfileActivity.this, "Progress has been reset", Toast.LENGTH_SHORT).show();
                finish();
            }
        });

        // do nothing
        builder.setNegativeButton("Cancel", null);

        // show dialog
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}
