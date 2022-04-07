package com.deepgulhanedg.riddleroom;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

public class QuizTwo extends AppCompatActivity {

    TextView queTextTech,queNumTech,scoreTextTech;
    ProgressBar progressViewTech;

    int index,questions,score,mQuestion=1;

    private QuesAns[] quesBank = new QuesAns[]{new QuesAns(R.string.question_21 , true),
            new QuesAns(R.string.question_22 , false),
            new QuesAns(R.string.question_23,true) ,
            new QuesAns(R.string.question_24,true),
            new QuesAns(R.string.question_25,true),
            new QuesAns(R.string.question_26,false),
            new QuesAns(R.string.question_27,false),
            new QuesAns(R.string.question_28,false),
            new QuesAns(R.string.question_29,false),
            new QuesAns(R.string.question_30,true)    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_two);

        queTextTech = findViewById(R.id.queTextTech);

        questions = quesBank[index].getQuestionId();
        queTextTech.setText(questions);

        queNumTech = findViewById(R.id.queNumTech);
        queNumTech.setText("Q : 1/10");


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
            queNumTech.setText("Q : " + mQuestion + "/10");

        }
        index = (index+1) % 10;
        questions = quesBank[index].getQuestionId();
        queTextTech.setText(questions);

        progressViewTech = findViewById(R.id.progressBarViewTech);
        progressViewTech.incrementProgressBy(10);

        scoreTextTech = findViewById(R.id.scoreTextTech);
        scoreTextTech.setText("Score " + score +"/10");

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