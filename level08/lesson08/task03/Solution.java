package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static void main(String[] args) {
        HashMap<String, String> map = createMap();

        System.out.println(map.size());
        System.out.println("FirstName count " + getCountTheSameFirstName(map, "FirstName0"));
        System.out.println("LastName count " + getCountTheSameLastName(map, "LastName0"));
    }

    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> hashMap = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            hashMap.put("FirstName" + i, "LastName" + i);
        }
        return hashMap;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int count = 0;
        for (String s : map.values()) {
            if (s.equals(name)) count++;
        }
        return count;

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        int count = 0;
        for (String s : map.keySet()) {
            if (s.equals(lastName)) count++;
        }
        return count;
    }
}
