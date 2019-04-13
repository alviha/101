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

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.intent.Intents.intended;
import static android.support.test.espresso.intent.matcher.IntentMatchers.hasComponent;
import static android.support.test.espresso.matcher.RootMatchers.withDecorView;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.*;

public class PreTestActivityTest {

    @Rule
    public ActivityTestRule<PreTestActivity> mActivityTestRule = new ActivityTestRule<PreTestActivity>(PreTestActivity.class);

    private CharSequence correctAnswer;
    private CharSequence[] incorrectAnswers;
    private AnswerChoice[][] answerChoiceSet;
    private String[] questionSet;
    private RadioGroup answerChoicesGroup;
    private int idOfCorrectChoice;
    private int[] idOfIncorrectChoices;

    @Before
    public void setUp() throws Exception {

        correctAnswer = "";
        incorrectAnswers = new CharSequence[3];
        idOfCorrectChoice = 0;
        idOfIncorrectChoices = new int[3];

        // retrieve questions and answer choices sets for pretest
        answerChoiceSet = Library.getPreTestAnswerChoices();
        answerChoicesGroup = mActivityTestRule.getActivity().findViewById(R.id.pretest_radioGroup_answerChoices);
        questionSet = Library.getPreTestQuestions();

        Intents.init();
    }

    // test: submitting the correct answer displays the next question button
    @Test
    public void testCorrectAnswer() {

        findCorrectAnswerAndIncorrectAnswers(0);
        findIdOfCorrectAndIncorrectRadioButtons();

        Espresso.onView(withId(idOfCorrectChoice)).perform(ViewActions.scrollTo());
        Espresso.onView(withId(idOfCorrectChoice)).perform(click()); // click the correct answer choice
        Espresso.onView(withId(R.id.pretest_button_submitAnswer)).perform(click()); // click the submit answer button

        Espresso.onView(withId(R.id.pretest_button_nextQuestion)).check(ViewAssertions.matches(isDisplayed()));
    }

    // test: submitting the incorrect answer displays a toast message
    @Test
    public void testIncorrectAnswer() throws InterruptedException {

        findCorrectAnswerAndIncorrectAnswers(0);
        findIdOfCorrectAndIncorrectRadioButtons();

        Espresso.onView(withId(idOfIncorrectChoices[0])).perform(ViewActions.scrollTo());
        Espresso.onView(withId(idOfIncorrectChoices[0])).perform(click()); // click the incorrect answer choice
        Espresso.onView(withId(R.id.pretest_button_submitAnswer)).perform(click()); // click the submit answer button

        // check if toast message is displayed
        Thread.sleep(500); // idle before assertion
        Espresso.onView(withText("Incorrect"))
                .inRoot(withDecorView(not(mActivityTestRule.getActivity().getWindow().getDecorView())))
                .check(matches(isDisplayed()));
    }

    // test: clicking the next question button shows the next question
    @Test
    public void testNextQuestion() {

        findCorrectAnswerAndIncorrectAnswers(0);
        findIdOfCorrectAndIncorrectRadioButtons();

        Espresso.onView(withId(idOfCorrectChoice)).perform(ViewActions.scrollTo());
        Espresso.onView(withId(idOfCorrectChoice)).perform(click()); // click the correct answer choice
        Espresso.onView(withId(R.id.pretest_button_submitAnswer)).perform(click()); // click the submit answer button
        Espresso.onView(withId(R.id.pretest_button_nextQuestion)).perform(click()); // click the next question button

        // question text view matches the lesson's next question
        Espresso.onView(withId(R.id.pretest_text_question)).check(ViewAssertions.matches(withText(questionSet[1])));

    }

    // test: submitting all the incorrect answers displays the next question button
    @Test
    public void testSubmitAllIncorrectAnswers() {

        findCorrectAnswerAndIncorrectAnswers(0);
        findIdOfCorrectAndIncorrectRadioButtons();

        pickIncorrectAnswers(0);

        Espresso.onView(withId(R.id.pretest_button_nextQuestion)).check(ViewAssertions.matches(isDisplayed()));
    }

