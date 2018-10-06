package com.example.quadro.daggerjavatest;

import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

import javax.inject.Singleton;

@Singleton
@Component(modules = {
    AndroidSupportInjectionModule.class,
    AppModule.class,
    InjectorModule.class
})
public interface AppComponent extends AndroidInjector<MyApp> {

    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<MyApp> {

    }
}
