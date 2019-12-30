package com.example.hpuser.hairgallery;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PagerOtherGirls1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pager_other_girls1);

        ViewPager myPager = (ViewPager) findViewById(R.id.PagerOthersGirls1);
        AdapterGirlsOther adpt= new AdapterGirlsOther(this);
        myPager.setAdapter(adpt);
        myPager.setCurrentItem(1);
    }
}
