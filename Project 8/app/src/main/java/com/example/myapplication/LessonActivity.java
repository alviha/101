package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LessonActivity extends AppCompatActivity implements View.OnClickListener {

    // UI elements
    Button toNextQuestion, toHomepage;

    TextView nameOfLesson, intro, body;

    private String[] lessonSet;


    // level and lesson data
    private Library.Levels level;
    private int lesson;

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

        //Set listener for buttons
        toNextQuestion.setOnClickListener(this);
        toHomepage.setOnClickListener(this);

        // retrieve lesson and level data from previous activity
        level = (Library.Levels) getIntent().getSerializableExtra("LEVEL");
        lesson = getIntent().getIntExtra("LESSON", 0);

        lessonSet = Library.getSampleLessons(level,lesson);

        setLessonText();

        //finds out if current level is unlocked
        if(Unlock.isUnlocked(lesson,level)){
            toNextQuestion.setEnabled(true);
        }
        else if(lesson==0&&level==Library.Levels.ELEMENTARY_PROGRAMMING){//(Library.Levels.ELEMENTARY_PROGRAMMING.equals(0)){
            toNextQuestion.setEnabled(true);
        }
    }

    @Override
    public void onClick(View v) {

        // next button is clicked
        if(v == toNextQuestion){

            // store level and lesson data in the intent
            Intent intent = new Intent(LessonActivity.this, QuestionActivity.class);
            intent.putExtra("LEVEL", level);
            intent.putExtra("LESSON", lesson);

            startActivity(intent);
            finish();
        }
        if (v == toHomepage){

            startActivity(new Intent(LessonActivity.this, Homepage.class));
        }
    }

    private void setLessonText(){

        nameOfLesson.setText(lessonSet[0]);
        intro.setText(lessonSet[1]);
        body.setText(lessonSet[2]);
    }
}
