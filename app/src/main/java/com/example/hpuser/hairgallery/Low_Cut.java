package com.example.hpuser.hairgallery;

import android.app.ActionBar;
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

public class Low_Cut extends AppCompatActivity {
ImageView img1,img2,img3,img4,img5,img6,img7,img8,img9,img10,img11,img12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_low__cut);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if(getSupportActionBar()!=null){
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }


    }



    public void onClickFirstImg(View view) {
        Intent low1 = new Intent(getApplicationContext(),PagerLowCut.class);
        startActivity(low1);

    }

    public void onClickSecondImg(View view) {
        Intent low2 = new Intent(getApplicationContext(),Pager2LowCut.class);
        startActivity(low2);
    }

    public void onclickThirdImg(View view) {
        Intent low3 = new Intent(getApplicationContext(),Pager3LowCut.class);
        startActivity(low3);
    }

    public void onclickFourthImg(View view) {
        Intent low4 = new Intent(getApplicationContext(),Pager4LowCut.class);
        startActivity(low4);
    }

    public void onclickFivthImg(View view) {
        Intent low5 = new Intent(getApplicationContext(),Pager5LowCut.class);
        startActivity(low5);
    }

    public void onclickSixedImg(View view) {
        Intent low6 = new Intent(getApplicationContext(),Pager6LowCut.class);
        startActivity(low6);
    }

    public void onclickSeventhImg(View view) {
        Intent low7 = new Intent(getApplicationContext(),Pager7LowCut.class);
        startActivity(low7);
    }

    public void onclickEightImg(View view) {
        Intent low8 = new Intent(getApplicationContext(),Pager8LowCut.class);
        startActivity(low8);
    }

    public void onclickNinthImg(View view) {
        Intent low9 = new Intent(getApplicationContext(),Pager9LowCut.class);
        startActivity(low9);
    }

    public void onclickTenth(View view) {
        Intent low10 = new Intent(getApplicationContext(),Pager10LowCut.class);
        startActivity(low10);
    }

    public void onclickEleventh(View view) {
        Intent low11 = new Intent(getApplicationContext(),Pager11LowCut.class);
        startActivity(low11);
    }

    public void onclickTwelveth(View view) {
        Intent low12 = new Intent(getApplicationContext(),Pager12LowCut.class);
        startActivity(low12);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId()== android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
}
