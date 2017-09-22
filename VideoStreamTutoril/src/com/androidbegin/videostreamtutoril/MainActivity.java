package com.androidbegin.videostreamtutoril;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	
	Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
     // Locate the button in activity_main.xml
     		button = (Button) findViewById(R.id.Button);
     		
     	// Capture button clicks
    		button.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					
					// Start NewActivity.class
					Intent myIntent = new Intent(MainActivity.this,VideoViewActivity.class);
					startActivity(myIntent);

					
				}
			} );
     				
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
