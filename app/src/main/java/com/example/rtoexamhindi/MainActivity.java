package com.example.rtoexamhindi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
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

    public void signActive(View view) {
        view.startAnimation(AnimationUtils.loadAnimation(this, R.anim.image_click));
        Intent signIntent = new Intent(MainActivity.this, RoadSigns.class);
        startActivity(signIntent);
    }

    public void rateUs(View view) {
        Context context = getApplicationContext();
        Uri uri = Uri.parse("market://details?id=" + context.getPackageName());
        Intent goToMarket = new Intent(Intent.ACTION_VIEW, uri);
        // To count with Play market backstack, After pressing back button,
        // to taken back to our application, we need to add following flags to intent.
        goToMarket.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY |
                Intent.FLAG_ACTIVITY_NEW_DOCUMENT |
                Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
        try {
            startActivity(goToMarket);
        } catch (ActivityNotFoundException e) {
            startActivity(new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://play.google.com/store/apps/details?id=" + context.getPackageName())));
        }
    }

    public void quickTest(View view) {
        view.startAnimation(AnimationUtils.loadAnimation(this, R.anim.image_click));
        int i = 1 + (int) (Math.random() * ((13 - 1) + 1));
        Intent testQuickIntent = new Intent(this, Test.class);
        testQuickIntent.putExtra("set", i);
        startActivity(testQuickIntent);
    }
}
