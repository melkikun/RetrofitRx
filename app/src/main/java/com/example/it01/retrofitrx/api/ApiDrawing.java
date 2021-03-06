package com.example.it01.retrofitrx.api;

import com.example.it01.retrofitrx.entities.MasterDrawing;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;
import rx.Observer;

/**
 * Created by IT01 on 3/8/2017.
 */

public interface ApiDrawing {
    @GET("data/master-drawing")
    Observable<List<MasterDrawing>> md();
    @GET("data/master-drawing/id/{id}")
    Observable<MasterDrawing> detailMd(@Path("id") int id);
}
