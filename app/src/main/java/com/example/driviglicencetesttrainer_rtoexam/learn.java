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
        } else if (set == 4) {
            Questions.add(new QPractice(getString(R.string.ques_46), getString(R.string.ans_46), 46));
            Questions.add(new QPractice(getString(R.string.ques_47), getString(R.string.ans_47), 47));
            Questions.add(new QPractice(getString(R.string.ques_48), getString(R.string.ans_48), 48));
            Questions.add(new QPractice(getString(R.string.ques_49), getString(R.string.ans_49), 49));
            Questions.add(new QPractice(getString(R.string.ques_50), getString(R.string.ans_50), 50));
            Questions.add(new QPractice(getString(R.string.ques_51), getString(R.string.ans_51), 51));
            Questions.add(new QPractice(getString(R.string.ques_52), getString(R.string.ans_52), 52));
            Questions.add(new QPractice(getString(R.string.ques_53), getString(R.string.ans_53), 53));
            Questions.add(new QPractice(getString(R.string.ques_54), getString(R.string.ans_54), 54));
            Questions.add(new QPractice(getString(R.string.ques_55), getString(R.string.ans_55), 55));
            Questions.add(new QPractice(getString(R.string.ques_56), getString(R.string.ans_56), 56));
            Questions.add(new QPractice(getString(R.string.ques_57), getString(R.string.ans_57), 57));
            Questions.add(new QPractice(getString(R.string.ques_58), getString(R.string.ans_58), 58));
            Questions.add(new QPractice(getString(R.string.ques_59), getString(R.string.ans_59), 59));
            Questions.add(new QPractice(getString(R.string.ques_60), getString(R.string.ans_60), 60));
        } else if (set == 5) {
            Questions.add(new QPractice(getString(R.string.ques_61), getString(R.string.ans_61), 61));
            Questions.add(new QPractice(getString(R.string.ques_62), getString(R.string.ans_62), 62));
            Questions.add(new QPractice(getString(R.string.ques_63), getString(R.string.ans_63), 63));
            Questions.add(new QPractice(getString(R.string.ques_64), getString(R.string.ans_64), 64));
            Questions.add(new QPractice(getString(R.string.ques_65), getString(R.string.ans_65), 65));
            Questions.add(new QPractice(getString(R.string.ques_66), getString(R.string.ans_66), 66));
            Questions.add(new QPractice(getString(R.string.ques_67), getString(R.string.ans_67), 67));
            Questions.add(new QPractice(getString(R.string.ques_68), getString(R.string.ans_68), 68));
            Questions.add(new QPractice(getString(R.string.ques_69), getString(R.string.ans_69), 69));
            Questions.add(new QPractice(getString(R.string.ques_70), getString(R.string.ans_70), 70));
            Questions.add(new QPractice(getString(R.string.ques_71), getString(R.string.ans_71), 71));
            Questions.add(new QPractice(getString(R.string.ques_72), getString(R.string.ans_72), 72));
            Questions.add(new QPractice(getString(R.string.ques_73), getString(R.string.ans_73), 73));
            Questions.add(new QPractice(getString(R.string.ques_74), getString(R.string.ans_74), 74));
            Questions.add(new QPractice(getString(R.string.ques_75), getString(R.string.ans_75), 75));
        } else if (set == 6) {
            Questions.add(new QPractice(getString(R.string.ques_76), getString(R.string.ans_76), 76));
            Questions.add(new QPractice(getString(R.string.ques_77), getString(R.string.ans_77), 77));
            Questions.add(new QPractice(getString(R.string.ques_78), getString(R.string.ans_78), 78));
            Questions.add(new QPractice(getString(R.string.ques_79), getString(R.string.ans_79), 79));
            Questions.add(new QPractice(getString(R.string.ques_80), getString(R.string.ans_80), 80));
            Questions.add(new QPractice(getString(R.string.ques_81), getString(R.string.ans_81), 81));
            Questions.add(new QPractice(getString(R.string.ques_82), getString(R.string.ans_82), 82));
            Questions.add(new QPractice(getString(R.string.ques_83), getString(R.string.ans_83), 83));
            Questions.add(new QPractice(getString(R.string.ques_84), getString(R.string.ans_84), 84));
            Questions.add(new QPractice(getString(R.string.ques_85), getString(R.string.ans_85), 85));
            Questions.add(new QPractice(getString(R.string.ques_86), getString(R.string.ans_86), 86));
            Questions.add(new QPractice(getString(R.string.ques_87), getString(R.string.ans_87), 87));
            Questions.add(new QPractice(getString(R.string.ques_88), getString(R.string.ans_88), 88));
            Questions.add(new QPractice(getString(R.string.ques_89), getString(R.string.ans_89), 89));
            Questions.add(new QPractice(getString(R.string.ques_90), getString(R.string.ans_90), 90));
        } else if (set == 7) {
            Questions.add(new QPractice(getString(R.string.ques_91), getString(R.string.ans_91), 91));
            Questions.add(new QPractice(getString(R.string.ques_92), getString(R.string.ans_92), 92));
            Questions.add(new QPractice(getString(R.string.ques_93), getString(R.string.ans_93), 93));
            Questions.add(new QPractice(getString(R.string.ques_94), getString(R.string.ans_94), 94));
            Questions.add(new QPractice(getString(R.string.ques_95), getString(R.string.ans_95), 95));
            Questions.add(new QPractice(getString(R.string.ques_96), getString(R.string.ans_96), 96));
            Questions.add(new QPractice(getString(R.string.ques_97), getString(R.string.ans_97), 97));
            Questions.add(new QPractice(getString(R.string.ques_98), getString(R.string.ans_98), 98));
            Questions.add(new QPractice(getString(R.string.ques_99), getString(R.string.ans_99), 99));
            Questions.add(new QPractice(getString(R.string.ques_100), getString(R.string.ans_100), 100));
            Questions.add(new QPractice(getString(R.string.ques_101), getString(R.string.ans_101), 101));
            Questions.add(new QPractice(getString(R.string.ques_102), getString(R.string.ans_102), 102));
            Questions.add(new QPractice(getString(R.string.ques_103), getString(R.string.ans_103), 103));
            Questions.add(new QPractice(getString(R.string.ques_104), getString(R.string.ans_104), 104));
            Questions.add(new QPractice(getString(R.string.ques_105), getString(R.string.ans_105), 105));
        } else if (set == 8) {
            Questions.add(new QPractice(getString(R.string.ques_106), getString(R.string.ans_106), 106));
            Questions.add(new QPractice(getString(R.string.ques_107), getString(R.string.ans_107), 107));
            Questions.add(new QPractice(getString(R.string.ques_108), getString(R.string.ans_108), 108));
            Questions.add(new QPractice(getString(R.string.ques_109), getString(R.string.ans_109), 109));
            Questions.add(new QPractice(getString(R.string.ques_110), getString(R.string.ans_110), 110));
            Questions.add(new QPractice(getString(R.string.ques_111), getString(R.string.ans_111), 111));
            Questions.add(new QPractice(getString(R.string.ques_112), getString(R.string.ans_112), 112));
            Questions.add(new QPractice(getString(R.string.ques_113), getString(R.string.ans_113), 113));
            Questions.add(new QPractice(getString(R.string.ques_114), getString(R.string.ans_114), 114));
            Questions.add(new QPractice(getString(R.string.ques_115), getString(R.string.ans_115), 115));
            Questions.add(new QPractice(getString(R.string.ques_116), getString(R.string.ans_116), 116));
            Questions.add(new QPractice(getString(R.string.ques_117), getString(R.string.ans_117), 117));
            Questions.add(new QPractice(getString(R.string.ques_118), getString(R.string.ans_118), 118));
            Questions.add(new QPractice(getString(R.string.ques_119), getString(R.string.ans_119), 119));
            Questions.add(new QPractice(getString(R.string.ques_120), getString(R.string.ans_120), 120));
        } else if (set == 9) {
            Questions.add(new QPractice(getString(R.string.ques_121), getString(R.string.ans_121), 121));
            Questions.add(new QPractice(getString(R.string.ques_122), getString(R.string.ans_122), 122));
            Questions.add(new QPractice(getString(R.string.ques_123), getString(R.string.ans_123), 123));
            Questions.add(new QPractice(getString(R.string.ques_124), getString(R.string.ans_124), 124));
            Questions.add(new QPractice(getString(R.string.ques_125), getString(R.string.ans_125), 125));
            Questions.add(new QPractice(getString(R.string.ques_126), getString(R.string.ans_126), 126));
            Questions.add(new QPractice(getString(R.string.ques_127), getString(R.string.ans_127), 127));
            Questions.add(new QPractice(getString(R.string.ques_128), getString(R.string.ans_128), 128));
            Questions.add(new QPractice(getString(R.string.ques_129), getString(R.string.ans_129), 129));
            Questions.add(new QPractice(getString(R.string.ques_130), getString(R.string.ans_130), 130));
            Questions.add(new QPractice(getString(R.string.ques_131), getString(R.string.ans_131), 131));
            Questions.add(new QPractice(getString(R.string.ques_132), getString(R.string.ans_132), 132));
            Questions.add(new QPractice(getString(R.string.ques_133), getString(R.string.ans_133), 133));
            Questions.add(new QPractice(getString(R.string.ques_134), getString(R.string.ans_134), 134));
            Questions.add(new QPractice(getString(R.string.ques_135), getString(R.string.ans_135), 135));
        } else if (set == 10) {
            Questions.add(new QPractice(getString(R.string.ques_136), getString(R.string.ans_136), 136));
            Questions.add(new QPractice(getString(R.string.ques_137), getString(R.string.ans_137), 137));
            Questions.add(new QPractice(getString(R.string.ques_138), getString(R.string.ans_138), 138));
            Questions.add(new QPractice(getString(R.string.ques_139), getString(R.string.ans_139), 139));
            Questions.add(new QPractice(getString(R.string.ques_140), getString(R.string.ans_140), 140));
            Questions.add(new QPractice(getString(R.string.ques_141), getString(R.string.ans_141), 141));
            Questions.add(new QPractice(getString(R.string.ques_142), getString(R.string.ans_142), 142));
            Questions.add(new QPractice(getString(R.string.ques_143), getString(R.string.ans_143), 143));
            Questions.add(new QPractice(getString(R.string.ques_144), getString(R.string.ans_144), 144));
            Questions.add(new QPractice(getString(R.string.ques_145), getString(R.string.ans_145), 145));
            Questions.add(new QPractice(getString(R.string.ques_146), getString(R.string.ans_146), 146));
            Questions.add(new QPractice(getString(R.string.ques_147), getString(R.string.ans_147), 147));
            Questions.add(new QPractice(getString(R.string.ques_148), getString(R.string.ans_148), 148));
            Questions.add(new QPractice(getString(R.string.ques_149), getString(R.string.ans_149), 149));
            Questions.add(new QPractice(getString(R.string.ques_150), getString(R.string.ans_150), 150));
        } else if (set == 11) {
            Questions.add(new QPractice(getString(R.string.ques_151), getString(R.string.ans_151), 151));
            Questions.add(new QPractice(getString(R.string.ques_152), getString(R.string.ans_152), 152));
            Questions.add(new QPractice(getString(R.string.ques_153), getString(R.string.ans_153), 153));
            Questions.add(new QPractice(getString(R.string.ques_154), getString(R.string.ans_154), 154));
            Questions.add(new QPractice(getString(R.string.ques_155), getString(R.string.ans_155), 155));
            Questions.add(new QPractice(getString(R.string.ques_156), getString(R.string.ans_156), 156));
            Questions.add(new QPractice(getString(R.string.ques_157), getString(R.string.ans_157), 157));
            Questions.add(new QPractice(getString(R.string.ques_158), getString(R.string.ans_158), 158));
            Questions.add(new QPractice(getString(R.string.ques_159), getString(R.string.ans_159), 159));
            Questions.add(new QPractice(getString(R.string.ques_160), getString(R.string.ans_160), 160));
            Questions.add(new QPractice(getString(R.string.ques_161), getString(R.string.ans_161), 161));
            Questions.add(new QPractice(getString(R.string.ques_162), getString(R.string.ans_162), 162));
            Questions.add(new QPractice(getString(R.string.ques_163), getString(R.string.ans_163), 163));
            Questions.add(new QPractice(getString(R.string.ques_164), getString(R.string.ans_164), 164));
            Questions.add(new QPractice(getString(R.string.ques_165), getString(R.string.ans_165), 165));
        } else if (set == 12) {
            Questions.add(new QPractice(getString(R.string.ques_166), getString(R.string.ans_166), 166));
            Questions.add(new QPractice(getString(R.string.ques_167), getString(R.string.ans_167), 167));
            Questions.add(new QPractice(getString(R.string.ques_168), getString(R.string.ans_168), 168));
            Questions.add(new QPractice(getString(R.string.ques_169), getString(R.string.ans_169), 169));
            Questions.add(new QPractice(getString(R.string.ques_170), getString(R.string.ans_170), 170));
            Questions.add(new QPractice(getString(R.string.ques_171), getString(R.string.ans_171), 171));
            Questions.add(new QPractice(getString(R.string.ques_172), getString(R.string.ans_172), 172));
            Questions.add(new QPractice(getString(R.string.ques_173), getString(R.string.ans_173), 173));
            Questions.add(new QPractice(getString(R.string.ques_174), getString(R.string.ans_174), 174));
            Questions.add(new QPractice(getString(R.string.ques_175), getString(R.string.ans_175), 175));
            Questions.add(new QPractice(getString(R.string.ques_176), getString(R.string.ans_176), 176));
            Questions.add(new QPractice(getString(R.string.ques_177), getString(R.string.ans_177), 177));
            Questions.add(new QPractice(getString(R.string.ques_178), getString(R.string.ans_178), 178));
            Questions.add(new QPractice(getString(R.string.ques_179), getString(R.string.ans_179), 179));
            Questions.add(new QPractice(getString(R.string.ques_180), getString(R.string.ans_180), 180));
        } else if (set == 13) {
            Questions.add(new QPractice(getString(R.string.ques_181), getString(R.string.ans_181), 181));
            Questions.add(new QPractice(getString(R.string.ques_182), getString(R.string.ans_182), 182));
            Questions.add(new QPractice(getString(R.string.ques_183), getString(R.string.ans_183), 183));
            Questions.add(new QPractice(getString(R.string.ques_184), getString(R.string.ans_184), 184));
            Questions.add(new QPractice(getString(R.string.ques_185), getString(R.string.ans_185), 185));
            Questions.add(new QPractice(getString(R.string.ques_186), getString(R.string.ans_186), 186));
            Questions.add(new QPractice(getString(R.string.ques_187), getString(R.string.ans_187), 187));
            Questions.add(new QPractice(getString(R.string.ques_188), getString(R.string.ans_188), 188));
            Questions.add(new QPractice(getString(R.string.ques_189), getString(R.string.ans_189), 189));
            Questions.add(new QPractice(getString(R.string.ques_190), getString(R.string.ans_190), 190));
            Questions.add(new QPractice(getString(R.string.ques_191), getString(R.string.ans_191), 191));
            Questions.add(new QPractice(getString(R.string.ques_192), getString(R.string.ans_192), 192));
            Questions.add(new QPractice(getString(R.string.ques_193), getString(R.string.ans_193), 193));
            Questions.add(new QPractice(getString(R.string.ques_194), getString(R.string.ans_194), 194));
            Questions.add(new QPractice(getString(R.string.ques_195), getString(R.string.ans_195), 195));
        }


        QAdapter adapter = new QAdapter(this, Questions);

        ListView listView = (ListView) findViewById(R.id.set_list);

        listView.setAdapter(adapter);

    }
}
