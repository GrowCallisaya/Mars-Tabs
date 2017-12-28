package com.grow.plantillatabs.models;

import android.support.v4.app.Fragment;

/**
 * Created by growcallisaya on 12/26/17.
 */

public class FragmentItem {
    public Fragment fragment;
    public String title;

    public FragmentItem(Fragment fragment, String title) {
        this.fragment = fragment;
        this.title = title;
    }
}
