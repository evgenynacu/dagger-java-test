package com.example.quadro.daggerjavatest;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class InjectorModule {
    @ContributesAndroidInjector
    public abstract MainActivity bindMainActivity();
}
