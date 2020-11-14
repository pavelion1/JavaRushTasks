package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

import javax.sound.midi.Soundbank;

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    private int compare(int x, int y){
        if (x > y)
            return 1;
        else
        if (x < y)
            return -1;
        return 0;
    }

    public boolean fight(Cat anotherCat) {

        int i = 0;
        int ageScore = compare(this.age, anotherCat.age);

        if (this.age > anotherCat.age)
            i++;
        else
            if (this.age < anotherCat.age)
                i--;
        if (this.weight > anotherCat.weight)
            i++;
        else
            if (this.weight < anotherCat.weight)
                i--;
        if (this.strength > anotherCat.strength)
            i++;
        else
            if (this.strength < anotherCat.strength)
                i--;

        boolean isWin = i > 0;

        return isWin;

    }

    public static void main(String[] args) {

        Cat cat1 = new Cat();
        cat1.age = 3; cat1.weight=3; cat1.strength = 10;
        Cat cat2 = new Cat();
        cat2.age = 3; cat2.weight=3; cat2.strength = 20;

       if (cat1.fight(cat2)){
           System.out.println("Кот1 ПОБЕДИЛ!");
       }
       else System.out.println("Кот1 ПРОИГРАЛ");
    }
}
