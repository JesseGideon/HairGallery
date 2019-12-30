package com.example.hpuser.hairgallery;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PagerFixing5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pager_fixing5);


        ViewPager myPager=(ViewPager) findViewById(R.id.PagerFixing5);

        AdapterFixing adpt= new AdapterFixing(this);
        myPager.setAdapter(adpt);
        myPager.setCurrentItem(4);
    }
}
