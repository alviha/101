package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;

import org.w3c.dom.Text;

public class ForgotPasswordActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText input_Email;

    private Button button_SendEmail;

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        FirebaseApp.initializeApp(this);
        mAuth = FirebaseAuth.getInstance();

        input_Email = findViewById(R.id.input_Email);

        button_SendEmail = findViewById(R.id.button_SendEmail);
        button_SendEmail.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v == button_SendEmail){

            String email = input_Email.getText().toString();
            mAuth.sendPasswordResetEmail(email);
            Toast.makeText(ForgotPasswordActivity.this, "Email Sent", Toast.LENGTH_SHORT).show();
        }

    }
}
