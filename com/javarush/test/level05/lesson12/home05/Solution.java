package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int summ = 0;
        Scanner numberType = new Scanner(System.in);

        while (true) {
            String sNumber = numberType.next();

            if (sNumber.equals("сумма")) {
                break;
            }

            int number = Integer.parseInt(sNumber);
            summ += number;
        }
        System.out.println(summ);
    }
}
