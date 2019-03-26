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
    private AnswerChoice[][] answerChoiceSet;
    private int score;
    private int questionNumber;
    private List<String> correctAnswersList;

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

        // retrieve level and lesson data from previous activity's intent
        level = (Library.Levels) getIntent().getSerializableExtra("LEVEL");
        lesson = getIntent().getIntExtra("LESSON", 0);

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
            }
            // selected answer is incorrect, decrement the score
            else {
                Toast.makeText(QuestionActivity.this, "Incorrect", Toast.LENGTH_SHORT).show();
                score--;
            }

            questionNumber++;

            // all questions have been answered
            if(questionNumber > questionSet.length - 1) {
                showResults();
            }
            else {

                // clear radio button selection, and show next question
                answerChoicesGroup.clearCheck();
                showNextQuestion();
            }
        }
    }

    private void showNextQuestion() {

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
            return false;
        }

        return true;
    }

    /**
     *  shows the score result
     */
    private void showResults() {

        answerChoicesGroup.setVisibility(View.GONE);
        question.setText("You scored " + score + "/" + questionSet.length);
    }
}
