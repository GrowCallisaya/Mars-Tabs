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
import com.grow.plantillatabs.models.Planets;
import com.grow.plantillatabs.adapter.RecyclerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by growcallisaya on 12/26/17.
 */

public class MarsListFragment extends Fragment {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    private View mRootView;
    private Context mContext;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mRootView = inflater.inflate(R.layout.fragment_mars_list, container, false);
        mContext = mRootView.getContext();

        mRecyclerView = (RecyclerView) mRootView.findViewById(R.id.my_recycler_view);
        mRecyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(mContext);
        mRecyclerView.setLayoutManager(mLayoutManager);

        List<Planets> myDataset = new ArrayList<>();
        myDataset.add(new Planets("JUPITER","orange","1001","http://ramonsandino.com/cosmos2/img/vectorIcons/jupiter/jupiter.png"));
        myDataset.add(new Planets("SATURNO","blue","2203","https://cdn.pixabay.com/photo/2012/04/10/17/39/venus-26620_1280.png"));
        myDataset.add(new Planets("VENUS","green","10","https://cdn.pixabay.com/photo/2017/04/04/14/26/pluto-2201446_1280.png"));
        mAdapter = new RecyclerAdapter(myDataset, mContext);
        mRecyclerView.setAdapter(mAdapter);

        return mRootView;
    }

}
