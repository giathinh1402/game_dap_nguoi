package com.example.game;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class TimeOverActivity extends AppCompatActivity {
    TextView textScore;
    ImageView playAgain;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timeover);

        textScore = findViewById(R.id.text_score);
        int score = getIntent().getIntExtra("score", 0);
        displayScore(score);

        ImageView btnCallActivityPlay;
        btnCallActivityPlay = (ImageView) findViewById(R.id.play_again);
        btnCallActivityPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TimeOverActivity.this, PlayActivity.class);
                startActivity(intent);
            }
        });
    }

    public void displayScore(int score) {
        textScore.setText("" + score);
    }

}
