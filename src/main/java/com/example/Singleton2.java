package com.example;

import javax.inject.Singleton;

@Singleton
public class Singleton2 {
    public int get() {
        return getAnInt();
    }

    private int getAnInt() {
        return 3;
    }
}
