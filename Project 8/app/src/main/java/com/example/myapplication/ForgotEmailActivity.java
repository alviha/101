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
        setContentView(R.layout.activity_forgot_email);

        FirebaseApp.initializeApp(this);
        mAuth = FirebaseAuth.getInstance();

        secondaryEmail = findViewById(R.id.input_Email);
        username = findViewById(R.id.input_username);

        sendEmail = findViewById(R.id.button_SendEmail);
        sendEmail.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if (v == sendEmail){

            String user = username.getText().toString();

            if(TextUtils.isEmpty(user) || user.length() < 6){
                username.setError("Invalid Username");
                username.requestFocus();
                return;
            }

            String secEmail = secondaryEmail.getText().toString();

            if(TextUtils.isEmpty(secEmail) || !secEmail.contains("@") || !secEmail.contains(".")){
                secondaryEmail.setError("Invalid Email");
                secondaryEmail.requestFocus();
                return;
            }

            //Intent anIntent = new Intent(Intent.ACTION_SEND);

           // anIntent.setType("text/plain");
           // anIntent.putExtra(Intent.EXTRA_SUBJECT, "Forgotten Email");
           // anIntent.putExtra(anIntent.EXTRA_EMAIL, new String[]{secondaryEmail.getText().toString()});
           // anIntent.putExtra(anIntent.EXTRA_TEXT, "hi");
            //startActivity(anIntent);

            Toast.makeText(ForgotEmailActivity.this, "Sending Email", Toast.LENGTH_SHORT).show();


        }

    }
}