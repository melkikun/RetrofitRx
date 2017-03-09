package com.example.it01.retrofitrx.service.impl;

import com.example.it01.retrofitrx.api.ApiDrawing;
import com.example.it01.retrofitrx.api.ApiRest;
import com.example.it01.retrofitrx.api.Intro;
import com.example.it01.retrofitrx.entities.MasterDrawing;
import com.example.it01.retrofitrx.presenter.MdPresenter;
import com.example.it01.retrofitrx.service.MdService;

import java.util.List;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by IT01 on 3/8/2017.
 */

public class MdServiceImpl implements MdService{

    @Override
    public Observable listDrawing() {
        ApiDrawing apiDrawing = ApiRest.retrofit().create(ApiDrawing.class);
        Observable <List<MasterDrawing>> listObservable = apiDrawing.md();
        return listObservable;
    }
}
