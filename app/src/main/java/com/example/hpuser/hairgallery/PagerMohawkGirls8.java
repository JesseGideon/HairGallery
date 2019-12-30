package com.example.hpuser.hairgallery;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PagerMohawkGirls8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pager_mohawk_girls8);

        ViewPager myPager=(ViewPager) findViewById(R.id.PagerMohawkGirls8);

        AdapterMohawkGirls adpt= new AdapterMohawkGirls(this);
        myPager.setAdapter(adpt);
        myPager.setCurrentItem(7);
    }
}
