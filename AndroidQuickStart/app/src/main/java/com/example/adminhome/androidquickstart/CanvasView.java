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
    private GameManager gameManager;


    public CanvasView(Context context, AttributeSet attrs) {
        super(context, attrs);
        gameManager = new GameManager();
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        gameManager.onDraw(canvas);
    }
}
