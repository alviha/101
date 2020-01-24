package com.example.myapplication;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaScannerConnection;
import android.os.Bundle;
import android.os.Environment;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;


public class Homepage extends AppCompatActivity implements View.OnClickListener {

    private Button elementaryProgrammingLesson1, elementaryProgrammingLesson2, elementaryProgrammingLesson3;
    private Button selectionsLesson1, selectionsLesson2, selectionsLesson3;
    private Button functionsCharactersStringsLesson1, functionsCharactersStringsLesson2,
            functionsCharactersStringsLesson3, functionsCharactersStringsLesson4;
    private Button loopsLesson1, loopsLesson2, loopsLesson3;
    private Button methodsLesson1, methodsLesson2;
    private Button singleDimensionalArraysLesson1, singleDimensionalArraysLesson2;
    private ProgressBar progressBar;
    private TabLayout tabLayout;
    public static int progressStatus;
    private SharedPreferences myPref;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        // ask user if they want to take a pretest after signing up
        boolean promptPretest = getIntent().getBooleanExtra("promptPretest", false);
        if(promptPretest) {
            showPretestDialog();
        }

        initializeLessonButtons();
        setOnClickListenerForLessonButtons();

        // code for the buttons at the bottom of the homepage
        tabLayout = findViewById(R.id.tabLayout_homepage);
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                if(tab.getText().toString().equals("Profile")) {
                    startActivity(new Intent(Homepage.this, ProfileActivity.class));
                }
                else if(tab.getText().toString().equals("Options")) {
                    startActivity(new Intent(Homepage.this, OptionsActivity.class));
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                // do nothing
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

                if(tab.getText().toString().equals("Profile")) {
                    startActivity(new Intent(Homepage.this, ProfileActivity.class));
                }
                else if(tab.getText().toString().equals("Options")) {
                    startActivity(new Intent(Homepage.this, OptionsActivity.class));
                }
            }
        });

        //retrieves preferences
        myPref = getSharedPreferences("PREFERENCE", MODE_PRIVATE);
        //connects progress bar variable to the progress bar on homepage
        progressBar = findViewById(R.id.widget_progressBar);
        //gets the progress value from the questions and passes it on to the progress bar
        getTotal();
        progressStatus = myPref.getInt("total",0);
        progressBar.setProgress(progressStatus);


    }

    @Override
    public void onClick(View v) {

        if (v == elementaryProgrammingLesson1) {

            Intent intent = new Intent(Homepage.this, LessonActivity.class);
            storeLevelAndLessonData(intent, Library.Levels.ELEMENTARY_PROGRAMMING, 0);

            startActivity(intent);
        } else if (v == elementaryProgrammingLesson2) {

            Intent intent = new Intent(Homepage.this, LessonActivity.class);
            storeLevelAndLessonData(intent, Library.Levels.ELEMENTARY_PROGRAMMING, 1);

            startActivity(intent);
        } else if (v == elementaryProgrammingLesson3) {

            Intent intent = new Intent(Homepage.this, LessonActivity.class);
            storeLevelAndLessonData(intent, Library.Levels.ELEMENTARY_PROGRAMMING, 2);

            startActivity(intent);
        } else if (v == selectionsLesson1) {

            Intent intent = new Intent(Homepage.this, LessonActivity.class);
            storeLevelAndLessonData(intent, Library.Levels.SELECTIONS, 0);

            startActivity(intent);
        } else if (v == selectionsLesson2) {

            Intent intent = new Intent(Homepage.this, LessonActivity.class);
            storeLevelAndLessonData(intent, Library.Levels.SELECTIONS, 1);

            startActivity(intent);
        } else if (v == selectionsLesson3) {

            Intent intent = new Intent(Homepage.this, LessonActivity.class);
            storeLevelAndLessonData(intent, Library.Levels.SELECTIONS, 2);

            startActivity(intent);
        } else if (v == functionsCharactersStringsLesson1) {

            Intent intent = new Intent(Homepage.this, LessonActivity.class);
            storeLevelAndLessonData(intent, Library.Levels.FUNCTIONS_CHARACTERS_STRINGS, 0);

            startActivity(intent);
        } else if (v == functionsCharactersStringsLesson2) {

            Intent intent = new Intent(Homepage.this, LessonActivity.class);
            storeLevelAndLessonData(intent, Library.Levels.FUNCTIONS_CHARACTERS_STRINGS, 1);

            startActivity(intent);
        } else if (v == functionsCharactersStringsLesson3) {

            Intent intent = new Intent(Homepage.this, LessonActivity.class);
            storeLevelAndLessonData(intent, Library.Levels.FUNCTIONS_CHARACTERS_STRINGS, 2);

            startActivity(intent);
        } else if (v == functionsCharactersStringsLesson4) {

            Intent intent = new Intent(Homepage.this, LessonActivity.class);
            storeLevelAndLessonData(intent, Library.Levels.FUNCTIONS_CHARACTERS_STRINGS, 3);

            startActivity(intent);
        } else if (v == loopsLesson1) {

            Intent intent = new Intent(Homepage.this, LessonActivity.class);
            storeLevelAndLessonData(intent, Library.Levels.LOOPS, 0);

            startActivity(intent);
        } else if (v == loopsLesson2) {

            Intent intent = new Intent(Homepage.this, LessonActivity.class);
            storeLevelAndLessonData(intent, Library.Levels.LOOPS, 1);

            startActivity(intent);
        } else if (v == loopsLesson3) {

            Intent intent = new Intent(Homepage.this, LessonActivity.class);
            storeLevelAndLessonData(intent, Library.Levels.LOOPS, 2);

            startActivity(intent);
        } else if (v == methodsLesson1) {

            Intent intent = new Intent(Homepage.this, LessonActivity.class);
            storeLevelAndLessonData(intent, Library.Levels.METHODS, 0);

            startActivity(intent);
        } else if (v == methodsLesson2) {

            Intent intent = new Intent(Homepage.this, LessonActivity.class);
            storeLevelAndLessonData(intent, Library.Levels.METHODS, 1);

            startActivity(intent);
        } else if (v == singleDimensionalArraysLesson1) {

            Intent intent = new Intent(Homepage.this, LessonActivity.class);
            storeLevelAndLessonData(intent, Library.Levels.SINGLE_DIMENSIONAL_ARRAYS, 0);

            startActivity(intent);
        } else if (v == singleDimensionalArraysLesson2) {

            Intent intent = new Intent(Homepage.this, LessonActivity.class);
            storeLevelAndLessonData(intent, Library.Levels.SINGLE_DIMENSIONAL_ARRAYS, 1);

            startActivity(intent);
        }

    }

    /**
     * Stores the level and lesson data through an intent
     *
     * @param i      Intent message object used between Homepage and LessonActivity
     * @param level  the Level to be launched
     * @param lesson the lesson number to be launched (lesson 1 is 0)
     */
    private void storeLevelAndLessonData(Intent i, Library.Levels level, int lesson) {

        i.putExtra("LEVEL", level);
        i.putExtra("LESSON", lesson);
    }

    /**
     * Initializes the lesson buttons in Homepage
     */
    private void initializeLessonButtons() {

        elementaryProgrammingLesson1 = findViewById(R.id.button_ePLesson1);
        elementaryProgrammingLesson2 = findViewById(R.id.button_ePLesson2);
        elementaryProgrammingLesson3 = findViewById(R.id.button_ePLesson3);
        selectionsLesson1 = findViewById(R.id.button_sLesson1);
        selectionsLesson2 = findViewById(R.id.button_sLesson2);
        selectionsLesson3 = findViewById(R.id.button_sLesson3);
        functionsCharactersStringsLesson1 = findViewById(R.id.button_fCSLesson1);
        functionsCharactersStringsLesson2 = findViewById(R.id.button_fCSLesson2);
        functionsCharactersStringsLesson3 = findViewById(R.id.button_fCSLesson3);
        functionsCharactersStringsLesson4 = findViewById(R.id.button_fCSLesson4);
        loopsLesson1 = findViewById(R.id.button_while);
        loopsLesson2 = findViewById(R.id.button_for);
        loopsLesson3 = findViewById(R.id.button_do);
        methodsLesson1 = findViewById(R.id.button_mLesson1);
        methodsLesson2 = findViewById(R.id.button_mLesson2);
        singleDimensionalArraysLesson1 = findViewById(R.id.button_aLesson1);
        singleDimensionalArraysLesson2 = findViewById(R.id.button_aLesson2);
    }

    /**
     * Sets the on click listener for the lesson buttons
     */
    private void setOnClickListenerForLessonButtons() {

        elementaryProgrammingLesson1.setOnClickListener(this);
        elementaryProgrammingLesson2.setOnClickListener(this);
        elementaryProgrammingLesson3.setOnClickListener(this);
        selectionsLesson1.setOnClickListener(this);
        selectionsLesson2.setOnClickListener(this);
        selectionsLesson3.setOnClickListener(this);
        functionsCharactersStringsLesson1.setOnClickListener(this);
        functionsCharactersStringsLesson2.setOnClickListener(this);
        functionsCharactersStringsLesson3.setOnClickListener(this);
        functionsCharactersStringsLesson4.setOnClickListener(this);
        loopsLesson1.setOnClickListener(this);
        loopsLesson2.setOnClickListener(this);
        loopsLesson3.setOnClickListener(this);
        methodsLesson1.setOnClickListener(this);
        methodsLesson2.setOnClickListener(this);
        singleDimensionalArraysLesson1.setOnClickListener(this);
        singleDimensionalArraysLesson2.setOnClickListener(this);
    }

    // offers the user to take a pretest to test out of levels
    private void showPretestDialog() {

        // setup dialog
        AlertDialog.Builder builder = new AlertDialog.Builder(Homepage.this);
        builder.setTitle("Take Pretest?");
        builder.setMessage("Would you like to take a pretest for a chance to test out of levels?");

        builder.setPositiveButton("Accept", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                startActivity(new Intent(Homepage.this, PreTestActivity.class));
            }
        });

        // do nothing
        builder.setNegativeButton("Decline", null);

        // show dialog
        AlertDialog dialog = builder.create();
        dialog.show();
    }
    private void getTotal(){
        int totalScore;
        double elementary,selection,function,loop,method,array;
        //adds all lesson scores
        elementary = (myPref.getInt("elementaryProgramming1",0)+
                myPref.getInt("elementaryProgramming2",0)+
                myPref.getInt("elementaryProgramming3",0))/3.0;
        selection = myPref.getInt("selections1",0)+
                myPref.getInt("selections2",0)+
                myPref.getInt("selections3",0)/3.0;
        function = myPref.getInt("functionsCharactersStrings1",0)+
                myPref.getInt("functionsCharactersStrings2",0)+
                myPref.getInt("functionsCharactersStrings3",0)+
                myPref.getInt("functionsCharactersStrings4",0)/4.0;
        loop = myPref.getInt("loops1",0)+
                myPref.getInt("loops2",0)+
                myPref.getInt("loops3",0)/3.0;
        method = myPref.getInt("methods1",0)+
                myPref.getInt("methods2",0)/2.0;
        array = myPref.getInt("singleDimensionalArrays1",0)+
                myPref.getInt("singleDimensionalArrays2",0)/2.0;
        //compares sectional scores to pretest scores for that section
        totalScore = Math.max((int)elementary,myPref.getInt("elementaryProgrammingPretest",0))+
                Math.max((int)selection, myPref.getInt("selectionsPretest",0))+
                Math.max((int)function,myPref.getInt("functionsCharactersStringsPretest",0))+
                Math.max((int)loop,myPref.getInt("loopsPretest",0))+
                Math.max((int)method,myPref.getInt("methodsPretest",0))+
                Math.max((int)array, myPref.getInt("singleDimensionalArraysPretest",0));
        //converts to percent
        totalScore = (int)(totalScore/6.0);
        //sets total percent in shared preferences
        myPref.edit().putInt("total",totalScore).apply();
    }
}