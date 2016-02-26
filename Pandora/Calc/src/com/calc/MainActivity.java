package com.calc;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	Button b1,b2,b3,b4;
	EditText ET1,ET2;
	TextView T;
	String num1, num2;
	double result;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		b1=(Button)findViewById(R.id.button1);
		b2=(Button)findViewById(R.id.button2);
		b3=(Button)findViewById(R.id.button3);
		b4=(Button)findViewById(R.id.button4);
		ET1=(EditText)findViewById(R.id.editText1);
		ET2=(EditText)findViewById(R.id.editText2);
		T=(TextView)findViewById(R.id.textView1);
		b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				num1 = ET1.getText().toString();
				num2 = ET2.getText().toString();
				result = Double.parseDouble(num1) + Double.parseDouble(num2);
				T.setText(Double.toString(result));
			}});
			b2.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					num1 = ET1.getText().toString();
					num2 = ET2.getText().toString();
					result = Double.parseDouble(num1) - Double.parseDouble(num2);
					T.setText(Double.toString(result));
				}});
			b3.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						num1 = ET1.getText().toString();
						num2 = ET2.getText().toString();
						result = Double.parseDouble(num1) * Double.parseDouble(num2);
						T.setText(Double.toString(result));
					}});
			b4.setOnClickListener(new OnClickListener() {
						
						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							num1 = ET1.getText().toString();
							num2 = ET2.getText().toString();
							result = Double.parseDouble(num1) / Double.parseDouble(num2);
							T.setText(Double.toString(result));
						}});

	

}
}
