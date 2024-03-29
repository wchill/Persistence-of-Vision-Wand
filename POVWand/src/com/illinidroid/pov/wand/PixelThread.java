package com.illinidroid.pov.wand;

import android.graphics.Canvas;
import android.os.Debug;
import android.util.Log;

public class PixelThread extends Thread {
	static int FPS = 30;

	private static final String TAG = "PixelDisplay";

	// The actual view that handles inputs
	// and draws to the surface
	private PixelDisplay view;

	// flag to hold game state
	private boolean running;

	public boolean isRunning() {
		return running;
	}

	public void setRunning(boolean running) {
		this.running = running;
	}
	
	public void setFPS(int FPS) {
		PixelThread.FPS = FPS;
	}

	public PixelThread(PixelDisplay view) {
		super();
		this.view = view;
	}

	@Override
	public void run() {
		long ticksPS = 1000 / FPS;
		long startTime;
		long sleepTime;
		while (running) {
			//Debug.startMethodTracing("calc");
			Canvas c = null;
			startTime = System.currentTimeMillis();
			try {
				c = view.getHolder().lockCanvas();
				synchronized (view.getHolder()) {
					view.doDraw(c);
				}
			} finally {
				if (c != null) {
					view.getHolder().unlockCanvasAndPost(c);
				}
			}
			sleepTime = ticksPS - (System.currentTimeMillis() - startTime);
			try {
				if (sleepTime > 0) {
					sleep(sleepTime);
				}
				else {
					//sleep(10);
				}
			} catch (Exception e) {
			}
			//Debug.stopMethodTracing();
		}
	}
}