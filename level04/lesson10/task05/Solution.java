package com.javarush.test.level04.lesson10.task05;

<<<<<<< HEAD
=======
import java.io.*;

>>>>>>> 2fb5e8213875d54d9aa85a522823c454221381d4
/* Таблица умножения
Вывести на экран таблицу умножения 10х10 используя цикл while.
Числа разделить пробелом.
1 2 3 4 5 6 7 8 9 10
2 4 6 8 10 12 14 16 18 20
...
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int multiplier = 1;

        while (multiplier <= 10) {
            System.out.println(1 * multiplier + " " +
                    2 * multiplier + " " + 3 * multiplier + " " +
                    4 * multiplier + " " + 5 * multiplier + " " +
                    6 * multiplier + " " + 7 * multiplier + " " +
                    8 * multiplier + " " + 9 * multiplier + " " +
                    10 * multiplier);
            multiplier++;
        }

    }
}
