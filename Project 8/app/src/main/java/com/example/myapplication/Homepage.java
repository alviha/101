package com.example.myapplication;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Homepage extends AppCompatActivity implements View.OnClickListener {

    private Button sample;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        sample = findViewById(R.id.button_ePLesson1);
        sample.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if ( v == sample){

            // store level and lesson data in the intent
            Intent intent = new Intent(Homepage.this, LessonActivity.class);
            intent.putExtra("LEVEL", Library.Levels.ELEMENTARY_PROGRAMMING);
            intent.putExtra("LESSON", 0);

            startActivity(intent);
        }

    }
}