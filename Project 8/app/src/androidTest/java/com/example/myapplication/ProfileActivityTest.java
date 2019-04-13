package com.example.myapplication;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.intent.Intents;
import android.support.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.pressBack;
import static android.support.test.espresso.action.ViewActions.pressBackUnconditionally;
import static android.support.test.espresso.assertion.ViewAssertions.doesNotExist;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.intent.Intents.intended;
import static android.support.test.espresso.intent.Intents.intending;
import static android.support.test.espresso.intent.matcher.IntentMatchers.hasComponent;
import static android.support.test.espresso.matcher.RootMatchers.withDecorView;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.isRoot;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.*;

public class ProfileActivityTest {

    @Rule
    public ActivityTestRule<ProfileActivity> mActivityTestRule = new ActivityTestRule<ProfileActivity>(ProfileActivity.class);

    @Before
    public void setUp() throws Exception {
        Intents.init();
    }

    // test: clicking on progress button displays a progress snapshot
    @Test
    public void testClickProgress() {
        Espresso.onView(withId(R.id.button_Progress)).perform(click()); // click the progress button
        Espresso.onView(withId(R.id.text_ProfileHeader)).check(matches(withText(containsString("Progress")))); // assert header name
    }

    // test: clicking on achievements button displays the achievements and medals
    @Test
    public void testClickAchievements() {
        Espresso.onView(withId(R.id.button_Achievements)).perform(click()); // click the achievements button
        Espresso.onView(withId(R.id.text_ProfileHeader)).check(matches(withText(containsString("Achievements")))); // assert header name
    }

    // test: clicking on reset button displays alert dialog
    @Test
    public void testClickResetAlertDialog() {
        Espresso.onView(withId(R.id.button_Reset)).perform(click()); // click the reset button
        Espresso.onView(withText("Reset Progress?")).check(matches(isDisplayed())); // check if alert dialog is displayed
    }

    // test: clicking on reset button, and clicking cancel hides the alert dialog
    @Test
    public void testCancelReset() {
        Espresso.onView(withId(R.id.button_Reset)).perform(click()); // click the reset button
        Espresso.onView(withText("Reset Progress?")).check(matches(isDisplayed())); // check if alert dialog is displayed
        Espresso.onView(withText(equalToIgnoringCase("Cancel"))).perform(click()); // click cancel button
        Espresso.onView(withText("Reset Progress?")).check(doesNotExist()); // check if alert dialog is not displayed
    }

    // test: clicking on reset button, and clicking confirm to reset progress will reset progress and redirect back to homepage
    @Test
    public void testConfirmResetRedirectToHomepage() throws InterruptedException {
        Espresso.onView(withId(R.id.button_Reset)).perform(click()); // click the reset button
        Espresso.onView(withText(equalToIgnoringCase("Confirm"))).perform(click()); // click confirm button

        Thread.sleep(500); // idle before assertion
        intended(hasComponent(Homepage.class.getName())); // assert if homepage activity is launched
    }

    // test: clicking on reset button, and clicking confirm to reset progress will reset progress and display a toast message
    @Test
    public void testConfirmResetToastMessage() throws InterruptedException {
        Espresso.onView(withId(R.id.button_Reset)).perform(click()); // click the reset button
        Espresso.onView(withText(equalToIgnoringCase("Confirm"))).perform(click()); // click confirm button

        Espresso.onView(withText("Progress has been reset"))
                .inRoot(withDecorView(not(mActivityTestRule.getActivity().getWindow().getDecorView())))
                .check(matches(isDisplayed())); // check if toast message is displayed
    }

    // test: click the back button from profile goes back to homepage
    @Test
    public void onBackPressedFromProfile() throws InterruptedException {
        Espresso.onView(isRoot()).perform(pressBackUnconditionally()); // assert header name
        assertTrue(mActivityTestRule.getActivity().isFinishing()); // assert finish activity
    }

    // test: click the back button from progress displays the profile screen
    @Test
    public void onBackPressedFromProgress() throws InterruptedException {
        Espresso.onView(withId(R.id.button_Progress)).perform(click()); // click the progress button
        Espresso.onView(isRoot()).perform(pressBackUnconditionally()); // press back button
        Espresso.onView(withId(R.id.text_ProfileHeader)).check(matches(withText(containsString("Profile")))); // assert header name
    }

    // test: click the back button from achievements displays the profile screen
    @Test
    public void onBackPressedFromAchievements() throws InterruptedException {
        Espresso.onView(withId(R.id.button_Achievements)).perform(click()); // click the achievements button
        Espresso.onView(isRoot()).perform(pressBackUnconditionally()); // press back button
        Espresso.onView(withId(R.id.text_ProfileHeader)).check(matches(withText(containsString("Profile")))); // assert header name
    }

    // test: click the back button from reset hides the alert dialog
    @Test
    public void onBackPressedFromReset() {
        Espresso.onView(withId(R.id.button_Reset)).perform(click()); // click the reset button
        Espresso.onView(isRoot()).perform(pressBackUnconditionally()); // press back button
        Espresso.onView(withText("Reset Progress?")).check(doesNotExist()); // check if alert dialog is not displayed
    }

    @After
    public void tearDown() throws Exception {
        Intents.release();
    }

}