package com.illinidroid.pov.wand;

import android.graphics.Canvas;

public class PixelThread extends Thread 
{
    static final long FPS = 10;
    private PixelDisplay view;
    private boolean running = false;
   
    public PixelThread(PixelDisplay view) 
    {
          this.view = view;
    }
 
    public void setRunning(boolean run) 
    {
          running = run;
    }    
    
    @Override
    public void run() 
    {
          long ticksPS = 1000 / FPS;
          long startTime;
          long sleepTime;
          
          while (running) 
          {
                 Canvas c = null;
                 startTime = System.currentTimeMillis();
                 try 
                 {
                        c = view.getHolder().lockCanvas();
                        
                        synchronized (view.getHolder()) 
                        {
                               view.onDraw(c);
                        }
                 } 
                 finally 
                 {
                        if (c != null) 
                        {
                               view.getHolder().unlockCanvasAndPost(c);
                        }
                 }
                 
                 
                 sleepTime = ticksPS + startTime - System.currentTimeMillis();
                 
                 
                 try 
                 {
                        if (sleepTime > 0)
                        {
                               sleep(sleepTime);
                        }
                        else
                        {
                               sleep(10);
                        }
                        
                        
                        
                 } 
                 catch (Exception e) {
                 
                 }
          }
    }
}