package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ForgotEmailActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText secondaryEmail;
    private EditText username;

    private Button sendEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_email);

        secondaryEmail = findViewById(R.id.input_Email);
        username = findViewById(R.id.input_username);

        sendEmail = findViewById(R.id.button_SendEmail);
        sendEmail.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if (v == sendEmail){

        }

    }
}