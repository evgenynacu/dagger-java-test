package com.example.quadro.daggerjavatest;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;

public class MyApp extends DaggerApplication {

    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerAppComponent.builder().create(this);
    }
}