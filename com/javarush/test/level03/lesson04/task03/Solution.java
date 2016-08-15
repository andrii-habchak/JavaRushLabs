package com.javarush.test.level03.lesson04.task03;

/* StarCraft
Создать 10 зергов, 5 протосов и 12 терран.
Дать им всем уникальные имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Zerg Zeroga = new Zerg();
        Zeroga.name = "Zeroga";

        Zerg Zeus = new Zerg();
        Zeus.name = "Zeus";

        Zerg Zema = new Zerg();
        Zema.name = "Zema";

        Zerg Sasha = new Zerg();
        Sasha.name = "Sasha";

        Zerg Lost = new Zerg();
        Lost.name = "Lost";

        Zerg Vasja = new Zerg();
        Vasja.name = "Vasja";

        Zerg Nikita = new Zerg();
        Nikita.name = "Nikita";

        Zerg Abram = new Zerg();
        Abram.name = "Abram";

        Zerg Sarachka = new Zerg();
        Sarachka.name = "Sarachka";

        Zerg Izja = new Zerg();
        Izja.name = "Izja";



        Protos Turok = new Protos();
        Turok.name = "Turok";

        Protos Tupac = new Protos();
        Tupac.name = "Tupac";

        Protos Taras = new Protos();
        Taras.name = "Taras";

        Protos Tambov = new Protos();
        Tambov.name = "Tambov";

        Protos Valjanok = new Protos();
        Valjanok.name = "Valjanok";


        Terran Terranozavr = new Terran();
        Terranozavr.name = "Terranozavr";

        Terran Terra = new Terran();
        Terra.name = "Terra";

        Terran T800 = new Terran();
        T800.name = "T800";

        Terran T1000 = new Terran();
        T1000.name = "T1000";

        Terran Lucius = new Terran();
        Lucius.name = "Lucius";

        Terran Spartacus = new Terran();
        Spartacus.name = "Spartacus";

        Terran Jora_Kornev = new Terran();
        Jora_Kornev.name = "Jora_Kornev";

        Terran Lusja = new Terran();
        Lusja.name = "Lusja";

        Terran Jod = new Terran();
        Jod.name = "Jod";

        Terran God = new Terran();
        God.name = "God";

        Terran Mok = new Terran();
        Mok.name = "Mok";

        Terran Hujak = new Terran();
        Hujak.name = "Hujak";

    }

    public static class Zerg
    {
        public String name;
    }

    public static class Protos
    {
        public String name;
    }

    public static class Terran
    {
        public String name;
    }
}