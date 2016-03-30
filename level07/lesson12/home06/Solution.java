package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human).
Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human granddad1 = new Human("Дед1, Сталина на вас нет!", true, 21, null, null);
        Human granddad2 = new Human("Дед2, Овощь", true, 21, null, null);
        Human grandma1 = new Human("Бабушка1, я в твои годы!", false, 21, null, null);
        Human grandma2 = new Human("Бабушка2, При мне такого не было!", false, 21, null, null);
        Human mom = new Human("Маман", false, 21, granddad1, grandma1);
        Human dad = new Human("Батя, ёпт", true, 21, granddad2, grandma2);
        Human chield1 = new Human("Спиногрыз", true, 15, dad, mom);
        Human chield2 = new Human("Оболтус", true, 10, dad, mom);
        Human chield3 = new Human("Киндер", true, 6, dad, mom);

        System.out.println(granddad1);
        System.out.println(granddad2);
        System.out.println(grandma1);
        System.out.println(grandma2);
        System.out.println(mom);
        System.out.println(dad);
        System.out.println(chield1);
        System.out.println(chield2);
        System.out.println(chield3);
    }

    public static class Human
    {
        public String name;
        public boolean sex;
        public int age;
        public Human father;
        public Human mother;

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
