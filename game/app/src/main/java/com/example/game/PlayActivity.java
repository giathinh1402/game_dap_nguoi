package com.example.game;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class PlayActivity extends AppCompatActivity {
    ImageView img1, img2, img3, img4, img5, img6, img7, img8, img9;
    ImageView imgBua1, imgBua2, imgBua3, imgBua4, imgBua5, imgBua6, imgBua7, imgBua8, imgBua9;
    ImageView imgChuot1, imgChuot2, imgChuot3, imgChuot4, imgChuot5, imgChuot6, imgChuot7, imgChuot8, imgChuot9;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

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
                Toast.makeText(PlayActivity.this, "Bạn đã click 1", Toast.LENGTH_SHORT).show();
                imgBua1.setVisibility(View.VISIBLE); // hien bua
            }
        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PlayActivity.this, "Bạn đã click 2", Toast.LENGTH_SHORT).show();
                imgBua2.setVisibility(View.VISIBLE); // hien bua
            }
        });

        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PlayActivity.this, "Bạn đã click 3", Toast.LENGTH_SHORT).show();
                imgBua3.setVisibility(View.VISIBLE); // hien bua
            }
        });

        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PlayActivity.this, "Bạn đã click 4", Toast.LENGTH_SHORT).show();
                imgBua4.setVisibility(View.VISIBLE); // hien bua
            }
        });

        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PlayActivity.this, "Bạn đã click 5", Toast.LENGTH_SHORT).show();
                imgBua5.setVisibility(View.VISIBLE); // hien bua
            }
        });

        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PlayActivity.this, "Bạn đã click 6", Toast.LENGTH_SHORT).show();
                imgBua6.setVisibility(View.VISIBLE); // hien bua
            }
        });

        img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PlayActivity.this, "Bạn đã click 7", Toast.LENGTH_SHORT).show();
                imgBua7.setVisibility(View.VISIBLE); // hien bua
            }
        });

        img8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PlayActivity.this, "Bạn đã click 8", Toast.LENGTH_SHORT).show();
                imgBua8.setVisibility(View.VISIBLE); // hien bua
            }
        });

        img9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PlayActivity.this, "Bạn đã click 9", Toast.LENGTH_SHORT).show();
                imgBua9.setVisibility(View.VISIBLE); // hien bua
            }
        });
    }
}
