package com.lixuebo.mvpdemo.ui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.lixuebo.mvpdemo.R;
import com.lixuebo.mvpdemo.dagger.component.activity.DaggerMainActivityComponent;
import com.lixuebo.mvpdemo.dagger.component.activity.MainActivityComponent;
import com.lixuebo.mvpdemo.dagger.module.activity.MainActivityModule;
import com.lixuebo.mvpdemo.presenter.activity.MainActivityPresenter;

import javax.inject.Inject;


public class MainActivity extends AppCompatActivity {

    @Inject
    MainActivityPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainActivityComponent component = DaggerMainActivityComponent.builder().
                mainActivityModule(new MainActivityModule(this))
                .build();

        component.in(this);

        presenter.toString();
    }
}
