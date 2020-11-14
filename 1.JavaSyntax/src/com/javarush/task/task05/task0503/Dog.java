package com.javarush.task.task05.task0503;


/* 
Геттеры и сеттеры для класса Dog
*/

public class Dog {
    private String name;
    private int age;

    public String getName(){
        return this.name;
    }

    public int getAge(){
      return this.age;
    }

    public void setName(String name /* = "pashka*/){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }


    public static void main(String[] args) {

        Dog dog = new Dog();
        System.out.println(dog.getName());

        String name = "pashka";
        dog.setName(name /* = "pashka*/ );
    }
}
