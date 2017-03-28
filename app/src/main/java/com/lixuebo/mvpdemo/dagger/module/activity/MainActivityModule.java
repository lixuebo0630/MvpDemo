package com.lixuebo.mvpdemo.dagger.module.activity;

import com.lixuebo.mvpdemo.presenter.activity.MainActivityPresenter;
import com.lixuebo.mvpdemo.ui.activity.MainActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by lixuebo on 17/3/17.
 */

@Module
public class MainActivityModule {

    MainActivity activity;

    public MainActivityModule(MainActivity activity) {
        this.activity = activity;
    }

    @Provides
    MainActivityPresenter provideMainActivityPresenter() {
        return new MainActivityPresenter(activity);
    }
}
