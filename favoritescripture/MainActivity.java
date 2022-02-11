package com.example.favoritescripture;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {

    Button button;
    EditText editText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                EditText bookInput = (EditText)findViewById(R.id.editTextBook);
                EditText chapterInput = (EditText)findViewById(R.id.editTextChapter);
                EditText verseInput = (EditText)findViewById(R.id.editTextVerse);

                Intent navigate = new Intent(MainActivity.this, DisplayActivity.class);

                navigate.putExtra("book", bookInput.getText().toString());
                navigate.putExtra("chapter", chapterInput.getText().toString());
                navigate.putExtra("verse", verseInput.getText().toString());

                Log.i("Log: ", "About to create intent with " + bookInput.getText().toString() + " " + chapterInput.getText().toString() + ":" + verseInput.getText().toString());
                startActivity(navigate);
            }
        });
    }
}