package com.javarush.test.level14.lesson08.home03;

public class Person {
    public static class User extends Person {
        void live() {
            System.out.println("Usually I just live");
        }
    }

    public static class Looser extends Person {
        void doNothing() {
            System.out.println("Usually I do nothing");
        }
    }

    public static class Coder extends Person {
        void coding() {
            System.out.println("Usually I create code");
        }
    }

    public static class Proger extends Person {
        void enjoy() {
            System.out.println("Wonderful life!");
        }
    }

}
