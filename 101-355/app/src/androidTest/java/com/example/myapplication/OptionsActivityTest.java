package com.example.myapplication;

import android.content.Intent;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.intent.Intents;
import android.support.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.pressBackUnconditionally;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.intent.Intents.intended;
import static android.support.test.espresso.intent.matcher.IntentMatchers.hasAction;
import static android.support.test.espresso.matcher.ViewMatchers.hasErrorText;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.isRoot;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.*;

public class OptionsActivityTest {

    @Rule
    public ActivityTestRule<OptionsActivity> mActivityTestRule = new ActivityTestRule<OptionsActivity>(OptionsActivity.class);

    @Before
    public void setUp() throws Exception {
        Intents.init();
    }

    // test: clicking on app tutorial displays app tutorial page
    @Test
    public void testClickAppTutorial() {
        Espresso.onView(withId(R.id.button_appTutorial)).perform(click()); // click the app tutorial button
        Espresso.onView(withId(R.id.text_heading_appTutorial)).check(matches(isDisplayed())); // assert header name
    }

    // test: clicking on faqs displays frequently asked questions page
    @Test
    public void testClickFAQs() {
        Espresso.onView(withId(R.id.button_faqs)).perform(click()); // click the faqs button
        Espresso.onView(withId(R.id.text_heading_faq)).check(matches(isDisplayed())); // assert header name
    }

    // test: clicking on feedback displays feedback page
    @Test
    public void testClickFeedback() throws InterruptedException {
        Espresso.onView(withId(R.id.button_feedback)).perform(click()); // click the feedback button
        Thread.sleep(500);
        Espresso.onView(withId(R.id.text_heading_feedback)).check(matches(withText(containsString("Feedback")))); // assert header name
    }

    // test: clicking on bug reporting displays bug reporting page
    @Test
    public void testClickBugReporting() {
        Espresso.onView(withId(R.id.button_bugReporting)).perform(click()); // click the bug reporting button
        Espresso.onView(withId(R.id.text_heading_feedback)).check(matches(withText(containsString("Bug Report")))); // assert header name
    }

    // test: sending a feedback without writing a message displays error message
    @Test
    public void testFeedbackNoMessage() {
        Espresso.onView(withId(R.id.button_feedback)).perform(click()); // click the feedback button
        Espresso.onView(withId(R.id.button_sendMessage)).perform(click()); // click the send feedback button

        Espresso.onView(withId(R.id.input_feedbackMessage))
                .check(matches(hasErrorText("This field is required"))); // check if error message is displayed
    }

    // test: sending a bug report without writing a message displays error message
    @Test
    public void testBugReportingNoMessage() {
        Espresso.onView(withId(R.id.button_bugReporting)).perform(click()); // click the feedback button
        Espresso.onView(withId(R.id.button_sendMessage)).perform(click()); // click the send feedback button

        Espresso.onView(withId(R.id.input_feedbackMessage))
                .check(matches(hasErrorText("This field is required"))); // check if error message is displayed
    }

    // test: sending a feedback message launches app chooser
    @Test
    public void testFeedback() throws InterruptedException {
        Espresso.onView(withId(R.id.button_feedback)).perform(click()); // click the feedback button
        Espresso.onView(withId(R.id.input_feedbackMessage)).perform(typeText("Feedback test")); // type feedback message
        Espresso.closeSoftKeyboard();
        Espresso.onView(withId(R.id.button_sendMessage)).perform(click()); // click the send feedback button

        Thread.sleep(1000); // idle before assertion
        intended(hasAction(Intent.ACTION_CHOOSER)); // assert app chooser is launched
    }

    // test: sending a bug report message launches app chooser
    @Test
    public void testBugReport() throws InterruptedException {
        Espresso.onView(withId(R.id.button_bugReporting)).perform(click()); // click the bug report button
        Espresso.onView(withId(R.id.input_feedbackMessage)).perform(typeText("Bug report test")); // type bug report message
        Espresso.closeSoftKeyboard();
        Espresso.onView(withId(R.id.button_sendMessage)).perform(click()); // click the send bug report button

        Thread.sleep(1000); // idle before assertion
        intended(hasAction(Intent.ACTION_CHOOSER)); // assert app chooser is launched
        Espresso.onView(isRoot()).perform(pressBackUnconditionally()); // press back button to close chooser
    }

    // test: click the back button from options ends the options activity and goes back to homepage
    @Test
    public void onBackPressedFromOptions() throws InterruptedException {
        Espresso.onView(isRoot()).perform(pressBackUnconditionally()); // press back button
        assertTrue(mActivityTestRule.getActivity().isFinishing()); // assert finish activity
    }

    // test: click the back button from app tutorial displays the options screen
    @Test
    public void onBackPressedFromAppTutorial() throws InterruptedException {
        Espresso.onView(withId(R.id.button_appTutorial)).perform(click()); // click the app tutorial button
        Espresso.onView(isRoot()).perform(pressBackUnconditionally()); // press back button
        Espresso.onView(withId(R.id.text_heading_options)).check(matches(withText(containsString("Options")))); // assert header name
    }

    // test: click the back button from faqs displays the options screen
    @Test
    public void onBackPressedFromFAQs() throws InterruptedException {
        Espresso.onView(withId(R.id.button_faqs)).perform(click()); // click the faqs button
        Espresso.onView(isRoot()).perform(pressBackUnconditionally()); // press back button
        Espresso.onView(withId(R.id.text_heading_options)).check(matches(withText(containsString("Options")))); // assert header name
    }

    // test: click the back button from feedback displays the options screen
    @Test
    public void onBackPressedFromFeedback() throws InterruptedException {
        Espresso.onView(withId(R.id.button_feedback)).perform(click()); // click the feedback button
        Espresso.onView(isRoot()).perform(pressBackUnconditionally()); // press back button
        Espresso.onView(withId(R.id.text_heading_options)).check(matches(withText(containsString("Options")))); // assert header name
    }

    // test: click the back button from bug reoporting displays the options screen
    @Test
    public void onBackPressedFromBugReporting() throws InterruptedException {
        Espresso.onView(withId(R.id.button_bugReporting)).perform(click()); // click the bug reporting button
        Espresso.onView(isRoot()).perform(pressBackUnconditionally()); // press back button
        Espresso.onView(withId(R.id.text_heading_options)).check(matches(withText(containsString("Options")))); // assert header name
    }

    @After
    public void tearDown() throws Exception {
        Intents.release();
    }
}