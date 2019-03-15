package com.example.myapplication;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import org.w3c.dom.Text;

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView title;

    private EditText input_password;
    private EditText input_email;
    private EditText input_usernameAttemptbox;
    private EditText input_personName;
    private EditText input_confirmPassword;

    private Button submit;
    private Button alreadyHaveAccount;

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        title = findViewById(R.id.text_signUp);

        input_password = findViewById(R.id.input_password);
        input_email = findViewById(R.id.input_email);
        input_usernameAttemptbox = findViewById(R.id.input_username);
        input_personName = findViewById(R.id.input_name);
        input_confirmPassword= findViewById(R.id.input_confirmPassword);

        submit = findViewById(R.id.button_signUp);
        alreadyHaveAccount = findViewById(R.id.button_alreadyHaveAccount);

        submit.setOnClickListener(this);
        alreadyHaveAccount.setOnClickListener(this);

        mAuth = FirebaseAuth.getInstance();


    }

    @Override
    public void onClick(View v) {

        switch(v.getId()){

            case R.id.button_signUp:
                if(!validate()){
                    return;
                }
                else{
                    String email = input_email.getText().toString();
                    String password = input_password.getText().toString();
                    mAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(task.isSuccessful()){
                                Toast.makeText(getApplicationContext(), "Registration Successful", Toast.LENGTH_SHORT);
                                startActivity(new Intent(SignUpActivity.this, Homepage.class));
                                finish();
                            }
                            else{
                                Toast.makeText(getApplicationContext(), "Error ocurred. Please try again.", Toast.LENGTH_LONG);
                            }
                        }
                    });
                }
            case R.id.button_alreadyHaveAccount:
                startActivity(new Intent(SignUpActivity.this, LoginActivity.class));
        }
    }

    public boolean validate(){

        String username = input_usernameAttemptbox.getText().toString();
        if(username.length() < 6){
            input_usernameAttemptbox.setError("Username needs to be 6 letters or longer");
            input_usernameAttemptbox.requestFocus();
            return false;
        }

        String password = input_password.getText().toString();
        if(password.length() < 8){
            input_password.setError("Password needs to be 8 letters long");
            input_password.requestFocus();
            return false;
        }

        String email = input_email.getText().toString();
        if(TextUtils.isEmpty(email)){
            input_email.setError("Email is required");
            input_email.requestFocus();
            return false;
        }
        if(!email.contains("@")){
            input_email.setError("Invalid email");
            input_email.requestFocus();
            return false;
        }

        String confirmPassword = input_confirmPassword.getText().toString();
        if(!confirmPassword.equals(password)){
            input_confirmPassword.setError("Confirmed Password and Password do not match");
            input_confirmPassword.requestFocus();
            return false;
        }

        String personName = input_personName.getText().toString();
        if(TextUtils.isEmpty(personName)){
            input_personName.setError("Name is required");
            input_personName.requestFocus();
            return false;
        }

        return true;

    }
}
