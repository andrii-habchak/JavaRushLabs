package com.javarush.test.level04.lesson13.task03;

import java.io.*;

/* Рисуем треугольник
Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
Пример:
8
88
888
...
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        // Решение с использованием двух циклов через число
        for (int n = 1; n <= 10; n++) {
            for (int m = n; m > 0; m--){
                System.out.print(8);
            }
            System.out.println();
        }

        // Решение с использованием двух циклов через строку
//        for (int n = 1; n <= 10; n++) {
//            for (int m = n; m > 0; m--){
//                String row8 = "8";
//                System.out.print(row8);
//                row8 = row8 + 8;
//            }
//            System.out.println();
//        }

    }
}
