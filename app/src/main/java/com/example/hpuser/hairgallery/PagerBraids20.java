package com.example.hpuser.hairgallery;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PagerBraids20 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pager_braids20);

        ViewPager myPager = (ViewPager) findViewById(R.id.PagerBraids20);
        AdapterBraids adpt = new AdapterBraids(this);
        myPager.setAdapter(adpt);
        myPager.setCurrentItem(19);
    }
}
