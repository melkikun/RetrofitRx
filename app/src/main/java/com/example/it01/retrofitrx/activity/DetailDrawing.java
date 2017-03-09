package com.example.it01.retrofitrx.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.it01.retrofitrx.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailDrawing extends ToolbarActivity {
    @BindView(R.id.id)
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_drawing);
        ButterKnife.bind(this);
        init(R.id.toolbar);
        Log.d("profile", getIntent().getExtras().get("profile").toString());
    }
}
