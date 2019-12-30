package com.example.hpuser.hairgallery;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PagerFixing9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pager_fixing9);

        ViewPager myPager=(ViewPager) findViewById(R.id.PagerFixing9);

        AdapterFixing adpt= new AdapterFixing(this);
        myPager.setAdapter(adpt);
        myPager.setCurrentItem(8);
    }
}
