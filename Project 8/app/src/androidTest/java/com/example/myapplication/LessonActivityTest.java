/**
 *  Test class of the LessonActivity using JUnit 4 and Espresso
 *
 * @author Bufford Brian Sta Maria
 *
 * CMSC 355, Spring 2019
 * Project A8
 * 3/30/2019
 *
 */
package com.example.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.intent.Intents;
import android.support.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.scrollTo;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.intent.Intents.intended;
import static android.support.test.espresso.intent.matcher.IntentMatchers.hasAction;
import static android.support.test.espresso.intent.matcher.IntentMatchers.hasComponent;
import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

public class LessonActivityTest {

    @Rule
    public ActivityTestRule<LessonActivity> mActivityTestRule = new ActivityTestRule<LessonActivity>(LessonActivity.class);

    @Before
    public void setUp() throws Exception {
        Intents.init();
    }

    // test: clicking next takes you to the QuestionActivity IF it is clickable (lesson is unlocked)
    @Test
    public void testGoToQuestions() throws InterruptedException {

        if(LessonActivity.lessonIsUnlocked) {
            Espresso.onView(withId(R.id.button_toNextQuestion)).perform(scrollTo()); // scroll to next button
            Espresso.onView(withId(R.id.button_toNextQuestion)).perform(click()); // click the next button

            Thread.sleep(500); // idle test to wait for activity to launch before assertion
            intended(hasComponent(QuestionActivity.class.getName())); // assert if question activity is launched
        }
    }

    // test: clicking back to homepage takes you back to the homepage
    @Test
    public void testBackToHomepage() {

        Espresso.onView(withId(R.id.button_toHomepage)).perform(click()); // click back to homepage button
        assertTrue(mActivityTestRule.getActivity().isFinishing()); // assert finish activity
    }

    // test: clicking the helpful resource link launches launches another app
    @Test
    public void testHelpfulResource() throws InterruptedException {

        Espresso.onView(withId(R.id.text_resourceLink)).perform(click()); // click resource link text
        Thread.sleep(500); // idle before assertion
        intended(hasAction(Intent.ACTION_VIEW)); // assert another app was launched
    }

    @After
    public void tearDown() throws Exception {
        Intents.release();
    }

}