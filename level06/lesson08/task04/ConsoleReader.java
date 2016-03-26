package com.javarush.test.level06.lesson08.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* Класс ConsoleReader
Сделать класс ConsoleReader, у которого будут 4 статических метода:
String readString() – читает с клавиатуры строку
int readInt() – читает с клавиатуры число
double readDouble() – читает с клавиатуры дробное число
boolean readBoolean() – читает с клавиатуры строку "true" или "false" и возвращает соответствующую логическую переменную true или false
Внимание: создавайте переменную для чтения данных с консоли (BufferedReader или Scanner) внутри каждого метода
*/

public class ConsoleReader
{
    public static String readString() throws Exception
    {
        Scanner stringScanner = new Scanner(System.in);
        String string = stringScanner.next();
        return string;
    }

    public static int readInt() throws Exception
    {
        Scanner intScanner = new Scanner(System.in);
        int integer = intScanner.nextInt();
        return integer;

    }

    public static double readDouble() throws Exception
    {
        Scanner doubleScanner = new Scanner(System.in);
        double doubleNumber = doubleScanner.nextDouble();
        return doubleNumber;

    }

    public static boolean readBoolean() throws Exception
    {
        Scanner scanner = new Scanner(System.in);
        String bool = scanner.next();

        if (bool.equals("true")) {
            return true;
        } else {
            return false;
        }
    }
}
