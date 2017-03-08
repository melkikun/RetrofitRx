package com.example.it01.retrofitrx.service.impl;

import com.example.it01.retrofitrx.api.ApiRest;
import com.example.it01.retrofitrx.api.Intro;
import com.example.it01.retrofitrx.presenter.MdPresenter;
import com.example.it01.retrofitrx.service.MdService;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by IT01 on 3/8/2017.
 */

public class MdServiceImpl implements MdService{
    MdPresenter mdPresenter;
    public MdServiceImpl(MdPresenter mdPresenter) {
        this.mdPresenter = mdPresenter;
    }

    @Override
    public void listDrawing() {
        Intro intro = ApiRest.retrofit().create(Intro.class);
        Observable<String> observer = intro.hallo();
        observer.subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<String>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(String s) {
                        mdPresenter.setMessage(s);
                    }
                });
    }
}
