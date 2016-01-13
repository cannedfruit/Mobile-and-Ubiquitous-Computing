package com.cannedfruit.geoquiz;

/**
 * Created by Sarah on 1/13/2016.
 * Mobile Ubiquitous Computing
 */
public class Question {
    private int mTextResId;
    private boolean manswerTrue;

    public Question(int textResId, boolean answerTrue){
        mTextResId = textResId;
        manswerTrue = answerTrue;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }


    public boolean isManswerTrue() {
        return manswerTrue;
    }
    public void setManswerTrue(boolean manswerTrue) {
        this.manswerTrue = manswerTrue;
    }
}
