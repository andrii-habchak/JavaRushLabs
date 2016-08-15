package com.javarush.test.level13.lesson11.bonus02;

/*
* В классе Person реализовать метод pull(Person person), который выводит фразу типа '<name> за <person>'. Пример:
 Бабка за Дедку
 Дедка за Репку
 */

public class Person implements RepkaItem {
    private String name;
    private String namePadezh;

    public Person(String name, String namePadezh) {
        this.name = name;
        this.namePadezh = namePadezh;
    }

    static void pull(Person firstPerson, Person secondPerson) {
        System.out.println(firstPerson.getName() + " за " + secondPerson.getNamePadezh());
    }

    @Override
    public String getNamePadezh() {
        return this.namePadezh;
    }

    public String getName() {
        return name;
    }
}
