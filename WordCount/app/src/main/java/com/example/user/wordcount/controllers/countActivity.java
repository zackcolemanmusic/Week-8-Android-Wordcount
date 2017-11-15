package com.example.user.wordcount.controllers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.user.wordcount.R;

public class countActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        int countWords = extras.getInt("answer");
        TextView answerTextView = findViewById(R.id.answer_num);
        answerTextView.setText(Integer.toString(countWords));

    }
}
