package com.example.hpuser.hairgallery;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Pager4LowCut extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pager4_low_cut);
        ViewPager Mypager= (ViewPager) findViewById(R.id.Pager4lowcut);
        AdapterLowCut mydpt=new AdapterLowCut(this);
        Mypager.setAdapter(mydpt);
        Mypager.setCurrentItem(3);
    }
}
