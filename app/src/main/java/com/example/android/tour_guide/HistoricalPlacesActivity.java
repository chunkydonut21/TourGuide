package com.example.android.tour_guide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;


public class HistoricalPlacesActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(getString(R.string.h1), getString(R.string.h2), R.drawable.rf));
        words.add(new Word(getString(R.string.h3), getString(R.string.h4), R.drawable.qm));
        words.add(new Word(getString(R.string.h5), getString(R.string.h6), R.drawable.ht));
        words.add(new Word(getString(R.string.h7), getString(R.string.h8), R.drawable.tbf));
        words.add(new Word(getString(R.string.h9), getString(R.string.h10), R.drawable.ig));
        words.add(new Word(getString(R.string.h11), getString(R.string.h12), R.drawable.sdt));
        words.add(new Word(getString(R.string.h13), getString(R.string.h14), R.drawable.isa));


        WordAdapter wa = new WordAdapter(this, words, R.color.hp);
        ListView lv = (ListView) findViewById(R.id.list);
        lv.setAdapter(wa);
    }

}
