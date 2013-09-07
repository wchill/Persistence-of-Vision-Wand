package com.illinidroid.pov.wand;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class PixelDisplay extends SurfaceView {
	
	int pixels = 0;
	
	static final String TAG = "PixelDisplay";
	SurfaceHolder holder;
	private PixelThread _pixelThread;
	boolean state = false;
	
	boolean[][] data = null;
	
	float x;
	float diameter;
	float radius;

    Paint p;

	public PixelDisplay(Context context) {
		super(context);
		init();
	}

	public PixelDisplay(Context context, AttributeSet attrs) {
		super(context, attrs);
		init();
	}

	public PixelDisplay(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		init();
	}
	
	public void setColor(int color) {
		p.setColor(color);
	}
	
	public void setDisplayData(boolean[][] data) {
		this.data = data;
		pixels = data[0].length;
	}
	
	public void init() {
		
		p = new Paint();
		p.setColor(Color.WHITE);
		
		holder = getHolder();
		
		_pixelThread = new PixelThread(this);

		holder.addCallback(new SurfaceHolder.Callback() {

			@Override
			public void surfaceDestroyed(SurfaceHolder holder) {
				boolean retry = true;
				_pixelThread.setRunning(false);

				while (retry) {
					try {
						_pixelThread.join();
						retry = false;
					} catch (InterruptedException e) {

					}
				}
			}

			@Override
			public void surfaceCreated(SurfaceHolder holder) {
				diameter = getHeight() / pixels;
				x = (getWidth() - diameter) / 2;
				radius = diameter / 2;
				_pixelThread.setRunning(true);
				_pixelThread.start();
			}

			@Override
			public void surfaceChanged(SurfaceHolder holder, int format,
					int width, int height) {

			}
		});
	}
	
	@Override
    protected void onDraw(Canvas canvas) {
          canvas.drawColor(Color.BLACK);
          for(int i = 0; i < pixels; i++) {
              canvas.drawCircle(x + radius, diameter * i + radius, radius, p);
              //Log.d(TAG, "Drawing circle " + (i+1) + " x: " + x + " y: " + (diameter * i) + " diameter: " + diameter);
          }
    }
}
