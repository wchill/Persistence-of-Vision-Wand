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
	int loc = 0;
	
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
	
	public void setDisplayText(String text) {
		data = TextConverter.convert(text);
		if(data.length > 0)
			pixels = data[0].length;
		prepareForDrawing();
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
				prepareForDrawing();
			}

			@Override
			public void surfaceChanged(SurfaceHolder holder, int format,
					int width, int height) {

			}
		});
	}
	
	private void prepareForDrawing() {
		if(pixels > 0) {
			diameter = getHeight() / pixels;
			x = (getWidth() - diameter) / 2;
			radius = diameter / 2;
			if(!_pixelThread.isRunning()) {
				_pixelThread.setRunning(true);
				_pixelThread.start();
			}
		}
	}
	
	@Override
    protected void onDraw(Canvas canvas) {
		if(canvas != null) {
			canvas.drawColor(Color.BLACK);
			for (int i = 0; i < pixels; i++) {
				if(data[loc][i])
					canvas.drawCircle(x + radius, diameter * i + radius, radius, p);
				// Log.d(TAG, "Drawing circle " + (i+1) + " x: " + x + " y: " +
				// (diameter * i) + " diameter: " + diameter);
			}
			loc++;
			if(loc >= data.length) loc = 0;
		}
    }
}
