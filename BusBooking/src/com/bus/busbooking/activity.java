package com.bus.busbooking;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;



public class activity extends Activity{

	ImageButton travel,book,cal,contact,fees;
	
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity);
		
		
	        
	    
		
		travel = (ImageButton)findViewById(R.id.travel_img);
		book = (ImageButton)findViewById(R.id.book_img);
		contact = (ImageButton)findViewById(R.id.contact_img);
		fees = (ImageButton)findViewById(R.id.fees_img);
		cal = (ImageButton)findViewById(R.id.calend_img);
		
		book.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent move=new Intent(activity.this,BookSystem.class);
				startActivity(move);
			}
		});
		
		cal.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent move=new Intent(activity.this,Cal.class);
				startActivity(move);
			}
		});
      
      contact.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent move=new Intent(activity.this,Contact.class);
				startActivity(move);
			}
		});
      
      fees.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent move=new Intent(activity.this,Fees.class);
				startActivity(move);
			}
		});
		
      travel.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent move=new Intent(activity.this,Travel.class);
				startActivity(move);
			}
		});
     
      
    
	}
	
	

}

