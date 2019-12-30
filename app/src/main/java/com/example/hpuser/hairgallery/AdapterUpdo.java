package com.example.hpuser.hairgallery;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by HP USER on 19/03/2018.
 */

public class AdapterUpdo extends PagerAdapter {
    private int[] images = new int[]{R.drawable.updo1,R.drawable.updo2,R.drawable.updo3,R.drawable.updo4, R.drawable.updo5,
            R.drawable.updo6, R.drawable.updo7, R.drawable.updo8, R.drawable.updo9,R.drawable.updo10,R.drawable.updo11,
            R.drawable.updo12,R.drawable.updo13,R.drawable.updo14,R.drawable.updo15,R.drawable.updo16,R.drawable.updo17};
    private Context ctx;

    public AdapterUpdo(Context Mycontext) {
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
