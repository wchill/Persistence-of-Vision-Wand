package com.illinidroid.pov.wand;
import java.util.Arrays;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;

public class ProcessText {
	
	public int[][] processImage(String text, float textSize) {
		Paint paint = new Paint();

	    int width = (int) (paint.measureText(text) + 0.5f); // round
	    float baseline = (int) (-paint.ascent() + 0.5f); // ascent() is negative
	    int height = (int) (baseline + paint.descent() + 0.5f);
	    Bitmap image = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
	    Canvas canvas = new Canvas(image);
	    canvas.drawText(text, 0, baseline, paint);
	    Bitmap b = image;
		int[] pixels = new int[b.getWidth()*b.getHeight()];
		/*boolean[][] */ int[][] isColored = new /*boolean*/ int[b.getHeight()][b.getWidth()];
		System.out.println("1");
		for(int r= 0; r < b.getHeight(); r++)
		{
			System.out.println("2");
			for(int c = 0; c < b.getWidth(); c++)
			{
				System.out.println("3");
				if(b.getPixel(c,r) != 0)
				{
					isColored[r][c] = 1;
				}
				
			}
		}
//	/*
//		//b.getPixels(pixels, 0, b.getWidth(), 0, 0, b.getWidth(), b.getHeight());
//		
//		System.out.println(Arrays.toString(pixels));
//		
//		System.out.println(b.getWidth() + " " + b.getHeight());
//		for(int a = 0; a < b.getHeight();a++)
//		{
//			Arrays.fill(isColored[a],0/*false*/);
//			System.out.println(a);
//			System.out.println("isColored Length:" + isColored[0].length);
//			System.out.println("isColored Height:" + isColored.length);
//		}
//
//		
//		int x = -1;
//		for(int r = 0; r < b.getHeight(); r++)
//		{
//			for(int c = 0; c < b.getWidth();c++ )
//			{   x+=1;
//				
//				if(pixels[x] != 0)
//				{
//				isColored[r][c] = 1;//true;
//				}
//			}
//		
//		}
//		
//	
		System.out.println(Arrays.deepToString(isColored));
		return isColored;
	}


	

}

