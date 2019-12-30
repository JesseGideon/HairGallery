package com.example.hpuser.hairgallery;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by HP USER on 14/03/2018.
 */

public class AdapterGirlsOther extends PagerAdapter {
    private int[] images = new int[]{R.drawable.others1, R.drawable.others2, R.drawable.others3, R.drawable.others4, R.drawable.others5};
    private Context ctx;

    public AdapterGirlsOther(Context Mycontext) {
        ctx = Mycontext;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
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