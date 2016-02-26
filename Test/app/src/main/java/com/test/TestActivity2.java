package com.test;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by UJWAL on 19-02-2016.
 */
public class TestActivity2 extends Activity{
    Button b4,b5,b6;
    int d=0;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.test_main2);
            b4 = (Button)findViewById(R.id.button4);
            b5 = (Button)findViewById(R.id.button5);
            b6 = (Button)findViewById(R.id.button6);
            b4.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {
                                      Toast.makeText(getApplicationContext(), "Welcome to 2nd Page", Toast.LENGTH_LONG).show();

                                  }
                              }
            );
            b5.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {

                                          Toast.makeText(getApplicationContext(), "Facebook", Toast.LENGTH_LONG).show();
                                          String u = "http://www.facebook.com";
                                          Intent k = new Intent(Intent.ACTION_VIEW, Uri.parse(u));
                                          startActivity(k);

                                      }
                                  }
        );
            b6.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {
                                      d++;
                                      if(d==4) {
                                          Toast.makeText(getApplicationContext(), "Back to Page 1", Toast.LENGTH_LONG).show();
                                          Intent j = new Intent(TestActivity2.this,TestActivity.class);
                                          startActivity(j);
                                      }

                                  }
                              }
        );

    }
}
