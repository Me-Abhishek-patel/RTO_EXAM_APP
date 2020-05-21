package com.example.driviglicencetesttrainer_rtoexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class learn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sets);


        final ArrayList<QPractice> Questions = new ArrayList<QPractice>();
        Intent setIntent = getIntent();
        int set = setIntent.getIntExtra("set", 0);

        /*Setting 15 questions in array list  */
        if (set == 1) {
            Questions.add(new QPractice(getString(R.string.ques_1), getString(R.string.ans_1), 1));
            Questions.add(new QPractice(getString(R.string.ques_2), getString(R.string.ans_2), 2));
            Questions.add(new QPractice(getString(R.string.ques_3), getString(R.string.ans_3), 3));
            Questions.add(new QPractice(getString(R.string.ques_4), getString(R.string.ans_4), 4));
            Questions.add(new QPractice(getString(R.string.ques_5), getString(R.string.ans_5), 5));
            Questions.add(new QPractice(getString(R.string.ques_6), getString(R.string.ans_6), 6));
            Questions.add(new QPractice(getString(R.string.ques_7), getString(R.string.ans_7), 7));
            Questions.add(new QPractice(getString(R.string.ques_8), getString(R.string.ans_8), 8));
            Questions.add(new QPractice(getString(R.string.ques_9), getString(R.string.ans_9), 9));
            Questions.add(new QPractice(getString(R.string.ques_10), getString(R.string.ans_10), 10));
            Questions.add(new QPractice(getString(R.string.ques_11), getString(R.string.ans_11), 11));
            Questions.add(new QPractice(getString(R.string.ques_12), getString(R.string.ans_12), 12));
            Questions.add(new QPractice(getString(R.string.ques_13), getString(R.string.ans_13), 13));
            Questions.add(new QPractice(getString(R.string.ques_14), getString(R.string.ans_14), 14));
            Questions.add(new QPractice(getString(R.string.ques_15), getString(R.string.ans_15), 15));
        } else if (set == 2) {
            Questions.add(new QPractice(getString(R.string.ques_16), getString(R.string.ans_16), 16));
            Questions.add(new QPractice(getString(R.string.ques_17), getString(R.string.ans_17), 17));
            Questions.add(new QPractice(getString(R.string.ques_18), getString(R.string.ans_18), 18));
            Questions.add(new QPractice(getString(R.string.ques_19), getString(R.string.ans_19), 19));
            Questions.add(new QPractice(getString(R.string.ques_20), getString(R.string.ans_20), 20));
            Questions.add(new QPractice(getString(R.string.ques_21), getString(R.string.ans_21), 21));
            Questions.add(new QPractice(getString(R.string.ques_22), getString(R.string.ans_22), 22));
            Questions.add(new QPractice(getString(R.string.ques_23), getString(R.string.ans_23), 23));
            Questions.add(new QPractice(getString(R.string.ques_24), getString(R.string.ans_24), 24));
            Questions.add(new QPractice(getString(R.string.ques_25), getString(R.string.ans_25), 25));
            Questions.add(new QPractice(getString(R.string.ques_26), getString(R.string.ans_26), 26));
            Questions.add(new QPractice(getString(R.string.ques_27), getString(R.string.ans_27), 27));
            Questions.add(new QPractice(getString(R.string.ques_28), getString(R.string.ans_28), 28));
            Questions.add(new QPractice(getString(R.string.ques_29), getString(R.string.ans_29), 29));
            Questions.add(new QPractice(getString(R.string.ques_30), getString(R.string.ans_30), 30));
        } else if (set == 3) {
            Questions.add(new QPractice(getString(R.string.ques_31), getString(R.string.ans_31), 31));
            Questions.add(new QPractice(getString(R.string.ques_32), getString(R.string.ans_32), 32));
            Questions.add(new QPractice(getString(R.string.ques_33), getString(R.string.ans_33), 33));
            Questions.add(new QPractice(getString(R.string.ques_34), getString(R.string.ans_34), 34));
            Questions.add(new QPractice(getString(R.string.ques_35), getString(R.string.ans_35), 35));
            Questions.add(new QPractice(getString(R.string.ques_36), getString(R.string.ans_36), 36));
            Questions.add(new QPractice(getString(R.string.ques_37), getString(R.string.ans_37), 37));
            Questions.add(new QPractice(getString(R.string.ques_38), getString(R.string.ans_38), 38));
            Questions.add(new QPractice(getString(R.string.ques_39), getString(R.string.ans_39), 39));
            Questions.add(new QPractice(getString(R.string.ques_40), getString(R.string.ans_40), 40));
            Questions.add(new QPractice(getString(R.string.ques_41), getString(R.string.ans_41), 41));
            Questions.add(new QPractice(getString(R.string.ques_42), getString(R.string.ans_42), 42));
            Questions.add(new QPractice(getString(R.string.ques_43), getString(R.string.ans_43), 43));
            Questions.add(new QPractice(getString(R.string.ques_44), getString(R.string.ans_44), 44));
            Questions.add(new QPractice(getString(R.string.ques_45), getString(R.string.ans_45), 45));
        }


        QAdapter adapter = new QAdapter(this, Questions);

        ListView listView = (ListView) findViewById(R.id.set_list);

        listView.setAdapter(adapter);

    }
}
