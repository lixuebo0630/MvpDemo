package com.lixuebo.mvpdemo.dagger.component.activity;

import com.lixuebo.mvpdemo.dagger.module.activity.MainActivityModule;
import com.lixuebo.mvpdemo.ui.activity.MainActivity;

import dagger.Component;

/**
 * Created by lixuebo on 17/3/18.
 * 建立Activity与Module之间的关系
 */
@Component(modules = MainActivityModule.class)
public interface MainActivityComponent {

    void in(MainActivity activity);
}
