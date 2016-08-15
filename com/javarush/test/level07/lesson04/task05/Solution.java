package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] bigArray = new int[20];

        Scanner intScanner = new Scanner(System.in);

        for (int i = 0; i < bigArray.length; i++) {
            bigArray[i] = intScanner.nextInt();
        }

        int[] intsArray1 = new int[10];
        int[] intsArray2 = new int[10];

        System.arraycopy(bigArray, 0, intsArray1, 0, bigArray.length - intsArray1.length);
        System.arraycopy(bigArray, bigArray.length - intsArray2.length, intsArray2, 0,
                bigArray.length - intsArray2.length);

        for (int i : intsArray2) {
            System.out.println(i);
        }

    }
}
