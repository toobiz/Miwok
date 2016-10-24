package com.example.android.miwok;

import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_numbers);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("one", "lutti"));
        words.add(new Word("one", "otiiko"));
        words.add(new Word("one", "tolookosu"));
        words.add(new Word("one", "oyyisa"));
        words.add(new Word("one", "massokka"));
        words.add(new Word("one", "temmokka"));
        words.add(new Word("one", "kenekaku"));
        words.add(new Word("one", "kawinta"));
        words.add(new Word("one", "wo'e"));
        words.add(new Word("one", "na'aacha"));

        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
