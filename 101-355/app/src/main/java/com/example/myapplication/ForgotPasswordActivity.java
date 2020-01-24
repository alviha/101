package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
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
        setContentView(R.layout.activity_forgot_password); // view forgot password page
            //connecting to firebase
        FirebaseApp.initializeApp(this);
        mAuth = FirebaseAuth.getInstance();
            //assign email
        input_Email = findViewById(R.id.input_Email);
            //assign button
        button_SendEmail = findViewById(R.id.button_SendEmail);
        button_SendEmail.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
            //if button is pressed
        if (v == button_SendEmail){
            //send email and inform user the email was sent
            String email = input_Email.getText().toString();

            if(TextUtils.isEmpty(email)){
                input_Email.setError(getResources().getString(R.string.error_email)); // error message
                input_Email.requestFocus(); // move cursor to email text field
                return;
            }
            mAuth.sendPasswordResetEmail(email);
            Toast.makeText(ForgotPasswordActivity.this, R.string.toast_emailSent, Toast.LENGTH_SHORT).show();
        }

    }
}
