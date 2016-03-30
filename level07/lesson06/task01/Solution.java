package com.javarush.test.level07.lesson06.task01;

import java.util.ArrayList;
import java.util.List;

/* 5 различных строчек в списке
1. Создай список строк.
2. Добавь в него 5 различных строчек.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        List<String> list = new ArrayList<>();

        list.add("String one");
        list.add("String two");
        list.add("String three");
        list.add("String four");
        list.add("String five");

        System.out.println(list.size());

        for (String s : list) {
            System.out.println(s);
        }

    }
}
