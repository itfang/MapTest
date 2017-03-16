package com.example.maptest;


import android.app.Application;

import com.baidu.mapapi.SDKInitializer;

/**
 * 初始化 SDK引用的Context 全局变量
 * Created by BoBo on 2017/3/13.
 */

public class MyAppLication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        SDKInitializer.initialize(getApplicationContext());
    }
}
