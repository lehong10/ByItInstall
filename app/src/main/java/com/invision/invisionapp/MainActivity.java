package com.invision.invisionapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.invision.adapter.AutoScrollViewPager;
import com.invision.adapter.CustomViewPagerAdapter;

public class MainActivity extends AppCompatActivity {
    private AutoScrollViewPager scrollViewPager;
    private int[] mResource = {
            R.drawable.icon_settings,
            R.drawable.icon_settings,
            R.drawable.icon_settings
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_app_layout);
        scrollViewPager = (AutoScrollViewPager)findViewById(R.id.auto_viewpager_start_layout);
        scrollViewPager.setAdapter(new CustomViewPagerAdapter(this,mResource));
        scrollViewPager.setInterval(1000);
        scrollViewPager.setSlideBorderMode(AutoScrollViewPager.SLIDE_BORDER_MODE_TO_PARENT);
        scrollViewPager.startAutoScroll();
    }
}
