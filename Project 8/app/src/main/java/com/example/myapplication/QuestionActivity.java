package com.example.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class QuestionActivity extends AppCompatActivity implements View.OnClickListener{

    // Challenge UI elements
    TextView questionHeading, question, hintText;
    RadioGroup answerChoicesGroup;
    RadioButton choice1, choice2, choice3, choice4;
    Button hint, submitAnswer, next;

    // Results screen UI elements
    TextView scoreResult, resultFeedback;
    Button repeatChallenge, backToHomepage;

    // Level and lesson data to be retrieved from intent
    private static Library.Levels level;
    private static int lesson;

    // Variables related to the challenge
    private String[] questionSet;
    private AnswerChoice[][] answerChoiceSet;
    private String[] hintSet;
    private int score;
    private int questionNumber;
    private int mistakeCounter;
    private List<String> correctAnswersList;
    public static int progressStatus;
    private double percent;
    private static double scorePercent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        // initialize UI Elements
        questionHeading = findViewById(R.id.text_questionNumber);
        question = findViewById(R.id.text_question);
        answerChoicesGroup = findViewById(R.id.radioGroup_answerChoices);
        hintText = findViewById(R.id.text_hint);
        hint = findViewById(R.id.button_showHint);
        submitAnswer = findViewById(R.id.button_submitAnswer);
        next = findViewById(R.id.button_nextQuestion);

        // set listener for the buttons
        hint.setOnClickListener(this);
        submitAnswer.setOnClickListener(this);
        next.setOnClickListener(this);

        // retrieve level and lesson data from intent
        level = (Library.Levels) getIntent().getSerializableExtra("LEVEL");
        lesson = getIntent().getIntExtra("LESSON", 0);

        // retrieve question and answer set from Library class
        questionSet = Library.getQuestions(level, lesson);
        answerChoiceSet = Library.getAnswerChoices(level, lesson);
        hintSet = Library.getHints(level, lesson);

        // set score to max number of questions, and set question number to the first question
        score = questionSet.length;
        questionNumber = 0;
        //sets percent to current progress
        percent = Homepage.progressStatus;

        // show first question
        showNextQuestion();
    }

    @Override
    public void onClick(View v) {

        // submit answer button is clicked
        if(v == submitAnswer) {

            // no answer choice was selected
            if(answerChoicesGroup.getCheckedRadioButtonId() == -1) {
                Toast.makeText(QuestionActivity.this, "No answer choice was selected", Toast.LENGTH_SHORT).show();
                return;
            }

            // selected answer is correct
            if(answerIsCorrect()) {
                Toast.makeText(QuestionActivity.this, "Correct", Toast.LENGTH_SHORT).show();
                showAnswer();
            }

            // selected answer is incorrect
            else {

                Toast.makeText(QuestionActivity.this, "Incorrect", Toast.LENGTH_SHORT).show();

                // make selected answer not clickable
                findViewById(answerChoicesGroup.getCheckedRadioButtonId()).setClickable(false);
                answerChoicesGroup.clearCheck();

                mistakeCounter++;

                // decrement score only when the first mistake is made
                if(mistakeCounter == 1) {
                    score--;
                }

                if(mistakeCounter == 3) {
                    showAnswer();
                }

            }

        }

        // next question button
        if(v == next) {

            hintText.setVisibility(View.INVISIBLE);
            hint.setVisibility(View.VISIBLE);
            submitAnswer.setVisibility(View.VISIBLE);
            next.setVisibility(View.INVISIBLE);

            // all questions have been answered
            if(questionNumber > questionSet.length - 1) {
                showResults();
            }
            else {

                // clear radio button selection, and show next question
                answerChoicesGroup.clearCheck();
                showNextQuestion();
            }

            // clear highlights for radio buttons
            for(int i = 0; i < answerChoicesGroup.getChildCount(); i++) {
                answerChoicesGroup.getChildAt(i).setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.common_google_signin_btn_text_light_default));
            }
        }

        // show hint button
        if (v == hint){

            hintText.setText(hintSet[questionNumber]);
            hintText.setVisibility(View.VISIBLE);
            hint.setVisibility(View.INVISIBLE);
        }

        if(v == repeatChallenge) {

            questionNumber = 0;
            score = questionSet.length;

            // hide question related elements
            questionHeading.setVisibility(View.VISIBLE);
            question.setVisibility(View.VISIBLE);
            answerChoicesGroup.setVisibility(View.VISIBLE);
            hint.setVisibility(View.VISIBLE);
            hintText.setVisibility(View.INVISIBLE);
            submitAnswer.setVisibility(View.VISIBLE);
            next.setVisibility(View.INVISIBLE);

            // hide result screen elements
            findViewById(R.id.text_challengeCompleted).setVisibility(View.GONE);
            scoreResult.setVisibility(View.GONE);
            resultFeedback.setVisibility(View.GONE);
            repeatChallenge.setVisibility(View.GONE);
            backToHomepage.setVisibility(View.GONE);

            showNextQuestion();
        }

        if(v == backToHomepage) {

            Intent intent = new Intent(QuestionActivity.this, Homepage.class);
            startActivity(intent);
            finish();
        }


    }

    private void showNextQuestion() {

        mistakeCounter = 0;

        answerChoicesGroup.clearCheck();

        // reset radio buttons to be clickable
        for(int i = 0; i < answerChoicesGroup.getChildCount(); i++) {
            answerChoicesGroup.getChildAt(i).setClickable(true);
        }

        // Set the question and heading
        question.setText(questionSet[questionNumber]);
        int questionHeadingNumber = questionNumber+1;
        questionHeading.setText("Question " + questionHeadingNumber + ":");

        // add the correct answer choices to the correct answer list
        correctAnswersList = new ArrayList<>();
        for(AnswerChoice answer : answerChoiceSet[questionNumber]) {
            if(answer.isCorrect()) {
                correctAnswersList.add(answer.getContent());
            }
        }

        // create ArrayList with answerChoiceSet
        List<AnswerChoice> answers = new ArrayList<>(Arrays.asList(answerChoiceSet[questionNumber]));

        // shuffle answer choices
        Collections.shuffle(answers);

        // Set the text of the radio buttons to the answer choices
        int i = 0;
        while(!answers.isEmpty()) {
            ((RadioButton)answerChoicesGroup.getChildAt(i)).setText(answers.remove(0).getContent());
            i++;
        }

    }

    /**
     * Checks if the selected answer is correct
     * @return true if selected answer is correct, otherwise false
     */
    private boolean answerIsCorrect() {

        // retrieve the text of the selected answer
        int idOfCheckedButton = answerChoicesGroup.getCheckedRadioButtonId();
        View checkedButton = answerChoicesGroup.findViewById(idOfCheckedButton);
        int indexOfCheckedButton = answerChoicesGroup.indexOfChild(checkedButton);
        CharSequence selectedAnswer = ((RadioButton)answerChoicesGroup.getChildAt(indexOfCheckedButton)).getText();

        // selected answer is not correct
        if(!correctAnswersList.contains(selectedAnswer)) {
            checkedButton.setBackgroundColor(Color.RED);
            return false;
        }

        checkedButton.setBackgroundColor(Color.GREEN);

        next.setVisibility(View.VISIBLE);
        return true;
    }

    private void showAnswer(){

        submitAnswer.setVisibility(View.INVISIBLE);
        hint.setVisibility(View.INVISIBLE);
        hintText.setVisibility(View.INVISIBLE);
        next.setVisibility(View.VISIBLE);

        for(int i = 0; i < answerChoicesGroup.getChildCount(); i++) {
            answerChoicesGroup.getChildAt(i).setClickable(false);
        }

        questionNumber++;
    }

    /**
     *  shows the result screen
     */
    private void showResults() {

        // hide question related elements
        questionHeading.setVisibility(View.GONE);
        question.setVisibility(View.GONE);
        answerChoicesGroup.setVisibility(View.GONE);
        hint.setVisibility(View.GONE);
        hintText.setVisibility(View.GONE);
        submitAnswer.setVisibility(View.GONE);
        next.setVisibility(View.GONE);

        // initialize buttons and set on click listener
        repeatChallenge = findViewById(R.id.button_repeatChallenge);
        backToHomepage = findViewById(R.id.button_backToHomepage);
        repeatChallenge.setOnClickListener(this);
        backToHomepage.setOnClickListener(this);

        // show result screen elements
        findViewById(R.id.text_challengeCompleted).setVisibility(View.VISIBLE);
        scoreResult = findViewById(R.id.text_scoreResult);
        scoreResult.setVisibility(View.VISIBLE);
        resultFeedback = findViewById(R.id.text_resultFeedback);
        resultFeedback.setVisibility(View.VISIBLE);
        repeatChallenge.setVisibility(View.VISIBLE);
        backToHomepage.setVisibility(View.VISIBLE);

        //calculates percentage complete then converts to int
        percent = (score/140.0)*100.0 + percent;
        progressStatus = (int)percent;
        Progress.ProgressStatus(progressStatus);
        Homepage.progressStatus = (int)percent;
        scorePercent = (score/questionSet.length)*100.0;

        // show score
        DecimalFormat scoreFormat = new DecimalFormat("##.##%");
        double scorePercentage = (score / 1.0) / questionSet.length;
        scoreResult.setText("Results\n\n" + score + "/" + questionSet.length + "\n\n" + scoreFormat.format(scorePercentage));

        if(scorePercentage >= 1.0) {
            resultFeedback.setText("Excellent Job!");
        }
        else if(scorePercentage >= 0.8) {
            resultFeedback.setText("Nice job!");
        }
        else {
            resultFeedback.setText("An 80% or better is required to unlock the next lesson");
        }
    }
    public static void setUnlock(){
        Unlock.UnlockLevel((int)scorePercent,lesson,level);
    }

}