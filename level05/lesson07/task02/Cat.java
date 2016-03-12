package com.javarush.test.level05.lesson07.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным. Например, если вес неизвестен, то нужно указать какой-нибудь средний вес.
Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat {

    String nameCat;
    int weightCat;
    int ageCat;
    String colorCat;
    String addressCat;

    public void initialize (String name) {
        this.nameCat = name;
        this.weightCat = 4;
        this.ageCat = 3;
    }

    public void initialize (String name, int weight, int age) {
        this.nameCat = name;
        this.weightCat = weight;
        this.ageCat = age;
    }

    public void initialize (String name, int age) {
        this.nameCat = name;
        this.ageCat = age;
        this.weightCat = 4;
    }

    public void initialize (int weight, String color) {
        this.weightCat = weight;
        this.colorCat = color;
        this.nameCat = null;
        this.addressCat = null;
        this.ageCat = 3;
    }

    public void initialize (int weight, String color, String address) {
        this.weightCat = weight;
        this.colorCat = color;
        this.addressCat = address;
        this.weightCat = 4;
        this.ageCat = 3;
    }

}
