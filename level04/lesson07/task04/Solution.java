package com.javarush.test.level04.lesson07.task04;

/* Положительные и отрицательные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе,
в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б", где а, б - искомые значения.
Пример для чисел 2 5 6:
количество отрицательных чисел: 0
количество положительных чисел: 3
Пример для чисел -2 -5 6:
количество отрицательных чисел: 2
количество положительных чисел: 1
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

        int countPositive = 0;
        int countNegative = 0;

        // подсчет позитивных числе
        if (number1 > 0) {
            countPositive++;
        }
        if (number2 > 0) {
            countPositive++;
        }
        if (number3 > 0) {
            countPositive++;
        }

        // подсчет негативных чисел
        if (number1 < 0) {
            countNegative++;
        }
        if (number2 < 0) {
            countNegative++;
        }
        if (number3 < 0) {
            countNegative++;
        }

        System.out.println("количество отрицательных чисел: "+ countNegative);
        System.out.println("количество положительных чисел: " + countPositive);
    }
}
