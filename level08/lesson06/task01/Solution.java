package com.javarush.test.level08.lesson06.task01;

import java.util.*;

/* Создать два списка LinkedList и ArrayList
Нужно создать два списка – LinkedList и ArrayList.
*/

public class Solution
{
    public static Object createArrayList()
    {
        List<Object> objectArrayList = new ArrayList<>();
        return objectArrayList;
    }

    public static Object createLinkedList()
    {
        List<Object> objectLinkedList = new LinkedList<>();
        return objectLinkedList;
    }

    public static void main(String[] args) {
        createArrayList();
        createLinkedList();
    }
}
