package com.javarush.test.level14.lesson08.bonus03;

/**
 * Created by coura on 28.04.2016.
 */
class Singleton {
    private static Singleton singleton;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
