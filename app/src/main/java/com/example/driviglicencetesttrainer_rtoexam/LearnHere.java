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

    public void qPracticeSet4(View view) {
        view.startAnimation(AnimationUtils.loadAnimation(this, R.anim.image_click));
        Intent qpSet4Intent = new Intent(this, learn.class);
        qpSet4Intent.putExtra("set", 4);
        startActivity(qpSet4Intent);

    }

    public void qPracticeSet5(View view) {
        view.startAnimation(AnimationUtils.loadAnimation(this, R.anim.image_click));
        Intent qpSet5Intent = new Intent(this, learn.class);
        qpSet5Intent.putExtra("set", 5);
        startActivity(qpSet5Intent);

    }

    public void qPracticeSet6(View view) {
        view.startAnimation(AnimationUtils.loadAnimation(this, R.anim.image_click));
        Intent qpSet6Intent = new Intent(this, learn.class);
        qpSet6Intent.putExtra("set", 6);
        startActivity(qpSet6Intent);

    }

    public void qPracticeSet7(View view) {
        view.startAnimation(AnimationUtils.loadAnimation(this, R.anim.image_click));
        Intent qpSet7Intent = new Intent(this, learn.class);
        qpSet7Intent.putExtra("set", 7);
        startActivity(qpSet7Intent);

    }

    public void qPracticeSet8(View view) {
        view.startAnimation(AnimationUtils.loadAnimation(this, R.anim.image_click));
        Intent qpSet8Intent = new Intent(this, learn.class);
        qpSet8Intent.putExtra("set", 8);
        startActivity(qpSet8Intent);

    }

    public void qPracticeSet9(View view) {
        view.startAnimation(AnimationUtils.loadAnimation(this, R.anim.image_click));
        Intent qpSet9Intent = new Intent(this, learn.class);
        qpSet9Intent.putExtra("set", 9);
        startActivity(qpSet9Intent);

    }

    public void qPracticeSet10(View view) {
        view.startAnimation(AnimationUtils.loadAnimation(this, R.anim.image_click));
        Intent qpSet10Intent = new Intent(this, learn.class);
        qpSet10Intent.putExtra("set", 10);
        startActivity(qpSet10Intent);

    }

    public void qPracticeSet11(View view) {
        view.startAnimation(AnimationUtils.loadAnimation(this, R.anim.image_click));
        Intent qpSet11Intent = new Intent(this, learn.class);
        qpSet11Intent.putExtra("set", 11);
        startActivity(qpSet11Intent);

    }

    public void qPracticeSet12(View view) {
        view.startAnimation(AnimationUtils.loadAnimation(this, R.anim.image_click));
        Intent qpSet12Intent = new Intent(this, learn.class);
        qpSet12Intent.putExtra("set", 12);
        startActivity(qpSet12Intent);

    }

    public void qPracticeSet13(View view) {
        view.startAnimation(AnimationUtils.loadAnimation(this, R.anim.image_click));
        Intent qpSet13Intent = new Intent(this, learn.class);
        qpSet13Intent.putExtra("set", 13);
        startActivity(qpSet13Intent);

    }
}
