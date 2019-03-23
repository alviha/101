package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class QuestionActivity extends AppCompatActivity implements View.OnClickListener{

    // UI elements
    TextView question;
    Button submitAnswer;
    RadioGroup answerChoicesGroup;
    RadioButton choice1;
    RadioButton choice2;
    RadioButton choice3;
    RadioButton choice4;

    // Variables passed from previous activity
    private Library.Levels level;
    private int lesson;

    // Variables related to the challenge
    private String[] questionSet;
    private String[][] answerChoiceSet;
    private int score;
    private int questionNumber;
    private String correctAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        // initialize UI Elements
        question = findViewById(R.id.text_question);
        submitAnswer = findViewById(R.id.button_submit);
        answerChoicesGroup = findViewById(R.id.radioGroup_answerChoices);

        // set listener for submit button
        submitAnswer.setOnClickListener(this);

        // retrieve level and lesson data from previous activity
        level = Library.Levels.ELEMENTARY_PROGRAMMING; // dummy data assigned for testing, TODO: change to data passed from previous activity
        lesson = 0; // dummy data assigned for testing, TODO: change to data passed from previous activity

        // retrieve question and answer set from Library class
        questionSet = Library.getQuestions(level, lesson);
        answerChoiceSet = Library.getAnswerChoices(level, lesson);

        // set score to max number of questions, and set question number to the first question
        score = questionSet.length;
        questionNumber = 0;

        // show first question
        showNextQuestion();
    }

    @Override
    public void onClick(View v) {

        if(v == submitAnswer) {

            if(answerChoicesGroup.getCheckedRadioButtonId() == -1) {
                Toast.makeText(QuestionActivity.this, "No answer choice was selected", Toast.LENGTH_SHORT).show();
                return;
            }

            if(answerIsCorrect()) {
                Toast.makeText(QuestionActivity.this, "Correct", Toast.LENGTH_SHORT).show();
            }
            else {
                Toast.makeText(QuestionActivity.this, "Incorrect", Toast.LENGTH_SHORT).show();
                score--;
            }

            questionNumber++;

            if(questionNumber > questionSet.length - 1) {
                showResults();
            }
            else {
                answerChoicesGroup.clearCheck();
                showNextQuestion();
            }
        }
    }

    private void showNextQuestion() {

        // Set the question
        question.setText(questionSet[questionNumber]);

        // Set the first answer choice as the correct answer
        correctAnswer = answerChoiceSet[questionNumber][0];

        // create ArrayList with answerChoiceSet
        List<String> answers = new ArrayList<String>(Arrays.asList(answerChoiceSet[questionNumber]));

        // shuffle answer choices
        Collections.shuffle(answers);

        // Set the text of the radio buttons to the answer choices
        int i = 0;
        while(!answers.isEmpty()) {
            ((RadioButton)answerChoicesGroup.getChildAt(i)).setText(answers.remove(0));
            i++;
        }

    }

    private boolean answerIsCorrect() {

        for(int i = 0; i < answerChoiceSet[questionNumber].length; i++) {
            CharSequence selectedAnswer = ((RadioButton)answerChoicesGroup.getChildAt(i)).getText();
            if(TextUtils.equals(selectedAnswer, correctAnswer)) {
                return true;
            }
        }

        return false;
    }

    private void showResults() {
        answerChoicesGroup.setVisibility(View.GONE);
        question.setText("You scored " + score + "/" + questionSet.length);
    }
}
