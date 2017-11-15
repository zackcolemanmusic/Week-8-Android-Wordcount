package com.example.user.wordcount.controllers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.user.wordcount.models.Counter;
import com.example.user.wordcount.R;

public class MainWordCountActivity extends AppCompatActivity {


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
//        String text = this.input.getText().toString();
//        Counter counter = new Counter();
//        this.howManywords.setText(Integer.toString(Counter.countWords(text)));

        Intent intent = new Intent(this, countActivity.class);
        String text = this.input.getText().toString();
        //Counter counter = new Counter();
        //this.howManywords.setText(Integer.toString(Counter.countWords(text)));

        intent.putExtra("answer", Counter.countWords(text));

        startActivity(intent);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.activity_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if(item.getItemId() == R.id.action_about) {
            Intent intent = new Intent(this, AboutActivity.class);
            startActivity(intent);
        } else if(item.getItemId() == R.id.action_settings){
            Intent intent = new Intent(this, SettingsActivity.class);
            startActivity(intent);
        }
        return true;
    }








}
