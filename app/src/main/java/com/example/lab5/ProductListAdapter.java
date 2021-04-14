package com.example.lab5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;

public class ProductListAdapter extends RecyclerView.Adapter<ProductListAdapter.ProductViewHolder> {
    @NonNull
    private final LinkedList<Product_a> mProList;
    private LayoutInflater mInflater;

    public ProductListAdapter(@NonNull LinkedList<Product_a> mProList, Context ctx) {
        this.mProList = mProList;
        this.mInflater = mInflater.from(ctx);
    }

    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.product_a_item,
                parent, false);
        return new ProductListAdapter.ProductViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductListAdapter.ProductViewHolder holder, int position) {
        Product_a mCurrent = mProList.get(position);
        holder.nameInView.setText(mCurrent.getName());
        holder.discountInView.setText(String.valueOf(mCurrent.getDiscount()));
        holder.priceInView.setText(String.valueOf(mCurrent.getPrice()));
        holder.voteInView.setText(String.valueOf(mCurrent.getVote()));
        holder.imgInView.setImageResource(mCurrent.getImg());
    }

    @Override
    public int getItemCount() {
        return mProList.size();
    }

    public class ProductViewHolder extends RecyclerView.ViewHolder {
        public final TextView nameInView;
        public final TextView discountInView;
        public final TextView priceInView;
        public final TextView voteInView;
        public final ImageView imgInView;

        final ProductListAdapter mAdapter;
        public ProductViewHolder(@NonNull View itemView, ProductListAdapter mAdapter) {
            super(itemView);
            this.nameInView = itemView.findViewById(R.id.tvNameGrid);
            this.discountInView = itemView.findViewById(R.id.tvDiscountGrid);
            this.priceInView = itemView.findViewById(R.id.tvPriceGrid);
            this.voteInView = itemView.findViewById(R.id.tvVoteGrid);
            this.imgInView = itemView.findViewById(R.id.imgGrid);
            this.mAdapter = mAdapter;
        }
    }
}
