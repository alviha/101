package com.example.myapplication;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.intent.Intents;
import android.support.test.rule.ActivityTestRule;
import android.util.Log;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.action.ViewActions.clearText;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.intent.Intents.intended;
import static android.support.test.espresso.intent.matcher.IntentMatchers.hasComponent;
import static android.support.test.espresso.matcher.RootMatchers.withDecorView;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.*;

public class LoginActivityTest {

    @Rule
    public ActivityTestRule<LoginActivity> mActivityTestRule = new ActivityTestRule<LoginActivity>(LoginActivity.class);

    private String testEmail;
    private String testPassword;

    @Before
    public void setUp() throws Exception {

        // valid email and password
        testEmail = "charles1232@example.com";
        testPassword = "12345678";

        Intents.init();
    }

    // test: show toast message when email has not been registered
    @Test
    public void testInputEmailNotRegistered() throws InterruptedException {

        testEmail = "unregisteredemail@example.com";

        Espresso.onView(withId(R.id.input_email)).perform(typeText(testEmail)); // enter email
        Espresso.closeSoftKeyboard();

        Espresso.onView(withId(R.id.input_password)).perform(typeText(testPassword)); // enter password
        Espresso.closeSoftKeyboard();

        Espresso.onView(withId(R.id.button_signIn)).perform(click()); // click sign in button

        // check if toast message is displayed
        Thread.sleep(500); // idle before assertion
        Espresso.onView(withText("Account not yet created."))
                .inRoot(withDecorView(not(mActivityTestRule.getActivity().getWindow().getDecorView())))
                .check(matches(isDisplayed()));
    }

    // test: show toast message when password is incorrect
    @Test
    public void testInputPasswordIncorrect() throws InterruptedException {

        testPassword = "abcdefgh";

        Espresso.onView(withId(R.id.input_email)).perform(typeText(testEmail)); // enter email
        Espresso.closeSoftKeyboard();

        Espresso.onView(withId(R.id.input_password)).perform(typeText(testPassword)); // enter password
        Espresso.closeSoftKeyboard();

        Espresso.onView(withId(R.id.button_signIn)).perform(click()); // click sign in button

        // check if toast message is displayed
        Thread.sleep(500); // idle before assertion
        Espresso.onView(withText("Account not yet created."))
                .inRoot(withDecorView(not(mActivityTestRule.getActivity().getWindow().getDecorView())))
                .check(matches(isDisplayed()));
    }

    // test: redirect to forgot password activity when 3 failed attempts is reached
    @Test
    public void testThreeFailedAttempts() throws InterruptedException {

        Espresso.onView(withId(R.id.input_email)).perform(typeText(testEmail)); // enter email
        Espresso.closeSoftKeyboard();

        testPassword = "mypassword";
        Espresso.onView(withId(R.id.input_password)).perform(typeText(testPassword)); // enter password 1st attempt
        Espresso.closeSoftKeyboard();

        Espresso.onView(withId(R.id.button_signIn)).perform(click()); // click sign in button

        Thread.sleep(1000);
        testPassword = "vcu2019!";
        Espresso.onView(withId(R.id.input_password)).perform(clearText());
        Espresso.onView(withId(R.id.input_password)).perform(typeText(testPassword)); // enter password 2nd attempt
        Espresso.closeSoftKeyboard();

        Espresso.onView(withId(R.id.button_signIn)).perform(click()); // click sign in button

        Thread.sleep(1000);
        testPassword = "helloworld";
        Espresso.onView(withId(R.id.input_password)).perform(clearText());
        Espresso.onView(withId(R.id.input_password)).perform(typeText(testPassword)); // enter password 3rd attempt
        Espresso.closeSoftKeyboard();

        Espresso.onView(withId(R.id.button_signIn)).perform(click()); // click sign in button

        Thread.sleep(2000); // idle test to wait for activity to launch before assertion
        intended(hasComponent(ForgotPasswordActivity.class.getName())); // assert if forgot password activity is launched
    }

    // test: redirect to homepage when email exists and entered password is correct
    @Test
    public void testInputsCorrect() throws InterruptedException {

        // test data initialized in setUp()

        Espresso.onView(withId(R.id.input_email)).perform(typeText(testEmail)); // enter email
        Espresso.closeSoftKeyboard();

        Espresso.onView(withId(R.id.input_password)).perform(typeText(testPassword)); // enter password
        Espresso.closeSoftKeyboard();

        Espresso.onView(withId(R.id.button_signIn)).perform(click()); // click sign in button

        Thread.sleep(2000); // idle test to wait for activity to launch before assertion
        intended(hasComponent(Homepage.class.getName())); // assert if homepage activity is launched
    }

    // test: redirect to forgot email activity when forgot email is clicked
    @Test
    public void testRedirectToForgotEmail() throws InterruptedException {

        Espresso.onView(withId(R.id.button_forgotEmail)).perform(click()); // click forgot email button

        Thread.sleep(2000); // idle test to wait for activity to launch before assertion
        intended(hasComponent(ForgotEmailActivity.class.getName())); // assert if forgot email activity is launched
    }

    // test: redirect to forgot password activity when forgot password is clicked
    @Test
    public void testRedirectToForgotPassword() throws InterruptedException {

        Espresso.onView(withId(R.id.button_forgotPassword)).perform(click()); // click forgot password button

        Thread.sleep(2000); // idle test to wait for activity to launch before assertion
        intended(hasComponent(ForgotPasswordActivity.class.getName())); // assert if forgot password activity is launched
    }

    // test: redirect to sign up activity when need to create an account is clicked
    @Test
    public void testRedirectToSignUp() throws InterruptedException {

        Espresso.onView(withId(R.id.button_createNewAccount)).perform(click()); // click need to create an account button

        Thread.sleep(2000); // idle test to wait for activity to launch before assertion
        intended(hasComponent(SignUpActivity.class.getName())); // assert if sign up activity is launched
    }

    @After
    public void tearDown() throws Exception {
        Intents.release();
    }
}