package com.example.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LessonActivity extends AppCompatActivity implements View.OnClickListener {

    // UI elements
    Button button_next;

    // level and lesson data
    private Library.Levels level;
    private int lesson;
    private SharedPreferences myPref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson);

        button_next = findViewById(R.id.button_next);
        button_next.setOnClickListener(this);

        // retrieve lesson and level data from previous activity
        level = (Library.Levels) getIntent().getSerializableExtra("LEVEL");
        lesson = getIntent().getIntExtra("LESSON", 0);
        //retrieve preferences
        myPref = getSharedPreferences("PREFERENCE", MODE_PRIVATE);
        //finds out if current level is unlocked
        if(myPref.getBoolean(Progress.unlockName(lesson,level),false)){//QuestionActivity.getUnlock(context,lesson,level)){
            button_next.setEnabled(true);
        }
        //unlocks first level
        if(lesson==0&&level==Library.Levels.ELEMENTARY_PROGRAMMING){
            button_next.setEnabled(true);
        }
    }

    @Override
    public void onClick(View v) {

        // next button is clicked
        if(v == button_next){

            // store level and lesson data in the intent
            Intent intent = new Intent(LessonActivity.this, QuestionActivity.class);
            intent.putExtra("LEVEL", level);
            intent.putExtra("LESSON", lesson);

            startActivity(intent);
            finish();
        }
    }
}
