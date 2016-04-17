package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел.
Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно.
Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> intsArrayList = new ArrayList<>();
        int[] array5 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2};
        int[] array4 = {1, 2, 3, 4};
        int[] array7 = {1, 2, 3, 4, 5, 6, 7};
        int[] array0 = {};

        intsArrayList.add(array5);
        intsArrayList.add(array2);
        intsArrayList.add(array4);
        intsArrayList.add(array7);
        intsArrayList.add(array0);

        return intsArrayList;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
