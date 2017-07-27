package com.ch1;

import com.example.androidprj.R;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.os.Bundle;
import android.view.View;


public class DrawBitmap extends Activity {
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(new ViewWithBitmap(this));
	}
	
	 private static class ViewWithBitmap extends View {

		public ViewWithBitmap(Context context) {
			super(context);
		}
		
		@Override protected void onDraw(Canvas canvas) {
            canvas.drawColor(Color.BLUE);
            
            Bitmap jayPic = BitmapFactory.decodeResource(getResources(), R.drawable.bluejay);
            
            // 이미지를 확대해서 그린다.
            Bitmap jayPicMedium= Bitmap.createScaledBitmap(jayPic, 200, 300, false);   //이미지를 확대한다.        
            canvas.drawBitmap(jayPicMedium, 60, 75, null); //이미지를 정해진 위치에 그린다.
            
            // 이미지를 축소해서 그린다.
            Bitmap jayPicSmall= Bitmap.createScaledBitmap(jayPic, 50, 75, false);  //이미지를 축소한다.
         
            Matrix maxTopLeft = new Matrix();
            maxTopLeft.preRotate(30);

            Matrix maxBottomLeft = new Matrix();
            maxBottomLeft.preRotate(-30);
            
            Matrix maxTopRight = new Matrix();
            maxTopRight.preRotate(-30);			// tilt 30 degrees left
            maxTopRight.preScale(-1, 1);		// mirror image
            
            Matrix maxBottomRight = new Matrix();
            maxBottomRight.preRotate(30);		// tilt 30 degrees right
            maxBottomRight.preScale(-1, 1);		// mirror image

            Bitmap jayPicTopLeft = Bitmap.createBitmap(jayPicSmall, 0, 0, jayPicSmall.getWidth(), jayPicSmall.getHeight(), maxTopLeft, false);
            Bitmap jayPicBottomLeft = Bitmap.createBitmap(jayPicSmall, 0, 0, jayPicSmall.getWidth(), jayPicSmall.getHeight(), maxBottomLeft, false);

            Bitmap jayPicTopRight = Bitmap.createBitmap(jayPicSmall, 0, 0, jayPicSmall.getWidth(), jayPicSmall.getHeight(), maxTopRight, false);
            Bitmap jayPicBottomRight = Bitmap.createBitmap(jayPicSmall, 0, 0, jayPicSmall.getWidth(), jayPicSmall.getHeight(), maxBottomRight, false);
	           
            jayPicSmall.recycle();
            jayPic.recycle();

            //이미지를 그린다.
            canvas.drawBitmap(jayPicTopLeft, 30, 30, null);
            canvas.drawBitmap(jayPicBottomLeft, 30, 325, null);
            canvas.drawBitmap(jayPicTopRight, 225, 30, null);
            canvas.drawBitmap(jayPicBottomRight, 225, 325, null);
            
            
        }

	 }
}
