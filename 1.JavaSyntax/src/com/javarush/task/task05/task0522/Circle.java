package com.javarush.task.task05.task0522;

/* 
Максимум конструкторов
*/

public class Circle {
    public double x;
    public double y;
    public double radius;

    //напишите тут ваш код
    public Circle(){

    }

    public Circle(double x){
        this.x = x;
    }
    public Circle(double y, double x){
        this.y = y;
        this.x = x;
    }
    public Circle(double radius, double y, double x){
        this.radius = radius;
        this.y = y;
        this.x = x;
    }


    public static void main(String[] args) {

    }
}