package com.deepgulhanedg.riddleroom;

public class QuesAns {

    private int questionId;
    private boolean answerId;

    public QuesAns(int questionResId,boolean tOrF){

         questionId = questionResId;
         answerId = tOrF;

    }


    public int getQuestionId() {

        return questionId;
    }

    public boolean isAnswerId() {

        return answerId;
    }



    //setters
    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public void setAnswerId(boolean answerId) {
        this.answerId = answerId;
    }

}
