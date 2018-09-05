package com.demo.rxandroiddemo;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.GET;

public interface Api {
    @GET
    Observable<String> login(@Body String request);

    @GET
    Observable<String> register(@Body String request);
}
