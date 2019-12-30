package com.example.hpuser.hairgallery;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

public class MohawkGirls extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mohawk_girls);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if(getSupportActionBar()!=null){
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    public void onclickImg1(View view) {
        Intent myint = new Intent(getApplicationContext(),PagerMohawkGirls.class);
        startActivity(myint);
    }

    public void onclickImg2(View view) {
        Intent myint = new Intent(getApplicationContext(),PagerMohawkGirls2.class);
        startActivity(myint);
    }

    public void onclickImg3(View view) {
        Intent myint = new Intent(getApplicationContext(),PagerMohawkGirls3.class);
        startActivity(myint);
    }

    public void onclickImg4(View view) {
        Intent myint = new Intent(getApplicationContext(),PagerMohawkGirls4.class);
        startActivity(myint);
    }

    public void onclickImg5(View view) {
        Intent myint = new Intent(getApplicationContext(),PagerMohawkGirls5.class);
        startActivity(myint);
    }

    public void onclickImg6(View view) {
        Intent myint = new Intent(getApplicationContext(),PagerMohawkGirls6.class);
        startActivity(myint);
    }

    public void onclickImg7(View view) {
        Intent myint = new Intent(getApplicationContext(),PagerMohawkGirls7.class);
        startActivity(myint);
    }

    public void onclickImg8(View view) {
        Intent myint = new Intent(getApplicationContext(),PagerMohawkGirls8.class);
        startActivity(myint);
    }

    public void onclickImg9(View view) {
        Intent myint = new Intent(getApplicationContext(),PagerMohawkGirls9.class);
        startActivity(myint);
    }

    public void onclickImg10(View view) {
        Intent myint = new Intent(getApplicationContext(),PagerMohawkGirls10.class);
        startActivity(myint);

    }

    public void onclickImg11(View view) {
        Intent myint = new Intent(getApplicationContext(),PagerMohawkGirls11.class);
        startActivity(myint);


    }

    public void onclickImg12(View view) {
        Intent myint = new Intent(getApplicationContext(),PagerMohawkGirls12.class);
        startActivity(myint);
    }

    public void onclickImg13(View view) {
        Intent myint = new Intent(getApplicationContext(),PagerMohawkGirls13.class);
        startActivity(myint);
    }

    public void onclickImg14(View view) {
        Intent myint = new Intent(getApplicationContext(),PagerMohawkGirls14.class);
        startActivity(myint);
    }

    public void onclickImg15(View view) {
        Intent myint = new Intent(getApplicationContext(),PagerMohawkGirls15.class);
        startActivity(myint);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId()== android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
}
