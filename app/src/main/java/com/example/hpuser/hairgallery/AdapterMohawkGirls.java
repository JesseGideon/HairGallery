package com.example.hpuser.hairgallery;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by HP USER on 14/03/2018.
 */

public class AdapterMohawkGirls extends PagerAdapter {

    private int[] images = new int[]{R.drawable.mohawkgirls1, R.drawable.mohawkgirls2, R.drawable.mohawkgirls3, R.drawable.mohawkgirls4, R.drawable.mohawkgirls5,
            R.drawable.mohawkgirls6,R.drawable.mohawkgirls7,R.drawable.mohawkgirls8,R.drawable.mohawkgirls9,R.drawable.mohawkgirls10,R.drawable.mohawkgirls11,R.drawable.mohawkgirls12,
            R.drawable.mohawkgirls13,R.drawable.mohawkgirls14,R.drawable.mohawkgirls15};
    private Context ctx;

    public AdapterMohawkGirls(Context Mycontext) {
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