    // test: clicking the submit button without picking an answer choice displays a toast message
    @Test
    public void testNoAnswerChoiceSelected() throws InterruptedException {

        findCorrectAnswerAndIncorrectAnswers(0);
        findIdOfCorrectAndIncorrectRadioButtons();

        Espresso.onView(withId(R.id.pretest_button_submitAnswer)).perform(click()); // click the submit answer button

        // check if toast message is displayed
        Thread.sleep(500); // idle before assertion
        Espresso.onView(withText("No answer choice was selected"))
                .inRoot(withDecorView(not(mActivityTestRule.getActivity().getWindow().getDecorView())))
                .check(matches(isDisplayed()));

    }

    // test: completing the pretest should show the score results
    @Test
    public void testShowScore() throws InterruptedException {

        int questionCounter = 0;
        while (questionCounter < questionSet.length) {

            findCorrectAnswerAndIncorrectAnswers(questionCounter);
            findIdOfCorrectAndIncorrectRadioButtons();

            pickCorrectAnswer(questionCounter);

            questionCounter++;
        }

        Thread.sleep(500); // idle before assertion
        Espresso.onView(withId(R.id.text_preTestCompleted)).check(ViewAssertions.matches(isDisplayed()));
    }

    // test: completing the pretest and clicking exit test redirects to the homepage
    @Test
    public void testBackToHomepage() throws InterruptedException {

        int questionCounter = 0;
        while (questionCounter < questionSet.length) {

            findCorrectAnswerAndIncorrectAnswers(questionCounter);
            findIdOfCorrectAndIncorrectRadioButtons();

            pickCorrectAnswer(questionCounter);

            questionCounter++;
        }

        Espresso.onView(withId(R.id.button_exitTest)).perform(click()); // click the exit test button

        Thread.sleep(500); // idle before assertion
        intended(hasComponent(Homepage.class.getName())); // assert if homepage activity is launched
    }

    @After
    public void tearDown() throws Exception {
        Intents.release();
    }

    private void findCorrectAnswerAndIncorrectAnswers(int questionNumber) {

        int counter = 0;
        for (AnswerChoice a : answerChoiceSet[questionNumber]) {
            if (a.isCorrect()) {
                correctAnswer = a.getContent();
            } else {
                incorrectAnswers[counter] = a.getContent();
                counter++;
            }
        }
    }

    private void findIdOfCorrectAndIncorrectRadioButtons() {

        int counter = 0;
        for (int i = 0; i < answerChoicesGroup.getChildCount(); i++) {
            RadioButton rb = (RadioButton) answerChoicesGroup.getChildAt(i);
            if (rb.getText().equals(correctAnswer)) {
                idOfCorrectChoice = rb.getId();
            } else {
                idOfIncorrectChoices[counter] = rb.getId();
                counter++;
            }
        }
    }

    private void pickCorrectAnswer(int questionNumber) {


        Espresso.onView(withId(idOfCorrectChoice)).perform(ViewActions.scrollTo());
        Espresso.onView(withId(idOfCorrectChoice)).perform(click()); // click the correct answer choice
        Espresso.onView(withId(R.id.pretest_button_submitAnswer)).perform(click()); // click the submit answer button
        Espresso.onView(withId(R.id.pretest_button_nextQuestion)).perform(click()); // click the next question button

    }

    private void pickIncorrectAnswers(int questionNumber) {

        for (int i = 0; i < incorrectAnswers.length; i++) {

            Espresso.onView(withId(idOfIncorrectChoices[i])).perform(ViewActions.scrollTo());
            Espresso.onView(withId(idOfIncorrectChoices[i])).perform(click()); // click the incorrect answer choice
            Espresso.onView(withId(R.id.pretest_button_submitAnswer)).perform(click()); // click the submit answer button
        }
    }
}