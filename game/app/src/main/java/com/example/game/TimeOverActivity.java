package com.example.game;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class TimeOverActivity extends AppCompatActivity {
    TextView textScore;
    TextView playAgain;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timeover);

        textScore = findViewById(R.id.text_score);
        int score = getIntent().getIntExtra("score", 0);
        displayScore(score);

        playAgain = findViewById(R.id.play_again);
        playAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer mp = MediaPlayer.create(TimeOverActivity.this, R.raw.click);
                mp.start();
                Intent intent = new Intent(TimeOverActivity.this, PlayActivity.class);
                startActivity(intent);
            }
        });
    }

    public void displayScore(int score) {
        textScore.setText("" + score);
    }

}
