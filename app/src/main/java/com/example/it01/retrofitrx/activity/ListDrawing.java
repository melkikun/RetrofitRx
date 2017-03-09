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

import com.example.it01.retrofitrx.R;
import com.example.it01.retrofitrx.adapter.ListDrawingAdapter;
import com.example.it01.retrofitrx.entities.MasterDrawing;
import com.example.it01.retrofitrx.event.RecycleListener;
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

public class ListDrawing extends ToolbarActivity {
    @BindView(R.id.drawing_rv)
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_drawing);
        ButterKnife.bind(this);
        init(R.id.toolbar);
        MdService mdService = new MdServiceImpl();
        Observable<List<MasterDrawing>> listObservable = mdService.listDrawing();
        listObservable.subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<List<MasterDrawing>>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(final List<MasterDrawing> masterDrawings) {
                        ListDrawingAdapter listDrawingAdapter = new ListDrawingAdapter(masterDrawings, getApplicationContext());
                        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
                        recyclerView.setLayoutManager(layoutManager);
                        recyclerView.setItemAnimator(new DefaultItemAnimator());
                        recyclerView.setAdapter(listDrawingAdapter);
                        recyclerView.addOnItemTouchListener(new RecycleListener(getApplicationContext(), recyclerView, new RecycleListener.Xxx() {
                            @Override
                            public void onClick(View view, int position) {
                                Log.d("click", masterDrawings.get(position).getHeadMark());
                                Log.d("click", masterDrawings.get(position).getMasterDrawingId());
                                Intent intent = new Intent(ListDrawing.this, DetailDrawing.class);
                                intent.putExtra("id", masterDrawings.get(position).getMasterDrawingId());
                                intent.putExtra("headmark", masterDrawings.get(position).getHeadMark());
                                intent.putExtra("comptype", masterDrawings.get(position).getCompType());
                                intent.putExtra("profile", masterDrawings.get(position).getProfile());
                                startActivity(intent);
                            }

                            @Override
                            public void onLongClick(View view, int position) {
                                Log.d("click", "2");
                            }
                        }));
                    }
                });
    }
}
