package com.example.hpuser.hairgallery;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Thread myT = new Thread(){
            public void run(){
                try{
                    sleep(2*1000);
                    Intent myInt = new Intent(SplashScreen.this,HomeSample.class);
                    startActivity(myInt);
                }catch (Exception ex){
                    ex.printStackTrace();
                }
                finally {
                    finish();
                }
            }
        };
        myT.start();
    }
}
