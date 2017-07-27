package kr.study.game;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class Pad {
    private final float mTop;
    private float mLeft;
    private final float mBottom;
    private float mRight;

    public Pad(float top, float bottom) {
        mTop = top;
        mBottom = bottom;
    }

    public void setLeftRight(float left, float right) {
        mLeft = left;
        mRight = right;
    }

    public void draw(Canvas canvas, Paint paint) {
        // 색칠하는 부분 그리기 
        paint.setColor(Color.LTGRAY);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect(mLeft, mTop, mRight, mBottom, paint);
    }
}
