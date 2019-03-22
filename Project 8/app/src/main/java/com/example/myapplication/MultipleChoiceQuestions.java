package com.example.myapplication;

import android.widget.Button;

public abstract class MultipleChoiceQuestions {

    private Button choice1;
    private Button choice2;
    private Button choice3;
    private Button choice4;

    private Button selected;
    private Button correct;

   // public void highlightAnswer(){
   // }

    public MultipleChoiceQuestions(Button aChoice1, Button aChoice2, Button aChoice3, Button aChoice4){
        choice1 = aChoice1;
        choice2 = aChoice2;
        choice3 = aChoice3;
        choice4 = aChoice4;
    }


    //Shows green if answer is correct and red if its incorrect.
    public void answerOutcome(){

        if (isCorrect(selected, correct)){
            return;
            //turn green
        }
        else{
            return;
            //turn red
        }
    }

    public void showAnswer(){

    }



    public boolean isCorrect(Button selectedAnswer, Button correctAnswer) {
        return selectedAnswer == correctAnswer;
    }


}
