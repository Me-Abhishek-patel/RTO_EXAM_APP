package com.example.driviglicencetesttrainer_rtoexam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class RoadSigns extends AppCompatActivity {
    ListView listView;
    ArrayList<SignItem> signItemArrayList = new ArrayList<>();
    private SignAdapter mSignAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signs);
        listView = (ListView) findViewById(R.id.sign_list);
        signItemArrayList.add(new SignItem(R.drawable.img1, getString(R.string.sgn1), 1));
        signItemArrayList.add(new SignItem(R.drawable.img2, getString(R.string.sgn2), 2));
        signItemArrayList.add(new SignItem(R.drawable.img3, getString(R.string.sgn3), 3));
        signItemArrayList.add(new SignItem(R.drawable.img4, getString(R.string.sgn4), 4));
        signItemArrayList.add(new SignItem(R.drawable.img5, getString(R.string.sgn5), 5));
        signItemArrayList.add(new SignItem(R.drawable.img6, getString(R.string.sgn6), 6));
        signItemArrayList.add(new SignItem(R.drawable.img7, getString(R.string.sgn7), 7));
        signItemArrayList.add(new SignItem(R.drawable.img8, getString(R.string.sgn8), 8));
        signItemArrayList.add(new SignItem(R.drawable.img9, getString(R.string.sgn9), 9));
        signItemArrayList.add(new SignItem(R.drawable.img10, getString(R.string.sgn10), 10));
        signItemArrayList.add(new SignItem(R.drawable.img11, getString(R.string.sgn11), 11));
        signItemArrayList.add(new SignItem(R.drawable.img12, getString(R.string.sgn12), 12));
        signItemArrayList.add(new SignItem(R.drawable.img13, getString(R.string.sgn13), 13));
        signItemArrayList.add(new SignItem(R.drawable.img14, getString(R.string.sgn14), 14));
        signItemArrayList.add(new SignItem(R.drawable.img15, getString(R.string.sgn15), 15));
        signItemArrayList.add(new SignItem(R.drawable.img16, getString(R.string.sgn16), 16));
        signItemArrayList.add(new SignItem(R.drawable.img17, getString(R.string.sgn17), 17));
        signItemArrayList.add(new SignItem(R.drawable.img18, getString(R.string.sgn18), 18));
        signItemArrayList.add(new SignItem(R.drawable.img19, getString(R.string.sgn19), 19));
        signItemArrayList.add(new SignItem(R.drawable.img20, getString(R.string.sgn20), 20));
        signItemArrayList.add(new SignItem(R.drawable.img21, getString(R.string.sgn21), 21));
        signItemArrayList.add(new SignItem(R.drawable.img22, getString(R.string.sgn22), 22));
        signItemArrayList.add(new SignItem(R.drawable.img23, getString(R.string.sgn23), 23));
        signItemArrayList.add(new SignItem(R.drawable.img24, getString(R.string.sgn24), 24));
        signItemArrayList.add(new SignItem(R.drawable.img25, getString(R.string.sgn25), 25));
        signItemArrayList.add(new SignItem(R.drawable.img26, getString(R.string.sgn26), 26));
        signItemArrayList.add(new SignItem(R.drawable.img27, getString(R.string.sgn27), 27));
        signItemArrayList.add(new SignItem(R.drawable.img28, getString(R.string.sgn28), 28));
        signItemArrayList.add(new SignItem(R.drawable.img29, getString(R.string.sgn29), 29));
        signItemArrayList.add(new SignItem(R.drawable.img30, getString(R.string.sgn30), 30));
        signItemArrayList.add(new SignItem(R.drawable.img31, getString(R.string.sgn31), 31));
        signItemArrayList.add(new SignItem(R.drawable.img32, getString(R.string.sgn32), 32));
        signItemArrayList.add(new SignItem(R.drawable.img33, getString(R.string.sgn33), 33));
        signItemArrayList.add(new SignItem(R.drawable.img34, getString(R.string.sgn34), 34));
        signItemArrayList.add(new SignItem(R.drawable.img35, getString(R.string.sgn35), 35));
        signItemArrayList.add(new SignItem(R.drawable.img36, getString(R.string.sgn36), 36));
        signItemArrayList.add(new SignItem(R.drawable.img37, getString(R.string.sgn37), 37));
        signItemArrayList.add(new SignItem(R.drawable.img38, getString(R.string.sgn38), 38));
        signItemArrayList.add(new SignItem(R.drawable.img39, getString(R.string.sgn39), 39));
        signItemArrayList.add(new SignItem(R.drawable.img40, getString(R.string.sgn40), 40));
        signItemArrayList.add(new SignItem(R.drawable.img41, getString(R.string.sgn41), 41));
        signItemArrayList.add(new SignItem(R.drawable.img42, getString(R.string.sgn42), 42));
        signItemArrayList.add(new SignItem(R.drawable.img43, getString(R.string.sgn43), 43));
        signItemArrayList.add(new SignItem(R.drawable.img44, getString(R.string.sgn44), 44));
        signItemArrayList.add(new SignItem(R.drawable.img45, getString(R.string.sgn45), 45));
        signItemArrayList.add(new SignItem(R.drawable.img46, getString(R.string.sgn46), 46));
        signItemArrayList.add(new SignItem(R.drawable.img47, getString(R.string.sgn47), 47));
        signItemArrayList.add(new SignItem(R.drawable.img48, getString(R.string.sgn48), 48));
        signItemArrayList.add(new SignItem(R.drawable.img49, getString(R.string.sgn49), 49));
        signItemArrayList.add(new SignItem(R.drawable.img50, getString(R.string.sgn50), 50));
        signItemArrayList.add(new SignItem(R.drawable.img51, getString(R.string.sgn51), 51));
        signItemArrayList.add(new SignItem(R.drawable.img52, getString(R.string.sgn52), 52));
        signItemArrayList.add(new SignItem(R.drawable.img53, getString(R.string.sgn53), 53));
        signItemArrayList.add(new SignItem(R.drawable.img54, getString(R.string.sgn54), 54));
        signItemArrayList.add(new SignItem(R.drawable.img55, getString(R.string.sgn55), 55));
        signItemArrayList.add(new SignItem(R.drawable.img56, getString(R.string.sgn56), 56));
        signItemArrayList.add(new SignItem(R.drawable.img57, getString(R.string.sgn57), 57));
        signItemArrayList.add(new SignItem(R.drawable.img58, getString(R.string.sgn58), 58));
        signItemArrayList.add(new SignItem(R.drawable.img59, getString(R.string.sgn59), 59));
        signItemArrayList.add(new SignItem(R.drawable.img60, getString(R.string.sgn60), 60));
        signItemArrayList.add(new SignItem(R.drawable.img61, getString(R.string.sgn61), 61));
        signItemArrayList.add(new SignItem(R.drawable.img62, getString(R.string.sgn62), 62));
        signItemArrayList.add(new SignItem(R.drawable.img63, getString(R.string.sgn63), 63));
        signItemArrayList.add(new SignItem(R.drawable.img64, getString(R.string.sgn64), 64));
        signItemArrayList.add(new SignItem(R.drawable.img65, getString(R.string.sgn65), 65));
        signItemArrayList.add(new SignItem(R.drawable.img66, getString(R.string.sgn66), 66));
        signItemArrayList.add(new SignItem(R.drawable.img67, getString(R.string.sgn67), 67));
        signItemArrayList.add(new SignItem(R.drawable.img68, getString(R.string.sgn68), 68));
        signItemArrayList.add(new SignItem(R.drawable.img69, getString(R.string.sgn69), 69));
        signItemArrayList.add(new SignItem(R.drawable.img70, getString(R.string.sgn70), 70));
        signItemArrayList.add(new SignItem(R.drawable.img71, getString(R.string.sgn71), 71));
        signItemArrayList.add(new SignItem(R.drawable.img72, getString(R.string.sgn72), 72));
        signItemArrayList.add(new SignItem(R.drawable.img73, getString(R.string.sgn73), 73));
        signItemArrayList.add(new SignItem(R.drawable.img74, getString(R.string.sgn74), 74));
        signItemArrayList.add(new SignItem(R.drawable.img75, getString(R.string.sgn75), 75));
        signItemArrayList.add(new SignItem(R.drawable.img76, getString(R.string.sgn76), 76));
        signItemArrayList.add(new SignItem(R.drawable.img77, getString(R.string.sgn77), 77));
        signItemArrayList.add(new SignItem(R.drawable.img78, getString(R.string.sgn78), 78));
        signItemArrayList.add(new SignItem(R.drawable.img79, getString(R.string.sgn79), 79));
        signItemArrayList.add(new SignItem(R.drawable.img80, getString(R.string.sgn80), 80));
        signItemArrayList.add(new SignItem(R.drawable.img81, getString(R.string.sgn81), 81));
        signItemArrayList.add(new SignItem(R.drawable.img82, getString(R.string.sgn82), 82));
        signItemArrayList.add(new SignItem(R.drawable.img83, getString(R.string.sgn83), 83));
        signItemArrayList.add(new SignItem(R.drawable.img84, getString(R.string.sgn84), 84));
        signItemArrayList.add(new SignItem(R.drawable.img85, getString(R.string.sgn85), 85));
        signItemArrayList.add(new SignItem(R.drawable.img86, getString(R.string.sgn86), 86));
        signItemArrayList.add(new SignItem(R.drawable.img87, getString(R.string.sgn87), 87));
        signItemArrayList.add(new SignItem(R.drawable.img88, getString(R.string.sgn88), 88));
        signItemArrayList.add(new SignItem(R.drawable.img89, getString(R.string.sgn89), 89));
        signItemArrayList.add(new SignItem(R.drawable.img90, getString(R.string.sgn90), 90));
        signItemArrayList.add(new SignItem(R.drawable.img91, getString(R.string.sgn91), 91));

        mSignAdapter = new SignAdapter(this, signItemArrayList);
        listView.setAdapter(mSignAdapter);
    }

}
