package com.javarush.task.task04.task0434;

/* 
Таблица умножения Ӏ Java Syntax: 4 уровень, 10 лекция
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int a = 0;
        while(a < 10){
            a++;
            int p = 0;
            while (p <  10){
                p++;
                System.out.print(a * p + " ");
            }
            System.out.println();
        }

    }
}
