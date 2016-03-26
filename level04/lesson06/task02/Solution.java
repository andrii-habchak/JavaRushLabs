package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
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
        String snumber4 = reader.readLine();

        int number1 = Integer.parseInt(snumber1);
        int number2 = Integer.parseInt(snumber2);
        int number3 = Integer.parseInt(snumber3);
        int number4 = Integer.parseInt(snumber4);

        int max1;
        max1 = maximum(number1, number2);
        int max2;
        max2 = maximum(number3, number4);
        int max3;
        max3 = maximum(max1, max2);

        System.out.println(max3);

    }

    public static int maximum(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
