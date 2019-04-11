package com.example.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LessonActivity extends AppCompatActivity implements View.OnClickListener {

    // UI elements
    Button toNextQuestion, toHomepage;

    TextView nameOfLesson, intro, body, link;

    String video;

    private String[] lessonSet;

    // level and lesson data
    private Library.Levels level;
    private int lesson;

    private SharedPreferences myPref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson);

        //Initialize UI elements
        nameOfLesson = findViewById(R.id.text_lessonName);
        body = findViewById(R.id.text_lessonBody);
        intro = findViewById(R.id.text_introduction);
        toNextQuestion = findViewById(R.id.button_toNextQuestion);
        toHomepage = findViewById(R.id.button_toHomepage);
        link = findViewById(R.id.text_resourceLink);

        //Set listener for buttons and link
        toNextQuestion.setOnClickListener(this);
        toHomepage.setOnClickListener(this);
        link.setOnClickListener(this);

        // retrieve lesson and level data from previous activity
        level = (Library.Levels) getIntent().getSerializableExtra("LEVEL");
        lesson = getIntent().getIntExtra("LESSON", 0);
        //retrieve preferences
        myPref = getSharedPreferences("PREFERENCE", MODE_PRIVATE);

        lessonSet = Library.getSampleLessons(level, lesson);

        setLessonText();

        // underline text
        link.setPaintFlags(link.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

        // set text to link
        video = getVideoLink();
        link.setText(getResources().getString(R.string.helpfulResource));

        //finds out if current level is unlocked
        if (myPref.getBoolean(Progress.unlockName(lesson, level), false)) {
            toNextQuestion.setEnabled(true);
        }
        //unlocks first level
        if (lesson == 0 && level == Library.Levels.ELEMENTARY_PROGRAMMING) {
            toNextQuestion.setEnabled(true);
        }
    }


    @Override
    public void onClick(View v) {

        // next button is clicked
        if (v == toNextQuestion) {

            // store level and lesson data in the intent
            Intent intent = new Intent(LessonActivity.this, QuestionActivity.class);
            intent.putExtra("LEVEL", level);
            intent.putExtra("LESSON", lesson);

            startActivity(intent);
            finish();
        }
        if (v == toHomepage) {
            finish();
        }
        if (v == link) {

            // redirect to youtube video
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(video)));
        }
    }

    private void setLessonText() {

        nameOfLesson.setText(lessonSet[0]);
        intro.setText(lessonSet[1]);
        body.setText(lessonSet[2]);
    }

    private String getVideoLink() {

        String[][] videoLinks = {

                // Elementary Programming Links
                {
                        "https://www.youtube.com/watch?v=JpoI_rdMgLM",
                        "https://www.youtube.com/watch?v=MSiCt6nO2G4",
                        "https://www.youtube.com/watch?v=sepAXU0V9jk"
                },

                // Selections Links
                {
                        "https://www.youtube.com/watch?v=JpoI_rdMgLM",
                        "https://www.youtube.com/watch?v=MSiCt6nO2G4",
                        "https://www.youtube.com/watch?v=sepAXU0V9jk"
                },

                // Mathematical Functions Characters and Strings Links
                {
                        "https://www.youtube.com/watch?v=JpoI_rdMgLM",
                        "https://www.youtube.com/watch?v=MSiCt6nO2G4",
                        "https://www.youtube.com/watch?v=sepAXU0V9jk",
                        "https://www.youtube.com/watch?v=W1GEMdHnCQE"
                },

                // Loops Links
                {
                        "https://www.youtube.com/watch?v=JpoI_rdMgLM",
                        "https://www.youtube.com/watch?v=MSiCt6nO2G4",
                        "https://www.youtube.com/watch?v=sepAXU0V9jk"
                },

                // Methods Links
                {
                        "https://www.youtube.com/watch?v=JpoI_rdMgLM",
                        "https://www.youtube.com/watch?v=MSiCt6nO2G4"
                },

                // Single-Dimensional Arrays Links
                {
                        "https://www.youtube.com/watch?v=JpoI_rdMgLM",
                        "https://www.youtube.com/watch?v=MSiCt6nO2G4"
                }
        };

        if (level == Library.Levels.ELEMENTARY_PROGRAMMING) {
            return videoLinks[0][lesson];
        } else if (level == Library.Levels.SELECTIONS) {
            return videoLinks[1][lesson];
        } else if (level == Library.Levels.FUNCTIONS_CHARACTERS_STRINGS) {
            return videoLinks[2][lesson];
        } else if (level == Library.Levels.LOOPS) {
            return videoLinks[3][lesson];
        } else if (level == Library.Levels.METHODS) {
            return videoLinks[4][lesson];
        } else {
            return videoLinks[5][lesson];
        }
    }
}
