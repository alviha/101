package com.example.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PreTestActivity extends AppCompatActivity implements View.OnClickListener {

    // Test UI elements
    TextView questionHeading, question;
    RadioGroup answerChoicesGroup;
    RadioButton choice1, choice2, choice3, choice4;
    Button submitAnswer, next;
    HorizontalScrollView questionScroll;

    // Results UI elements
    TextView sectionsUnlocked;
    Button exitTest;

    // Variables
    private String[] questionSet;
    private AnswerChoice[][] answerChoiceSet;
    private int[] scores;
    private int sectionNumber;
    private int questionNumber;
    private int mistakeCounter;
    private List<String> correctAnswersList;
    private static final double MAX_SECTION_SCORE = 10.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre_test);

        // initialize UI Elements
        questionHeading = findViewById(R.id.pretest_text_questionNumber);
        question = findViewById(R.id.pretest_text_question);
        answerChoicesGroup = findViewById(R.id.pretest_radioGroup_answerChoices);
        submitAnswer = findViewById(R.id.pretest_button_submitAnswer);
        next = findViewById(R.id.pretest_button_nextQuestion);
        questionScroll = findViewById(R.id.pretest_scrollView_question);

        // set listener for the buttons
        submitAnswer.setOnClickListener(this);
        next.setOnClickListener(this);

        // retrieve question and answer set from Library class
        questionSet = Library.getPreTestQuestions();
        answerChoiceSet = Library.getPreTestAnswerChoices();

        // set question number to the first question
        questionNumber = 0;

        // set the section number to the first section, initialize scores array
        sectionNumber = 0;
        scores = new int[6];

        // show first question
        showNextQuestion();
    }

    @Override
    public void onClick(View v) {

        // submit answer button is clicked
        if(v == submitAnswer) {

            // no answer choice was selected
            if(answerChoicesGroup.getCheckedRadioButtonId() == -1) {
                Toast.makeText(PreTestActivity.this, "No answer choice was selected", Toast.LENGTH_SHORT).show();
                return;
            }

            // selected answer is correct
            if(answerIsCorrect()) {
                Toast.makeText(PreTestActivity.this, "Correct", Toast.LENGTH_SHORT).show();
                showAnswer();
            }

            // selected answer is incorrect
            else {

                Toast.makeText(PreTestActivity.this, "Incorrect", Toast.LENGTH_SHORT).show();

                // make selected answer not clickable
                findViewById(answerChoicesGroup.getCheckedRadioButtonId()).setClickable(false);
                answerChoicesGroup.clearCheck();

                mistakeCounter++;

                // decrement score only when the first mistake is made
                if(mistakeCounter == 1) {
                    scores[sectionNumber]--;
                }

                if(mistakeCounter == 3) {
                    showAnswer();
                }

            }

        }

        // next question button
        if(v == next) {

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

        // exit test button
        if(v == exitTest) {

            Intent intent = new Intent(PreTestActivity.this, Homepage.class);
            startActivity(intent);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            finish();
        }

    }

    private void showNextQuestion() {

        mistakeCounter = 0;

        answerChoicesGroup.clearCheck();

        questionScroll.scrollTo(0, 0);

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
        next.setVisibility(View.VISIBLE);

        for(int i = 0; i < answerChoicesGroup.getChildCount(); i++) {
            answerChoicesGroup.getChildAt(i).setClickable(false);
        }

        questionNumber++;

        // questions for one section is complete
        if(questionNumber % 10 == 0) {
            sectionNumber++;
        }
    }

    /**
     *  shows the result screen
     */
    private void showResults() {

        // hide question related elements
        questionHeading.setVisibility(View.GONE);
        question.setVisibility(View.GONE);
        answerChoicesGroup.setVisibility(View.GONE);
        submitAnswer.setVisibility(View.GONE);
        next.setVisibility(View.GONE);

        // show results related elements
        findViewById(R.id.text_preTestCompleted).setVisibility(View.VISIBLE);
        findViewById(R.id.tableLayout_sectionsAndScores).setVisibility(View.VISIBLE);
        sectionsUnlocked = findViewById(R.id.text_sectionsUnlocked);
        sectionsUnlocked.setVisibility(View.VISIBLE);
        exitTest = findViewById(R.id.button_exitTest);
        exitTest.setVisibility(View.VISIBLE);
        exitTest.setOnClickListener(this);

        // show score
        DecimalFormat scoreFormat = new DecimalFormat("##.##%");
        ((TextView) findViewById(R.id.text_section1Score)).setText(scoreFormat.format(scores[0] / MAX_SECTION_SCORE));
        ((TextView) findViewById(R.id.text_section2Score)).setText(scoreFormat.format(scores[1] / MAX_SECTION_SCORE));
        ((TextView) findViewById(R.id.text_section3Score)).setText(scoreFormat.format(scores[2] / MAX_SECTION_SCORE));
        ((TextView) findViewById(R.id.text_section4Score)).setText(scoreFormat.format(scores[3] / MAX_SECTION_SCORE));
        ((TextView) findViewById(R.id.text_section5Score)).setText(scoreFormat.format(scores[4] / MAX_SECTION_SCORE));
        ((TextView) findViewById(R.id.text_section6Score)).setText(scoreFormat.format(scores[5] / MAX_SECTION_SCORE));

    }
}
