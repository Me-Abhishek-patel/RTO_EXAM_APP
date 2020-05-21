package com.example.driviglicencetesttrainer_rtoexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TestSet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_set);
    }

    public void testSet1(View view) {
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
        Intent testSet3Intent = new Intent(this, Test.class);
        testSet3Intent.putExtra("set", 3);
        startActivity(testSet3Intent);

    }

    public void testSet4(View view) {
        Intent testSet4Intent = new Intent(this, Test.class);
        testSet4Intent.putExtra("set", 4);
        startActivity(testSet4Intent);

    }
}
