package com.example.administrator.test3_pagechange;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by yuki on 2016/09/28.
 */
public class FPAdapter extends FragmentPagerAdapter {
    public FPAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        return Fragment.newInstance(position);
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "ページ" + (position + 1);
    }
}