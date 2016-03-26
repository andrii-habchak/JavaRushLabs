package com.javarush.test.level04.lesson13.task04;

<<<<<<< HEAD
=======
import java.io.*;

>>>>>>> 2fb5e8213875d54d9aa85a522823c454221381d4
/* Рисуем линии
Используя цикл for вывести на экран:
- горизонтальную линию из 10 восьмёрок
- вертикальную линию из 10 восьмёрок.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        for (int row = 1; row <= 10; row++) {
            System.out.print(8);
        }

        System.out.println();

        for (int column = 1; column <= 10; column++) {
            System.out.println(8);
        }

    }
}
