package com.javarush.test.level15.lesson12.home09;

/* Парсер реквестов
Считать с консоли URl ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк

Пример 1
Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
Вывод:
lvl view name

Пример 2
Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
Вывод:
obj name
double 3.14
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //add your code here

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url;
        try {
            url  = reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        ArrayList<String> objParameters = parsingParameter(url);
        parsingObjParameters(objParameters);

    }

    private static ArrayList<String> parsingParameter(String url) {
        int indexOfParameters = url.indexOf("?") + 1;
        String allParameters = url.substring(indexOfParameters);
        String [] parameters = allParameters.split("&");

        ArrayList<String> namesOfParameter = new ArrayList<>();
        ArrayList<String> objParameters = new ArrayList<>();

        for (String parameter : parameters) {
            if (parameter.contains("=")) {
                String [] parameterAndValue = parameter.split("="); // index 0 it's name of parameter and index 1 it's value
                namesOfParameter.add(parameterAndValue[0]);
                if (parameter.contains("obj")) {
                    objParameters.add(parameterAndValue[1]);
                }
            } else {
                namesOfParameter.add(parameter);
            }
        }
        printNameParameters(namesOfParameter);
        return objParameters;
    }

    private static void printNameParameters(ArrayList<String> namesOfParameter) {
        for (String name : namesOfParameter) {
            System.out.print(name + " ");
        }
        System.out.println("");
    }

    private static void parsingObjParameters(ArrayList<String> objParameters) {
        for (String objParameter : objParameters) {
            try {
                double valueOfParameter = Double.parseDouble(objParameter);
                alert(valueOfParameter);
            } catch (NumberFormatException e) {
                alert(objParameter);
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
