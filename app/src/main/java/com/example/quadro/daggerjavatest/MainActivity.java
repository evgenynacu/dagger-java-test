package com.example.quadro.daggerjavatest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import dagger.android.AndroidInjection;

import javax.inject.Inject;
import javax.inject.Named;

public class MainActivity extends AppCompatActivity {

    @Inject @Named("test")
    String str1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AndroidInjection.inject(this);
    }
}
