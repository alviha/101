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

public class HomepageTest {

    @Rule
    public ActivityTestRule<Homepage> mActivityTestRule = new ActivityTestRule<Homepage>(Homepage.class);

    @Before
    public void setUp() throws Exception {
        Intents.init();
    }

    // test: clicking lesson button takes you to the LessonActivity
    @Test
    public void testElementaryProgrammingLesson1() throws InterruptedException {

        Espresso.onView(withId(R.id.button_ePLesson1)).perform(click()); // click the next button

        Thread.sleep(500); // idle test to wait for activity to launch before assertion
        intended(hasComponent(LessonActivity.class.getName())); // assert if lesson activity is launched
    }

    @After
    public void tearDown() throws Exception {
        Intents.release();
    }

}