package com.example.quadro.daggerjavatest;

import dagger.Module;
import dagger.Provides;

import javax.inject.Named;

@Module
public class AppModule {
    @Provides
    @Named("test")
    public String provideString() {
        return "test";
    }
}
