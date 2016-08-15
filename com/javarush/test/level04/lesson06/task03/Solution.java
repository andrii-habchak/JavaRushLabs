package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String snumber1 = reader.readLine();
        String snumber2 = reader.readLine();
        String snumber3 = reader.readLine();

        int number1 = Integer.parseInt(snumber1);
        int number2 = Integer.parseInt(snumber2);
        int number3 = Integer.parseInt(snumber3);

        System.out.println(maximum(number1, number2, number3) + " " + middle(number1, number2, number3) + " " + minimum(number1, number2, number3));
    }
    public static int maximum (int a, int b, int c) {

        if ((a >= b) && (a >= c)) {
            return a;
        } else if ((b >= a) && (b >= c)) {
            return b;
        } else {
            return c;
        }
    }

    public static int minimum (int a, int b, int c) {

        if ((a <= b) && (a <= c)) {
            return a;
        } else if ((b <= a) && (b <= c)) {
            return b;
        } else {
            return c;
        }
    }

    public static int middle (int a, int b, int c){
        if ((maximum(a, b, c) == a) && (minimum(a, b, c) == b) || (maximum(a, b, c) == b) && (minimum(a, b, c) == a)) {
            return c;
        } else if ((maximum(a, b, c) == c) && (minimum(a, b, c) == b) || (maximum(a, b, c) == b) && (minimum(a, b, c) == c)) {
            return a;
        } else {
            return b;
        }

    }
}
