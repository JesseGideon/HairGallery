package com.example.hpuser.hairgallery;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PagerUpdo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pager_updo);

        ViewPager myPager = (ViewPager) findViewById(R.id.PagerUpdo);
        AdapterUpdo adpt= new AdapterUpdo(this);
        myPager.setAdapter(adpt);
        myPager.setCurrentItem(0);
    }
}
