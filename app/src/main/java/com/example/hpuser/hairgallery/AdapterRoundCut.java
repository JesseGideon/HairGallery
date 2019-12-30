package com.example.hpuser.hairgallery;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by HP USER on 18/02/2018.
 */

public class AdapterRoundCut extends PagerAdapter {
private  int[] img= new int[]{R.drawable.round2,R.drawable.round3replaced,R.drawable.round4replaced,R.drawable.round5replaced,
        R.drawable.round6replaced,R.drawable.round7replaced,R.drawable.round8replaced,R.drawable.round9replaced,R.drawable.round10replaced,
        R.drawable.round11replaced,R.drawable.round12replaced,R.drawable.round13replaced,R.drawable.round17replaced,R.drawable.roundrelaced,
        R.drawable.round18replaced,R.drawable.round20replaced,R.drawable.round16replaced,R.drawable.roundreplacedagain,
        R.drawable.round21replaced,R.drawable.round22,R.drawable.round23,R.drawable.round24replaced,R.drawable.round25replaced};
    Context ctx;
    public AdapterRoundCut(Context myContext){
        ctx=myContext;
    }

    @Override
    public int getCount() {
        return img.length;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        ImageView myIMgView = new ImageView(ctx);
        myIMgView.setImageResource(img[position]);
        myIMgView.setScaleType(ImageView.ScaleType.FIT_XY);
        container.addView(myIMgView);
        return myIMgView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((ImageView)object);
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }
}
