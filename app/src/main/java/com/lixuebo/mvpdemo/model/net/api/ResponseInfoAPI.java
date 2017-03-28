package com.lixuebo.mvpdemo.model.net.api;

import com.lixuebo.mvpdemo.model.net.bean.ResponseInfo;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by lixuebo on 17/3/18.
 */

public interface ResponseInfoAPI {

    @GET("TakeoutService/login")
    Call<ResponseInfo> login(@Query("password") String password, @Query("username") String username);
}
