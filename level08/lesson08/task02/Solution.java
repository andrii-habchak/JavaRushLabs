package com.javarush.test.level08.lesson08.task02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution
{

    public static void main(String[] args) {

        HashSet<Integer> integers = new HashSet<>();

        integers = removeAllNumbersMoreThan10(createSet());

        for (Integer i : integers) {
            System.out.println(i);
        }

    }
    public static HashSet<Integer> createSet()
    {
        HashSet<Integer> integers = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            integers.add(i);
        }
        return integers;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {
        Iterator<Integer> iterator = set.iterator();

        while (iterator.hasNext()){
            int temp = iterator.next();
            if (temp > 10) iterator.remove();
        }
        return set;
    }
}
