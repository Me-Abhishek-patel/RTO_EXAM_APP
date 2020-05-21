package com.example.driviglicencetesttrainer_rtoexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;

public class LearnHere extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_here);
    }

    public void qPracticeSet1(View view) {
        view.startAnimation(AnimationUtils.loadAnimation(this, R.anim.image_click));
        Intent qpSet1Intent = new Intent(this, learn.class);
        qpSet1Intent.putExtra("set", 1);
        startActivity(qpSet1Intent);

    }

    public void qPracticeSet2(View view) {
        view.startAnimation(AnimationUtils.loadAnimation(this, R.anim.image_click));
        Intent qpSet2Intent = new Intent(this, learn.class);
        qpSet2Intent.putExtra("set", 2);
        startActivity(qpSet2Intent);

    }

    public void qPracticeSet3(View view) {
        view.startAnimation(AnimationUtils.loadAnimation(this, R.anim.image_click));
        Intent qpSet3Intent = new Intent(this, learn.class);
        qpSet3Intent.putExtra("set", 3);
        startActivity(qpSet3Intent);

    }

}
