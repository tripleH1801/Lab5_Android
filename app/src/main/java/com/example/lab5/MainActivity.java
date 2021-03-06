package com.example.lab5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    private final LinkedList<String> mWordList = new LinkedList<>();
    private RecyclerView mRecyclerView;
    private WordListAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        for (int i = 0; i < 20; i++) {
//            mWordList.addLast("Word " + i);
//        }
//// Get a handle to the RecyclerView.
//        mRecyclerView = findViewById(R.id.recycleViewListProduct_a);
//// Create an adapter and supply the data to be displayed.
//        mAdapter = new WordListAdapter(mWordList, this);
//// Connect the adapter with the RecyclerView.
//        mRecyclerView.setAdapter(mAdapter);
//// Give the RecyclerView a default layout manager.
//        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        Intent intent = new Intent(this, Product_a_RecycleView.class);
        startActivity(intent);
    }
}