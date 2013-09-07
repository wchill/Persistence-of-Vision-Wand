package com.illinidroid.pov.wand;

import android.graphics.Canvas;

public class PixelThread extends Thread 
{
	static final long FPS = 60;
	
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
                 Canvas c = null;
                 startTime = System.currentTimeMillis();
                 try {
                        c = view.getHolder().lockCanvas();
                        synchronized (view.getHolder()) {
                               view.onDraw(c);
                        }
                 } finally {
                        if (c != null) {
                               view.getHolder().unlockCanvasAndPost(c);
                        }
                 }
                 sleepTime = ticksPS-(System.currentTimeMillis() - startTime);
                 try {
                        if (sleepTime > 0)
                               sleep(sleepTime);
                        else
                               sleep(10);
                 } catch (Exception e) {}
          }
    }
}