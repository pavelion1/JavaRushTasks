package com.javarush.task.task05.task0520;

/* 
Создать класс прямоугольник (Rectangle)
*/


public class Rectangle {
    //напишите тут ваш код
    int top;
    int left;
    int width;
    int height;
    public Rectangle(int top, int left){
        this.top = top;
        this.left = left;
    }
    public Rectangle(int width, int top, int left){
        this.width = width;
        this.top = top;
        this.left = left;
    }
    public Rectangle(int top, int left,int height, int width){
        this.top = top;
        this.left = left;
        this.height = height;
        this.width = width;
    }
    public Rectangle(int height){
        this.height = height;
    }


    public static void main(String[] args) {

    }
}
