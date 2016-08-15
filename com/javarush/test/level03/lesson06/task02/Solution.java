package com.javarush.test.level03.lesson06.task02;

/* Таблица умножения
Выведи на экран таблицу умножения 10 на 10 в следующем виде:
1 2 3 …
2 4 6 …
3 6 9 …
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        Number(1);
        Number(2);
        Number(3);
        Number(4);
        Number(5);
        Number(6);
        Number(7);
        Number(8);
        Number(9);
        Number(10);
    }

    public static void Number (int c)
    {
        int one = c * 1;
        System.out.print(one + " ");
        int two = c * 2;
        System.out.print(two + " ");
        int three = c * 3;
        System.out.print(three + " ");
        int four = c * 4;
        System.out.print(four + " ");
        int five = c * 5;
        System.out.print(five + " ");
        int six = c * 6;
        System.out.print(six + " ");
        int seven = c * 7;
        System.out.print(seven + " ");
        int eight = c * 8;
        System.out.print(eight + " ");
        int nine = c * 9;
        System.out.print(nine + " ");
        int ten = c * 10;
        System.out.println(ten);

    }
}