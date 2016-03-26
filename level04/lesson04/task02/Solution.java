package com.javarush.test.level04.lesson04.task02;

/* Ближайшее к 10
Реализовать метод closeToTen. Метод должен выводить на экран ближайшее к 10 из двух чисел, записанных в аргументах метода.
Например, среди чисел 8 и 11 ближайшее к десяти 11. Если оба числа на равной длине к 10, то вывести на экран любое из них.
Подсказка:  используйте метод public static int abs(int a), который возвращает абсолютную величину числа.
*/

<<<<<<< HEAD
=======
import com.sun.org.apache.xpath.internal.SourceTree;

>>>>>>> 2fb5e8213875d54d9aa85a522823c454221381d4
public class Solution
{
    public static void main(String[] args)
    {
        closeToTen(8,11);
        closeToTen(14,7);
    }

    public static void closeToTen(int a, int b)
    {
        int c = 10 - a;
        c = abs(c);
        int d = 10 - b;
        d = abs(d);

        if (c > d)
            System.out.println(b);
        if (c < d)
            System.out.println(a);
        if (c == d)
            System.out.println(a);
        //::CODE:

    }

    public static int abs(int a)
    {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}