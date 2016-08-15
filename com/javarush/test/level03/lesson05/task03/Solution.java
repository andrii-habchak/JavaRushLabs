package com.javarush.test.level03.lesson05.task03;

/* Конвертер времени
Добавьте метод public static int convertToSeconds(int hour) который будет конвертировать часы в секунды.
Вызовите его дважды в методе main с любыми параметрами. Результаты выведите на экран, каждый раз с новой строки.
*/

public class Solution
{
    public static int convertToSeconds(int hour)
    {
        int second = hour * 3600;
        System.out.println(second);
        return second;
    }

    public static void main(String[] args) {
        convertToSeconds(2);
        convertToSeconds(5);
        //напишите тут ваш код
    }
}