package com.javarush.test.level01.lesson04.task02.level00.lesson03.task02;

/* На дворе 31 век
Написать программу, выводящую на экран нынешний год. На дворе 31 век, если что.

Подсказка:
Возьмите текущий год и измените век на 31.
Вывести нужно число, состоящее из четырех цифр.
*/
public class Solution
{
    public static void main(String[] args)
    {
        int century = 100;
        int java_rush_year = 31 * century - 84;

        System.out.println(java_rush_year);
    }
}
