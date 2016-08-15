package com.javarush.test.level14.lesson08.bonus01;

import java.util.ArrayList;
import java.util.IllegalFormatCodePointException;
import java.util.List;

/* Нашествие эксепшенов
Заполни массив exceptions 10 различными эксепшенами.
Первое исключение уже реализовано в методе initExceptions.
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
            exceptions.add(new NullPointerException());
            exceptions.add(new IllegalArgumentException());
            exceptions.add(new NumberFormatException());
            exceptions.add(new IndexOutOfBoundsException());
            exceptions.add(new ClassCastException());
            exceptions.add(new ClassNotFoundException());
            exceptions.add(new CloneNotSupportedException());
            exceptions.add(new NullPointerException());
            exceptions.add(new IllegalFormatCodePointException(3));
        }
    }
}
