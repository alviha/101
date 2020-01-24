package com.example.myapplication;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class SignUpActivity extends AppCompatActivity implements View.OnClickListener {

    /** instance data members */
    private EditText input_name;
    private EditText input_username;
    private EditText input_email;
    private EditText input_password;
    private EditText input_confirmPassword;

    private Button button_signUp;
    private Button button_alreadyHaveAccount;

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        FirebaseApp.initializeApp(this);

        /* initialize data members */
        mAuth = FirebaseAuth.getInstance();

        input_name = findViewById(R.id.input_name);
        input_username = findViewById(R.id.input_username);
        input_email = findViewById(R.id.input_email);
        input_password = findViewById(R.id.input_password);
        input_confirmPassword = findViewById(R.id.input_confirmPassword);

        button_signUp = findViewById(R.id.button_signUp);
        button_alreadyHaveAccount = findViewById(R.id.button_alreadyHaveAccount);

        button_signUp.setOnClickListener(this);
        button_alreadyHaveAccount.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        /* sign up button clicked */
        if(v == button_signUp){

            String name = input_name.getText().toString();
            final String username = input_username.getText().toString();
            String email = input_email.getText().toString();
            String password = input_password.getText().toString();
            String confirmPassword = input_confirmPassword.getText().toString();

            /* next few if statements are for checking validation */

            /* name text field is empty */
            if(TextUtils.isEmpty(name)){
                input_name.setError("Name is required");
                input_name.requestFocus();
                return;
            }

            /* username entered is less than 6 characters */
            if(username.length() < 6){
                input_username.setError("Username must be 6 characters or longer");
                input_username.requestFocus();
                return;
            }

            /* email text field is empty */
            if(TextUtils.isEmpty(email)){
                input_email.setError("Email required");
                input_email.requestFocus();
                return;
            }

            /* email entered does not contain '@' symbol */
            if(!email.contains("@")){
                input_email.setError("Invalid email");
                input_email.requestFocus();
                return;
            }

            /* password entered is less than 8 characters */
            if(password.length() < 8){
                input_password.setError("Password must be at least 8 characters long");
                input_password.requestFocus();
                return;
            }

            /* Confirm password entered does not match the entered password */
            if(!confirmPassword.equals(password)){
                input_confirmPassword.setError("Confirmed Password and Password do not match");
                input_confirmPassword.requestFocus();
                return;
            }

            /* all validations passed, create user through firebase using email and password */
            mAuth.createUserWithEmailAndPassword(email, password)
                    .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {

                            if(task.isSuccessful()){
                                Toast.makeText(SignUpActivity.this, "Registration successful", Toast.LENGTH_SHORT).show();

                                Intent intent = new Intent(SignUpActivity.this, Homepage.class);

                                // data to prompt pretest
                                intent.putExtra("promptPretest", true);
                                startActivity(intent);
                                finish();
                            }
                            else{
                                Toast.makeText(SignUpActivity.this, "Registration failed. Please try again",
                                        Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
//            FirebaseDatabase database = FirebaseDatabase.getInstance();
//            DatabaseReference data_username = database.getReference();
//            DatabaseReference data_name = database.getReference();
//            data_username.setValue(username);
//            data_name.setValue(name);
        }

        /* already have an account clicked */
        if(v == button_alreadyHaveAccount){

            startActivity(new Intent(SignUpActivity.this, LoginActivity.class));
            finish();
        }
    }
}
