package com.javarush.test.level14.lesson06.home01;

/**
 * Created by coura on 26.04.2016.
 */

class UkrainianHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 14;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.UKRAINE +
                ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
