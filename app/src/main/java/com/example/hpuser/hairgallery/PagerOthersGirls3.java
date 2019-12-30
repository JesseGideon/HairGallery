package com.example.hpuser.hairgallery;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PagerOthersGirls3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pager_others_girls3);

        ViewPager myPager = (ViewPager) findViewById(R.id.PagerOthersGirls3);
        AdapterGirlsOther adpt= new AdapterGirlsOther(this);
        myPager.setAdapter(adpt);
        myPager.setCurrentItem(3);
    }
}
