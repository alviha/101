package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;

public class ForgotEmailActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText secondaryEmail;
    private EditText username;

    private Button sendEmail;

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_email); //view forgot email page
            //connecting to firebase
        FirebaseApp.initializeApp(this);
        mAuth = FirebaseAuth.getInstance();
            //assign email and username
        secondaryEmail = findViewById(R.id.input_Email);
        username = findViewById(R.id.input_username);
            //assign button
        sendEmail = findViewById(R.id.button_SendEmail);
        sendEmail.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
            //if the button is clicked
        if (v == sendEmail){

            String user = username.getText().toString();
            //check to see if username is empty
            if(TextUtils.isEmpty(user) || user.length() < 6){
                username.setError("Invalid Username");
                username.requestFocus();
                return;
            }

            String secEmail = secondaryEmail.getText().toString();
            //check to see if secondary email is empty
            if(TextUtils.isEmpty(secEmail) || !secEmail.contains("@") || !secEmail.contains(".")){
                secondaryEmail.setError("Invalid Email");
                secondaryEmail.requestFocus();
                return;
            }

            //send email
            Intent anIntent = new Intent(Intent.ACTION_SEND);
            //email format
            anIntent.setType("text/plain");
            anIntent.putExtra(Intent.EXTRA_SUBJECT, "Forgotten Email");
            anIntent.putExtra(anIntent.EXTRA_EMAIL, new String[]{secondaryEmail.getText().toString()});
            anIntent.putExtra(anIntent.EXTRA_TEXT, "hi");
            startActivity(anIntent);
            //tell user email was sent
            Toast.makeText(ForgotEmailActivity.this, "Email Sent", Toast.LENGTH_SHORT).show();
        }

    }
}