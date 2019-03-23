package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class QuestionActivity extends AppCompatActivity implements View.OnClickListener{

    TextView question;

    Button submitAnswer;

    RadioGroup answerChoices;
    RadioButton choice1;
    RadioButton choice2;
    RadioButton choice3;
    RadioButton choice4;

    private Library.Levels level;
    private int lesson;

    private String[] questionSet;
    private String[][] answerChoiceSet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        question = findViewById(R.id.text_question);
        submitAnswer = findViewById(R.id.button_submit);
        answerChoices = findViewById(R.id.radioGroup_answerChoices);

        submitAnswer.setOnClickListener(this);

        level = Library.Levels.ELEMENTARY_PROGRAMMING; // TODO: dummy object for testing, change to object passed from previous activity
        lesson = 0; // TODO: dummy object for testing, change to object passed from previous activity

        questionSet = Library.getQuestions(level, lesson);
        answerChoiceSet = Library.getAnswerChoices(level, lesson);

        question.setText(questionSet[0]);

        for(int i = 0; i < answerChoiceSet[0].length; i++) {
            ((RadioButton)answerChoices.getChildAt(i)).setText(answerChoiceSet[0][i]);
        }
    }

    @Override
    public void onClick(View v) {

        if(v == submitAnswer) {

//            if(answerIsCorrect()) {
//
//            }
        }
    }

//    private static boolean answerIsCorrect() {
//
//    }
}
