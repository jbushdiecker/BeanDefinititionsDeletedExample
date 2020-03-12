package com.example;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class Singleton1 {

    private Singleton2 singleton2;

    @Inject
    public Singleton1(Singleton2 singleton2) {
        this.singleton2 = singleton2;
    }

    public Integer get() {
        return singleton2.get();
    }
}
