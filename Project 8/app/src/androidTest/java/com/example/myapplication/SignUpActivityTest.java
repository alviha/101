package com.example.myapplication;

import android.support.test.espresso.Espresso;
import android.support.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.hasErrorText;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

public class SignUpActivityTest {

    @Rule
    public ActivityTestRule<SignUpActivity> mActivityTestRule = new ActivityTestRule<SignUpActivity>(SignUpActivity.class);

    private String testName;
    private String testUsername;
    private String testEmail;
    private String testPassword;
    private String testConfirmPassword;


    @Before
    public void setUp() throws Exception {

        testName = "Allen";
        testUsername = "allen08";
        testEmail = "allen1231133222@gmail.com";
        testPassword = "12345678";
        testConfirmPassword = "12345678";
    }


    // test: error message should show when name text field is empty
    @Test
    public void testNameInputEmpty() {

        testName = "";

        Espresso.onView(withId(R.id.input_name)).perform(typeText(testName)); // empty name text field

        Espresso.closeSoftKeyboard();

        Espresso.onView(withId(R.id.button_signUp)).perform(click()); // click the sign up button

        Espresso.onView(withId(R.id.input_name)).check(matches(hasErrorText("Name is required"))); // check if error message is displayed

    }

    // test: error message should show when username text field is empty
    @Test
    public void testUsernameInputEmpty() {

        testUsername = "";

        Espresso.onView(withId(R.id.input_name)).perform(typeText(testName));
        Espresso.onView(withId(R.id.input_username)).perform(typeText(testUsername)); // empty username text field

        Espresso.closeSoftKeyboard();

        Espresso.onView(withId(R.id.button_signUp)).perform(click()); // click the sign up button

        Espresso.onView(withId(R.id.input_username))
                .check(matches(hasErrorText("Username must be 6 characters or longer"))); // check if error message is displayed

    }

    // test: error message should show when email text field is empty
    @Test
    public void testEmailInputEmpty() {

        testEmail = "";

        Espresso.onView(withId(R.id.input_name)).perform(typeText(testName));
        Espresso.onView(withId(R.id.input_username)).perform(typeText(testUsername));
        Espresso.onView(withId(R.id.input_email)).perform(typeText(testEmail)); // empty email text field

        Espresso.closeSoftKeyboard();

        Espresso.onView(withId(R.id.button_signUp)).perform(click()); // click the sign up button

        Espresso.onView(withId(R.id.input_email))
                .check(matches(hasErrorText("Email Required"))); // check if error message is displayed

    }

    // test: error message should show when password text field is empty
    @Test
    public void testPasswordInputEmpty() {

        testPassword = "";

        Espresso.onView(withId(R.id.input_name)).perform(typeText(testName));
        Espresso.onView(withId(R.id.input_username)).perform(typeText(testUsername));
        Espresso.onView(withId(R.id.input_email)).perform(typeText(testEmail));
        Espresso.onView(withId(R.id.input_password)).perform(typeText(testPassword)); // empty password text field

        Espresso.closeSoftKeyboard();

        Espresso.onView(withId(R.id.button_signUp)).perform(click()); // click the sign up button

        Espresso.onView(withId(R.id.input_password))
                .check(matches(hasErrorText("Password must be at least 8 characters long"))); // check if error message is displayed

    }

    // test: error message should show when confirm password text field does not match the entered password
    @Test
    public void testConfirmPasswordInputDoesNotMatchPassword() {

        testConfirmPassword = "abcdefgh";

        Espresso.onView(withId(R.id.input_name)).perform(typeText(testName));
        Espresso.onView(withId(R.id.input_username)).perform(typeText(testUsername));
        Espresso.onView(withId(R.id.input_email)).perform(typeText(testEmail));
        Espresso.onView(withId(R.id.input_password)).perform(typeText(testPassword));
        Espresso.onView(withId(R.id.input_password)).perform(typeText(testPassword));

        Espresso.closeSoftKeyboard();

        Espresso.onView(withId(R.id.button_signUp)).perform(click()); // click the sign up button

        Espresso.onView(withId(R.id.input_confirmPassword))
                .check(matches(hasErrorText("Confirmed Password and Password do not match"))); // check if error message is displayed

    }

    @After
    public void tearDown() throws Exception {
    }
}