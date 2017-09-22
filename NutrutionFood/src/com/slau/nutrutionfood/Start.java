package com.slau.nutrutionfood;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Start extends Activity {
	
	Button vitamins,protein,fats,mineral,fibre;
	
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.start);
		
		vitamins = (Button)findViewById(R.id.button2);
		protein = (Button)findViewById(R.id.button5);
		fats =(Button)findViewById(R.id.button4);
		mineral = (Button)findViewById(R.id.button3);
		fibre = (Button)findViewById(R.id.button1);
		
		vitamins.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent move=new Intent(Start.this,Vitamins.class);
				startActivity(move);
			}
		});
		protein.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent move=new Intent(Start.this,Protein.class);
				startActivity(move);
			}
		});
		fats.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent move=new Intent(Start.this,Fats.class);
				startActivity(move);
			}
		});
		mineral.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent move=new Intent(Start.this,Mineral.class);
				startActivity(move);
			}
		});
		fibre.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent move=new Intent(Start.this,Fibre.class);
				startActivity(move);
			}
		});
		
	}

}
