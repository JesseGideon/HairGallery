package com.example.hpuser.hairgallery;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

public class Updo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_updo);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if(getSupportActionBar()!=null){
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    public void onClickupdo1(View view) {
        Intent h= new Intent(getApplicationContext(),PagerUpdo.class);
        startActivity(h);
    }

    public void onClickupdo2(View view) {
        Intent h= new Intent(getApplicationContext(),PagerUpdo2.class);
        startActivity(h);
    }

    public void onClickupdo3(View view) {
        Intent h= new Intent(getApplicationContext(),PagerUpdo3.class);
        startActivity(h);
    }

    public void onClickupdo4(View view) {
        Intent h= new Intent(getApplicationContext(),PagerUpdo4.class);
        startActivity(h);
    }

    public void onClickupdo5(View view) {
        Intent h= new Intent(getApplicationContext(),PagerUpdo5.class);
        startActivity(h);
    }

    public void onClickupdo6(View view) {
        Intent h= new Intent(getApplicationContext(),PagerUpdo6.class);
        startActivity(h);
    }

    public void onClickupdo7(View view) {
        Intent h= new Intent(getApplicationContext(),PagerUpdo7.class);
        startActivity(h);
    }

    public void onClickupdo8(View view) {
        Intent h= new Intent(getApplicationContext(),PagerUpdo8.class);
        startActivity(h);
    }

    public void onClickupdo9(View view) {
        Intent h= new Intent(getApplicationContext(),PagerUpdo9.class);
        startActivity(h);
    }

    public void onClickupdo10(View view) {
        Intent h= new Intent(getApplicationContext(),PagerUpdo10.class);
        startActivity(h);
    }

    public void onClickupdo11(View view) {
        Intent h= new Intent(getApplicationContext(),PagerUpdo11.class);
        startActivity(h);
    }

    public void onClickupdo12(View view) {
        Intent h= new Intent(getApplicationContext(),PagerUpdo12.class);
        startActivity(h);
    }

    public void onClickupdo13(View view) {
        Intent h= new Intent(getApplicationContext(),PagerUpdo13.class);
        startActivity(h);
    }

    public void onClickupdo14(View view) {
        Intent h= new Intent(getApplicationContext(),PagerUpdo14.class);
        startActivity(h);
    }

    public void onClickupdo15(View view) {
        Intent h= new Intent(getApplicationContext(),PagerUpdo15.class);
        startActivity(h);
    }

    public void onClickupdo16(View view) {
        Intent h= new Intent(getApplicationContext(),PagerUpdo16.class);
        startActivity(h);
    }

    public void onClickupdo17(View view) {
        Intent h= new Intent(getApplicationContext(),PagerUpdo17.class);
        startActivity(h);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId()== android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
}
