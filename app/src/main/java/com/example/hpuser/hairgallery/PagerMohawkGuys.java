package com.example.hpuser.hairgallery;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PagerMohawkGuys extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pager_mohawk_guys);

        ViewPager myPager = (ViewPager) findViewById(R.id.PagerMohawkGuys);
        AdapterMohawkGuys adpt= new AdapterMohawkGuys(this);
        myPager.setAdapter(adpt);
        myPager.setCurrentItem(0);

    }
}
