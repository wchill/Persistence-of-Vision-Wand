package com.illinidroid.pov.wand;
import java.util.Arrays;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;

public class ProcessText {
	
	public boolean[][] processImage(String text, float textSize) {
		Paint paint = new Paint();

	    int width = (int) (paint.measureText(text) + 0.5f); // round
	    float baseline = (int) (-paint.ascent() + 0.5f); // ascent() is negative
	    int height = (int) (baseline + paint.descent() + 0.5f);
	    Bitmap image = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
	    Canvas canvas = new Canvas(image);
	    canvas.drawText(text, 0, baseline, paint);
	    Bitmap b = image;
		int[] pixels = new int[b.getWidth()*b.getHeight()];
		
		b.getPixels(pixels, 0, b.getWidth(), 0, 0, b.getWidth()-1, b.getHeight()-1);
		
		System.out.println(Arrays.toString(pixels));
		boolean[][] isColored = new boolean[b.getWidth()][b.getHeight()];
		for(int a = 0; a < b.getHeight();a++)
		{
			Arrays.fill(isColored[a],false);
		}
		int x = -1;
		for(int r = 0; r < b.getHeight(); r++)
		{
			for(int c = 0; c < b.getWidth();c++ )
			{   x+=1;
				
				if(pixels[x] != 0)
				{
				isColored[r][c] = true;
				}
			}
		
		}
		System.out.println(Arrays.deepToString(isColored));
		return isColored;
	}


	

}

