package com.example.driviglicencetesttrainer_rtoexam;

public class QPractice {
    private String mQuestion;
    private String mAnswer;
    private int mQNo;

    QPractice(String question, String answer, int QNo) {
        mQuestion = question;
        mAnswer = answer;
        mQNo = QNo;

    }

    public String getmQuestion() {
        return mQuestion;
    }

    public String getmAnswer() {
        return mAnswer;
    }

    public int getmQNo() {
        return mQNo;
    }
}
