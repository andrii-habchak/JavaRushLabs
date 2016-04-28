package com.javarush.test.level14.lesson08.home09;

/**
 * Created by coura on 28.04.2016.
 */
class Hrivna extends Money {
    public Hrivna(double amount) {
        super(amount);
    }

    @Override
    public String getCurrencyName() {
        return "HRN";
    }
}
