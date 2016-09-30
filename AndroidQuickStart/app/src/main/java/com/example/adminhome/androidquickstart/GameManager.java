package com.example.adminhome.androidquickstart;

import android.graphics.Canvas;
import android.graphics.Paint;

/**
 * Created by AdminHome on 30.09.2016.
 */
public class GameManager {

    private MainCircle mainCircle;
    private Paint paint;

    public GameManager() {
        initMainCircle();
        initPaint();
    }

    private void initMainCircle() {
        mainCircle = new MainCircle(200, 500);
    }

    private void initPaint() {
        paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
    }

    public void onDraw(Canvas canvas) {
        canvas.drawCircle(mainCircle.getX(), mainCircle.getY(), mainCircle.getRadius(), paint);
    }
}
