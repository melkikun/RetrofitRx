package com.example.it01.retrofitrx;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.example.it01.retrofitrx.activity.ListDrawing;
import com.example.it01.retrofitrx.api.ApiRest;
import com.example.it01.retrofitrx.api.Intro;
import com.example.it01.retrofitrx.presenter.MdPresenter;
import com.example.it01.retrofitrx.service.MdService;
import com.example.it01.retrofitrx.service.impl.MdServiceImpl;

import org.w3c.dom.Text;

import butterknife.BindView;
import butterknife.ButterKnife;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.hello)
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        MdPresenter mdPresenter = new MdPresenter();
        textView.setText(mdPresenter.getMessage());
    }


}
