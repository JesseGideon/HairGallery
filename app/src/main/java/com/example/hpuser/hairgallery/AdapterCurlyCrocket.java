package com.example.hpuser.hairgallery;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by HP USER on 27/03/2018.
 */

public class AdapterCurlyCrocket extends PagerAdapter {
    private int[] images = new int[]{R.drawable.curly1, R.drawable.curly2,R.drawable.curly3,R.drawable.curly4, R.drawable.curly5,
            R.drawable.curly6, R.drawable.braids7, R.drawable.braids8, R.drawable.braids9,R.drawable.curly10,R.drawable.curly11,R.drawable.curly12,
            R.drawable.curly13,R.drawable.curly14,R.drawable.curly15,R.drawable.curly16,R.drawable.curly17,R.drawable.curly18,R.drawable.curly19};
    private Context ctx;

    public AdapterCurlyCrocket(Context Mycontext) {
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
