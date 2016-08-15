package com.javarush.test.level05.lesson09.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст – неизвестные. Кот - бездомный)
- вес, цвет, адрес ( чужой домашний кот)
Задача конструктора – сделать объект валидным. Например, если вес не известен, то нужно указать какой-нибудь средний вес.
Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    String nameCat; // null
    int weightCat;
    int ageCat;
    String colorCat;
    String addressCat; // null

    public Cat (String name) { //Имя
        this.nameCat = name;
        this.weightCat = 4;
        this.ageCat = 3;
//        this.colorCat = "Grey";
    }

    public Cat (String name, int weight, int age) { //Имя, вес, возраст
        this.nameCat = name;
        this.weightCat = weight;
        this.ageCat = age;
//        this.colorCat = "Grey";
    }

    public Cat (String name, int age) { //Имя, возраст (вес стандартный)
        this.nameCat = name;
        this.ageCat = age;
        this.weightCat = 4;
//        this.colorCat = "Grey";
    }

    public Cat (int weight, String color) { //вес, цвет, (имя, адрес и возраст – неизвестные. Кот - бездомный)
        this.weightCat = weight;
        this.colorCat = color;
        this.nameCat = null;
        this.addressCat = null;
        this.ageCat = 3;
    }

    public Cat (int weight, String color, String address) { //вес, цвет, адрес ( чужой домашний кот)
        this.weightCat = weight;
        this.colorCat = color;
        this.addressCat = address;
        this.weightCat = 4;
        this.ageCat = 3;
    }

}
