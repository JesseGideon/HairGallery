package com.example.hpuser.hairgallery;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

public class Others extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_others);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if(getSupportActionBar()!=null){
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

    }

    public void others1(View view) {
        Intent myint = new Intent(getApplicationContext(),PagerOthersGirls.class);
        startActivity(myint);
    }

    public void onClickImg1(View view) {
        Intent myint = new Intent(getApplicationContext(),PagerOtherGirls1.class);
        startActivity(myint);
    }

    public void click(View view) {
        Intent myint = new Intent(getApplicationContext(),PagerOthersGirls2.class);
        startActivity(myint);
    }

    public void clickIMg4(View view) {
        Intent myint = new Intent(getApplicationContext(),PagerOthersGirls3.class);
        startActivity(myint);
    }

    public void onclickImg5(View view) {
        Intent myint = new Intent(getApplicationContext(),PagerOthersGirls4.class);
        startActivity(myint);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId()== android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
}
