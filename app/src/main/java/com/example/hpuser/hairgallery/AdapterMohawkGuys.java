package com.example.hpuser.hairgallery;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by HP USER on 15/02/2018.
 */

public class AdapterMohawkGuys extends PagerAdapter {
    private int[] Mohwakimg = new int[]{R.drawable.mohawk1replaced,R.drawable.mohawk2replaced,R.drawable.mohawk3replaced,
    R.drawable.mohawk4replaced,R.drawable.mohawk5replaced,R.drawable.mohawk6relaced,R.drawable.mohawk7repalaced,R.drawable.mohawk8replaced,
    R.drawable.mohawk9,R.drawable.mohawk10,R.drawable.mohawk11replaced,R.drawable.mohawk12,R.drawable.mohawk13replaced,
    R.drawable.mohawk14,R.drawable.mohawk15replaced,R.drawable.mohawk16,R.drawable.mohawk17,R.drawable.mohawk18,
            R.drawable.mohawk19,R.drawable.mohawk20replaced,R.drawable.mohawk21,R.drawable.mohawk22};
    Context ctx;
    public AdapterMohawkGuys(Context Mycontext){
        ctx=Mycontext;
    }
    @Override
    public int getCount() {
        return Mohwakimg.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        ImageView myIMg= new ImageView(ctx);
        myIMg.setImageResource(Mohwakimg[position]);
        myIMg.setScaleType(ImageView.ScaleType.FIT_XY);
        container.addView(myIMg);
        return myIMg;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
     container.removeView((ImageView)object);
    }
}
