package com.example.driviglicencetesttrainer_rtoexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AnimationUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void learnHere(View view) {
        view.startAnimation(AnimationUtils.loadAnimation(this, R.anim.image_click));
        Intent learnHereIntent = new Intent(MainActivity.this, LearnHere.class);
        startActivity(learnHereIntent);
    }

    public void testSet(View view) {
        view.startAnimation(AnimationUtils.loadAnimation(this, R.anim.image_click));
        Intent testSetIntent = new Intent(MainActivity.this, TestSet.class);
        startActivity(testSetIntent);
    }

}
