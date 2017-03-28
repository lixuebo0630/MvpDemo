package com.lixuebo.mvpdemo;

import android.app.Application;
import android.content.Context;

/**
 * Created by lixuebo on 17/3/18.
 */

public class MyApplication extends Application {


    public static Context context;

    public static Context getContext() {
        return context;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
    }
}
