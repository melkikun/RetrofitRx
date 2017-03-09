package com.example.it01.retrofitrx.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.it01.retrofitrx.R;
import com.example.it01.retrofitrx.adapter.ListDrawingAdapter;
import com.example.it01.retrofitrx.entities.MasterDrawing;
import com.example.it01.retrofitrx.event.RecycleListener;
import com.example.it01.retrofitrx.presenter.MdPresenter;
import com.example.it01.retrofitrx.service.MdService;
import com.example.it01.retrofitrx.service.impl.MdServiceImpl;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class ListDrawing extends ToolbarActivity implements MdPresenter {
    @BindView(R.id.drawing_rv)
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_drawing);
        ButterKnife.bind(this);
        init(R.id.toolbar);
        MdService mdService = new MdServiceImpl(this);
        mdService.listDrawing();
    }

    @Override
    public void printList(final List<MasterDrawing> masterDrawings) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        ListDrawingAdapter listDrawingAdapter = new ListDrawingAdapter(masterDrawings, getApplicationContext());
        recyclerView.setAdapter(listDrawingAdapter);

        recyclerView.addOnItemTouchListener(new RecycleListener(getApplicationContext(), recyclerView, new RecycleListener.Xxx() {
            @Override
            public void onClick(View view, int position) {
                Toast.makeText(getApplicationContext(), masterDrawings.get(position).getHeadMark().toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));
    }
}
