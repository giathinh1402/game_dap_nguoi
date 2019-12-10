package com.example.game;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class TimeOverActivity extends AppCompatActivity {
    TextView textScore;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timeover);

        textScore = findViewById(R.id.text_score);
        int score = getIntent().getIntExtra("score", 0);
        displayScore(score);
    }

    public void displayScore(int score) {
        textScore.setText("" + score);
    }
}
