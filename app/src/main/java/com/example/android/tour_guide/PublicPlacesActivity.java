package com.example.android.tour_guide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class PublicPlacesActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(getString(R.string.p1), getString(R.string.p2)));
        words.add(new Word(getString(R.string.p3), getString(R.string.p4)));
        words.add(new Word(getString(R.string.p5), getString(R.string.p6)));
        words.add(new Word(getString(R.string.p7), getString(R.string.p8)));
        words.add(new Word(getString(R.string.p9), getString(R.string.p10)));
        words.add(new Word(getString(R.string.p11), getString(R.string.p12)));
        words.add(new Word(getString(R.string.p13), getString(R.string.p14)));
        words.add(new Word(getString(R.string.p15), getString(R.string.p16)));
        WordAdapter wa = new WordAdapter(this, words, R.color.pp);
        ListView lv = (ListView) findViewById(R.id.list);
        lv.setAdapter(wa);

    }
}
