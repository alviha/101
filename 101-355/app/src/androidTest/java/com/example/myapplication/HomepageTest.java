/**
 *  Test class of the Homepage using JUnit 4 and Espresso
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
import android.support.test.espresso.action.ViewActions;
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
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.equalToIgnoringCase;
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

        Espresso.onView(withId(R.id.button_ePLesson1)).perform(ViewActions.scrollTo());
        Espresso.onView(withId(R.id.button_ePLesson1)).perform(click()); // click the next button

        Thread.sleep(500); // idle test to wait for activity to launch before assertion
        intended(hasComponent(LessonActivity.class.getName())); // assert if lesson activity is launched
    }

    // test: clicking lesson button takes you to the LessonActivity
    @Test
    public void testElementaryProgrammingLesson2() throws InterruptedException {

        Espresso.onView(withId(R.id.button_ePLesson2)).perform(ViewActions.scrollTo());
        Espresso.onView(withId(R.id.button_ePLesson2)).perform(click()); // click the next button

        Thread.sleep(500); // idle test to wait for activity to launch before assertion
        intended(hasComponent(LessonActivity.class.getName())); // assert if lesson activity is launched
    }

    // test: clicking lesson button takes you to the LessonActivity
    @Test
    public void testElementaryProgrammingLesson3() throws InterruptedException {

        Espresso.onView(withId(R.id.button_ePLesson3)).perform(ViewActions.scrollTo());
        Espresso.onView(withId(R.id.button_ePLesson3)).perform(click()); // click the next button

        Thread.sleep(500); // idle test to wait for activity to launch before assertion
        intended(hasComponent(LessonActivity.class.getName())); // assert if lesson activity is launched
    }

    // test: clicking lesson button takes you to the LessonActivity
    @Test
    public void testSelectionsLesson1() throws InterruptedException {

        Espresso.onView(withId(R.id.button_sLesson1)).perform(ViewActions.scrollTo());
        Espresso.onView(withId(R.id.button_sLesson1)).perform(click()); // click the next button

        Thread.sleep(500); // idle test to wait for activity to launch before assertion
        intended(hasComponent(LessonActivity.class.getName())); // assert if lesson activity is launched
    }

    // test: clicking lesson button takes you to the LessonActivity
    @Test
    public void testSelectionsLesson2() throws InterruptedException {

        Espresso.onView(withId(R.id.button_sLesson2)).perform(ViewActions.scrollTo());
        Espresso.onView(withId(R.id.button_sLesson2)).perform(click()); // click the next button

        Thread.sleep(500); // idle test to wait for activity to launch before assertion
        intended(hasComponent(LessonActivity.class.getName())); // assert if lesson activity is launched
    }

    // test: clicking lesson button takes you to the LessonActivity
    @Test
    public void testSelectionsLesson3() throws InterruptedException {

        Espresso.onView(withId(R.id.button_sLesson3)).perform(ViewActions.scrollTo());
        Espresso.onView(withId(R.id.button_sLesson3)).perform(click()); // click the next button

        Thread.sleep(500); // idle test to wait for activity to launch before assertion
        intended(hasComponent(LessonActivity.class.getName())); // assert if lesson activity is launched
    }

    // test: clicking lesson button takes you to the LessonActivity
    @Test
    public void testFunctionsCharactersStringsLesson1() throws InterruptedException {

        Espresso.onView(withId(R.id.button_fCSLesson1)).perform(ViewActions.scrollTo());
        Espresso.onView(withId(R.id.button_fCSLesson1)).perform(click()); // click the next button

        Thread.sleep(500); // idle test to wait for activity to launch before assertion
        intended(hasComponent(LessonActivity.class.getName())); // assert if lesson activity is launched
    }

    // test: clicking lesson button takes you to the LessonActivity
    @Test
    public void testFunctionsCharactersStringsLesson2() throws InterruptedException {

        Espresso.onView(withId(R.id.button_fCSLesson2)).perform(ViewActions.scrollTo());
        Espresso.onView(withId(R.id.button_fCSLesson2)).perform(click()); // click the next button

        Thread.sleep(500); // idle test to wait for activity to launch before assertion
        intended(hasComponent(LessonActivity.class.getName())); // assert if lesson activity is launched
    }

    // test: clicking lesson button takes you to the LessonActivity
    @Test
    public void testFunctionsCharactersStringsLesson3() throws InterruptedException {

        Espresso.onView(withId(R.id.button_fCSLesson3)).perform(ViewActions.scrollTo());
        Espresso.onView(withId(R.id.button_fCSLesson3)).perform(click()); // click the next button

        Thread.sleep(500); // idle test to wait for activity to launch before assertion
        intended(hasComponent(LessonActivity.class.getName())); // assert if lesson activity is launched
    }

    // test: clicking lesson button takes you to the LessonActivity
    @Test
    public void testFunctionsCharactersStringsLesson4() throws InterruptedException {

        Espresso.onView(withId(R.id.button_fCSLesson4)).perform(ViewActions.scrollTo());
        Espresso.onView(withId(R.id.button_fCSLesson4)).perform(click()); // click the next button

        Thread.sleep(500); // idle test to wait for activity to launch before assertion
        intended(hasComponent(LessonActivity.class.getName())); // assert if lesson activity is launched
    }

    // test: clicking lesson button takes you to the LessonActivity
    @Test
    public void testLoopsLesson1() throws InterruptedException {

        Espresso.onView(withId(R.id.button_while)).perform(ViewActions.scrollTo());
        Espresso.onView(withId(R.id.button_while)).perform(click()); // click the next button

        Thread.sleep(500); // idle test to wait for activity to launch before assertion
        intended(hasComponent(LessonActivity.class.getName())); // assert if lesson activity is launched
    }

    // test: clicking lesson button takes you to the LessonActivity
    @Test
    public void testLoopsLesson2() throws InterruptedException {

        Espresso.onView(withId(R.id.button_for)).perform(ViewActions.scrollTo());
        Espresso.onView(withId(R.id.button_for)).perform(click()); // click the next button

        Thread.sleep(500); // idle test to wait for activity to launch before assertion
        intended(hasComponent(LessonActivity.class.getName())); // assert if lesson activity is launched
    }

    // test: clicking lesson button takes you to the LessonActivity
    @Test
    public void testLoopsLesson3() throws InterruptedException {

        Espresso.onView(withId(R.id.button_do)).perform(ViewActions.scrollTo());
        Espresso.onView(withId(R.id.button_do)).perform(click()); // click the next button

        Thread.sleep(500); // idle test to wait for activity to launch before assertion
        intended(hasComponent(LessonActivity.class.getName())); // assert if lesson activity is launched
    }

    // test: clicking lesson button takes you to the LessonActivity
    @Test
    public void testMethodsLesson1() throws InterruptedException {

        Espresso.onView(withId(R.id.button_mLesson1)).perform(ViewActions.scrollTo());
        Espresso.onView(withId(R.id.button_mLesson1)).perform(click()); // click the next button

        Thread.sleep(500); // idle test to wait for activity to launch before assertion
        intended(hasComponent(LessonActivity.class.getName())); // assert if lesson activity is launched
    }

    // test: clicking lesson button takes you to the LessonActivity
    @Test
    public void testMethodsLesson2() throws InterruptedException {

        Espresso.onView(withId(R.id.button_mLesson2)).perform(ViewActions.scrollTo());
        Espresso.onView(withId(R.id.button_mLesson2)).perform(click()); // click the next button

        Thread.sleep(500); // idle test to wait for activity to launch before assertion
        intended(hasComponent(LessonActivity.class.getName())); // assert if lesson activity is launched
    }

    // test: clicking lesson button takes you to the LessonActivity
    @Test
    public void testSingleDimensionalArrays1() throws InterruptedException {

        Espresso.onView(withId(R.id.button_aLesson1)).perform(ViewActions.scrollTo());
        Espresso.onView(withId(R.id.button_aLesson1)).perform(click()); // click the next button

        Thread.sleep(500); // idle test to wait for activity to launch before assertion
        intended(hasComponent(LessonActivity.class.getName())); // assert if lesson activity is launched
    }

    // test: clicking lesson button takes you to the LessonActivity
    @Test
    public void testSingleDimensionalArrays2() throws InterruptedException {

        Espresso.onView(withId(R.id.button_aLesson2)).perform(ViewActions.scrollTo());
        Espresso.onView(withId(R.id.button_aLesson2)).perform(click()); // click the next button

        Thread.sleep(500); // idle test to wait for activity to launch before assertion
        intended(hasComponent(LessonActivity.class.getName())); // assert if lesson activity is launched
    }

    // test: clicking profile tab takes you to the ProfileActivity
    @Test
    public void testProfile() throws InterruptedException {

        Espresso.onView(withText(equalToIgnoringCase("Profile"))).perform(click()); // click the profile tab

        Thread.sleep(500); // idle test to wait for activity to launch before assertion
        intended(hasComponent(ProfileActivity.class.getName())); // assert if profile activity is launched
    }

    // test: clicking options tab takes you to the OptionsActivity
    @Test
    public void testOptions() throws InterruptedException {

        Espresso.onView(withText(equalToIgnoringCase("Options"))).perform(click()); // click the options tab

        Thread.sleep(500); // idle test to wait for activity to launch before assertion
        intended(hasComponent(OptionsActivity.class.getName())); // assert if options activity is launched
    }

    @After
    public void tearDown() throws Exception {
        Intents.release();
    }

}