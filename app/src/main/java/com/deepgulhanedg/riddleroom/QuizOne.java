package com.deepgulhanedg.riddleroom;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

public class QuizOne extends AppCompatActivity {

    TextView queNumCorona,queTextCorona,scoreTextCorona;
    ProgressBar progressViewCorona;

    int index,questions,score,mQuestion=1;

    private QuesAns[] quesBank = new QuesAns[]{new QuesAns(R.string.question_11 , true),
            new QuesAns(R.string.question_12 , true),
            new QuesAns(R.string.question_13,true) ,
            new QuesAns(R.string.question_14,false),
            new QuesAns(R.string.question_15,true),
            new QuesAns(R.string.question_16,false),
            new QuesAns(R.string.question_17,false),
            new QuesAns(R.string.question_18,true),
            new QuesAns(R.string.question_19,false),
            new QuesAns(R.string.question_20,false)    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_one);

        queTextCorona = findViewById(R.id.queTextTech);

        questions = quesBank[index].getQuestionId();
        queTextCorona.setText(questions);

        queNumCorona = findViewById(R.id.queNumTech);
        queNumCorona.setText("Q : 1/10");


    }

    public void trueButton(View view){

        checkAns(true);
        updateQuestion();

    }
    public void falseButton(View view){

        checkAns(false);
        updateQuestion();

    }
    private void updateQuestion(){

        mQuestion = mQuestion + 1;
        if(mQuestion <= 10) {
            queNumCorona.setText("Q : " + mQuestion + "/10");

        }
        index = (index+1) % 10;
        questions = quesBank[index].getQuestionId();
        queTextCorona.setText(questions);

        progressViewCorona = findViewById(R.id.progressBarViewTech);
        progressViewCorona.incrementProgressBy(10);

        scoreTextCorona = findViewById(R.id.scoreTextTech);
        scoreTextCorona.setText("Score " + score +"/10");

        if(index==0){
            AlertDialog.Builder myAlertDialog = new AlertDialog.Builder(this);
            myAlertDialog.setTitle("Quiz Ended!");
            myAlertDialog.setCancelable(false);
            myAlertDialog.setMessage("Your Score is "+ score);
            myAlertDialog.setPositiveButton("Play Next Quiz", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    finish();
                }
            });
            myAlertDialog.show();

        }

    }

    private void checkAns(boolean userSelection){

        boolean correctAns = quesBank[index].isAnswerId();

        if(userSelection == correctAns){

            score = score+1;

        }
        else{

        }

    }

}