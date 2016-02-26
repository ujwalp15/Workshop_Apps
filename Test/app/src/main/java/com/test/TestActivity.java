package com.test;

import android.content.Intent;
import android.os.Bundle;
import android.sax.StartElementListener;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class TestActivity extends AppCompatActivity {
    Button b1,b2,b3;
    int c=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        b1 = (Button)findViewById(R.id.button);
        b2 = (Button)findViewById(R.id.button2);
        b3 = (Button)findViewById(R.id.button3);
        b1.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {
                                      Toast.makeText(getApplicationContext(),"Welcome to 1st Page", Toast.LENGTH_LONG).show();

                                  }
                              }
        );
        b2.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {
                                      Intent i = new Intent(Intent.ACTION_SET_WALLPAPER);
                                      startActivity(Intent.createChooser(i, "Set Wallpaper"));

                                  }
                              }
        );
        b3.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {
                                      c++;
                                      if(c==6) {
                                          Toast.makeText(getApplicationContext(), "Going to next page!!", Toast.LENGTH_LONG).show();
                                          Intent i = new Intent(TestActivity.this,TestActivity2.class);
                                          startActivity(i);
                                      }
                                  }
                              }
        );

    }

}
