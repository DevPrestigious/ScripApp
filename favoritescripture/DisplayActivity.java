package com.example.favoritescripture;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        Intent intent = getIntent();

        String book = intent.getStringExtra("book");
        String chapter = intent.getStringExtra("chapter");
        String verse = intent.getStringExtra("verse");
        Log.i("Log: ", "Received intent with " + intent.getStringExtra("book") + " " + intent.getStringExtra("chapter") + ":" + intent.getStringExtra("verse"));

        TextView displayScripture = (TextView)findViewById(R.id.displayScripture);

        displayScripture.setText(book + " " + chapter + ":" + verse);

    }
}