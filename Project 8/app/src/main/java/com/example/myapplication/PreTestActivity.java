package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PreTestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre_test);

        String[] questionsSet = Library.getPreTestQuestions();
        AnswerChoice[][] preTestAnswerSet = Library.getPreTestAnswerChoices();

        int questionNumber = 0;
        while (questionNumber < questionsSet.length){
            return;
        }
    }
}
