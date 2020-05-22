package com.example.driviglicencetesttrainer_rtoexam;

/*Importing imp classes */

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Set;

public class Test extends AppCompatActivity {

    final ArrayList<TestQues> Question = new ArrayList<TestQues>();
    /*TextView objects */
    TextView QuesTextView, opt1View, opt2View, opt3View, opt4View, QuestionNo, timer, score;
    /*int variables for counter */
    int counter = 30, scores = 0;
    /*i refers to question no -1 */
    int i;
    /*ImageView objects */
    ImageView nextbtn2, nextbtn;
    /*Timer objects */
    CountDownTimer Stopwatch;

    /*
     * this method is used to launch scorecard
     * and it also transfer score data to scorecard activity
     */
    public void launchScoreCard() {
        /*intent to lauch scorecard activity */
        Intent scorecard = new Intent(this, Scorecard.class);
        /*transfering score data*/
        scorecard.putExtra("scores", scores);
        /*starting the intent having scorcard activity  */
        startActivity(scorecard);
    }

    /*
     * this method changes the question dynamically
     */
    public void next() {
        /*Setting limit i limit to be below 16 objects */
        if (i <= Question.size()) {
            i++;
            /*If question reaches 15 then launcher is called to laund score card*/
            if (i >= Question.size()) {
                launchScoreCard();
            } else {
                /*changing question and options */

                QuesTextView.setText(Question.get(i).getmQuestion());
                opt1View.setText(Question.get(i).getmOpt1());
                opt2View.setText(Question.get(i).getmOpt2());
                opt3View.setText(Question.get(i).getmOpt3());
                opt4View.setText(Question.get(i).getmOpt4());

                /*changing back options colours to black  */
                opt1View.setTextColor(getResources().getColor(R.color.black));
                opt2View.setTextColor(getResources().getColor(R.color.black));
                opt3View.setTextColor(getResources().getColor(R.color.black));
                opt4View.setTextColor(getResources().getColor(R.color.black));

                /*changing question no  */
                QuestionNo.setText(Integer.toString(i + 1));

                /*after changing question the timer needs to be canceled , otherwise question will change again automaticaly   */
                if (Stopwatch != null)
                    Stopwatch.cancel();

                /*reset the timer back to 30 sec*/
                counter = 30;
                Stopwatch = new CountDownTimer(30000, 1000) {
                    public void onTick(long millisUntilFinished) {
                        timer.setText(String.valueOf(counter));
                        counter--;
                    }

                    public void onFinish() {
                        timer.setText("FINISH!!");
                        next();
                    }
                };
                Stopwatch.start();
            }

        }


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        Intent setIntent = getIntent();
        int set = setIntent.getIntExtra("set", 0);

        /*Setting 15 questions in array list  */
        if (set == 1) {

            Question.add(new TestQues(getString(R.string.ques_1), getString(R.string.ans_1), getString(R.string.ans_1), getString(R.string.ans_30), getString(R.string.ans_35), getString(R.string.ans_41)));
            Question.add(new TestQues(getString(R.string.ques_2), getString(R.string.ans_2), getString(R.string.ans_2), getString(R.string.ans_17), getString(R.string.ans_13), getString(R.string.ans_1)));
            Question.add(new TestQues(getString(R.string.ques_3), getString(R.string.ans_3), getString(R.string.ans_41), getString(R.string.ans_3), getString(R.string.ans_36), getString(R.string.ans_6)));
            Question.add(new TestQues(getString(R.string.ques_4), getString(R.string.ans_4), getString(R.string.ans_4), getString(R.string.ans_28), getString(R.string.ans_8), getString(R.string.ans_30)));
            Question.add(new TestQues(getString(R.string.ques_5), getString(R.string.ans_5), getString(R.string.ans_14), getString(R.string.ans_5), getString(R.string.ans_40), getString(R.string.ans_19)));
            Question.add(new TestQues(getString(R.string.ques_6), getString(R.string.ans_6), getString(R.string.ans_10), getString(R.string.ans_31), getString(R.string.ans_6), getString(R.string.ans_28)));
            Question.add(new TestQues(getString(R.string.ques_7), getString(R.string.ans_7), getString(R.string.ans_41), getString(R.string.ans_7), getString(R.string.ans_34), getString(R.string.ans_27)));
            Question.add(new TestQues(getString(R.string.ques_8), getString(R.string.ans_8), getString(R.string.ans_8), getString(R.string.ans_30), getString(R.string.ans_30), getString(R.string.ans_13)));
            Question.add(new TestQues(getString(R.string.ques_9), getString(R.string.ans_9), getString(R.string.ans_30), getString(R.string.ans_31), getString(R.string.ans_9), getString(R.string.ans_5)));
            Question.add(new TestQues(getString(R.string.ques_10), getString(R.string.ans_10), getString(R.string.ans_6), getString(R.string.ans_10), getString(R.string.ans_26), getString(R.string.ans_25)));
            Question.add(new TestQues(getString(R.string.ques_11), getString(R.string.ans_11), getString(R.string.ans_18), getString(R.string.ans_40), getString(R.string.ans_33), getString(R.string.ans_11)));
            Question.add(new TestQues(getString(R.string.ques_12), getString(R.string.ans_12), getString(R.string.ans_12), getString(R.string.ans_3), getString(R.string.ans_22), getString(R.string.ans_26)));
            Question.add(new TestQues(getString(R.string.ques_13), getString(R.string.ans_13), getString(R.string.ans_30), getString(R.string.ans_13), getString(R.string.ans_12), getString(R.string.ans_9)));
            Question.add(new TestQues(getString(R.string.ques_14), getString(R.string.ans_14), getString(R.string.ans_14), getString(R.string.ans_40), getString(R.string.ans_4), getString(R.string.ans_8)));
            Question.add(new TestQues(getString(R.string.ques_15), getString(R.string.ans_15), getString(R.string.ans_30), getString(R.string.ans_40), getString(R.string.ans_20), getString(R.string.ans_15)));
        } else if (set == 2) {
            Question.add(new TestQues(getString(R.string.ques_16), getString(R.string.ans_16), getString(R.string.ans_16), getString(R.string.ans_45), getString(R.string.ans_16), getString(R.string.ans_40)));
            Question.add(new TestQues(getString(R.string.ques_17), getString(R.string.ans_17), getString(R.string.ans_26), getString(R.string.ans_17), getString(R.string.ans_22), getString(R.string.ans_12)));
            Question.add(new TestQues(getString(R.string.ques_18), getString(R.string.ans_18), getString(R.string.ans_18), getString(R.string.ans_34), getString(R.string.ans_36), getString(R.string.ans_3)));
            Question.add(new TestQues(getString(R.string.ques_19), getString(R.string.ans_19), getString(R.string.ans_8), getString(R.string.ans_19), getString(R.string.ans_40), getString(R.string.ans_40)));
            Question.add(new TestQues(getString(R.string.ques_20), getString(R.string.ans_20), getString(R.string.ans_4), getString(R.string.ans_20), getString(R.string.ans_19), getString(R.string.ans_30)));
            Question.add(new TestQues(getString(R.string.ques_21), getString(R.string.ans_21), getString(R.string.ans_21), getString(R.string.ans_41), getString(R.string.ans_18), getString(R.string.ans_24)));
            Question.add(new TestQues(getString(R.string.ques_22), getString(R.string.ans_22), getString(R.string.ans_22), getString(R.string.ans_6), getString(R.string.ans_40), getString(R.string.ans_30)));
            Question.add(new TestQues(getString(R.string.ques_23), getString(R.string.ans_23), getString(R.string.ans_29), getString(R.string.ans_23), getString(R.string.ans_6), getString(R.string.ans_13)));
            Question.add(new TestQues(getString(R.string.ques_24), getString(R.string.ans_24), getString(R.string.ans_32), getString(R.string.ans_17), getString(R.string.ans_39), getString(R.string.ans_24)));
            Question.add(new TestQues(getString(R.string.ques_25), getString(R.string.ans_25), getString(R.string.ans_16), getString(R.string.ans_16), getString(R.string.ans_7), getString(R.string.ans_25)));
            Question.add(new TestQues(getString(R.string.ques_26), getString(R.string.ans_26), getString(R.string.ans_39), getString(R.string.ans_9), getString(R.string.ans_21), getString(R.string.ans_26)));
            Question.add(new TestQues(getString(R.string.ques_27), getString(R.string.ans_27), getString(R.string.ans_2), getString(R.string.ans_32), getString(R.string.ans_27), getString(R.string.ans_20)));
            Question.add(new TestQues(getString(R.string.ques_28), getString(R.string.ans_28), getString(R.string.ans_39), getString(R.string.ans_28), getString(R.string.ans_7), getString(R.string.ans_15)));
            Question.add(new TestQues(getString(R.string.ques_29), getString(R.string.ans_29), getString(R.string.ans_29), getString(R.string.ans_22), getString(R.string.ans_24), getString(R.string.ans_23)));
            Question.add(new TestQues(getString(R.string.ques_30), getString(R.string.ans_30), getString(R.string.ans_27), getString(R.string.ans_43), getString(R.string.ans_30), getString(R.string.ans_14)));
        } else if (set == 3) {
            Question.add(new TestQues(getString(R.string.ques_31), getString(R.string.ans_31), getString(R.string.ans_8), getString(R.string.ans_4), getString(R.string.ans_31), getString(R.string.ans_26)));
            Question.add(new TestQues(getString(R.string.ques_32), getString(R.string.ans_32), getString(R.string.ans_5), getString(R.string.ans_32), getString(R.string.ans_29), getString(R.string.ans_44)));
            Question.add(new TestQues(getString(R.string.ques_33), getString(R.string.ans_33), getString(R.string.ans_29), getString(R.string.ans_42), getString(R.string.ans_33), getString(R.string.ans_8)));
            Question.add(new TestQues(getString(R.string.ques_34), getString(R.string.ans_34), getString(R.string.ans_3), getString(R.string.ans_34), getString(R.string.ans_20), getString(R.string.ans_44)));
            Question.add(new TestQues(getString(R.string.ques_35), getString(R.string.ans_35), getString(R.string.ans_35), getString(R.string.ans_9), getString(R.string.ans_13), getString(R.string.ans_31)));
            Question.add(new TestQues(getString(R.string.ques_36), getString(R.string.ans_36), getString(R.string.ans_15), getString(R.string.ans_13), getString(R.string.ans_35), getString(R.string.ans_36)));
            Question.add(new TestQues(getString(R.string.ques_37), getString(R.string.ans_37), getString(R.string.ans_31), getString(R.string.ans_23), getString(R.string.ans_37), getString(R.string.ans_36)));
            Question.add(new TestQues(getString(R.string.ques_38), getString(R.string.ans_38), getString(R.string.ans_38), getString(R.string.ans_22), getString(R.string.ans_44), getString(R.string.ans_44)));
            Question.add(new TestQues(getString(R.string.ques_39), getString(R.string.ans_39), getString(R.string.ans_8), getString(R.string.ans_39), getString(R.string.ans_3), getString(R.string.ans_42)));
            Question.add(new TestQues(getString(R.string.ques_40), getString(R.string.ans_40), getString(R.string.ans_22), getString(R.string.ans_33), getString(R.string.ans_20), getString(R.string.ans_40)));
            Question.add(new TestQues(getString(R.string.ques_41), getString(R.string.ans_41), getString(R.string.ans_32), getString(R.string.ans_41), getString(R.string.ans_38), getString(R.string.ans_35)));
            Question.add(new TestQues(getString(R.string.ques_42), getString(R.string.ans_42), getString(R.string.ans_34), getString(R.string.ans_17), getString(R.string.ans_42), getString(R.string.ans_39)));
            Question.add(new TestQues(getString(R.string.ques_43), getString(R.string.ans_43), getString(R.string.ans_43), getString(R.string.ans_20), getString(R.string.ans_41), getString(R.string.ans_38)));
            Question.add(new TestQues(getString(R.string.ques_44), getString(R.string.ans_44), getString(R.string.ans_4), getString(R.string.ans_22), getString(R.string.ans_44), getString(R.string.ans_43)));
            Question.add(new TestQues(getString(R.string.ques_45), getString(R.string.ans_45), getString(R.string.ans_26), getString(R.string.ans_13), getString(R.string.ans_2), getString(R.string.ans_45)));
        } else if (set == 4) {
            Question.add(new TestQues(getString(R.string.ques_46), getString(R.string.ans_46), getString(R.string.ans_51), getString(R.string.ans_78), getString(R.string.ans_46), getString(R.string.ans_14)));
            Question.add(new TestQues(getString(R.string.ques_47), getString(R.string.ans_47), getString(R.string.ans_47), getString(R.string.ans_107), getString(R.string.ans_10), getString(R.string.ans_12)));
            Question.add(new TestQues(getString(R.string.ques_48), getString(R.string.ans_48), getString(R.string.ans_44), getString(R.string.ans_135), getString(R.string.ans_48), getString(R.string.ans_31)));
            Question.add(new TestQues(getString(R.string.ques_49), getString(R.string.ans_49), getString(R.string.ans_49), getString(R.string.ans_22), getString(R.string.ans_132), getString(R.string.ans_9)));
            Question.add(new TestQues(getString(R.string.ques_50), getString(R.string.ans_50), getString(R.string.ans_35), getString(R.string.ans_87), getString(R.string.ans_64), getString(R.string.ans_50)));
            Question.add(new TestQues(getString(R.string.ques_51), getString(R.string.ans_51), getString(R.string.ans_51), getString(R.string.ans_175), getString(R.string.ans_33), getString(R.string.ans_23)));
            Question.add(new TestQues(getString(R.string.ques_52), getString(R.string.ans_52), getString(R.string.ans_104), getString(R.string.ans_52), getString(R.string.ans_142), getString(R.string.ans_18)));
            Question.add(new TestQues(getString(R.string.ques_53), getString(R.string.ans_53), getString(R.string.ans_27), getString(R.string.ans_120), getString(R.string.ans_53), getString(R.string.ans_36)));
            Question.add(new TestQues(getString(R.string.ques_54), getString(R.string.ans_54), getString(R.string.ans_30), getString(R.string.ans_54), getString(R.string.ans_86), getString(R.string.ans_26)));
            Question.add(new TestQues(getString(R.string.ques_55), getString(R.string.ans_55), getString(R.string.ans_36), getString(R.string.ans_188), getString(R.string.ans_54), getString(R.string.ans_55)));
            Question.add(new TestQues(getString(R.string.ques_56), getString(R.string.ans_56), getString(R.string.ans_56), getString(R.string.ans_76), getString(R.string.ans_37), getString(R.string.ans_19)));
            Question.add(new TestQues(getString(R.string.ques_57), getString(R.string.ans_57), getString(R.string.ans_61), getString(R.string.ans_57), getString(R.string.ans_97), getString(R.string.ans_13)));
            Question.add(new TestQues(getString(R.string.ques_58), getString(R.string.ans_58), getString(R.string.ans_48), getString(R.string.ans_161), getString(R.string.ans_58), getString(R.string.ans_14)));
            Question.add(new TestQues(getString(R.string.ques_59), getString(R.string.ans_59), getString(R.string.ans_101), getString(R.string.ans_59), getString(R.string.ans_76), getString(R.string.ans_13)));
            Question.add(new TestQues(getString(R.string.ques_60), getString(R.string.ans_60), getString(R.string.ans_21), getString(R.string.ans_64), getString(R.string.ans_118), getString(R.string.ans_60)));
        } else if (set == 5) {
            Question.add(new TestQues(getString(R.string.ques_61), getString(R.string.ans_61), getString(R.string.ans_50), getString(R.string.ans_61), getString(R.string.ans_143), getString(R.string.ans_40)));
            Question.add(new TestQues(getString(R.string.ques_62), getString(R.string.ans_62), getString(R.string.ans_100), getString(R.string.ans_35), getString(R.string.ans_105), getString(R.string.ans_62)));
            Question.add(new TestQues(getString(R.string.ques_63), getString(R.string.ans_63), getString(R.string.ans_63), getString(R.string.ans_101), getString(R.string.ans_35), getString(R.string.ans_3)));
            Question.add(new TestQues(getString(R.string.ques_64), getString(R.string.ans_64), getString(R.string.ans_60), getString(R.string.ans_22), getString(R.string.ans_64), getString(R.string.ans_40)));
            Question.add(new TestQues(getString(R.string.ques_65), getString(R.string.ans_65), getString(R.string.ans_67), getString(R.string.ans_65), getString(R.string.ans_111), getString(R.string.ans_30)));
            Question.add(new TestQues(getString(R.string.ques_66), getString(R.string.ans_66), getString(R.string.ans_37), getString(R.string.ans_174), getString(R.string.ans_100), getString(R.string.ans_66)));
            Question.add(new TestQues(getString(R.string.ques_67), getString(R.string.ans_67), getString(R.string.ans_55), getString(R.string.ans_67), getString(R.string.ans_54), getString(R.string.ans_30)));
            Question.add(new TestQues(getString(R.string.ques_68), getString(R.string.ans_68), getString(R.string.ans_81), getString(R.string.ans_197), getString(R.string.ans_112), getString(R.string.ans_68)));
            Question.add(new TestQues(getString(R.string.ques_69), getString(R.string.ans_69), getString(R.string.ans_84), getString(R.string.ans_69), getString(R.string.ans_29), getString(R.string.ans_24)));
            Question.add(new TestQues(getString(R.string.ques_70), getString(R.string.ans_70), getString(R.string.ans_90), getString(R.string.ans_127), getString(R.string.ans_70), getString(R.string.ans_43)));
            Question.add(new TestQues(getString(R.string.ques_71), getString(R.string.ans_71), getString(R.string.ans_91), getString(R.string.ans_54), getString(R.string.ans_25), getString(R.string.ans_71)));
            Question.add(new TestQues(getString(R.string.ques_72), getString(R.string.ans_72), getString(R.string.ans_43), getString(R.string.ans_72), getString(R.string.ans_125), getString(R.string.ans_20)));
            Question.add(new TestQues(getString(R.string.ques_73), getString(R.string.ans_73), getString(R.string.ans_73), getString(R.string.ans_37), getString(R.string.ans_109), getString(R.string.ans_15)));
            Question.add(new TestQues(getString(R.string.ques_74), getString(R.string.ans_74), getString(R.string.ans_105), getString(R.string.ans_74), getString(R.string.ans_17), getString(R.string.ans_23)));
            Question.add(new TestQues(getString(R.string.ques_75), getString(R.string.ans_75), getString(R.string.ans_57), getString(R.string.ans_154), getString(R.string.ans_36), getString(R.string.ans_75)));
        } else if (set == 6) {
            Question.add(new TestQues(getString(R.string.ques_76), getString(R.string.ans_76), getString(R.string.ans_38), getString(R.string.ans_49), getString(R.string.ans_76), getString(R.string.ans_26)));
            Question.add(new TestQues(getString(R.string.ques_77), getString(R.string.ans_77), getString(R.string.ans_90), getString(R.string.ans_77), getString(R.string.ans_118), getString(R.string.ans_44)));
            Question.add(new TestQues(getString(R.string.ques_78), getString(R.string.ans_78), getString(R.string.ans_81), getString(R.string.ans_197), getString(R.string.ans_78), getString(R.string.ans_8)));
            Question.add(new TestQues(getString(R.string.ques_79), getString(R.string.ans_79), getString(R.string.ans_79), getString(R.string.ans_167), getString(R.string.ans_114), getString(R.string.ans_44)));
            Question.add(new TestQues(getString(R.string.ques_80), getString(R.string.ans_80), getString(R.string.ans_31), getString(R.string.ans_120), getString(R.string.ans_132), getString(R.string.ans_80)));
            Question.add(new TestQues(getString(R.string.ques_81), getString(R.string.ans_81), getString(R.string.ans_23), getString(R.string.ans_81), getString(R.string.ans_44), getString(R.string.ans_45)));
            Question.add(new TestQues(getString(R.string.ques_82), getString(R.string.ans_82), getString(R.string.ans_82), getString(R.string.ans_22), getString(R.string.ans_30), getString(R.string.ans_36)));
            Question.add(new TestQues(getString(R.string.ques_83), getString(R.string.ans_83), getString(R.string.ans_75), getString(R.string.ans_199), getString(R.string.ans_20), getString(R.string.ans_83)));
            Question.add(new TestQues(getString(R.string.ques_84), getString(R.string.ans_84), getString(R.string.ans_84), getString(R.string.ans_185), getString(R.string.ans_28), getString(R.string.ans_42)));
            Question.add(new TestQues(getString(R.string.ques_85), getString(R.string.ans_85), getString(R.string.ans_85), getString(R.string.ans_144), getString(R.string.ans_142), getString(R.string.ans_29)));
            Question.add(new TestQues(getString(R.string.ques_86), getString(R.string.ans_86), getString(R.string.ans_95), getString(R.string.ans_48), getString(R.string.ans_86), getString(R.string.ans_35)));
            Question.add(new TestQues(getString(R.string.ques_87), getString(R.string.ans_87), getString(R.string.ans_75), getString(R.string.ans_87), getString(R.string.ans_35), getString(R.string.ans_39)));
            Question.add(new TestQues(getString(R.string.ques_88), getString(R.string.ans_88), getString(R.string.ans_48), getString(R.string.ans_29), getString(R.string.ans_15), getString(R.string.ans_88)));
            Question.add(new TestQues(getString(R.string.ques_89), getString(R.string.ans_89), getString(R.string.ans_78), getString(R.string.ans_155), getString(R.string.ans_89), getString(R.string.ans_43)));
            Question.add(new TestQues(getString(R.string.ques_90), getString(R.string.ans_90), getString(R.string.ans_34), getString(R.string.ans_90), getString(R.string.ans_5), getString(R.string.ans_22)));
        } else if (set == 7) {
            Question.add(new TestQues(getString(R.string.ques_91), getString(R.string.ans_91), getString(R.string.ans_74), getString(R.string.ans_91), getString(R.string.ans_58), getString(R.string.ans_21)));
            Question.add(new TestQues(getString(R.string.ques_92), getString(R.string.ans_92), getString(R.string.ans_94), getString(R.string.ans_45), getString(R.string.ans_51), getString(R.string.ans_91)));
            Question.add(new TestQues(getString(R.string.ques_93), getString(R.string.ans_93), getString(R.string.ans_20), getString(R.string.ans_93), getString(R.string.ans_8), getString(R.string.ans_23)));
            Question.add(new TestQues(getString(R.string.ques_94), getString(R.string.ans_94), getString(R.string.ans_94), getString(R.string.ans_134), getString(R.string.ans_81), getString(R.string.ans_3)));
            Question.add(new TestQues(getString(R.string.ques_95), getString(R.string.ans_95), getString(R.string.ans_64), getString(R.string.ans_108), getString(R.string.ans_95), getString(R.string.ans_12)));
            Question.add(new TestQues(getString(R.string.ques_96), getString(R.string.ans_96), getString(R.string.ans_63), getString(R.string.ans_117), getString(R.string.ans_96), getString(R.string.ans_29)));
            Question.add(new TestQues(getString(R.string.ques_97), getString(R.string.ans_97), getString(R.string.ans_18), getString(R.string.ans_97), getString(R.string.ans_134), getString(R.string.ans_10)));
            Question.add(new TestQues(getString(R.string.ques_98), getString(R.string.ans_98), getString(R.string.ans_38), getString(R.string.ans_34), getString(R.string.ans_120), getString(R.string.ans_98)));
            Question.add(new TestQues(getString(R.string.ques_99), getString(R.string.ans_99), getString(R.string.ans_13), getString(R.string.ans_99), getString(R.string.ans_94), getString(R.string.ans_12)));
            Question.add(new TestQues(getString(R.string.ques_100), getString(R.string.ans_100), getString(R.string.ans_100), getString(R.string.ans_116), getString(R.string.ans_118), getString(R.string.ans_44)));
            Question.add(new TestQues(getString(R.string.ques_101), getString(R.string.ans_101), getString(R.string.ans_41), getString(R.string.ans_28), getString(R.string.ans_101), getString(R.string.ans_45)));
            Question.add(new TestQues(getString(R.string.ques_102), getString(R.string.ans_102), getString(R.string.ans_33), getString(R.string.ans_102), getString(R.string.ans_53), getString(R.string.ans_20)));
            Question.add(new TestQues(getString(R.string.ques_103), getString(R.string.ans_103), getString(R.string.ans_103), getString(R.string.ans_19), getString(R.string.ans_52), getString(R.string.ans_15)));
            Question.add(new TestQues(getString(R.string.ques_104), getString(R.string.ans_104), getString(R.string.ans_96), getString(R.string.ans_104), getString(R.string.ans_151), getString(R.string.ans_11)));
            Question.add(new TestQues(getString(R.string.ques_105), getString(R.string.ans_105), getString(R.string.ans_105), getString(R.string.ans_85), getString(R.string.ans_67), getString(R.string.ans_18)));
        } else if (set == 8) {
            Question.add(new TestQues(getString(R.string.ques_106), getString(R.string.ans_106), getString(R.string.ans_108), getString(R.string.ans_106), getString(R.string.ans_17), getString(R.string.ans_3)));
            Question.add(new TestQues(getString(R.string.ques_107), getString(R.string.ans_107), getString(R.string.ans_48), getString(R.string.ans_78), getString(R.string.ans_152), getString(R.string.ans_107)));
            Question.add(new TestQues(getString(R.string.ques_108), getString(R.string.ans_108), getString(R.string.ans_59), getString(R.string.ans_108), getString(R.string.ans_115), getString(R.string.ans_40)));
            Question.add(new TestQues(getString(R.string.ques_109), getString(R.string.ans_109), getString(R.string.ans_109), getString(R.string.ans_82), getString(R.string.ans_69), getString(R.string.ans_32)));
            Question.add(new TestQues(getString(R.string.ques_110), getString(R.string.ans_110), getString(R.string.ans_38), getString(R.string.ans_159), getString(R.string.ans_110), getString(R.string.ans_11)));
            Question.add(new TestQues(getString(R.string.ques_111), getString(R.string.ans_111), getString(R.string.ans_111), getString(R.string.ans_169), getString(R.string.ans_9), getString(R.string.ans_10)));
            Question.add(new TestQues(getString(R.string.ques_112), getString(R.string.ans_112), getString(R.string.ans_12), getString(R.string.ans_145), getString(R.string.ans_112), getString(R.string.ans_41)));
            Question.add(new TestQues(getString(R.string.ques_113), getString(R.string.ans_113), getString(R.string.ans_113), getString(R.string.ans_180), getString(R.string.ans_135), getString(R.string.ans_10)));
            Question.add(new TestQues(getString(R.string.ques_114), getString(R.string.ans_114), getString(R.string.ans_83), getString(R.string.ans_114), getString(R.string.ans_14), getString(R.string.ans_22)));
            Question.add(new TestQues(getString(R.string.ques_115), getString(R.string.ans_115), getString(R.string.ans_36), getString(R.string.ans_159), getString(R.string.ans_148), getString(R.string.ans_115)));
            Question.add(new TestQues(getString(R.string.ques_116), getString(R.string.ans_116), getString(R.string.ans_116), getString(R.string.ans_61), getString(R.string.ans_145), getString(R.string.ans_23)));
            Question.add(new TestQues(getString(R.string.ques_117), getString(R.string.ans_117), getString(R.string.ans_19), getString(R.string.ans_117), getString(R.string.ans_90), getString(R.string.ans_27)));
            Question.add(new TestQues(getString(R.string.ques_118), getString(R.string.ans_118), getString(R.string.ans_36), getString(R.string.ans_21), getString(R.string.ans_124), getString(R.string.ans_118)));
            Question.add(new TestQues(getString(R.string.ques_119), getString(R.string.ans_119), getString(R.string.ans_119), getString(R.string.ans_20), getString(R.string.ans_152), getString(R.string.ans_2)));
            Question.add(new TestQues(getString(R.string.ques_120), getString(R.string.ans_120), getString(R.string.ans_21), getString(R.string.ans_199), getString(R.string.ans_120), getString(R.string.ans_31)));
        } else if (set == 9) {
            Question.add(new TestQues(getString(R.string.ques_121), getString(R.string.ans_121), getString(R.string.ans_121), getString(R.string.ans_70), getString(R.string.ans_138), getString(R.string.ans_6)));
            Question.add(new TestQues(getString(R.string.ques_122), getString(R.string.ans_122), getString(R.string.ans_51), getString(R.string.ans_86), getString(R.string.ans_122), getString(R.string.ans_7)));
            Question.add(new TestQues(getString(R.string.ques_123), getString(R.string.ans_123), getString(R.string.ans_26), getString(R.string.ans_123), getString(R.string.ans_52), getString(R.string.ans_22)));
            Question.add(new TestQues(getString(R.string.ques_124), getString(R.string.ans_124), getString(R.string.ans_47), getString(R.string.ans_24), getString(R.string.ans_52), getString(R.string.ans_124)));
            Question.add(new TestQues(getString(R.string.ques_125), getString(R.string.ans_125), getString(R.string.ans_53), getString(R.string.ans_83), getString(R.string.ans_125), getString(R.string.ans_35)));
            Question.add(new TestQues(getString(R.string.ques_126), getString(R.string.ans_126), getString(R.string.ans_126), getString(R.string.ans_38), getString(R.string.ans_54), getString(R.string.ans_15)));
            Question.add(new TestQues(getString(R.string.ques_127), getString(R.string.ans_127), getString(R.string.ans_104), getString(R.string.ans_54), getString(R.string.ans_24), getString(R.string.ans_127)));
            Question.add(new TestQues(getString(R.string.ques_128), getString(R.string.ans_128), getString(R.string.ans_128), getString(R.string.ans_92), getString(R.string.ans_57), getString(R.string.ans_4)));
            Question.add(new TestQues(getString(R.string.ques_129), getString(R.string.ans_129), getString(R.string.ans_90), getString(R.string.ans_27), getString(R.string.ans_129), getString(R.string.ans_43)));
            Question.add(new TestQues(getString(R.string.ques_130), getString(R.string.ans_130), getString(R.string.ans_42), getString(R.string.ans_130), getString(R.string.ans_129), getString(R.string.ans_33)));
            Question.add(new TestQues(getString(R.string.ques_131), getString(R.string.ans_131), getString(R.string.ans_66), getString(R.string.ans_26), getString(R.string.ans_49), getString(R.string.ans_131)));
            Question.add(new TestQues(getString(R.string.ques_132), getString(R.string.ans_132), getString(R.string.ans_132), getString(R.string.ans_141), getString(R.string.ans_49), getString(R.string.ans_3)));
            Question.add(new TestQues(getString(R.string.ques_133), getString(R.string.ans_133), getString(R.string.ans_66), getString(R.string.ans_61), getString(R.string.ans_16), getString(R.string.ans_133)));
            Question.add(new TestQues(getString(R.string.ques_134), getString(R.string.ans_134), getString(R.string.ans_94), getString(R.string.ans_89), getString(R.string.ans_134), getString(R.string.ans_10)));
            Question.add(new TestQues(getString(R.string.ques_135), getString(R.string.ans_135), getString(R.string.ans_135), getString(R.string.ans_51), getString(R.string.ans_131), getString(R.string.ans_7)));
        } else if (set == 10) {
            Question.add(new TestQues(getString(R.string.ques_136), getString(R.string.ans_136), getString(R.string.ans_100), getString(R.string.ans_136), getString(R.string.ans_152), getString(R.string.ans_40)));
            Question.add(new TestQues(getString(R.string.ques_137), getString(R.string.ans_137), getString(R.string.ans_75), getString(R.string.ans_137), getString(R.string.ans_73), getString(R.string.ans_41)));
            Question.add(new TestQues(getString(R.string.ques_138), getString(R.string.ans_138), getString(R.string.ans_37), getString(R.string.ans_51), getString(R.string.ans_84), getString(R.string.ans_138)));
            Question.add(new TestQues(getString(R.string.ques_139), getString(R.string.ans_139), getString(R.string.ans_139), getString(R.string.ans_82), getString(R.string.ans_79), getString(R.string.ans_43)));
            Question.add(new TestQues(getString(R.string.ques_140), getString(R.string.ans_140), getString(R.string.ans_29), getString(R.string.ans_129), getString(R.string.ans_140), getString(R.string.ans_28)));
            Question.add(new TestQues(getString(R.string.ques_141), getString(R.string.ans_141), getString(R.string.ans_141), getString(R.string.ans_30), getString(R.string.ans_83), getString(R.string.ans_45)));
            Question.add(new TestQues(getString(R.string.ques_142), getString(R.string.ans_142), getString(R.string.ans_15), getString(R.string.ans_86), getString(R.string.ans_142), getString(R.string.ans_16)));
            Question.add(new TestQues(getString(R.string.ques_143), getString(R.string.ans_143), getString(R.string.ans_143), getString(R.string.ans_109), getString(R.string.ans_135), getString(R.string.ans_4)));
            Question.add(new TestQues(getString(R.string.ques_144), getString(R.string.ans_144), getString(R.string.ans_28), getString(R.string.ans_186), getString(R.string.ans_144), getString(R.string.ans_44)));
            Question.add(new TestQues(getString(R.string.ques_145), getString(R.string.ans_145), getString(R.string.ans_145), getString(R.string.ans_206), getString(R.string.ans_73), getString(R.string.ans_39)));
            Question.add(new TestQues(getString(R.string.ques_146), getString(R.string.ans_146), getString(R.string.ans_62), getString(R.string.ans_29), getString(R.string.ans_129), getString(R.string.ans_146)));
            Question.add(new TestQues(getString(R.string.ques_147), getString(R.string.ans_147), getString(R.string.ans_75), getString(R.string.ans_150), getString(R.string.ans_147), getString(R.string.ans_34)));
            Question.add(new TestQues(getString(R.string.ques_148), getString(R.string.ans_148), getString(R.string.ans_148), getString(R.string.ans_128), getString(R.string.ans_39), getString(R.string.ans_9)));
            Question.add(new TestQues(getString(R.string.ques_149), getString(R.string.ans_149), getString(R.string.ans_45), getString(R.string.ans_76), getString(R.string.ans_149), getString(R.string.ans_34)));
            Question.add(new TestQues(getString(R.string.ques_150), getString(R.string.ans_150), getString(R.string.ans_44), getString(R.string.ans_150), getString(R.string.ans_103), getString(R.string.ans_15)));
        } else if (set == 11) {
            Question.add(new TestQues(getString(R.string.ques_151), getString(R.string.ans_151), getString(R.string.ans_26), getString(R.string.ans_133), getString(R.string.ans_77), getString(R.string.ans_151)));
            Question.add(new TestQues(getString(R.string.ques_152), getString(R.string.ans_152), getString(R.string.ans_64), getString(R.string.ans_186), getString(R.string.ans_152), getString(R.string.ans_12)));
            Question.add(new TestQues(getString(R.string.ques_153), getString(R.string.ans_153), getString(R.string.ans_105), getString(R.string.ans_153), getString(R.string.ans_106), getString(R.string.ans_26)));
            Question.add(new TestQues(getString(R.string.ques_154), getString(R.string.ans_154), getString(R.string.ans_154), getString(R.string.ans_69), getString(R.string.ans_68), getString(R.string.ans_44)));
            Question.add(new TestQues(getString(R.string.ques_155), getString(R.string.ans_155), getString(R.string.ans_24), getString(R.string.ans_89), getString(R.string.ans_155), getString(R.string.ans_35)));
            Question.add(new TestQues(getString(R.string.ques_156), getString(R.string.ans_156), getString(R.string.ans_156), getString(R.string.ans_45), getString(R.string.ans_127), getString(R.string.ans_5)));
            Question.add(new TestQues(getString(R.string.ques_157), getString(R.string.ans_157), getString(R.string.ans_68), getString(R.string.ans_101), getString(R.string.ans_157), getString(R.string.ans_12)));
            Question.add(new TestQues(getString(R.string.ques_158), getString(R.string.ans_158), getString(R.string.ans_32), getString(R.string.ans_67), getString(R.string.ans_12), getString(R.string.ans_158)));
            Question.add(new TestQues(getString(R.string.ques_159), getString(R.string.ans_159), getString(R.string.ans_159), getString(R.string.ans_137), getString(R.string.ans_15), getString(R.string.ans_36)));
            Question.add(new TestQues(getString(R.string.ques_160), getString(R.string.ans_160), getString(R.string.ans_56), getString(R.string.ans_117), getString(R.string.ans_160), getString(R.string.ans_23)));
            Question.add(new TestQues(getString(R.string.ques_161), getString(R.string.ans_161), getString(R.string.ans_161), getString(R.string.ans_165), getString(R.string.ans_129), getString(R.string.ans_42)));
            Question.add(new TestQues(getString(R.string.ques_162), getString(R.string.ans_162), getString(R.string.ans_42), getString(R.string.ans_29), getString(R.string.ans_123), getString(R.string.ans_162)));
            Question.add(new TestQues(getString(R.string.ques_163), getString(R.string.ans_163), getString(R.string.ans_83), getString(R.string.ans_163), getString(R.string.ans_75), getString(R.string.ans_7)));
            Question.add(new TestQues(getString(R.string.ques_164), getString(R.string.ans_164), getString(R.string.ans_164), getString(R.string.ans_144), getString(R.string.ans_45), getString(R.string.ans_45)));
            Question.add(new TestQues(getString(R.string.ques_165), getString(R.string.ans_165), getString(R.string.ans_74), getString(R.string.ans_165), getString(R.string.ans_17), getString(R.string.ans_7)));
        } else if (set == 12) {
            Question.add(new TestQues(getString(R.string.ques_166), getString(R.string.ans_166), getString(R.string.ans_166), getString(R.string.ans_83), getString(R.string.ans_68), getString(R.string.ans_13)));
            Question.add(new TestQues(getString(R.string.ques_167), getString(R.string.ans_167), getString(R.string.ans_85), getString(R.string.ans_45), getString(R.string.ans_97), getString(R.string.ans_167)));
            Question.add(new TestQues(getString(R.string.ques_168), getString(R.string.ans_168), getString(R.string.ans_95), getString(R.string.ans_75), getString(R.string.ans_168), getString(R.string.ans_10)));
            Question.add(new TestQues(getString(R.string.ques_169), getString(R.string.ans_169), getString(R.string.ans_81), getString(R.string.ans_137), getString(R.string.ans_128), getString(R.string.ans_169)));
            Question.add(new TestQues(getString(R.string.ques_170), getString(R.string.ans_170), getString(R.string.ans_170), getString(R.string.ans_28), getString(R.string.ans_68), getString(R.string.ans_11)));
            Question.add(new TestQues(getString(R.string.ques_171), getString(R.string.ans_171), getString(R.string.ans_86), getString(R.string.ans_167), getString(R.string.ans_171), getString(R.string.ans_22)));
            Question.add(new TestQues(getString(R.string.ques_172), getString(R.string.ans_172), getString(R.string.ans_90), getString(R.string.ans_172), getString(R.string.ans_110), getString(R.string.ans_17)));
            Question.add(new TestQues(getString(R.string.ques_173), getString(R.string.ans_173), getString(R.string.ans_85), getString(R.string.ans_30), getString(R.string.ans_149), getString(R.string.ans_173)));
            Question.add(new TestQues(getString(R.string.ques_174), getString(R.string.ans_174), getString(R.string.ans_174), getString(R.string.ans_99), getString(R.string.ans_95), getString(R.string.ans_29)));
            Question.add(new TestQues(getString(R.string.ques_175), getString(R.string.ans_175), getString(R.string.ans_99), getString(R.string.ans_175), getString(R.string.ans_42), getString(R.string.ans_15)));
            Question.add(new TestQues(getString(R.string.ques_176), getString(R.string.ans_176), getString(R.string.ans_22), getString(R.string.ans_116), getString(R.string.ans_40), getString(R.string.ans_176)));
            Question.add(new TestQues(getString(R.string.ques_177), getString(R.string.ans_177), getString(R.string.ans_177), getString(R.string.ans_162), getString(R.string.ans_9), getString(R.string.ans_14)));
            Question.add(new TestQues(getString(R.string.ques_178), getString(R.string.ans_178), getString(R.string.ans_31), getString(R.string.ans_128), getString(R.string.ans_178), getString(R.string.ans_2)));
            Question.add(new TestQues(getString(R.string.ques_179), getString(R.string.ans_179), getString(R.string.ans_62), getString(R.string.ans_179), getString(R.string.ans_75), getString(R.string.ans_6)));
            Question.add(new TestQues(getString(R.string.ques_180), getString(R.string.ans_180), getString(R.string.ans_36), getString(R.string.ans_62), getString(R.string.ans_138), getString(R.string.ans_180)));
        } else if (set == 13) {
            Question.add(new TestQues(getString(R.string.ques_181), getString(R.string.ans_181), getString(R.string.ans_181), getString(R.string.ans_79), getString(R.string.ans_35), getString(R.string.ans_18)));
            Question.add(new TestQues(getString(R.string.ques_182), getString(R.string.ans_182), getString(R.string.ans_11), getString(R.string.ans_31), getString(R.string.ans_182), getString(R.string.ans_18)));
            Question.add(new TestQues(getString(R.string.ques_183), getString(R.string.ans_183), getString(R.string.ans_74), getString(R.string.ans_107), getString(R.string.ans_117), getString(R.string.ans_183)));
            Question.add(new TestQues(getString(R.string.ques_184), getString(R.string.ans_184), getString(R.string.ans_23), getString(R.string.ans_56), getString(R.string.ans_184), getString(R.string.ans_30)));
            Question.add(new TestQues(getString(R.string.ques_185), getString(R.string.ans_185), getString(R.string.ans_52), getString(R.string.ans_185), getString(R.string.ans_38), getString(R.string.ans_27)));
            Question.add(new TestQues(getString(R.string.ques_186), getString(R.string.ans_186), getString(R.string.ans_43), getString(R.string.ans_130), getString(R.string.ans_34), getString(R.string.ans_186)));
            Question.add(new TestQues(getString(R.string.ques_187), getString(R.string.ans_187), getString(R.string.ans_187), getString(R.string.ans_177), getString(R.string.ans_120), getString(R.string.ans_38)));
            Question.add(new TestQues(getString(R.string.ques_188), getString(R.string.ans_188), getString(R.string.ans_55), getString(R.string.ans_109), getString(R.string.ans_188), getString(R.string.ans_19)));
            Question.add(new TestQues(getString(R.string.ques_189), getString(R.string.ans_189), getString(R.string.ans_79), getString(R.string.ans_196), getString(R.string.ans_96), getString(R.string.ans_189)));
            Question.add(new TestQues(getString(R.string.ques_190), getString(R.string.ans_190), getString(R.string.ans_35), getString(R.string.ans_47), getString(R.string.ans_190), getString(R.string.ans_25)));
            Question.add(new TestQues(getString(R.string.ques_191), getString(R.string.ans_191), getString(R.string.ans_84), getString(R.string.ans_191), getString(R.string.ans_13), getString(R.string.ans_36)));
            Question.add(new TestQues(getString(R.string.ques_192), getString(R.string.ans_192), getString(R.string.ans_192), getString(R.string.ans_167), getString(R.string.ans_6), getString(R.string.ans_27)));
            Question.add(new TestQues(getString(R.string.ques_193), getString(R.string.ans_193), getString(R.string.ans_69), getString(R.string.ans_16), getString(R.string.ans_193), getString(R.string.ans_21)));
            Question.add(new TestQues(getString(R.string.ques_194), getString(R.string.ans_194), getString(R.string.ans_194), getString(R.string.ans_176), getString(R.string.ans_89), getString(R.string.ans_14)));
            Question.add(new TestQues(getString(R.string.ques_195), getString(R.string.ans_195), getString(R.string.ans_32), getString(R.string.ans_93), getString(R.string.ans_195), getString(R.string.ans_12)));
        }

        /*initialising question no to -1 */
        i = -1;
        //Find view by id
        QuesTextView = (TextView) findViewById(R.id.quesTextView);
        QuestionNo = (TextView) findViewById(R.id.questionNo);

        opt1View = (TextView) findViewById(R.id.opt1);
        opt2View = (TextView) findViewById(R.id.opt2);
        opt3View = (TextView) findViewById(R.id.opt3);
        opt4View = (TextView) findViewById(R.id.opt4);
        nextbtn2 = (ImageView) findViewById(R.id.nextBottom);
        nextbtn = (ImageView) findViewById(R.id.nextTop);
        timer = (TextView) findViewById(R.id.timer);
        score = (TextView) findViewById(R.id.score);

        /*calling next method onCreate method  */
        next();


        /*Set click Listener on next buttons view*/
        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                next();
            }
        });
        nextbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                next();
            }
        });
        /*Set click Listener on options textviews view */
        opt1View.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Question.get(i).getmOpt1().equals(Question.get(i).getmAnswer())) {
                    opt1View.setTextColor(getResources().getColor(R.color.colorPrimary));

                    scores++;
                    score.setText(getString(R.string.score) + Integer.toString(scores));


                } else {
                    opt1View.setTextColor(getResources().getColor(R.color.red));


                }

                new CountDownTimer(1000, 500) {
                    public void onTick(long millisUntilFinished) {
                        timer.setText("FINISH!!");
                        Stopwatch.cancel();
                    }

                    public void onFinish() {

                        next();
                    }
                }.start();

            }
        });
        opt2View.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Question.get(i).getmOpt2().equals(Question.get(i).getmAnswer())) {
                    opt2View.setTextColor(getResources().getColor(R.color.colorPrimary));

                    scores++;
                    score.setText("स्कोर: " + Integer.toString(scores));
                } else {
                    opt2View.setTextColor(getResources().getColor(R.color.red));
                }
                new CountDownTimer(1000, 500) {
                    public void onTick(long millisUntilFinished) {
                        timer.setText("FINISH!!");
                        Stopwatch.cancel();
                    }

                    public void onFinish() {

                        next();
                    }
                }.start();

            }
        });
        opt3View.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Question.get(i).getmOpt3().equals(Question.get(i).getmAnswer())) {
                    opt3View.setTextColor(getResources().getColor(R.color.colorPrimary));
                    scores++;
                    score.setText("स्कोर: " + Integer.toString(scores));
                } else {
                    opt3View.setTextColor(getResources().getColor(R.color.red));
                }

                new CountDownTimer(1000, 500) {
                    public void onTick(long millisUntilFinished) {
                        timer.setText("FINISH!!");
                        Stopwatch.cancel();
                    }

                    public void onFinish() {

                        next();
                    }
                }.start();

            }
        });
        opt4View.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Question.get(i).getmOpt4().equals(Question.get(i).getmAnswer())) {
                    opt4View.setTextColor(getResources().getColor(R.color.colorPrimary));
                    scores++;
                    score.setText("स्कोर: " + Integer.toString(scores));
                } else {
                    opt4View.setTextColor(getResources().getColor(R.color.red));
                }
                new CountDownTimer(1000, 500) {
                    public void onTick(long millisUntilFinished) {
                        timer.setText("FINISH!!");
                        Stopwatch.cancel();
                    }

                    public void onFinish() {

                        next();
                    }
                }.start();

            }
        });


    }


}

