package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ForgotUsernameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_username);
    }

    public void sending(View v){
        Intent anIntent = new Intent(Intent.ACTION_SEND);
        anIntent.setType("text/plain");
        anIntent.putExtra(Intent.EXTRA_SUBJECT, "Forgotten Username");

    }
}
