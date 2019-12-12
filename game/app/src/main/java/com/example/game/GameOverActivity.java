package com.example.game;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class GameOverActivity extends AppCompatActivity {
            TextView playAgain;
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_over);

        playAgain = findViewById(R.id.play_again);
        playAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                final MediaPlayer mp = MediaPlayer.create(GameOverActivity.this, R.raw.click);
                mp.start();
                Intent intent = new Intent(GameOverActivity.this, PlayActivity.class);
                startActivity(intent);
            }
        });
    }
}
