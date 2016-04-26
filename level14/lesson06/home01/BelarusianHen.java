package com.javarush.test.level14.lesson06.home01;

/**
 * Created by coura on 26.04.2016.
 */

class BelarusianHen extends Hen {

    @Override
    public int getCountOfEggsPerMonth() {
        return 12;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.BELARUS +
                ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
