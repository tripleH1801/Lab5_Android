package com.example.lab5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Product_a_RecycleView extends AppCompatActivity {

    private LinkedList<Product_a> listProduct;
    private RecyclerView mRecyclerView;
    private ProductListAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_a__recycle_view);
        listProduct = new LinkedList<>();
        for (int i = 0; i < 20; i++) {
            listProduct.add(new Product_a("Name "+i, 12, 69900, 39, R.drawable.daynguon_1));
        }
// Get a handle to the RecyclerView.
        mRecyclerView = findViewById(R.id.recycleViewListProduct_a);
// Create an adapter and supply the data to be displayed.
        mAdapter = new ProductListAdapter(listProduct, this);
// Connect the adapter with the RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
// Give the RecyclerView a default layout manager.
        mRecyclerView.setLayoutManager(new GridLayoutManager(this, 2));
    }
}