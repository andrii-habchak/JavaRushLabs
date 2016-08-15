package com.javarush.test.level10.lesson11.home08;

import java.util.ArrayList;

/* Массив списков строк
Создать массив, элементами которого будут списки строк. Заполнить массив любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<String>[] arrayOfStringList =  createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList()
    {
        ArrayList<String> list = new ArrayList<>();
        list.add("пукт1");
        list.add("пукт2");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("пукт3");
        list2.add("пукт4");
        ArrayList<String>[] listStrings = new ArrayList[2];
        listStrings[0] = list;
        listStrings[1] = list2;
        return listStrings;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList)
    {
        for (ArrayList<String> list: arrayOfStringList)
        {
            for (String s : list)
            {
                System.out.println(s);
            }
        }
    }
}