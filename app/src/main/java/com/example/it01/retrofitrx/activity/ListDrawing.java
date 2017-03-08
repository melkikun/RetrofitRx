package com.example.it01.retrofitrx.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.it01.retrofitrx.R;
import com.example.it01.retrofitrx.adapter.ListDrawingAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ListDrawing extends AppCompatActivity {
    @BindView(R.id.drawing_rv)
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_drawing);
        ButterKnife.bind(this);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        List<String> hm = new ArrayList<>();
        hm.add("1");
        hm.add("1");
        hm.add("1");
        hm.add("1");
        hm.add("1");
        hm.add("1");
        hm.add("1");
        hm.add("1");
        ListDrawingAdapter listDrawingAdapter = new ListDrawingAdapter(hm, getApplicationContext());
        recyclerView.setAdapter(listDrawingAdapter);
    }
}
