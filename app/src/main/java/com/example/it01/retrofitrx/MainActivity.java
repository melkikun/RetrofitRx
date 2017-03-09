package com.example.it01.retrofitrx;

import android.content.Intent;
import android.os.Bundle;

import com.example.it01.retrofitrx.activity.ListDrawing;
import com.example.it01.retrofitrx.activity.ToolbarActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends ToolbarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        init(R.id.toolbar);
    }

    @OnClick(R.id.btn_list_drawing)
    public void listDrawing(){
        Intent intent = new Intent(getApplicationContext(), ListDrawing.class);
        startActivity(intent);
    }

}
