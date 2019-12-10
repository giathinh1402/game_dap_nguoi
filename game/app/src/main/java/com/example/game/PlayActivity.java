package com.example.game;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class PlayActivity extends AppCompatActivity {
    ImageView img1, img2, img3, img4, img5, img6, img7, img8, img9;
    ImageView imgBua1, imgBua2, imgBua3, imgBua4, imgBua5, imgBua6, imgBua7, imgBua8, imgBua9;
    ImageView imgChuot1, imgChuot2, imgChuot3, imgChuot4, imgChuot5, imgChuot6, imgChuot7, imgChuot8, imgChuot9;
    TextView textTime, textScore;
    int score = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        textScore = findViewById(R.id.text_score);
        textTime = findViewById(R.id.text_time);

        //image goi button
        img1 = findViewById(R.id.btn1); //Tìm lại button
        imgBua1 = findViewById(R.id.img_bua_1);
        imgChuot1 = findViewById(R.id.img_chuot_1);

        img2 = findViewById(R.id.btn2); //Tìm lại button
        imgBua2 = findViewById(R.id.img_bua_2);
        imgChuot2 = findViewById(R.id.img_chuot_2);

        img3 = findViewById(R.id.btn3); //Tìm lại button
        imgBua3 = findViewById(R.id.img_bua_3);
        imgChuot3 = findViewById(R.id.img_chuot_3);

        img4 = findViewById(R.id.btn4); //Tìm lại button
        imgBua4 = findViewById(R.id.img_bua_4);
        imgChuot4 = findViewById(R.id.img_chuot_4);

        img5 = findViewById(R.id.btn5); //Tìm lại button
        imgBua5 = findViewById(R.id.img_bua_5);
        imgChuot5 = findViewById(R.id.img_chuot_5);

        img6 = findViewById(R.id.btn6); //Tìm lại button
        imgBua6 = findViewById(R.id.img_bua_6);
        imgChuot6 = findViewById(R.id.img_chuot_6);

        img7 = findViewById(R.id.btn7); //Tìm lại button
        imgBua7 = findViewById(R.id.img_bua_7);
        imgChuot7 = findViewById(R.id.img_chuot_7);

        img8 = findViewById(R.id.btn8); //Tìm lại button
        imgBua8 = findViewById(R.id.img_bua_8);
        imgChuot8 = findViewById(R.id.img_chuot_8);

        img9 = findViewById(R.id.btn9); //Tìm lại button
        imgBua9 = findViewById(R.id.img_bua_9);
        imgChuot9 = findViewById(R.id.img_chuot_9);


        // an bua
        imgBua1.setVisibility(View.GONE); //An bua
        imgChuot1.setVisibility(View.GONE);// an chuot

        imgBua2.setVisibility(View.GONE); //An bua
        imgChuot2.setVisibility(View.GONE);// an chuot

        imgBua3.setVisibility(View.GONE); //An bua
        imgChuot3.setVisibility(View.GONE);// an chuot

        imgBua4.setVisibility(View.GONE); //An bua
        imgChuot4.setVisibility(View.GONE);// an chuot

        imgBua5.setVisibility(View.GONE); //An bua
        imgChuot5.setVisibility(View.GONE);// an chuot

        imgBua6.setVisibility(View.GONE); //An bua
        imgChuot6.setVisibility(View.GONE);// an chuot

        imgBua7.setVisibility(View.GONE); //An bua
        imgChuot7.setVisibility(View.GONE);// an chuot

        imgBua8.setVisibility(View.GONE); //An bua
        imgChuot8.setVisibility(View.GONE);// an chuot

        imgBua9.setVisibility(View.GONE); //An bua
        imgChuot9.setVisibility(View.GONE);// an chuot


        // set onclick
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgBua1.setVisibility(View.VISIBLE); // hien bua

                if (imgChuot1.getVisibility() == View.VISIBLE) {
                    imgChuot1.setVisibility(View.GONE);
                    score += 1;
                    displayScore();

                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            imgBua1.setVisibility(View.GONE);
                        }
                    }, 200);
                }else{
                    score -=2;
                    imgBua1.setVisibility(View.GONE);
                    displayScore();
                }displayOver();
            }
        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(PlayActivity.this, "Bạn đã click 2", Toast.LENGTH_SHORT).show();
                imgBua2.setVisibility(View.VISIBLE); // hien bua

                if (imgChuot2.getVisibility() == View.VISIBLE) {
                    imgChuot2.setVisibility(View.GONE);
                    score += 1;
                    displayScore();

                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            imgBua2.setVisibility(View.GONE);
                        }
                    }, 200);
                }else{
                    score -=2;
                    imgBua2.setVisibility(View.GONE);
                    displayScore();
                }displayOver();
            }
        });

        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(PlayActivity.this, "Bạn đã click 3", Toast.LENGTH_SHORT).show();
                imgBua3.setVisibility(View.VISIBLE); // hien bua

                if (imgChuot3.getVisibility() == View.VISIBLE) {
                    imgChuot3.setVisibility(View.GONE);
                    score += 1;
                    displayScore();

                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            imgBua3.setVisibility(View.GONE);
                        }
                    }, 200);
                }else{
                    score -=2;
                    imgBua3.setVisibility(View.GONE);
                    displayScore();
                }displayOver();
            }
        });

        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(PlayActivity.this, "Bạn đã click 4", Toast.LENGTH_SHORT).show();
                imgBua4.setVisibility(View.VISIBLE); // hien bua

                if (imgChuot4.getVisibility() == View.VISIBLE) {
                    imgChuot4.setVisibility(View.GONE);
                    score += 1;
                    displayScore();

                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            imgBua4.setVisibility(View.GONE);
                        }
                    }, 200);
                }else{
                    score -=2;
                    imgBua4.setVisibility(View.GONE);
                    displayScore();
                }displayOver();
            }
        });

        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(PlayActivity.this, "Bạn đã click 5", Toast.LENGTH_SHORT).show();
                imgBua5.setVisibility(View.VISIBLE); // hien bua

                if (imgChuot5.getVisibility() == View.VISIBLE) {
                    imgChuot5.setVisibility(View.GONE);
                    score += 1;
                    displayScore();

                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            imgBua5.setVisibility(View.GONE);
                        }
                    }, 200);
                }else{
                    score -=2;
                    imgBua5.setVisibility(View.GONE);
                    displayScore();
                }displayOver();
            }
        });

        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(PlayActivity.this, "Bạn đã click 6", Toast.LENGTH_SHORT).show();
                imgBua6.setVisibility(View.VISIBLE); // hien bua

                if (imgChuot6.getVisibility() == View.VISIBLE) {
                    imgChuot6.setVisibility(View.GONE);
                    score += 1;
                    displayScore();

                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            imgBua6.setVisibility(View.GONE);
                        }
                    }, 200);
                }else{
                    score -=2;
                    imgBua6.setVisibility(View.GONE);
                    displayScore();
                }displayOver();
            }
        });

        img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(PlayActivity.this, "Bạn đã click 7", Toast.LENGTH_SHORT).show();
                imgBua7.setVisibility(View.VISIBLE); // hien bua

                if (imgChuot7.getVisibility() == View.VISIBLE) {
                    imgChuot7.setVisibility(View.GONE);
                    score += 1;
                    displayScore();

                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            imgBua7.setVisibility(View.GONE);
                        }
                    }, 200);
                }else{
                    score -=2;
                    imgBua7.setVisibility(View.GONE);
                    displayScore();
                }displayOver();
            }
        });

        img8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(PlayActivity.this, "Bạn đã click 8", Toast.LENGTH_SHORT).show();
                imgBua8.setVisibility(View.VISIBLE); // hien bua

                if (imgChuot8.getVisibility() == View.VISIBLE) {
                    imgChuot8.setVisibility(View.GONE);
                    score += 1;
                    displayScore();

                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            imgBua8.setVisibility(View.GONE);
                        }
                    }, 200);
                }else{
                    score -=2;
                    imgBua8.setVisibility(View.GONE);
                    displayScore();
                }displayOver();
            }
        });

        img9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(PlayActivity.this, "Bạn đã click 9", Toast.LENGTH_SHORT).show();
                imgBua9.setVisibility(View.VISIBLE);// hien bua

                if (imgChuot9.getVisibility() == View.VISIBLE) {
                    imgChuot9.setVisibility(View.GONE);
                    score += 1;
                    displayScore();
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            imgBua9.setVisibility(View.GONE);
                        }
                    }, 200);
                }else{
                    score -=2;
                    imgBua9.setVisibility(View.GONE);
                    displayScore();
                }displayOver();
            }
        });

        new Timer().scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        hienThiChuot();
                    }
                });
            }
        }, 0, 1000);
        countDownTime();
    }

    private void hienThiChuot() {
        int randomNumber = new Random().nextInt(9 - 1 + 1) + 1;
        if (randomNumber == 1) {
            imgChuot1.setVisibility(View.VISIBLE);
        }else{
            imgChuot1.setVisibility(View.GONE);
        }
        if (randomNumber == 2) {
            imgChuot2.setVisibility(View.VISIBLE);
        }else{
            imgChuot2.setVisibility(View.GONE);
        }
        if (randomNumber == 3) {
            imgChuot3.setVisibility(View.VISIBLE);
        }else{
            imgChuot3.setVisibility(View.GONE);
        }
        if (randomNumber == 4) {
            imgChuot4.setVisibility(View.VISIBLE);
        }else{
            imgChuot4.setVisibility(View.GONE);
        }
        if (randomNumber == 5) {
            imgChuot5.setVisibility(View.VISIBLE);
        }else{
            imgChuot5.setVisibility(View.GONE);
        }
        if (randomNumber == 6) {
            imgChuot6.setVisibility(View.VISIBLE);
        }else{
            imgChuot6.setVisibility(View.GONE);
        }
        if (randomNumber == 7) {
            imgChuot7.setVisibility(View.VISIBLE);
        }else{
            imgChuot7.setVisibility(View.GONE);
        }
        if (randomNumber == 8) {
            imgChuot8.setVisibility(View.VISIBLE);
        }else{
            imgChuot8.setVisibility(View.GONE);
        }
        if (randomNumber == 9) {
            imgChuot9.setVisibility(View.VISIBLE);
        }else{
            imgChuot9.setVisibility(View.GONE);
        }
    }

    private void countDownTime(){
        new CountDownTimer(20000, 1000){
            public void onTick(long millisUntilFinished){
                textTime.setText("Time: " + millisUntilFinished / 1000);
            }
            public void onFinish(){
                textTime.setText("Time Over");
                openTimeoutScreen();
            }
        }.start();
    }

    public void displayScore() {
        textScore.setText("" + score);
    }

    public void openTimeoutScreen(){
        Intent intent = new Intent(PlayActivity.this, TimeOverActivity.class);
        intent.putExtra("score", score);
        startActivity(intent);
    }

    public void displayOver(){
        if (score < 0){
            openGameoverScreen();
        }
    }
    public void openGameoverScreen(){
        Intent intent = new Intent(PlayActivity.this, GameOverActivity.class);
        startActivity(intent);
    }
}
