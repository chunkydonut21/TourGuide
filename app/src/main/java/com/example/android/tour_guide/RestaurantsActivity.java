package com.example.android.tour_guide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class RestaurantsActivity extends AppCompatActivity {

    @Override

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word(getString(R.string.rs1), getString(R.string.rs2), R.drawable.orient));
        words.add(new Word(getString(R.string.rs3),getString(R.string.rs4), R.drawable.was));
        words.add(new Word(getString(R.string.rs5),getString(R.string.rs6), R.drawable.nine));
        words.add(new Word(getString(R.string.rs7), getString(R.string.rs8), R.drawable.three));
        words.add(new Word(getString(R.string.rs9), getString(R.string.rs10), R.drawable.lc));
        words.add(new Word(getString(R.string.rs11), getString(R.string.rs12), R.drawable.bhu));
        words.add(new Word(getString(R.string.rs13), getString(R.string.rs14), R.drawable.ott));


        WordAdapter wa = new WordAdapter(this, words, R.color.r);

        ListView lv = (ListView) findViewById(R.id.list);

        lv.setAdapter(wa);
    }
}
