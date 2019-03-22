package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LessonActivity extends AppCompatActivity implements View.OnClickListener {

    Button button_next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson);

        button_next = findViewById(R.id.button_next);

        button_next.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v == button_next){
            startActivity(new Intent(LessonActivity.this, QuestionActivity.class));
        }
    }
}
