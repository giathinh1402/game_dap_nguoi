package com.example.game;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;

@SuppressLint("AppCompatCustomView")
public class ClickableImageView extends ImageView {

    public ClickableImageView(Context context) {
        this(context, null);
    }

    public ClickableImageView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);

    }

    public ClickableImageView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    void init() {
        this.setClickable(true);
        setOnTouchListener(new OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    setAlpha(0.6f);
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    setAlpha(1f);
                }
                return false;
            }
        });
    }

}
