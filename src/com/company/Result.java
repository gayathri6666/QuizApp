package com.company;

public class Result {
    private int rightAns;
    private int wrongAns;

    public int getRightAns() {
        return rightAns;
    }

    public void setRightAns(int rightAns) {
        this.rightAns = rightAns;
    }

    public int getWrongAns() {
        return wrongAns;
    }

    public void setWrongAns(int wrongAns) {
        this.wrongAns = wrongAns;
    }

    public String getQuizResult() {
        return quizResult;
    }

    public void setQuizResult(String quizResult) {
        this.quizResult = quizResult;
    }

    private String quizResult;
}
