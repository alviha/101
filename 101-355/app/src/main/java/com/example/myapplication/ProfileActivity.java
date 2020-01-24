package com.example.myapplication;

import android.Manifest;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
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
import android.widget.ImageView;
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
    ImageView elementaryMedal,selectionsMedal,functionsMedal,loopsMedal,methodsMedal,arrayMedal,perfectMedal;
    SharedPreferences myPref;


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
        elementaryMedal = findViewById(R.id.imageView_medal1);
        selectionsMedal = findViewById(R.id.imageView_medal2);
        functionsMedal = findViewById(R.id.imageView_medal3);
        loopsMedal = findViewById(R.id.imageView_medal4);
        methodsMedal = findViewById(R.id.imageView_medal5);
        arrayMedal = findViewById(R.id.imageView_medal6);
        perfectMedal = findViewById(R.id.imageView_perfectionistMedal);
        myPref = getSharedPreferences("PREFERENCE", MODE_PRIVATE);
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
            // reset progress screen
            else if(header.getText().toString().equals(getResources().getString(R.string.progress))) {
                findViewById(R.id.scrollView_progress).scrollTo(0, 0);
            }
        }

    }

    private void showProgressScreen() {

        header.setText(getResources().getString(R.string.progress));
        header.setTypeface(Typeface.DEFAULT);

        // show current progress with levels
        findViewById(R.id.scrollView_progress).setVisibility(View.VISIBLE);
        progressSnapshot();

        // unlock certificate if all lessons are completed with a passing score for each
        if(finishedAllLessons()) {
            findViewById(R.id.image_certificateOfCompletion).setVisibility(View.VISIBLE);
            findViewById(R.id.text_saveImagePrompt).setVisibility(View.VISIBLE);
        }

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
        //checks to see if prerequisites for the medals are met and unlocks them if they are
        medalProgress();
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
                //clears all shared preferences
                myPref.edit().clear().apply();
                Toast.makeText(ProfileActivity.this, "Progress has been reset", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(ProfileActivity.this, Homepage.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                finish();
            }
        });

        // do nothing
        builder.setNegativeButton("Cancel", null);

        // show dialog
        AlertDialog dialog = builder.create();
        dialog.show();
    }
    private void medalProgress(){
        //checks to see if each section has above %80
        if(myPref.getInt("elementaryProgramming1",0)>=80&&
                myPref.getInt("elementaryProgramming2",0)>=80&&
        myPref.getInt("elementaryProgramming3",0)>=80||myPref.getInt("elementaryProgrammingPretest",0)>=80)
        {
            elementaryMedal.setAlpha(1.0f);
        }
        if(myPref.getInt("selections1",0)>=80&&
                myPref.getInt("selections2",0)>=80&&
                myPref.getInt("selections3",0)>=80||myPref.getInt("selectionsPretest",0)>=80)
        {
            selectionsMedal.setAlpha(1.0f);
        }
        if(myPref.getInt("functionsCharactersStrings1",0)>=80&&
                myPref.getInt("functionsCharactersStrings2",0)>=80&&
                myPref.getInt("functionsCharactersStrings3",0)>=80&&
        myPref.getInt("functionsCharactersStrings4",0)>=80||
                myPref.getInt("functionsCharactersStringsPretest",0)>=80)
        {
            functionsMedal.setAlpha(1.0f);
        }
        if(myPref.getInt("loops1",0)>=80&&
                myPref.getInt("loops2",0)>=80&&
                myPref.getInt("loops3",0)>=80||myPref.getInt("loopsPretest",0)>=80){
            loopsMedal.setAlpha(1.0f);
        }
        if(myPref.getInt("methods1",0)>=80&&
                myPref.getInt("methods2",0)>=80||myPref.getInt("methodsPretest",0)>=80)
        {
            methodsMedal.setAlpha(1.0f);
        }
        if(myPref.getInt("singleDimensionalArrays1",0)>=80&&
                myPref.getInt("singleDimensionalArrays2",0)>=80||myPref.getInt("singleDimensionalArraysPretest",0)>=80)
        {
            arrayMedal.setAlpha(1.0f);
        }
        //checks to see if user has %100 in every section
        if(myPref.getInt("total",0)>=100||myPref.getInt("pretestTotal",0)>=100)
        {
            perfectMedal.setAlpha(1.0f);
        }
    }

    // sets the progress data
    private void progressSnapshot() {

        String scorePercentage = myPref.getInt("elementaryProgramming1", 0) + "%";
        ((TextView)findViewById(R.id.text_ePLesson1Percentage)).setText(scorePercentage);

        scorePercentage = myPref.getInt("elementaryProgramming2", 0) + "%";
        ((TextView)findViewById(R.id.text_ePLesson2Percentage)).setText(scorePercentage);

        scorePercentage = myPref.getInt("elementaryProgramming3", 0) + "%";
        ((TextView)findViewById(R.id.text_ePLesson3Percentage)).setText(scorePercentage);

        scorePercentage = myPref.getInt("selections1", 0) + "%";
        ((TextView)findViewById(R.id.text_sLesson1Percentage)).setText(scorePercentage);

        scorePercentage = myPref.getInt("selections2", 0) + "%";
        ((TextView)findViewById(R.id.text_sLesson2Percentage)).setText(scorePercentage);

        scorePercentage = myPref.getInt("selections3", 0) + "%";
        ((TextView)findViewById(R.id.text_sLesson3Percentage)).setText(scorePercentage);

        scorePercentage = myPref.getInt("functionsCharactersStrings1", 0) + "%";
        ((TextView)findViewById(R.id.text_functionsLesson1Percentage)).setText(scorePercentage);

        scorePercentage = myPref.getInt("functionsCharactersStrings2", 0) + "%";
        ((TextView)findViewById(R.id.text_functionsLesson2Percentage)).setText(scorePercentage);

        scorePercentage = myPref.getInt("functionsCharactersStrings3", 0) + "%";
        ((TextView)findViewById(R.id.text_functionsLesson3Percentage)).setText(scorePercentage);

        scorePercentage = myPref.getInt("functionsCharactersStrings4", 0) + "%";
        ((TextView)findViewById(R.id.text_functionsLesson4Percentage)).setText(scorePercentage);

        scorePercentage = myPref.getInt("loops1", 0) + "%";
        ((TextView)findViewById(R.id.text_loopsLesson1Percentage)).setText(scorePercentage);

        scorePercentage = myPref.getInt("loops2", 0) + "%";
        ((TextView)findViewById(R.id.text_loopsLesson2Percentage)).setText(scorePercentage);

        scorePercentage = myPref.getInt("loops3", 0) + "%";
        ((TextView)findViewById(R.id.text_loopsLesson3Percentage)).setText(scorePercentage);

        scorePercentage = myPref.getInt("methods1", 0) + "%";
        ((TextView)findViewById(R.id.text_methodsLesson1Percentage)).setText(scorePercentage);

        scorePercentage = myPref.getInt("methods2", 0) + "%";
        ((TextView)findViewById(R.id.text_methodsLesson2Percentage)).setText(scorePercentage);

        scorePercentage = myPref.getInt("singleDimensionalArrays1", 0) + "%";
        ((TextView)findViewById(R.id.text_arraysLesson1Percentage)).setText(scorePercentage);

        scorePercentage = myPref.getInt("singleDimensionalArrays2", 0) + "%";
        ((TextView)findViewById(R.id.text_arraysLesson2Percentage)).setText(scorePercentage);
    }

    // asserts if all lessons have been completed with a score of 80 or above
    private boolean finishedAllLessons() {

        if (myPref.getInt("elementaryProgramming1", 0) >= 80 &&
                myPref.getInt("elementaryProgramming2", 0) >= 80 &&
                myPref.getInt("elementaryProgramming3", 0) >= 80 &&
                myPref.getInt("selections1", 0) >= 80 &&
                myPref.getInt("selections2", 0) >= 80 &&
                myPref.getInt("selections3", 0) >= 80 &&
                myPref.getInt("functionsCharactersStrings1", 0) >= 80 &&
                myPref.getInt("functionsCharactersStrings2", 0) >= 80 &&
                myPref.getInt("functionsCharactersStrings3", 0) >= 80 &&
                myPref.getInt("functionsCharactersStrings4", 0) >= 80 &&
                myPref.getInt("loops1", 0) >= 80 &&
                myPref.getInt("loops2", 0) >= 80 &&
                myPref.getInt("loops3", 0) >= 80 &&
                myPref.getInt("methods1", 0) >= 80 &&
                myPref.getInt("methods2", 0) >= 80 &&
                myPref.getInt("singleDimensionalArrays1", 0) >= 80 &&
                myPref.getInt("singleDimensionalArrays2", 0) >= 80) {
            return true;
        }

        return false;
    }
}
