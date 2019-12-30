package com.example.hpuser.hairgallery;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PagerCurlyCrocket13 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pager_curly_crocket13);

        ViewPager myPager = (ViewPager) findViewById(R.id.PagerCurlyCrocket13);
        AdapterCurlyCrocket adpt = new AdapterCurlyCrocket(this);
        myPager.setAdapter(adpt);
        myPager.setCurrentItem(12);
    }
}
