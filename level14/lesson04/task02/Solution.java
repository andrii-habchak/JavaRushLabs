package com.javarush.test.level14.lesson04.task02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* Коты
1. Считывать строки(параметры) с консоли, пока пользователь не введет пустую строку(Enter).
2. Каждый параметр соответствует имени кота.
Для каждого параметра:
3. Создать объект cat класса Cat, который равен коту из getCatByKey(String параметр).
4. Вывести на экран cat.toString().
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //Add your code here
        Solution solution = new Solution();
        ArrayList<String> cats = solution.enterCatsName();
        ArrayList<Cat> newCats = solution.catsIntoCatFactory(cats);
        solution.printCats(newCats);
    }

    void printCats(ArrayList<Cat> cats) {
        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }

    ArrayList<Cat> catsIntoCatFactory(ArrayList<String> cats) {
        ArrayList<Cat> catsObj = new ArrayList<>();
        for (String cat : cats) {
            catsObj.add(CatFactory.getCatByKey(cat));
        }
        return catsObj;
    }

    ArrayList<String> enterCatsName() {
        ArrayList<String> cats = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String input = null;
            try {
                input = reader.readLine();
                if (input.isEmpty()) break;
                cats.add(input);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return cats;
    }

    static class CatFactory {

        static Cat getCatByKey(String key) {
            Cat cat = null;
            if ("vaska".equals(key)) {
                cat = new MaleCat("Василий");
            } else if ("murka".equals(key)) {
                cat = new FemaleCat("Мурочка");
            } else if ("kiska".equals(key)) {
                cat = new FemaleCat("Кисюлька");
            } else {
                cat = new Cat(key);
            }

            return cat;
        }
    }

    static class Cat {
        private String name;

        protected Cat(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public String toString() {
            return "Я уличный кот " + getName();
        }
    }

    static class MaleCat extends Cat {
        MaleCat(String name) {
            super(name);
        }

        public String toString() {
            return "Я - солидный кошак по имени " + getName();
        }
    }

    static class FemaleCat extends Cat {
        FemaleCat(String name) {
            super(name);
        }

        public String toString() {
            return "Я - милая кошечка по имени " + getName();
        }
    }
}
