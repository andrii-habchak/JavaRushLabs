package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.next();

        Map<String, Integer> monthsMap = new HashMap<>();
        monthsMap.put("January", 1);
        monthsMap.put("February", 2);
        monthsMap.put("March", 3);
        monthsMap.put("April", 4);
        monthsMap.put("May", 5);
        monthsMap.put("June", 6);
        monthsMap.put("July", 7);
        monthsMap.put("August", 8);
        monthsMap.put("September", 9);
        monthsMap.put("October", 10);
        monthsMap.put("November", 11);
        monthsMap.put("December", 12);

        for (Map.Entry<String, Integer> map : monthsMap.entrySet()) {
            if (month.equals(map.getKey())) System.out.println(map.getKey() + " is " + map.getValue() + " month");
        }

    }

}
