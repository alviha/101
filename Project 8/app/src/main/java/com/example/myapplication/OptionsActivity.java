/**
 * OptionsActivity is the options page for the app.
 * Frequently Asked Questions are questions that might be asked repeatedly by different users
 * Feedback is a way for users to give suggestions or give their opinion about the app to the developers
 * Bug Reporting is the same as feedback, but is a way to report any bugs encountered within the app
 *
 * @author Bufford Brian Sta Maria
 *
 * CMSC 355, Spring 2019
 * Project A8
 * 4/5/2019
 */
package com.example.myapplication;

import android.content.Intent;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.SoundEffectConstants;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.EmptyStackException;

public class OptionsActivity extends AppCompatActivity implements View.OnClickListener {

    // main options UI elements
    Button appTutorial, faqs, feedback, bugReporting;

    // feedback and bug reporting UI elements
    EditText input_subject, input_message;
    Button button_sendMessage;

    // Message type is either Feedback or Bug
    String messageType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);

        appTutorial = findViewById(R.id.button_appTutorial);
        faqs = findViewById(R.id.button_faqs);
        feedback = findViewById(R.id.button_feedback);
        bugReporting = findViewById(R.id.button_bugReporting);

        appTutorial.setOnClickListener(this);
        faqs.setOnClickListener(this);
        feedback.setOnClickListener(this);
        bugReporting.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        // Buttons for Options Page
        if(v == appTutorial) {
            hideMainOptions();
            showTutorialScreen();
        }
        else if (v == faqs) {
            hideMainOptions();
            showFAQScreen();
        }
        else if(v == feedback) {
            hideMainOptions();
            messageType = "Feedback";
            showMessageScreen();
        }
        else if(v == bugReporting) {
            hideMainOptions();
            messageType = "Bug Report";
            showMessageScreen();
        }

        // Button for Feedback and Bug Reporting Page
        else if(v == button_sendMessage) {

            String subject = input_subject.getText().toString().trim();
            String bodyMessage = input_message.getText().toString().trim();

            // check for empty fields (subject is optional)
            if(TextUtils.isEmpty(bodyMessage)) {
                input_message.setError("This field is required");
                input_message.requestFocus();
                return;
            }

            sendMessage(subject, bodyMessage);
        }

    }

    @Override
    public void onBackPressed() {

        // back to homepage
        if(findViewById(R.id.text_heading_options).getVisibility() == View.VISIBLE) {
            finish();
        }

        // back to options screen
        else if(findViewById(R.id.text_heading_options).getVisibility() == View.GONE) {

            this.recreate();

            // reset scrollviews
            if(findViewById(R.id.text_heading_faq).getVisibility() == View.VISIBLE) {
                findViewById(R.id.scrollView_faq).scrollTo(0, 0);
            }
            else if(findViewById(R.id.text_heading_appTutorial).getVisibility() == View.VISIBLE) {
                findViewById(R.id.scrollView_appTutorial).scrollTo(0, 0);
            }
            // reset faq and feedback/bug reporting screen
            else {
                input_subject.setText("");
                input_message.setText("");
            }
        }

    }

    // Hide the elements on Options screen
    private void hideMainOptions() {

        findViewById(R.id.text_heading_options).setVisibility(View.GONE);
        appTutorial.setVisibility(View.GONE);
        faqs.setVisibility(View.GONE);
        feedback.setVisibility(View.GONE);
        bugReporting.setVisibility(View.GONE);
    }

    // App Tutorial Page
    private void showTutorialScreen() {

        // show tutorial screen UI
        findViewById(R.id.text_heading_appTutorial).setVisibility(View.VISIBLE);
        findViewById(R.id.scrollView_appTutorial).setVisibility(View.VISIBLE);
    }

    // Frequently Asked Questions Page
    private void showFAQScreen() {

        // show FAQ screen UI
        findViewById(R.id.text_heading_faq).setVisibility(View.VISIBLE);
        findViewById(R.id.scrollView_faq).setVisibility(View.VISIBLE);

        final String[] questions = {
                "How do I unlock the next lesson?",
                "Is the app free?",
                "Can I use this app on an iOS device?",
                "I have no prior programming experience, is this app for me?",
                "I found a bug, or I want to give suggestions. Where can I contact the developers?"
        };

        final String[] answers = {
                "You must complete the previous lesson's challenge with a score of 80% or more.",
                "The app is 100% free, and there are no micro-transactions.",
                "Unfortunately, no. The app is only available on android devices.",
                "Definitely. The app assumes that everyone is a beginner. Of course, though, the best way to learn programming is to actually code yourself.",
                "There are feedback and bug reporting buttons on the options page. Use them to message us."
        };

        // set the questions and answers
        ((TextView)findViewById(R.id.text_faq_question1)).setText(questions[0]);
        ((TextView)findViewById(R.id.text_faq_answer1)).setText(answers[0]);
        ((TextView)findViewById(R.id.text_faq_question2)).setText(questions[1]);
        ((TextView)findViewById(R.id.text_faq_answer2)).setText(answers[1]);
        ((TextView)findViewById(R.id.text_faq_question3)).setText(questions[2]);
        ((TextView)findViewById(R.id.text_faq_answer3)).setText(answers[2]);
        ((TextView)findViewById(R.id.text_faq_question4)).setText(questions[3]);
        ((TextView)findViewById(R.id.text_faq_answer4)).setText(answers[3]);
        ((TextView)findViewById(R.id.text_faq_question5)).setText(questions[4]);
        ((TextView)findViewById(R.id.text_faq_answer5)).setText(answers[4]);

    }

    // Feedback And Bug Reporting Page
    private void showMessageScreen() {

        findViewById(R.id.layout_feedback).setVisibility(View.VISIBLE);
        findViewById(R.id.text_heading_feedback).setVisibility(View.VISIBLE);
        ((TextView)findViewById(R.id.text_heading_feedback)).setText(messageType);

        input_subject = findViewById(R.id.input_feedbackSubject);
        input_message = findViewById(R.id.input_feedbackMessage);

        button_sendMessage = findViewById(R.id.button_sendMessage);
        button_sendMessage.setOnClickListener(this);

        if(messageType.equals("Feedback")) {
            button_sendMessage.setText("Send Feedback");
        }
        else {
            button_sendMessage.setText("Send Bug Report");
        }

    }

    private void sendMessage(String subject, String message) {

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/html");

        String[] developers = {
                "moritzv@mymail.vcu.edu",
                "luckjd@mymail.vcu.edu",
                "stamariabbv@vcu.edu",
                "alviha@mymail.vcu.edu"
        };

        intent.putExtra(Intent.EXTRA_EMAIL, developers);
        intent.putExtra(Intent.EXTRA_SUBJECT, messageType + ": " + subject);
        intent.putExtra(Intent.EXTRA_TEXT, message);

        startActivity(Intent.createChooser(intent, "Choose email app to use"));
    }
}
