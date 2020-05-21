package com.example.driviglicencetesttrainer_rtoexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;


public class Scorecard extends AppCompatActivity {
    TextView scoreview, percentview;
    int percent;
    ImageView scoremeter;

    public void animateTextView(int initialValue, int finalValue, final TextView textview) {
        DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator(0.8f);
        int start = Math.min(initialValue, finalValue);
        int end = Math.max(initialValue, finalValue);
        int difference = Math.abs(finalValue - initialValue);
        Handler handler = new Handler();
        for (int count = start; count <= end; count++) {
            int time = Math.round(decelerateInterpolator.getInterpolation((((float) count) / difference)) * 100) * count;
            final int finalCount = ((initialValue > finalValue) ? initialValue - count : count);
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    textview.setText(String.valueOf(finalCount));
                }
            }, time);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scorecard);
        Intent mIntent = getIntent();
        int scores = mIntent.getIntExtra("scores", 0);


        percent = (int) (scores * 100) / 15;
        scoremeter = (ImageView) findViewById(R.id.scoremeter);
        scoreview = (TextView) findViewById(R.id.scoresv);
        percentview = (TextView) findViewById(R.id.percentv);
        scoreview.setText(Integer.toString(scores));


        if (percent <= 25)
            scoremeter.setImageResource(R.drawable.poor);
        else if (percent <= 50)
            scoremeter.setImageResource(R.drawable.bad);
        else if (percent <= 75)
            scoremeter.setImageResource(R.drawable.normal);
        else
            scoremeter.setImageResource(R.drawable.good);


        animateTextView(0, scores, scoreview);

        percentview.setText(Integer.toString(percent) + " %");


    }

}
