package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;


public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<Human> humanList = new ArrayList<>();

        ArrayList<Human> father = new ArrayList<>();
        ArrayList<Human> mother = new ArrayList<>();

        humanList.add(new Human("Дитя1", false, 10, new ArrayList<Human>()));
        humanList.add(new Human("Дитя2", true, 7, new ArrayList<Human>()));
        humanList.add(new Human("Дитя3", true, 3, new ArrayList<Human>()));

        father.add(new Human("Батя", true, 70, humanList));
        mother.add(new Human("Мать", false, 70, humanList));
        humanList.addAll(father);
        humanList.addAll(mother);

        humanList.add(new Human("Дед1", true, 80, father));
        humanList.add(new Human("Дед2", true, 75, mother));

        humanList.add(new Human("Бабка1", false, 78, father));
        humanList.add(new Human("Бабка2", false, 70, mother));


        for (Human human : humanList) {
            System.out.println(human);
        }
    }

    public static class Human
    {
        private String name;
        private boolean sex;
        private int age;
        private ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
