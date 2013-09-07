package com.illinidroid.pov.wand;

import com.larswerkman.colorpicker.ColorPicker;
import com.larswerkman.colorpicker.OpacityBar;
import com.larswerkman.colorpicker.SVBar;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {

	Button pickColor;
	Button displayButton;
	EditText displayText;
	SeekBar refreshRate;
	int color = Color.WHITE;
	String[] faces;
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pickColor = (Button) findViewById(R.id.colorPicker);
        pickColor.setOnClickListener(this);
        displayButton = (Button) findViewById(R.id.displayButton);
        displayText = (EditText) findViewById(R.id.displayText);
        refreshRate = (SeekBar) findViewById(R.id.seekBar);
        displayButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				String s = displayText.getText().toString();
				if(s.length() == 0) Toast.makeText(MainActivity.this, "Please enter text to display", Toast.LENGTH_SHORT).show();
				else {
					Intent intent = new Intent(MainActivity.this, DisplayActivity.class);
					intent.putExtra("text", s);
					intent.putExtra("color", color);
					intent.putExtra("fps", refreshRate.getProgress());
					MainActivity.this.startActivity(intent);
				}
			}
		});
        
        faces = getResources().getStringArray(R.array.faces);
        
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, faces);
        ListView listView = (ListView) findViewById(R.id.rageFaces);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View viewClicked,int position, long id) {
				displayText.setText(faces[position]);
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        // getMenuInflater().inflate(R.menu.main, menu);
    	
        return true;
    }


	@Override
	public void onClick(View v) {
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
	    // Get the layout inflater
	    LayoutInflater inflater = getLayoutInflater();

	    View v1 = inflater.inflate(R.layout.dialog_colorpicker, null);
	    
	    final ColorPicker picker = (ColorPicker) v1.findViewById(R.id.picker);
	    SVBar svbar = (SVBar) v1.findViewById(R.id.svbar);
	    OpacityBar obar = (OpacityBar) v1.findViewById(R.id.opacitybar);
	    picker.addSVBar(svbar);
	    picker.addOpacityBar(obar);
	    
	    // Inflate and set the layout for the dialog
	    // Pass null as the parent view because its going in the dialog layout
	    builder.setView(v1)
	    // Add action buttons
	           .setPositiveButton("OK", new DialogInterface.OnClickListener() {
	               @Override
	               public void onClick(DialogInterface dialog, int id) {
	                   color = picker.getColor();
	                   pickColor.setBackgroundColor(color);
	               }
	           })
	           .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
	               public void onClick(DialogInterface dialog, int id) {
	            	   
	               }
	           });      
	    builder.show();
	}
    
}
