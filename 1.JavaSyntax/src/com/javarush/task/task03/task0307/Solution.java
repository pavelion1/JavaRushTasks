package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Zerg zerg1 = new Zerg();
        zerg1.name = "zerg1";

        Zerg zerg2 = new Zerg();
        zerg2.name = "Natalia";
        Zerg zerg3 = new Zerg();
        zerg3.name = "Yuly";
        Zerg zerg4 = new Zerg();
        zerg4.name = "Marina";
        Zerg zerg5 = new Zerg();
        zerg5.name = "Katy";

        Protoss protoss1 = new Protoss();
        protoss1.name = "Yura";
        Protoss protoss2 = new Protoss();
        protoss2.name = "Stich";
        Protoss protoss3 = new Protoss();
        protoss3.name = "Koly";

        Terran terran1 = new Terran();
        terran1.name = "Vlad";
        Terran terran2 = new Terran();
        terran2.name = "Mischa";
        Terran terran3 = new Terran();
        terran3.name = "Kakaschka";
        Terran terran4 = new Terran();
        terran4.name = "Pasha";




    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
