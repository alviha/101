package com.example.myapplication;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

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

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        initializeLessonButtons();
        setOnClickListenerForLessonButtons();

        // code for the buttons at the bottom of the homepage
        tabLayout = findViewById(R.id.tabLayout_homepage);
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                if(tab.getText().toString().equals("Profile")) {
                    // TODO: start profile activity

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
                    // TODO: start profile activity

                }
                else if(tab.getText().toString().equals("Options")) {
                    startActivity(new Intent(Homepage.this, OptionsActivity.class));

                }
            }
        });

        //connects progress bar variable to the progress bar on homepage
        progressBar = findViewById(R.id.widget_progressBar);
        
        //gets the progress value from the questions and passes it on to the progress bar
        progressStatus = QuestionActivity.progressStatus;
        progressBar.setProgress(progressStatus);
        progressBar.incrementProgressBy(progressStatus);

    }

    @Override
    public void onClick(View v) {

        if(v == elementaryProgrammingLesson1) {

            Intent intent = new Intent(Homepage.this, LessonActivity.class);
            storeLevelAndLessonData(intent, Library.Levels.ELEMENTARY_PROGRAMMING, 0);

            startActivity(intent);
        }
        else if(v == elementaryProgrammingLesson2) {

            Intent intent = new Intent(Homepage.this, LessonActivity.class);
            storeLevelAndLessonData(intent, Library.Levels.ELEMENTARY_PROGRAMMING, 1);

            startActivity(intent);
        }
        else if(v == elementaryProgrammingLesson3) {

            Intent intent = new Intent(Homepage.this, LessonActivity.class);
            storeLevelAndLessonData(intent, Library.Levels.ELEMENTARY_PROGRAMMING, 2);

            startActivity(intent);
        }
        else if(v == selectionsLesson1) {

            Intent intent = new Intent(Homepage.this, LessonActivity.class);
            storeLevelAndLessonData(intent, Library.Levels.SELECTIONS, 0);

            startActivity(intent);
        }
        else if(v == selectionsLesson2) {

            Intent intent = new Intent(Homepage.this, LessonActivity.class);
            storeLevelAndLessonData(intent, Library.Levels.SELECTIONS, 1);

            startActivity(intent);
        }
        else if(v == selectionsLesson3) {

            Intent intent = new Intent(Homepage.this, LessonActivity.class);
            storeLevelAndLessonData(intent, Library.Levels.SELECTIONS, 2);

            startActivity(intent);
        }
        else if(v == functionsCharactersStringsLesson1) {

            Intent intent = new Intent(Homepage.this, LessonActivity.class);
            storeLevelAndLessonData(intent, Library.Levels.FUNCTIONS_CHARACTERS_STRINGS, 0);

            startActivity(intent);
        }
        else if(v == functionsCharactersStringsLesson2) {

            Intent intent = new Intent(Homepage.this, LessonActivity.class);
            storeLevelAndLessonData(intent, Library.Levels.FUNCTIONS_CHARACTERS_STRINGS, 1);

            startActivity(intent);
        }
        else if(v == functionsCharactersStringsLesson3) {

            Intent intent = new Intent(Homepage.this, LessonActivity.class);
            storeLevelAndLessonData(intent, Library.Levels.FUNCTIONS_CHARACTERS_STRINGS, 2);

            startActivity(intent);
        }
        else if(v == functionsCharactersStringsLesson4) {

            Intent intent = new Intent(Homepage.this, LessonActivity.class);
            storeLevelAndLessonData(intent, Library.Levels.FUNCTIONS_CHARACTERS_STRINGS, 3);

            startActivity(intent);
        }
        else if(v == loopsLesson1) {

            Intent intent = new Intent(Homepage.this, LessonActivity.class);
            storeLevelAndLessonData(intent, Library.Levels.LOOPS, 0);

            startActivity(intent);
        }
        else if(v == loopsLesson2) {

            Intent intent = new Intent(Homepage.this, LessonActivity.class);
            storeLevelAndLessonData(intent, Library.Levels.LOOPS, 1);

            startActivity(intent);
        }
        else if(v == loopsLesson3) {

            Intent intent = new Intent(Homepage.this, LessonActivity.class);
            storeLevelAndLessonData(intent, Library.Levels.LOOPS, 2);

            startActivity(intent);
        }
        else if(v == methodsLesson1) {

            Intent intent = new Intent(Homepage.this, LessonActivity.class);
            storeLevelAndLessonData(intent, Library.Levels.METHODS, 0);

            startActivity(intent);
        }
        else if(v == methodsLesson2) {

            Intent intent = new Intent(Homepage.this, LessonActivity.class);
            storeLevelAndLessonData(intent, Library.Levels.METHODS, 1);

            startActivity(intent);
        }
        else if(v == singleDimensionalArraysLesson1) {

            Intent intent = new Intent(Homepage.this, LessonActivity.class);
            storeLevelAndLessonData(intent, Library.Levels.SINGLE_DIMENSIONAL_ARRAYS, 0);

            startActivity(intent);
        }
        else if(v == singleDimensionalArraysLesson2) {

            Intent intent = new Intent(Homepage.this, LessonActivity.class);
            storeLevelAndLessonData(intent, Library.Levels.SINGLE_DIMENSIONAL_ARRAYS, 1);

            startActivity(intent);
        }

    }

    /**
     * Stores the level and lesson data through an intent
     * @param i Intent message object used between Homepage and LessonActivity
     * @param level the Level to be launched
     * @param lesson the lesson number to be launched (lesson 1 is 0)
     */
    private void storeLevelAndLessonData(Intent i, Library.Levels level, int lesson) {

        i.putExtra("LEVEL", level);
        i.putExtra("LESSON", lesson);
    }

    /**
     *  Initializes the lesson buttons in Homepage
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
     *  Sets the on click listener for the lesson buttons
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
}