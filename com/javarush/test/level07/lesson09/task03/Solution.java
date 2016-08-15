package com.javarush.test.level07.lesson09.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* Слово «именно»
1. Создай список из слов «мама», «мыла», «раму».
2. После каждого слова вставь в список строку, содержащую слово «именно».
3. Используя цикл for вывести результат на экран, каждый элемент списка с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> listWords = new ArrayList<>();

        listWords.add("мама");
        listWords.add("мыла");
        listWords.add("раму");

        for (int i = 1; i <= listWords.size(); i += 2) {
            listWords.add(i, "именно");
        }

        for (String i : listWords) {
            System.out.println(i);
        }
    }
}
