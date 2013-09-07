package com.illinidroid.pov.wand;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class DisplayActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_display);
		
		Intent intent = getIntent();
		PixelDisplay pd = (PixelDisplay) findViewById(R.id.pixelDisplay);
		pd.setDisplayText(intent.getStringExtra("text"));
	}
}
