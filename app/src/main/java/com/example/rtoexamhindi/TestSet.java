package com.example.rtoexamhindi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;

public class TestSet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_set);
    }

    public void testSet1(View view) {
        view.startAnimation(AnimationUtils.loadAnimation(this, R.anim.image_click));
        Intent testSet1Intent = new Intent(this, Test.class);
        testSet1Intent.putExtra("set", 1);

        startActivity(testSet1Intent);

    }

    public void testSet2(View view) {
        Intent testSet2Intent = new Intent(this, Test.class);
        testSet2Intent.putExtra("set", 2);
        startActivity(testSet2Intent);

    }

    public void testSet3(View view) {
        view.startAnimation(AnimationUtils.loadAnimation(this, R.anim.image_click));
        Intent testSet3Intent = new Intent(this, Test.class);
        testSet3Intent.putExtra("set", 3);
        startActivity(testSet3Intent);

    }

    public void testSet4(View view) {
        Intent testSet4Intent = new Intent(this, Test.class);
        testSet4Intent.putExtra("set", 4);
        startActivity(testSet4Intent);

    }

    public void testSet5(View view) {
        view.startAnimation(AnimationUtils.loadAnimation(this, R.anim.image_click));
        Intent testSet5Intent = new Intent(this, Test.class);
        testSet5Intent.putExtra("set", 5);
        startActivity(testSet5Intent);

    }

    public void testSet6(View view) {
        view.startAnimation(AnimationUtils.loadAnimation(this, R.anim.image_click));
        Intent testSet6Intent = new Intent(this, Test.class);
        testSet6Intent.putExtra("set", 6);
        startActivity(testSet6Intent);

    }

    public void testSet7(View view) {
        view.startAnimation(AnimationUtils.loadAnimation(this, R.anim.image_click));
        Intent testSet7Intent = new Intent(this, Test.class);
        testSet7Intent.putExtra("set", 7);
        startActivity(testSet7Intent);

    }

    public void testSet8(View view) {
        view.startAnimation(AnimationUtils.loadAnimation(this, R.anim.image_click));
        Intent testSet8Intent = new Intent(this, Test.class);
        testSet8Intent.putExtra("set", 8);
        startActivity(testSet8Intent);

    }

    public void testSet9(View view) {
        Intent testSet9Intent = new Intent(this, Test.class);
        testSet9Intent.putExtra("set", 9);
        startActivity(testSet9Intent);

    }

    public void testSet10(View view) {
        view.startAnimation(AnimationUtils.loadAnimation(this, R.anim.image_click));
        Intent testSet10Intent = new Intent(this, Test.class);
        testSet10Intent.putExtra("set", 10);
        startActivity(testSet10Intent);

    }

    public void testSet11(View view) {
        Intent testSet11Intent = new Intent(this, Test.class);
        testSet11Intent.putExtra("set", 11);
        startActivity(testSet11Intent);

    }

    public void testSet12(View view) {
        view.startAnimation(AnimationUtils.loadAnimation(this, R.anim.image_click));
        Intent testSet12Intent = new Intent(this, Test.class);
        testSet12Intent.putExtra("set", 12);
        startActivity(testSet12Intent);

    }

    public void testSet13(View view) {
        Intent testSet13Intent = new Intent(this, Test.class);
        view.startAnimation(AnimationUtils.loadAnimation(this, R.anim.image_click));
        testSet13Intent.putExtra("set", 13);
        startActivity(testSet13Intent);

    }
}
