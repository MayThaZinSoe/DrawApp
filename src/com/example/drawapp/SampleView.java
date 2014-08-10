package com.example.drawapp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

public class SampleView extends View {

	/**
	 * @param args
	 */
	
	
	public SampleView(Context context){
	super(context);
	setBackgroundColor(Color.GREEN);
	
	}
	@Override
	public void onDraw(Canvas canvas){
		paint.setColor(Color.RED);
		canvas.drawCircle( 200, 200,20,paint);
	
	}
	private Paint paint = new Paint();
	
	
	@Override
	public boolean onTouchEvent(MotionEvent event){
		Toast.makeText(getContext(),"Change Touch",Toast.LENGTH_SHORT).show();
		
		
		return true;
	}

	
		
	
	
	
	
	
	
	
}
	
	
	


