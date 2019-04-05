package com.example.myapplication;

import android.media.MediaPlayer;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.SoundEffectConstants;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.EmptyStackException;

public class OptionsActivity extends AppCompatActivity implements View.OnClickListener {

    // main options UI elements
    Button faqs, feedback, bugReporting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);

        faqs = findViewById(R.id.button_faqs);
        feedback = findViewById(R.id.button_feedback);
        bugReporting = findViewById(R.id.button_bugReporting);

        faqs.setOnClickListener(this);
        feedback.setOnClickListener(this);
        bugReporting.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v == faqs) {

            hideMainOptions();
            showFAQScreen();
        }

    }

    @Override
    public void onBackPressed() {

        if(findViewById(R.id.text_heading_options).getVisibility() == View.VISIBLE) {
            finish();
        }
        else if(findViewById(R.id.text_heading_faq).getVisibility() == View.VISIBLE) {
            this.recreate();
        }

    }

    private void showMainOptionsScreen() {

        // show main options UI
        faqs.setVisibility(View.VISIBLE);
        feedback.setVisibility(View.VISIBLE);
        bugReporting.setVisibility(View.VISIBLE);
    }

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

    private void showFeedbackScreen() {

    }

    private void showBugReportingScreen() {

    }

    private void hideMainOptions() {

        findViewById(R.id.text_heading_options).setVisibility(View.GONE);
        faqs.setVisibility(View.GONE);
        feedback.setVisibility(View.GONE);
        bugReporting.setVisibility(View.GONE);
    }

    private void hideFAQScreen() {


    }
}
