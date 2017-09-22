package com.lesx.travelbus;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class NotificationReceiver extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		TextView tv = new TextView(this);
		tv.setText("We are telling all our custumer that we are having a promotion of tikect during this period of Semptember for any destination.");
		
		setContentView(tv);
	}
}