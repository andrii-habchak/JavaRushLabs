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
    public static void main(String[] args) throws IOException {
        //add your code here
        ArrayList<String> parametersList = new ArrayList<>();
        ArrayList<String> alertList = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();

        parsing(parametersList, alertList, url);

        printParameters(parametersList);

        whichAlert(alertList);

    }

    private static void parsing(ArrayList<String> parametersList, ArrayList<String> alertList, String url) {
        int indexOfParameters = url.indexOf("?") + 1;
        String allParameters = url.substring(indexOfParameters);
        String[] parametersArray = allParameters.split("&");

        for (String parameter : parametersArray) {
            if (parameter.contains("=")) {
                String[] parameterAndValue = parameter.split("=");
                parametersList.add(parameterAndValue[0]);
                if (parameterAndValue[0].equals("obj")) {
                    alertList.add(parameterAndValue[1]);
                }
            } else {
                parametersList.add(parameter);
            }
        }
    }

    private static void whichAlert(ArrayList<String> alertList) {
        for (String alertOne : alertList) {
            try {
                double alertDouble = Double.parseDouble(alertOne);
                alert(alertDouble);
            } catch (NumberFormatException e) {
                alert(alertOne);
            }
        }
    }

    private static void printParameters(ArrayList<String> parametersList) {
        int lastElemets = parametersList.size() - 1;
        for (int i = 0; i < lastElemets; i++) {
            System.out.print(parametersList.get(i) + " ");
        }
        System.out.println(parametersList.get(lastElemets));
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
