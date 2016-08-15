package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{

    public static HashMap<String, Date> createMap(){

        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("1Stallone", new Date("JUNE 1 1980"));
        map.put("2Stallone", new Date("JANUARY 1 1981"));
        map.put("3Stallone", new Date("FEBRUARY 1 1982"));
        map.put("4Stallone", new Date("MARCH 1 1983"));
        map.put("5Stallone", new Date("APRIL 1 1984"));
        map.put("6Stallone", new Date("MAY 1 1985"));
        map.put("7Stallone", new Date("JUNE 1 1986"));
        map.put("8Stallone", new Date("JULY 1 1987"));
        map.put("9Stallone", new Date("AUGUST 1 1988"));
        map.put("10Stallone", new Date("SEPTEMBER 1 1989"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map){

        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String, Date> pair = iterator.next();
            if ((pair.getValue().getMonth() > 4) && (pair.getValue().getMonth() < 8)){
                iterator.remove();
            }
        }
    }
}
