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

import android.support.test.espresso.Espresso;
import android.support.test.espresso.intent.Intents;
import android.support.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.intent.Intents.intended;
import static android.support.test.espresso.intent.matcher.IntentMatchers.hasComponent;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

public class LessonActivityTest {

    @Rule
    public ActivityTestRule<LessonActivity> mActivityTestRule = new ActivityTestRule<LessonActivity>(LessonActivity.class);

    @Before
    public void setUp() throws Exception {
        Intents.init();
    }

    // test: clicking next takes you to the QuestionActivity
    @Test
    public void testGoToQuestions() throws InterruptedException {

        Espresso.onView(withId(R.id.button_toNextQuestion)).perform(click()); // click the next button

        Thread.sleep(2000); // idle test to wait for activity to launch before assertion
        intended(hasComponent(QuestionActivity.class.getName())); // assert if question activity is launched
    }

    @After
    public void tearDown() throws Exception {
        Intents.release();
    }

}