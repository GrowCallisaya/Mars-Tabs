package com.grow.plantillatabs.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.grow.plantillatabs.R;

/**
 * Created by growcallisaya on 12/26/17.
 */

public class MarsCardsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_mars_other, container, false);
    }
}
