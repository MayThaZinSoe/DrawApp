package com.example.drawapp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

public class SampleView extends View {

	private Paint paint = new Paint();
	private int color= Color.RED ;
	private int bx = 100;
	private int by = 100;
	
	/**
	 * @param args
	 */
	
	
	public SampleView(Context context){
	super(context);
	setBackgroundColor(Color.TRANSPARENT);
	
	}
	@Override
	public void onDraw(Canvas canvas){
		paint.setColor(color);
		canvas.drawCircle( 100, 100,20,paint);
	
	}
	
	
	
	
	@Override
	public boolean onTouchEvent(MotionEvent event){
		
		
		int action = event.getAction();
		if((action & MotionEvent.ACTION_MASK)==
				MotionEvent.ACTION_DOWN){
			int ex = (int)event.getX();
			int ey = (int)event.getY();
		
			if ((bx - ex)*(bx - ex)+(by  - ey)*(by - ey) <= 20*20) {    
			Toast.makeText(getContext(),"Change Touch",Toast.LENGTH_SHORT).show();
			
			//change color,if blue,change to red
			if(color == Color.BLUE){
				color = Color.RED;
			}else{
				color = Color.BLUE;
			}
			
			invalidate();//repeate
			}
		
		
		}
		
		return true;
	}

	
		
	
	
	
	
	
	
	
}
	
	
	


