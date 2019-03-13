package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ForgotUsernameActivity extends AppCompatActivity {

    private TextView displayMessage;
    private Button execute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_username);

        execute = (Button) findViewById(R.id.button_SendEmail);

        displayMessage = (TextView) findViewById(R.id.text_ConfirmEmail);

    }

    public void handleClick(View view){
        EditText recipient = (EditText) findViewById(R.id.input_Email);
        Intent anIntent = new Intent(Intent.ACTION_SEND);
        anIntent.setType("text/plain");
        anIntent.putExtra(Intent.EXTRA_SUBJECT, "Forgotten Username");
        anIntent.putExtra(anIntent.EXTRA_EMAIL, new String[]{recipient.getText().toString()});

        displayMessage.setText("Email has been sent.");
    }



//link with button
}

/*
Tuesday - Firebase, button
Wednesday - implement forgot password + more firebase
Thursday - 3/4 should work on firebase + try link everything together
Friday - debugging + refining + easy login
Saturday - whatever doesn't get done
 */