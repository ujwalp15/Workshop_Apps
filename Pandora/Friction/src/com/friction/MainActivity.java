package com.friction;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	Button b1;
	int c=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button)findViewById(R.id.button1);
        b1.setOnClickListener(new OnClickListener(){
        	
        	@Override
        	public void onClick(View v){
        		c++;
        		Toast.makeText(getApplicationContext(), " "+c , Toast.LENGTH_LONG).show();
        		
        	}
        });
    }
    
}
