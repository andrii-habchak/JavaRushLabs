package com.javarush.test.level05.lesson07.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя инициализаторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    String nameDog;
    int growthDog;
    String colorDog;

    public void initialize (String name) {
        this.nameDog = name;
    }

    public void initialize (String name, int growth) {
        this.nameDog = name;
        this.growthDog = growth;
    }

    public void initialize (String name, int growth, String color) {
        this.nameDog = name;
        this.growthDog = growth;
        this.colorDog = color;
    }

}
