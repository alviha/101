package com.example.myapplication;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.intent.Intents;
import android.support.test.rule.ActivityTestRule;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.intent.Intents.intended;
import static android.support.test.espresso.intent.matcher.IntentMatchers.hasComponent;
import static android.support.test.espresso.matcher.ViewMatchers.hasTextColor;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

public class QuestionActivityTest {

    @Rule
    public ActivityTestRule<QuestionActivity> mActivityTestRule = new ActivityTestRule<QuestionActivity>(QuestionActivity.class);

    private CharSequence correctAnswer;
    private AnswerChoice[][] answerChoiceSet;
    RadioGroup answerChoicesGroup;
    int idOfCorrectChoice;


    @Before
    public void setUp() throws Exception {

        correctAnswer = "";
        idOfCorrectChoice = 0;

        // QuestionActivity is defaulted to launch Lesson 1 of Single Dimensional Arrays
        answerChoiceSet = Library.getAnswerChoices(Library.Levels.SINGLE_DIMENSIONAL_ARRAYS, 0);
        answerChoicesGroup = mActivityTestRule.getActivity().findViewById(R.id.radioGroup_answerChoices);

        Intents.init();
    }

    // test: clicking the hint button shows the hint for the question
    @Test
    public void testShowHint() {

        Espresso.onView(withId(R.id.button_showHint)).perform(ViewActions.scrollTo());
        Espresso.onView(withId(R.id.button_showHint)).perform(click()); // click the show hint button

        Espresso.onView(withId(R.id.text_hint)).check(ViewAssertions.matches(isDisplayed())); // check if hint text is displayed
    }

    // test: submitting the correct answer turns the answer choice green
    @Test
    public void testCorrectAnswer() {

        findCorrectAnswer(0);
        findIdOfCorrectRadioButton();

        Espresso.onView(withId(idOfCorrectChoice)).perform(ViewActions.scrollTo());
        Espresso.onView(withId(idOfCorrectChoice)).perform(click()); // click the correct answer choice
        Espresso.onView(withId(R.id.button_submitAnswer)).perform(click()); // click the submit answer button

        Espresso.onView(withId(R.id.button_nextQuestion)).check(ViewAssertions.matches(isDisplayed()));

    }

    @After
    public void tearDown() throws Exception {
        Intents.release();
    }

    private void findCorrectAnswer(int questionNumber) {

        for(AnswerChoice a : answerChoiceSet[questionNumber]) {
            if(a.isCorrect()){
                correctAnswer = a.getContent();
            }
        }
    }

    private void findIdOfCorrectRadioButton() {

        for(int i = 0; i < answerChoicesGroup.getChildCount(); i++) {
            RadioButton rb = (RadioButton)answerChoicesGroup.getChildAt(i);
            if(rb.getText().equals(correctAnswer)){
                idOfCorrectChoice = rb.getId();
            }
        }
    }

}