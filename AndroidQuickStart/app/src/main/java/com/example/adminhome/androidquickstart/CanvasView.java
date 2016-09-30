package com.example.adminhome.androidquickstart;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by AdminHome on 30.09.2016.
 */
public class CanvasView extends View{

    private MainCircle mainCircle;
    private Paint paint;

    public CanvasView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initMainCircle();
        intiPaint();
    }

    private void initMainCircle() {
        mainCircle = new MainCircle(200, 500);
    }

    private void intiPaint() {
        paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(mainCircle.getX(), mainCircle.getY(), mainCircle.getRadius(), paint);
    }
}
