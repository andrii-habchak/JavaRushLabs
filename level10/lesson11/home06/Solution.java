package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {

    }

    public static class Human {
        private String name;
        private int age;
        private int height;
        private int weight;
        private Human parent;
        private ArrayList<String> childrenList;

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Human(String name, int age, int height, int weight, Human parent, ArrayList<String> childrenList) {
            this.name = name;
            this.age = age;
            this.height = height;
            this.weight = weight;
            this.parent = parent;
            this.childrenList = childrenList;
        }

        public Human(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        public Human(String name, int age, int height, int weight) {
            this.name = name;
            this.age = age;
            this.height = height;
            this.weight = weight;
        }

        public Human(String name, int age, int height, int weight, Human parent) {
            this.name = name;
            this.age = age;
            this.height = height;
            this.weight = weight;
            this.parent = parent;
        }

        public Human(String name, int age, int height, int weight, ArrayList<String> childrenList) {
            this.name = name;
            this.age = age;
            this.height = height;
            this.weight = weight;
            this.childrenList = childrenList;
        }

        public Human(String name, int age, Human parent, ArrayList<String> childrenList) {
            this.name = name;
            this.age = age;
            this.parent = parent;
            this.childrenList = childrenList;
        }

        public Human(String name, int weight, ArrayList<String> childrenList) {
            this.name = name;
            this.weight = weight;
            this.childrenList = childrenList;
        }

        public Human(Human parent, ArrayList<String> childrenList) {
            this.parent = parent;
            this.childrenList = childrenList;
        }

        public Human(ArrayList<String> childrenList) {
            this.childrenList = childrenList;
        }
    }
}
