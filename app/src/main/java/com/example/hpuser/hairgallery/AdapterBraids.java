package com.example.hpuser.hairgallery;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by HP USER on 28/03/2018.
 */

public class AdapterBraids extends PagerAdapter {
    private int[] images = new int[]{R.drawable.braids18, R.drawable.braids3,R.drawable.braids4,R.drawable.braids5, R.drawable.braids6,
            R.drawable.braids7, R.drawable.braids8, R.drawable.braids9,R.drawable.braids10,R.drawable.braids11,R.drawable.braids12,
            R.drawable.braids13,R.drawable.braids14,R.drawable.braids15,R.drawable.braids16,R.drawable.braids17,R.drawable.braids18,R.drawable.braids19,
            R.drawable.braids20,R.drawable.braids21,R.drawable.braids22,R.drawable.braids24,R.drawable.braids25,R.drawable.braids26};
    private Context ctx;

    public AdapterBraids(Context Mycontext) {
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
