package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class SampleActivity extends AppCompatActivity {

    private Button submit;
    private Button showHint;
    private TextView title;
    private TextView question;
    private RadioGroup choices;
    private RadioButton choice1;
    private RadioButton choice2;
    private RadioButton choice3;
    private RadioButton choice4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);

        submit = findViewById(R.id.button_Submit);
        showHint = findViewById(R.id.button_Hint);

        title = findViewById(R.id.text_question);
        question = findViewById(R.id.text_question);

        choices = findViewById(R.id.radioGroup_choices);

        choice1 = findViewById(R.id.button_choice1);
        choice2 = findViewById(R.id.button_choice2);
        choice3 = findViewById(R.id.button_choice3);
        choice4 = findViewById(R.id.button_choice4);
    }
}
