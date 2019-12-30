package com.example.hpuser.hairgallery;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;

public class RoundCut extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_round_cut);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if(getSupportActionBar()!=null){
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }


    }

    public void onClickfirstimg(View view) {
        Intent myintent = new Intent(getApplicationContext(),PagerRoundCut.class);
        startActivity(myintent);

    }

    public void onClickSecondImg(View view) {
        Intent myintent = new Intent(getApplicationContext(),Pager2RoundCut.class);
        startActivity(myintent);
    }

    public void onClickThirdImg(View view) {
        Intent myintent = new Intent(getApplicationContext(),Pager3RoundCut.class);
        startActivity(myintent);
    }

    public void onClickFourthImg(View view) {
        Intent myintent = new Intent(getApplicationContext(),Pager4RoundCut.class);
        startActivity(myintent);
    }

    public void onClickFivethImg(View view) {
        Intent myintent = new Intent(getApplicationContext(),Pager5RoundCut.class);
        startActivity(myintent);
    }

    public void onClickSixedImg(View view) {
        Intent myintent = new Intent(getApplicationContext(),Pager6RoundCut.class);
        startActivity(myintent);
    }

    public void onClickSeventhImg(View view) {
        Intent myintent = new Intent(getApplicationContext(),Pager7RoundCut.class);
        startActivity(myintent);
    }

    public void onClickEightImg(View view) {
        Intent myintent = new Intent(getApplicationContext(),Pager8RoundCut.class);
        startActivity(myintent);
    }

    public void onClickNineImg(View view) {
        Intent myintent = new Intent(getApplicationContext(),Pager9RoundCut.class);
        startActivity(myintent);
    }

    public void onClickTenImg(View view) {
        Intent myintent = new Intent(getApplicationContext(),Pager10RoundCut.class);
        startActivity(myintent);
    }

    public void onClickElevenImg(View view) {
        Intent myintent = new Intent(getApplicationContext(),Pager11RoundCut.class);
        startActivity(myintent);
    }

    public void onClickTwlveImg(View view) {
        Intent myintent = new Intent(getApplicationContext(),Pager12RoundCut.class);
        startActivity(myintent);
    }

    public void onClickThirteenImg(View view) {

        Intent myintent = new Intent(getApplicationContext(),Pager13RoundCut.class);
        startActivity(myintent);
    }

    public void onClickFouteenImg(View view) {
        Intent myintent = new Intent(getApplicationContext(),Pager14RoundCut.class);
        startActivity(myintent);
    }

    public void onClickFiveteenImg(View view) {
        Intent myintent = new Intent(getApplicationContext(),Pager15RoundCut.class);
        startActivity(myintent);
    }

    public void OnClickSixtheenImg(View view) {
        Intent myintent = new Intent(getApplicationContext(),Pager16RoundCut.class);
        startActivity(myintent);
    }

    public void onClickSeventeenImgClick(View view) {
        Intent myintent = new Intent(getApplicationContext(),Pager17RoundCut.class);
        startActivity(myintent);
    }

    public void onClickEighteenImg(View view) {
        Intent myintent = new Intent(getApplicationContext(),Pager18RoundCut.class);
        startActivity(myintent);
    }

    public void onClickninteenImg(View view) {
        Intent myintent = new Intent(getApplicationContext(),Pager19RoundCut.class);
        startActivity(myintent);
    }

    public void onClickTwnetyImg(View view) {
        Intent myintent = new Intent(getApplicationContext(),Pager20RoundCut.class);
        startActivity(myintent);
    }

    public void onClickTwentyoneImg(View view) {
        Intent myintent = new Intent(getApplicationContext(),Pager21RoundCut.class);
        startActivity(myintent);
    }

    public void onClickTwentyTwoImg(View view) {
        Intent myintent = new Intent(getApplicationContext(),Pager22RoundCut.class);
        startActivity(myintent);
    }

    public void onClickTwentyThreeImg(View view) {
        Intent myintent = new Intent(getApplicationContext(),Pager23RoundCut.class);
        startActivity(myintent);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId()== android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }

}
