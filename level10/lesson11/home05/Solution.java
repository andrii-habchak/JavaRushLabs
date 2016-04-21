package com.javarush.test.level10.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* Количество букв
Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв (для 33 букв алфавита).
Вывести результат на экран.

Пример вывода:
а 5
б 8
в 3
г 7
д 0
…
я 9
*/

public class Solution
{
    public static void main(String[] args)  throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++)
        {
            alphabet.add(abcArray[i]);
        }

        //ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++)
        {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        //напишите тут ваш код
        HashMap<Character, Integer> alphabetMap = new HashMap<Character, Integer>();
        for (Character listItem : alphabet) {
            alphabetMap.put(listItem, 0);
        }

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).length(); j++) {
                char symbol = list.get(i).charAt(j);
                int count = alphabetMap.get(symbol);
                count++;
                alphabetMap.put(symbol, count);
            }
        }

        for (Map.Entry<Character, Integer> iterator : alphabetMap.entrySet()) {
            if (iterator.getValue() > 0) System.out.println(iterator.getKey() + " " + iterator.getValue());
        }
    }

}
