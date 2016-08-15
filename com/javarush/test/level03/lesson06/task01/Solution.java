package com.javarush.test.level03.lesson06.task01;

/* Мама мыла раму
Вывести на экран все возможные комбинации слов «Мама», «Мыла», «Раму».
Подсказка: их 6 штук. Каждую комбинацию вывести с новой строки. Слова не разделять. Пример:
МылаРамуМама
РамуМамаМыла
...
*/

public class Solution
{
    public static void main(String[] args)
    {
        String mila = "Мыла";
        String ramu = "Раму";
        String mama = "Мама";

        System.out.println(mama + mila + ramu); //МамаМылаРаму 123
        System.out.println(mila + ramu + mama); //МылаРамуМама 231
        System.out.println(ramu + mila + mama); //РамуМылаМама 321
        System.out.println(mila + mama + ramu); //МылаМамаРаму 213
        System.out.println(mama + ramu + mila); //МамаРамуМыла 132
        System.out.println(ramu + mama + mila); //РамуМамаМыла 312
        //напишите тут ваш код

    }
}