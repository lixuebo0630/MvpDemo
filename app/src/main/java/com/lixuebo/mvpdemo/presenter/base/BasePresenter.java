package com.lixuebo.mvpdemo.presenter.base;

import com.lixuebo.mvpdemo.model.dao.bean.DBHelper;
import com.lixuebo.mvpdemo.model.net.api.ResponseInfoAPI;
import com.lixuebo.mvpdemo.utils.Contants;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by lixuebo on 17/3/18.
 * 业务处理基类
 */

public class BasePresenter {

    protected static ResponseInfoAPI api;
    protected DBHelper helper;


    public BasePresenter() {

        if (api == null) {
            Retrofit retrofit = new Retrofit.Builder().baseUrl(Contants.BASEURL)
                    .addConverterFactory(GsonConverterFactory.create()).build();

            api = retrofit.create(ResponseInfoAPI.class);
        }

        helper = DBHelper.getInstance();
    }
}
