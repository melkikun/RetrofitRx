package com.example.it01.retrofitrx.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.it01.retrofitrx.R;
import com.example.it01.retrofitrx.adapter.DetailDrawingAdapter;
import com.example.it01.retrofitrx.entities.MasterDrawing;
import com.example.it01.retrofitrx.presenter.MdPresenter;
import com.example.it01.retrofitrx.service.MdService;
import com.example.it01.retrofitrx.service.impl.MdServiceImpl;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class DetailDrawing extends ToolbarActivity implements MdPresenter{
    private static final String TAG = "message";
    @BindView(R.id.rv_detail_drawing)
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_drawing);
        ButterKnife.bind(this);
        init(R.id.toolbar);
        Bundle bundle = getIntent().getExtras();
        String idHm = bundle.getString("id");
        int id = Integer.parseInt(idHm);
        MdService mdService = new MdServiceImpl(this);
        mdService.detailDrawing(id);
    }

    @Override
    public void printList(List<MasterDrawing> masterDrawings) {

    }

    @Override
    public void detailDrawing(MasterDrawing masterDrawing) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        DetailDrawingAdapter detailDrawingAdapter = new DetailDrawingAdapter(masterDrawing, getApplicationContext());
        recyclerView.setAdapter(detailDrawingAdapter);
    }

    @OnClick(R.id.fragment)
    public void goFragment(View view){
        Intent intent = new Intent(getApplicationContext(), Fr.class);
        startActivity(intent);
    }
}
