package com.example.hpuser.hairgallery;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Pager9RoundCut extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pager9_round_cut);
        ViewPager myPager = (ViewPager) findViewById(R.id.Pager9RoundCutGuys);
        AdapterRoundCut adpt = new AdapterRoundCut(this);
        myPager.setAdapter(adpt);
        myPager.setCurrentItem(8);
    }
}
