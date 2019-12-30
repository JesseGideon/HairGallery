package com.example.hpuser.hairgallery;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by HP USER on 15/02/2018.
 */

public class Adapter3LowCut extends PagerAdapter {
    private int[] images= new int[]{R.drawable.one_lowcutreplace,R.drawable.two_lowcutreplace,R.drawable.four_lowcutreplace,
            R.drawable.six_lowcutreplace,R.drawable.seven_lowcutreplace,R.drawable.five_lowcutreplace,R.drawable.ten_lowcutreplace,
            R.drawable.eleven_lowcutreplace,R.drawable.eight_lowcutreplace,R.drawable.fourteen_lowcutreaplce,
            R.drawable.thirteen_lowcutreplace,R.drawable.twelve_lowcutreplace};
    private Context ctx;
    public Adapter3LowCut(Context Mycontext){
        ctx=Mycontext;
    }
    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        ImageView MyImageView = new ImageView(ctx);
        MyImageView.setImageResource(images[position]);
        MyImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        container.addView(MyImageView);
        return MyImageView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((ImageView) object);
    }
}
