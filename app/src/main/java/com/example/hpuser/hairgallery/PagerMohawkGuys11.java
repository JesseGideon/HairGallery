package com.example.hpuser.hairgallery;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PagerMohawkGuys11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pager_mohawk_guys11);


        ViewPager myPager = (ViewPager) findViewById(R.id.PagerMohawkGuys11);
        AdapterMohawkGuys adpt= new AdapterMohawkGuys(this);
        myPager.setAdapter(adpt);
        myPager.setCurrentItem(10);
    }
}
