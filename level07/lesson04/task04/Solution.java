package com.javarush.test.level07.lesson04.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] intArray = new int[10];

        Scanner ints = new Scanner(System.in);

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = ints.nextInt();
        }

        int[] sortedArray = new int[10];

        for (int i = 0; i < sortedArray.length; i++) {
            sortedArray[i] = intArray[intArray.length - i - 1];
        }

        for (int i : sortedArray) {
            System.out.println(i);
        }

    }
}
