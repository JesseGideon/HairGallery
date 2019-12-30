package com.example.hpuser.hairgallery;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

public class Fixing extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fixing);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if(getSupportActionBar()!=null){
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

    }

    public void onclickImg1(View view) {
        Intent myINt = new Intent(getApplicationContext(),PagerFixing.class);
        startActivity(myINt);
    }

    public void onclickImg2(View view) {
        Intent myINt = new Intent(getApplicationContext(),PagerFixing2.class);
        startActivity(myINt);
    }

    public void onclickImg3(View view) {
        Intent myINt = new Intent(getApplicationContext(),PagerFixing3.class);
        startActivity(myINt);
    }

    public void onclickImg4(View view) {
        Intent myINt = new Intent(getApplicationContext(),PagerFixing4.class);
        startActivity(myINt);
    }

    public void onclickImg5(View view) {
        Intent myINt = new Intent(getApplicationContext(),PagerFixing5.class);
        startActivity(myINt);
    }



    public void onclickImg7(View view) {
        Intent myINt = new Intent(getApplicationContext(),PagerFixing7.class);
        startActivity(myINt);
    }

    public void onclickImg8(View view) {
        Intent myINt = new Intent(getApplicationContext(),PagerFixing8.class);
        startActivity(myINt);
    }

    public void onclickImg9(View view) {
        Intent myINt = new Intent(getApplicationContext(),PagerFixing9.class);
        startActivity(myINt);
    }

    public void onclickImgSix(View view) {
        Intent myINt = new Intent(getApplicationContext(),PagerFixing6.class);
        startActivity(myINt);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId()== android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
}
