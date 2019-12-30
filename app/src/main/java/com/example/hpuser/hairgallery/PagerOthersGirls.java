package com.example.hpuser.hairgallery;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PagerOthersGirls extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pager_others_girls);

        ViewPager myPager = (ViewPager) findViewById(R.id.PagerOthersGirls);
        AdapterGirlsOther adpt= new AdapterGirlsOther(this);
        myPager.setAdapter(adpt);
        myPager.setCurrentItem(0);
    }
}
