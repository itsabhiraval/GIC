package com.example.october7sveryown.gic;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 3000 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        TextView myText=(TextView)findViewById(R.id.myText);

        Typeface tf= Typeface.createFromAsset(getAssets(),"fonts/PT_Sans-Web-Bold.ttf");
        myText.setTypeface(tf);

        new Handler().postDelayed(new Runnable(){
            @Override
                    public void run(){
                Intent i=new Intent(MainActivity.this,SlideScreenActivity.class);
                startActivity(i);
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}

