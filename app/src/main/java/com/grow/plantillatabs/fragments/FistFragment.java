package com.grow.plantillatabs.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.grow.plantillatabs.R;
import com.grow.plantillatabs.models.Toys;
import com.grow.plantillatabs.adapter.RecyclerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by growcallisaya on 12/26/17.
 */

public class FistFragment extends Fragment {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    private View mRootView;
    private Context mContext;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mRootView = inflater.inflate(R.layout.fragment_one, container, false);
        mContext = mRootView.getContext();

        mRecyclerView = (RecyclerView) mRootView.findViewById(R.id.my_recycler_view);
        mRecyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(mContext);
        mRecyclerView.setLayoutManager(mLayoutManager);

        List<Toys> myDataset = new ArrayList<>();
        myDataset.add(new Toys("https://www.thetoyinsider.com/wp-content/uploads/2015/09/Tomy.toddler_jumbo_jamboree.jpg", "BUBU",12));
        myDataset.add(new Toys("http://jonvilma.com/images/toy-4.jpg", "COCHE",30));
        myDataset.add(new Toys("https://img.grouponcdn.com/stores/GMqorAqBM32dcZcAxNwNtc296cF/storespi2769055-1040x640/v1/c700x420.jpg", "CROCODILE",102));
        mAdapter = new RecyclerAdapter(myDataset, mContext);
        mRecyclerView.setAdapter(mAdapter);

        return mRootView;
    }

}
