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
import com.grow.plantillatabs.models.Toys;

import java.util.List;

/**
 * Created by growcallisaya on 12/26/17.
 */


public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
    private List<Toys> mDataset;
    private Context mContext;

    // ---- CONSTRUCTOR ----
    public RecyclerAdapter(List<Toys> myDataset, Context context) {
        mDataset = myDataset;
        mContext = context;
    }

    // ---- VIEWHOLDER ----
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView toyImage;
        public TextView toyName;
        public TextView toyPrice;
        public ViewHolder(View v) {
            super(v);
            toyImage = (ImageView) v.findViewById(R.id.iv_toy_image);
            toyName = (TextView) v.findViewById(R.id.tv_toy_name);
            toyPrice = (TextView) v.findViewById(R.id.tv_toy_price);
        }
    }

    // ---- VIEWHOLDER ADAPTER ----
    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_recycler, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    // ---- BINDING DATA ----
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.toyName.setText(mDataset.get(position).getName());
        holder.toyPrice.setText(String.valueOf(mDataset.get(position).getPrice()));
        Glide.with(mContext)
                .load(mDataset.get(position).getImage())
                .into(holder.toyImage);
    }

    // ---- SIZE OF ITEMS ----
    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}



