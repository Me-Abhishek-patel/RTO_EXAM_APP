package com.example.rtoexamhindi;

public class TestQues {
    private String mQuestion;
    private String mAnswer;
    private String mOpt1;
    private String mOpt2;
    private String mOpt3;
    private String mOpt4;

    TestQues(String question, String answer, String opt1, String opt2, String opt3, String opt4) {
        mQuestion = question;
        mAnswer = answer;
        mOpt1 = opt1;
        mOpt2 = opt2;
        mOpt3 = opt3;
        mOpt4 = opt4;
    }

    public String getmQuestion() {
        return mQuestion;
    }

    public String getmAnswer() {
        return mAnswer;
    }

    public String getmOpt1() {
        return mOpt1;
    }

    public String getmOpt2() {
        return mOpt2;
    }

    public String getmOpt3() {
        return mOpt3;
    }

    public String getmOpt4() {
        return mOpt4;
    }
}
