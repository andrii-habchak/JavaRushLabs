package com.javarush.test.level04.lesson04.task10;

/* Три числа
Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел. Если все три числа равны между собой, то вывести все три.
Пример для чисел 1 2 2:
2 2
Пример для чисел 2 2 2:
2 2 2
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String snumber = reader.readLine();
        String snumber2 = reader.readLine();
        String snumber3 = reader.readLine();

        int number = Integer.parseInt(snumber);
        int number2 = Integer.parseInt(snumber2);
        int number3 = Integer.parseInt(snumber3);

        if (number == number2) {
            if (number == number3) {
                System.out.println(number + " " + number2 + " " + number3);
            } else {
                System.out.println(number + " " + number2);
            }
        } else {
            if (number == number3) {
                if (number == number2) {
                    System.out.println(number + " " + number2 + " " + number3);
                } else {
                    System.out.println(number + " " + number3);
                }
            } else if (number2 == number3) {
                System.out.println(number2 + " " + number3);
            }
        }
    }
}