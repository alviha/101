package com.example.myapplication;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Homepage extends AppCompatActivity implements View.OnClickListener {

    private Button elementaryProgrammingLesson1, elementaryProgrammingLesson2, elementaryProgrammingLesson3;
    private Button selectionsLesson1, selectionsLesson2, selectionsLesson3;
    private Button functionsCharactersStringsLesson1, functionsCharactersStringsLesson2,
            functionsCharactersStringsLesson3, functionsCharactersStringsLesson4;
    private Button loopsLesson1, loopsLesson2, loopsLesson3;
    private Button methodsLesson1, methodsLesson2;
    private Button singleDimensionalArraysLesson1, singleDimensionalArraysLesson2;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        initializeButtons();
        setOnClickListenerForButtons();

        


    }

    @Override
    public void onClick(View v) {

        if(v == elementaryProgrammingLesson1) {

            // store level and lesson data in the intent
            Intent intent = new Intent(Homepage.this, LessonActivity.class);
            intent.putExtra("LEVEL", Library.Levels.ELEMENTARY_PROGRAMMING);
            intent.putExtra("LESSON", 0);

            startActivity(intent);
        }
        else if(v == elementaryProgrammingLesson2)

    }

    private void initializeButtons() {

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
        methodsLesson1 = findViewById(R.id.button_mlesson1);
        methodsLesson2 = findViewById(R.id.button_mLesson2);
        singleDimensionalArraysLesson1 = findViewById(R.id.button_aLesson1);
        singleDimensionalArraysLesson2 = findViewById(R.id.button_aLesson2);
    }

    private void setOnClickListenerForButtons() {

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