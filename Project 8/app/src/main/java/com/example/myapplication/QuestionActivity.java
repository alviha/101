package com.example.myapplication;

import android.graphics.Color;
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
    TextView questionHeading, question, hintText;
    RadioGroup answerChoicesGroup;
    RadioButton choice1, choice2, choice3, choice4;
    Button hint, submitAnswer, next;

    // Level and lesson data to be retrieved from intent
    private Library.Levels level;
    private int lesson;

    // Variables related to the challenge
    private String[] questionSet;
    private AnswerChoice[][] answerChoiceSet;
    private String[] hintSet;
    private int score;
    private int questionNumber;
    private int mistakeCounter;
    private List<String> correctAnswersList;

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

        mistakeCounter = 0;

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
                submitAnswer.setVisibility(View.INVISIBLE);
            }
            // selected answer is incorrect
            else {

                Toast.makeText(QuestionActivity.this, "Incorrect", Toast.LENGTH_SHORT).show();

                mistakeCounter++;

                if(mistakeCounter == 3) {
                    moveOn();
                }
                /** TODO: once a mistake is made, do not decrement score any further */
                score--;
            }

            questionNumber++;

        }

        if(v == next) {

            hintText.setText("");

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
            for(int i = 0; i < answerChoicesGroup.getChildCount(); i ++) {
                answerChoicesGroup.getChildAt(i).setBackgroundColor(Color.TRANSPARENT);
            }
        }

        if (v == hint){
            hintText.setText(hintSet[questionNumber]);
        }
    }

    private void showNextQuestion() {

        submitAnswer.setVisibility(View.VISIBLE);
        next.setVisibility(View.INVISIBLE);

        mistakeCounter = 0;

        // Set the question
        question.setText(questionSet[questionNumber]);

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

    private void moveOn(){

        submitAnswer.setVisibility(View.INVISIBLE);
        next.setVisibility(View.VISIBLE);

    }

    /**
     *  shows the score result
     */
    private void showResults() {

        answerChoicesGroup.setVisibility(View.GONE);
        question.setText("You scored " + score + "/" + questionSet.length);
    }
}
