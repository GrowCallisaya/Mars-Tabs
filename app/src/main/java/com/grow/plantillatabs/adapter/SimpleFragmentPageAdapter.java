package com.grow.plantillatabs.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


import com.grow.plantillatabs.models.FragmentItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by growcallisaya on 12/26/17.
 */

public class SimpleFragmentPageAdapter extends FragmentPagerAdapter {

    List<FragmentItem> fragments = new ArrayList<>();
    public SimpleFragmentPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position).fragment;
    }

    public void addFragment(Fragment fragment,String title){
        fragments.add(new FragmentItem(fragment,title));
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return fragments.get(position).title;
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}
