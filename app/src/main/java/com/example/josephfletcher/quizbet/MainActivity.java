package com.example.josephfletcher.quizbet;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.flashcard_question).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) findViewById(R.id.flashcard_question)).setVisibility(View.INVISIBLE);

                ((TextView) findViewById(R.id.flashcard_answer)).setVisibility(View.VISIBLE);
                ((TextView) findViewById(R.id.flashcard_answer)).setBackgroundColor(getResources().getColor(R.color.lightCyan));
            }
        });

        findViewById(R.id.flashcard_answer).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) findViewById(R.id.flashcard_question)).setVisibility(View.VISIBLE);
                ((TextView) findViewById(R.id.flashcard_question)).setBackgroundColor(getResources().getColor(R.color.turquoise));

                ((TextView) findViewById(R.id.flashcard_answer)).setVisibility(View.INVISIBLE);
            }
        });
    }
}