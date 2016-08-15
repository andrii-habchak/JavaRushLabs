package com.javarush.test.level07.lesson09.task01;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Три массива
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<Integer> integers = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 20; i++) {
            integers.add(i, scanner.nextInt());
        }

        ArrayList<Integer> multipleThree = new ArrayList<>();
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> otherNumbers = new ArrayList<>();

        for (int i = 0; i < integers.size(); i++) {
            if ((integers.get(i) % 3 == 0) && (integers.get(i) % 2 == 0)) {
                multipleThree.add(integers.get(i));
                evenNumbers.add(integers.get(i));
            }
            else if (integers.get(i) % 3 == 0)
                multipleThree.add(integers.get(i));
            else if (integers.get(i) % 2 == 0)
                evenNumbers.add(integers.get(i));
            else otherNumbers.add(integers.get(i));
        }

        printList(multipleThree);
        printList(evenNumbers);
        printList(otherNumbers);
    }

    public static void printList(List<Integer> list)
    {

        for (Integer i : list) {
            System.out.println(i);
        }
    }
}
