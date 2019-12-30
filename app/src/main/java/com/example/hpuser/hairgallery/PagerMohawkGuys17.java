package com.example.hpuser.hairgallery;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PagerMohawkGuys17 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pager_mohawk_guys17);

        ViewPager myPager = (ViewPager) findViewById(R.id.PagerMohawkGuys17);
        AdapterMohawkGuys adpt= new AdapterMohawkGuys(this);
        myPager.setAdapter(adpt);
        myPager.setCurrentItem(16);
    }
}
