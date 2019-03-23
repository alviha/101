package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LessonActivity extends AppCompatActivity implements View.OnClickListener {

    Button button_next;

    private Library.Levels level;
    private int lesson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson);

        button_next = findViewById(R.id.button_next);
        button_next.setOnClickListener(this);

        level = (Library.Levels) getIntent().getSerializableExtra("LEVEL");
        lesson = getIntent().getIntExtra("LESSON", 0);
    }

    @Override
    public void onClick(View v) {

        if(v == button_next){
            Intent intent = new Intent(LessonActivity.this, QuestionActivity.class);
            intent.putExtra("LEVEL", level);
            intent.putExtra("LESSON", lesson);
            startActivity(intent);
        }
    }
}
