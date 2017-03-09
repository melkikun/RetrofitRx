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
    private MdPresenter mdPresenter;

    public MdServiceImpl(MdPresenter mdPresenter) {
        this.mdPresenter = mdPresenter;
    }

    @Override
    public void listDrawing() {
        ApiDrawing apiDrawing = ApiRest.retrofit().create(ApiDrawing.class);
        Observable<List<MasterDrawing>> listObservable = apiDrawing.md();
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
                    public void onNext(List<MasterDrawing> masterDrawings) {
                        mdPresenter.printList(masterDrawings);
                    }
                });
    }
}
