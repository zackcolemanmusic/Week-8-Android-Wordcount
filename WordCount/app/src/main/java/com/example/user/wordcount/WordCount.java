package com.example.user.wordcount;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WordCount extends AppCompatActivity {


    private TextView howManywords;
    private Button button;
    private EditText input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_count);

        this.howManywords = (TextView) findViewById(R.id.Text_to_count);
        this.button = (Button) findViewById(R.id.button);
        this.input = (EditText) findViewById(R.id.input);
    }

    public void onButtonClicked(View button){
//        Log.d("MainActivity", "onButtonClicked");
        String text = this.input.getText().toString();
        Counter counter = new Counter();
        this.howManywords.setText(Integer.toString(Counter.countWords(text)));



    }






}
