package com.example.android.tour_guide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;


public class ReligiousPlacesActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word(getString(R.string.r1), getString(R.string.r2), R.drawable.kjm));
        words.add(new Word(getString(R.string.r3), getString(R.string.r4), R.drawable.adm));
        words.add(new Word(getString(R.string.r5), getString(R.string.r6), R.drawable.jm));
        words.add(new Word(getString(R.string.r7), getString(R.string.r8), R.drawable.lt));
        words.add(new Word(getString(R.string.r9), getString(R.string.r10), R.drawable.hnz));
        words.add(new Word(getString(R.string.r11), getString(R.string.r12), R.drawable.gd));
        words.add(new Word(getString(R.string.r13), getString(R.string.r14), R.drawable.church));
        words.add(new Word(getString(R.string.r15), getString(R.string.r16), R.drawable.iskon));
        words.add(new Word(getString(R.string.r17), getString(R.string.r18), R.drawable.lnt));

        WordAdapter wa = new WordAdapter(this, words, R.color.rp);
        ListView lv = (ListView) findViewById(R.id.list);
        lv.setAdapter(wa);
    }
}
