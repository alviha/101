package com.example.myapplication;

import android.support.test.espresso.Espresso;
import android.support.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.RootMatchers.withDecorView;
import static android.support.test.espresso.matcher.ViewMatchers.hasErrorText;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.*;

public class ForgotPasswordActivityTest {

    @Rule
    public ActivityTestRule<ForgotPasswordActivity> mActivityTestRule =
            new ActivityTestRule<ForgotPasswordActivity>(ForgotPasswordActivity.class);

    private String testEmail;

    @Before
    public void setUp() throws Exception {
        testEmail = "someemail@example.com";
    }

    // test: show error message when email text field is empty
    @Test
    public void testInputEmailEmpty() throws InterruptedException {

        testEmail = "";

        Espresso.onView(withId(R.id.input_Email)).perform(typeText(testEmail)); // empty email text field

        Espresso.onView(withId(R.id.button_SendEmail)).perform(click()); // click send email button

        Thread.sleep(500); // idle test before assertion
        Espresso.onView(withId(R.id.input_Email)).check(matches(hasErrorText("Email required")));
    }

    // test: show toast message when email has been sent
    @Test
    public void testInputEmail() {

        Espresso.onView(withId(R.id.input_Email)).perform(typeText(testEmail)); // enter email

        Espresso.onView(withId(R.id.button_SendEmail)).perform(click()); // click send email button

        // check if toast message is displayed
        Espresso.onView(withText(R.string.toast_emailSent))
                .inRoot(withDecorView(not(mActivityTestRule.getActivity().getWindow().getDecorView())))
                .check(matches(isDisplayed()));
    }

    @After
    public void tearDown() throws Exception {
    }
}