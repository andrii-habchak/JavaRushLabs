package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String snumber1 = reader.readLine();
        String snumber2 = reader.readLine();

        int number1 = Integer.parseInt(snumber1);
        int number2 = Integer.parseInt(snumber2);

        if (number1 < number2) {
            System.out.println(number1);
        } else {
            System.out.println(number2);
        }
    }
}