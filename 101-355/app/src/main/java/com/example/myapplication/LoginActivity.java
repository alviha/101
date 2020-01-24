package com.example.myapplication;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.app.LoaderManager.LoaderCallbacks;

import android.content.CursorLoader;
import android.content.Loader;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;

import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import java.util.ArrayList;
import java.util.List;

import static android.Manifest.permission.READ_CONTACTS;

/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends AppCompatActivity implements OnClickListener {

    private Button button_forgotPassword;
    private Button button_signIn;
    private Button button_createAccount;

    private EditText input_email;
    private EditText input_password;

    private FirebaseAuth mAuth;

    private int attemptCounter;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login); // view login page
        //connecting to firebase
        FirebaseApp.initializeApp(this);
        mAuth = FirebaseAuth.getInstance();

        //Buttons
        button_forgotPassword = findViewById(R.id.button_forgotPassword);
        button_signIn = findViewById(R.id.button_signIn);
        button_createAccount = findViewById(R.id.button_createNewAccount);

        //User inputs
        input_email = findViewById(R.id.input_email);
        input_password = findViewById(R.id.input_password);

        //Set onClick for buttons
        button_forgotPassword.setOnClickListener(this);
        button_signIn.setOnClickListener(this);
        button_createAccount.setOnClickListener(this);

        //counter for incorrect password input attempts
        attemptCounter = 0;

    }

    @Override
    public void onClick(View v) {
            //if forgot password was pressed then redirect to forgot password page
        if (v == button_forgotPassword){
            startActivity(new Intent(LoginActivity.this, ForgotPasswordActivity.class));
        }
            //if create account was pressed then redirect to create account page
        if (v == button_createAccount){
            startActivity(new Intent(LoginActivity.this, SignUpActivity.class));
        }
            //if sign in was pressed
        if (v == button_signIn){
            //get input from email text box
            String email = input_email.getText().toString();
            //check to see if input is empty
            if(TextUtils.isEmpty(email)){
                input_email.setError("Email Required");
                input_email.requestFocus();
                return;
            }
            //get input from password text box
            String password = input_password.getText().toString();
            //check to see if input is empty
            if (TextUtils.isEmpty(password)){
                input_password.setError("Password Required");
                input_password.requestFocus();

                return;
            }
            //check with firebase to see if email and password match records
            mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    //if email and password are correct then go to homepage otherwise alert user
                    if(task.isSuccessful()){
                        startActivity(new Intent(LoginActivity.this, Homepage.class));
                        finish();
                    }else{
                        Toast.makeText(LoginActivity.this,"Email does not match an account or password is incorrect.", Toast.LENGTH_SHORT).show();

                        attemptCounter++;

                        if(attemptCounter >= 3){
                            startActivity(new Intent(LoginActivity.this, ForgotPasswordActivity.class));
                            input_email.setText("");
                            input_password.setText("");
                            input_email.requestFocus();
                            attemptCounter = 0;
                        }
                    }

                }
            });
        }
    }
}
