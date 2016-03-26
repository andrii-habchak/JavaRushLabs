package com.javarush.test.level04.lesson06.task07;

/* Три числа
Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой.
Вывести на экран порядковый номер числа, отличного от остальных.
Пример для чисел 4 6 6:
1
Пример для чисел 6 6 3:
3
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNumber1 = reader.readLine();
        String sNumber2 = reader.readLine();
        String sNumber3 = reader.readLine();

        int number1 = Integer.parseInt(sNumber1);
        int number2 = Integer.parseInt(sNumber2);
        int number3 = Integer.parseInt(sNumber3);

        if (number1 == number2) {
            System.out.println(3);
        } else if (number2 == number3) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }

    }
}
