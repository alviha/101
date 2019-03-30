package com.example.myapplication;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.intent.Intents;
import android.support.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.intent.Intents.intended;
import static android.support.test.espresso.intent.matcher.IntentMatchers.hasComponent;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

public class QuestionActivityTest {

    @Rule
    public ActivityTestRule<QuestionActivity> mActivityTestRule = new ActivityTestRule<QuestionActivity>(QuestionActivity.class);

    @Before
    public void setUp() throws Exception {
        Intents.init();
    }

    // test: clicking the hint button shows the hint for the question
    @Test
    public void testShowHint() {


        Espresso.onView(withId(R.id.button_showHint)).perform(ViewActions.scrollTo());
        Espresso.onView(withId(R.id.button_showHint)).perform(click()); // click the show hint button

        Espresso.onView(withId(R.id.text_hint)).check(ViewAssertions.matches(isDisplayed())); // check if hint text is displayed
    }

    @After
    public void tearDown() throws Exception {
        Intents.release();
    }

}