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

public class ForgotEmailActivityTest {

    @Rule
    public ActivityTestRule<ForgotEmailActivity> mActivityTestRule = new ActivityTestRule<ForgotEmailActivity>(ForgotEmailActivity.class);

    private String testUsername;
    private String testEmail;

    @Before
    public void setUp() throws Exception {
        testUsername = "allen08";
        testEmail = "allen1231133222@gmail.com";
    }

    // test: error message should show when username text field is empty
    @Test
    public void testUsernameInputEmpty() {

        testUsername = "";

        Espresso.onView(withId(R.id.input_username)).perform(typeText(testUsername)); // empty username text field
        Espresso.closeSoftKeyboard();

        Espresso.onView(withId(R.id.input_Email)).perform(typeText(testEmail));
        Espresso.closeSoftKeyboard();

        Espresso.onView(withId(R.id.button_SendEmail)).perform(click()); // click the send email button

        Espresso.onView(withId(R.id.input_username))
                .check(matches(hasErrorText("Invalid Username"))); // check if error message is displayed

    }

    // test: error message should show when entered username is less than 6 characters, but not empty
    @Test
    public void testUsernameInputLessThan6CharactersButNotEmpty() {

        testUsername = "allen";

        Espresso.onView(withId(R.id.input_username)).perform(typeText(testUsername)); // username only has 5 characters
        Espresso.closeSoftKeyboard();

        Espresso.onView(withId(R.id.input_Email)).perform(typeText(testEmail));
        Espresso.closeSoftKeyboard();

        Espresso.onView(withId(R.id.button_SendEmail)).perform(click()); // click the send email button

        Espresso.onView(withId(R.id.input_username))
                .check(matches(hasErrorText("Invalid Username"))); // check if error message is displayed

    }

    // test: error message should show when email text field is empty
    @Test
    public void testEmailInputEmpty() {

        testEmail = "";

        Espresso.onView(withId(R.id.input_username)).perform(typeText(testUsername));
        Espresso.closeSoftKeyboard();

        Espresso.onView(withId(R.id.input_Email)).perform(typeText(testEmail)); // empty email text field
        Espresso.closeSoftKeyboard();

        Espresso.onView(withId(R.id.button_SendEmail)).perform(click()); // click the send email button

        Espresso.onView(withId(R.id.input_Email))
                .check(matches(hasErrorText("Invalid Email"))); // check if error message is displayed

    }

    // test: error message should show when email text field does not contain the '@' symbol
    @Test
    public void testEmailInputNoAtSymbol() {

        testEmail = "allen08gmail.com";

        Espresso.onView(withId(R.id.input_username)).perform(typeText(testUsername));
        Espresso.closeSoftKeyboard();

        Espresso.onView(withId(R.id.input_Email)).perform(typeText(testEmail)); // email text field with no '@'
        Espresso.closeSoftKeyboard();

        Espresso.onView(withId(R.id.button_SendEmail)).perform(click()); // click the send email button

        Espresso.onView(withId(R.id.input_Email))
                .check(matches(hasErrorText("Invalid Email"))); // check if error message is displayed

    }

    // test: error message should show when email text field does not contain a period
    @Test
    public void testEmailInputNoPeriod() {

        testEmail = "allen08@gmailcom";

        Espresso.onView(withId(R.id.input_username)).perform(typeText(testUsername));
        Espresso.closeSoftKeyboard();

        Espresso.onView(withId(R.id.input_Email)).perform(typeText(testEmail)); // email text field with no period
        Espresso.closeSoftKeyboard();

        Espresso.onView(withId(R.id.button_SendEmail)).perform(click()); // click the send email button

        Espresso.onView(withId(R.id.input_Email))
                .check(matches(hasErrorText("Invalid Email"))); // check if error message is displayed

    }

    // test: put all valid inputs, check if 'email sent' toast message pops up after clicking send email button
    @Test
    public void testValidInputs() {

        Espresso.onView(withId(R.id.input_username)).perform(typeText(testUsername));
        Espresso.closeSoftKeyboard();

        Espresso.onView(withId(R.id.input_Email)).perform(typeText(testEmail));
        Espresso.closeSoftKeyboard();

        Espresso.onView(withId(R.id.button_SendEmail)).perform(click()); // click the send email button

        // check if toast message is displayed
        Espresso.onView(withText("Email Sent"))
                .inRoot(withDecorView(not(mActivityTestRule.getActivity().getWindow().getDecorView())))
                .check(matches(isDisplayed()));

    }



    @After
    public void tearDown() throws Exception {
    }
}