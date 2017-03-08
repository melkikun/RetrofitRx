package com.example.it01.retrofitrx.api;


import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by IT01 on 3/8/2017.
 */

public interface Intro {
    @GET("hallo.php")
    Observable<String> hallo();
}
