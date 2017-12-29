package com.grow.plantillatabs.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.grow.plantillatabs.R;
import com.grow.plantillatabs.contrib.views.TextViewExoBold;
import com.grow.plantillatabs.contrib.views.TextViewExoThin;
import com.grow.plantillatabs.models.Planets;

import java.util.List;

/**
 * Created by growcallisaya on 12/26/17.
 */


public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
    private List<Planets> mDataset;
    private Context mContext;

    // ---- CONSTRUCTOR ----
    public RecyclerAdapter(List<Planets> myDataset, Context context) {
        mDataset = myDataset;
        mContext = context;
    }

    // ---- VIEWHOLDER ----
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView planetImage;
        public TextViewExoBold planteName;
        public TextViewExoThin planetHabitants;
        public ViewHolder(View v) {
            super(v);
            planetImage = (ImageView) v.findViewById(R.id.iv_planet_image);
            planteName = (TextViewExoBold) v.findViewById(R.id.tv_planet_name);
            planetHabitants = (TextViewExoThin) v.findViewById(R.id.tv_planet_habitants);
        }
    }

    // ---- VIEWHOLDER ADAPTER ----
    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.mars_item, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    // ---- BINDING DATA ----
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.planteName.setText(mDataset.get(position).getName());
        holder.planetHabitants.setText(String.valueOf(mDataset.get(position).getHabitants()));
        Glide.with(mContext)
                .load(mDataset.get(position).getImage())
                .into(holder.planetImage);
    }

    // ---- SIZE OF ITEMS ----
    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}



