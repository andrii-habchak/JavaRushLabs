package com.javarush.test.level08.lesson08.task01;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution
{
    public static HashSet<String> createSet()
    {
        Set<String> strings = new HashSet<>();


        strings.add("Леонид");
        strings.add("Лагуна");
        strings.add("Леоньтев");
        strings.add("Лавры");
        strings.add("Лазарет");
        strings.add("Лазарь");
        strings.add("Лодка");
        strings.add("Лекарь");
        strings.add("Литр");
        strings.add("Лувр");
        strings.add("Лото");
        strings.add("Лабирит");
        strings.add("Лаборант");
        strings.add("Лаборатория");
        strings.add("Лаваш");
        strings.add("Лазер");
        strings.add("Лазейка");
        strings.add("Лада");
        strings.add("Лазеть");
        strings.add("Лазурит");


        return (HashSet<String>) strings;
    }
}
