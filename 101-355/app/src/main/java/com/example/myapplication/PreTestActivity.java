package com.example.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
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
        scores = new int[]{10, 10, 10, 10, 10, 10};

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
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
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

        // show message that says how many sections the user has unlocked
        sectionsUnlocked.setText(getSectionsUnlockedMessage());

        // sets progress based on pretest performance
        setProgressScores();

        //unlocks sections passed with %80 or higher
        setSectionsUnlocked();

    }
    private void setSectionsUnlocked(){
        SharedPreferences myPref = getSharedPreferences("PREFERENCE", MODE_PRIVATE);
        double scoreTotal = 0.0;
        //checks to see if above %80 on elementary section
        if(((10-Math.abs(scores[0]))/MAX_SECTION_SCORE)*100.0>=80){
            //gets percent
            scoreTotal= ((10-Math.abs(scores[0]))/10.0)*100.0;
            //saves score percent and unlocks levels
            myPref.edit().putInt("elementaryProgrammingPretest",(int)scoreTotal).apply();
            myPref.edit().putBoolean("elementaryProgramming02",true).apply();
            myPref.edit().putBoolean("elementaryProgramming03",true).apply();
        }
        //checks to see if above %80 on selection section
        if(((10-Math.abs(scores[1]))/MAX_SECTION_SCORE)*100.0>=80){
            //gets percent
            scoreTotal= ((10-Math.abs(scores[1]))/MAX_SECTION_SCORE)*100.0;
            //saves score percent and unlocks levels
            myPref.edit().putInt("selectionsPretest",(int)scoreTotal).apply();
            myPref.edit().putBoolean("selections01",true).apply();
            myPref.edit().putBoolean("selections02",true).apply();
            myPref.edit().putBoolean("selections03",true).apply();
        }
        //checks to see if above %80 on function section
        if(((10-Math.abs(scores[2]))/MAX_SECTION_SCORE)*100.0>=80){
            //gets percent
            scoreTotal= ((10-Math.abs(scores[2]))/MAX_SECTION_SCORE)*100.0;
            //saves score percent and unlocks levels
            myPref.edit().putInt("functionsCharactersStringsPretest",(int)scoreTotal).apply();
            myPref.edit().putBoolean("functionsCharactersStrings01",true).apply();
            myPref.edit().putBoolean("functionsCharactersStrings02",true).apply();
            myPref.edit().putBoolean("functionsCharactersStrings03",true).apply();
            myPref.edit().putBoolean("functionsCharactersStrings04",true).apply();
        }
        //checks to see if above %80 on loops section
        if(((10-Math.abs(scores[3]))/MAX_SECTION_SCORE)*100.0>=80){
            //gets percent
            scoreTotal= ((10-Math.abs(scores[3]))/MAX_SECTION_SCORE)*100.0;
            //saves score percent and unlocks levels
            myPref.edit().putInt("loopsPretest",(int)scoreTotal).apply();
            myPref.edit().putBoolean("loops01",true).apply();
            myPref.edit().putBoolean("loops02",true).apply();
            myPref.edit().putBoolean("loops03",true).apply();
        }
        //checks to see if above %80 on methods section
        if(((10-Math.abs(scores[4]))/MAX_SECTION_SCORE)*100.0>=80) {
            //gets percent
            scoreTotal = ((10 - Math.abs(scores[4])) / MAX_SECTION_SCORE) * 100.0;
            //saves score percent and unlocks levels
            myPref.edit().putInt("methodsPretest", (int) scoreTotal).apply();
            myPref.edit().putBoolean("methods01", true).apply();
            myPref.edit().putBoolean("methods02", true).apply();
            }
            //checks to see if above %80 on arrays section
        if (((10.0 - Math.abs(scores[5])) / MAX_SECTION_SCORE) * 100.0 >= 80) {
                //gets percent
                scoreTotal = ((10.0 - Math.abs(scores[5])) / 10.0) * 100.0;
                //saves score percent and unlocks levels
                myPref.edit().putInt("singleDimensionalArraysPretest", (int) scoreTotal).apply();
                myPref.edit().putBoolean("singleDimensionalArrays01", true).apply();
                myPref.edit().putBoolean("singleDimensionalArrays02", true).apply();
            }
        //}}}}}
        //stores total percent of all sections above %80 on pretest
        myPref.edit().putInt("pretestTotal",returnTotal()).apply();
    }
    private int returnTotal(){
        SharedPreferences myPref = getSharedPreferences("PREFERENCE", MODE_PRIVATE);
        //calculates total score of all sections above %80 on pretest
        double total = myPref.getInt("singleDimensionalArraysPretest",0) +
                myPref.getInt("methodsPretest",0) +
                myPref.getInt("loopsPretest",0) +
                myPref.getInt("functionsCharactersStringsPretest",0) +
                myPref.getInt("selectionsPretest",0) +
                myPref.getInt("elementaryProgrammingPretest",0);
        //gets total percent of all sections above %80 on pretest
        total /= 6.0;
        return  (int)total;
    }

    private String getSectionsUnlockedMessage() {

        double percentage = 0.0;

        if(scores[0] >= 8) {
            percentage += 1/6.0;
        }
        if(scores[1] >= 8) {
            percentage += 1/6.0;
        }
        if(scores[2] >= 8) {
            percentage += 1/6.0;
        }
        if(scores[3] >= 8) {
            percentage += 1/6.0;
        }
        if(scores[4] >= 8) {
            percentage += 1/6.0;
        }
        if(scores[5] >= 8) {
            percentage += 1/6.0;
        }

        DecimalFormat sectionsFormat = new DecimalFormat("##.##%");
        return sectionsFormat.format(percentage) + " of the sections unlocked";
    }

    private void setProgressScores() {

        int[] scorePercentages = new int[scores.length];
        for(int i = 0; i < scorePercentages.length; i++) {
            scorePercentages[i] = scores[i] * 10;
        }

        SharedPreferences myPref = getSharedPreferences("PREFERENCE", MODE_PRIVATE);

        // set scores for Elementary Programming
        myPref.edit().putInt("elementaryProgramming1", scorePercentages[0]).apply();
        myPref.edit().putInt("elementaryProgramming2", scorePercentages[0]).apply();
        myPref.edit().putInt("elementaryProgramming3", scorePercentages[0]).apply();

        // set scores for Selections
        myPref.edit().putInt("selections1", scorePercentages[1]).apply();
        myPref.edit().putInt("selections2", scorePercentages[1]).apply();
        myPref.edit().putInt("selections3", scorePercentages[1]).apply();

        // set scores for Functions Characters and Strings
        myPref.edit().putInt("functionsCharactersStrings1", scorePercentages[2]).apply();
        myPref.edit().putInt("functionsCharactersStrings2", scorePercentages[2]).apply();
        myPref.edit().putInt("functionsCharactersStrings3", scorePercentages[2]).apply();
        myPref.edit().putInt("functionsCharactersStrings4", scorePercentages[2]).apply();

        // set scores for Loops
        myPref.edit().putInt("loops1", scorePercentages[3]).apply();
        myPref.edit().putInt("loops2", scorePercentages[3]).apply();
        myPref.edit().putInt("loops3", scorePercentages[3]).apply();

        // set scores for Methods
        myPref.edit().putInt("methods1", scorePercentages[4]).apply();
        myPref.edit().putInt("methods2", scorePercentages[4]).apply();

        // set scores for Single-Dimensional Arrays
        myPref.edit().putInt("singleDimensionalArrays1", scorePercentages[5]).apply();
        myPref.edit().putInt("singleDimensionalArrays2", scorePercentages[5]).apply();
    }
}
