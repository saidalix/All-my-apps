package com.lesx.travelbus;


import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class MainActivity extends Activity{

	ImageButton travel,book,cal,contact,fees;
	
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		// listener handler
	    View.OnClickListener handler = new View.OnClickListener(){
	        public void onClick(View v) {
	            
	            switch (v.getId()) {

	                case R.id.btnShowNotification:
	                	showNotification();
	                    break;
	                    
	            }
	        }
	    };
	        
	    // we will set the listeners
	    findViewById(R.id.btnShowNotification).setOnClickListener(handler);
		
		travel = (ImageButton)findViewById(R.id.travel_img);
		book = (ImageButton)findViewById(R.id.book_img);
		contact = (ImageButton)findViewById(R.id.contact_img);
		fees = (ImageButton)findViewById(R.id.fees_img);
		cal = (ImageButton)findViewById(R.id.calend_img);
		
		travel.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent move=new Intent(MainActivity.this,Travel.class);
				startActivity(move);
			}
		});
		
      book.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent move=new Intent(MainActivity.this,BookSystem.class);
				startActivity(move);
			}
		});
      
      cal.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent move=new Intent(MainActivity.this,Cal.class);
				startActivity(move);
			}
		});
      
      contact.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent move=new Intent(MainActivity.this,Contact.class);
				startActivity(move);
			}
		});
      
      fees.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent move=new Intent(MainActivity.this,Fees.class);
				startActivity(move);
			}
		});
	
	}
	
	@TargetApi(Build.VERSION_CODES.JELLY_BEAN)
	@SuppressLint("NewApi")
	public void showNotification(){

		// define sound URI, the sound to be played when there's a notification
		Uri soundUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
		
		// intent triggered, you can add other intent for other actions
		Intent intent = new Intent(MainActivity.this, NotificationReceiver.class);
		PendingIntent pIntent = PendingIntent.getActivity(MainActivity.this, 0, intent, 0);
		
		// this is it, we'll build the notification!
		// in the addAction method, if you don't want any icon, just set the first param to 0
		Notification mNotification = new Notification.Builder(this)
			
		.setContentTitle("New Post!")
		.setContentText("Here's an awesome update for you comming soon!")
		.setSmallIcon(R.drawable.ninja)
		.setContentIntent(pIntent)
		.setSound(soundUri)
		
		.addAction(R.drawable.ninja, "View", pIntent)
		.addAction(0, "Remind", pIntent)
		
		.build();
		
		NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

		// If you want to hide the notification after it was selected, do the code below
		// myNotification.flags |= Notification.FLAG_AUTO_CANCEL;
		
		notificationManager.notify(0, mNotification);
	}
	
	public void cancelNotification(int notificationId){
		
		if (Context.NOTIFICATION_SERVICE!=null) {
            String ns = Context.NOTIFICATION_SERVICE;
            NotificationManager nMgr = (NotificationManager) getApplicationContext().getSystemService(ns);
            nMgr.cancel(notificationId);
        }
	}

}
