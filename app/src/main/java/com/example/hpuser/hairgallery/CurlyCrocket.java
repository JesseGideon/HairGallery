package com.example.hpuser.hairgallery;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

public class CurlyCrocket extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_curly_crocket);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if(getSupportActionBar()!=null){
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    public void curly1Clicked(View view) {
        Intent curly = new Intent(getApplicationContext(),PagerCurlyCrocket.class);
        startActivity(curly);
    }

    public void curly2Clicked(View view) {
        Intent curly = new Intent(getApplicationContext(),PagerCurlyCrocket2.class);
        startActivity(curly);
    }

    public void curly3Clicked(View view) {
        Intent curly = new Intent(getApplicationContext(),PagerCurlyCrocket3.class);
        startActivity(curly);
    }

    public void curly4Clicked(View view) {
        Intent curly = new Intent(getApplicationContext(),PagerCurlyCrocket4.class);
        startActivity(curly);
    }

    public void curly5Clicked(View view) {
        Intent curly = new Intent(getApplicationContext(),PagerCurlyCrocket5.class);
        startActivity(curly);
    }

    public void curly6Clicked(View view) {
        Intent curly = new Intent(getApplicationContext(),PagerCurlyCrocket6.class);
        startActivity(curly);
    }

    public void curly7Clicked(View view) {
        Intent curly = new Intent(getApplicationContext(),PagerCurlyCrocket7.class);
        startActivity(curly);
    }

    public void curly8Clicked(View view) {
        Intent curly = new Intent(getApplicationContext(),PagerCurlyCrocket8.class);
        startActivity(curly);
    }

    public void curly9Clicked(View view) {
        Intent curly = new Intent(getApplicationContext(),PagerCurlyCrocket9.class);
        startActivity(curly);
    }

    public void curly10Clicked(View view) {
        Intent curly = new Intent(getApplicationContext(),PagerCurlyCrocket10.class);
        startActivity(curly);

    }

    public void curly11Clicked(View view) {
        Intent curly = new Intent(getApplicationContext(),PagerCurlyCrocket11.class);
        startActivity(curly);
    }

    public void curly12Clicked(View view) {
        Intent curly = new Intent(getApplicationContext(),PagerCurlyCrocket12.class);
        startActivity(curly);
    }

    public void curly13Clicked(View view) {
        Intent curly = new Intent(getApplicationContext(),PagerCurlyCrocket13.class);
        startActivity(curly);
    }

    public void curly14Clicked(View view) {
        Intent curly = new Intent(getApplicationContext(),PagerCurlyCrocket14.class);
        startActivity(curly);
    }

    public void curly15Clicked(View view) {
        Intent curly = new Intent(getApplicationContext(),PagerCurlyCrocket15.class);
        startActivity(curly);
    }

    public void curly16Clicked(View view) {
        Intent curly = new Intent(getApplicationContext(),PagerCurlyCrocket16.class);
        startActivity(curly);
    }

    public void curly17Clicked(View view) {
        Intent curly = new Intent(getApplicationContext(),PagerCurlyCrocket17.class);
        startActivity(curly);
    }

    public void curly18Clicked(View view) {
        Intent curly = new Intent(getApplicationContext(),PagerCurlyCrocket18.class);
        startActivity(curly);
    }

    public void curly19Clicked(View view) {
        Intent curly = new Intent(getApplicationContext(),PagerCurlyCrocket19.class);
        startActivity(curly);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId()== android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
}
