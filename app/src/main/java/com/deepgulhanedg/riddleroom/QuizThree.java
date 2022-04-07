package com.deepgulhanedg.riddleroom;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

public class QuizThree extends AppCompatActivity {

    TextView questionNumber,questionText,scoreText;
    ProgressBar progressBarView;

    int index,questions,score,mQuestion=1;


    private QuesAns[] quesBank = new QuesAns[]{new QuesAns(R.string.question_1 , true),
            new QuesAns(R.string.question_2 , false),
            new QuesAns(R.string.question_3,false) ,
            new QuesAns(R.string.question_4,true),
            new QuesAns(R.string.question_5,false),
            new QuesAns(R.string.question_6,true),
            new QuesAns(R.string.question_7,false),
            new QuesAns(R.string.question_8,true),
            new QuesAns(R.string.question_9,true),
            new QuesAns(R.string.question_10,true)    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_three);

        questionText = findViewById(R.id.questionText);

        questions = quesBank[index].getQuestionId();
        questionText.setText(questions);

        questionNumber = findViewById(R.id.questionNumber);
        questionNumber.setText("Q : 1/10");

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
            questionNumber.setText("Q : " + mQuestion + "/10");

        }
        index = (index+1) % 10;
        questions = quesBank[index].getQuestionId();
        questionText.setText(questions);

        progressBarView = findViewById(R.id.progressBarViewTech);
        progressBarView.incrementProgressBy(10);

        scoreText = findViewById(R.id.scoreTextTech);
        scoreText.setText("Score " + score +"/10");

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