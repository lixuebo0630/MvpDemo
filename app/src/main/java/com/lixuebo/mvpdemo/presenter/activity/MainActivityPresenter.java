package com.lixuebo.mvpdemo.presenter.activity;

import com.lixuebo.mvpdemo.presenter.base.BasePresenter;
import com.lixuebo.mvpdemo.ui.activity.MainActivity;

/**
 * Created by lixuebo on 17/3/17.
 */

public class MainActivityPresenter extends BasePresenter{

    MainActivity activity;

    public MainActivityPresenter(MainActivity activity) {
        this.activity =activity;
    }
}
