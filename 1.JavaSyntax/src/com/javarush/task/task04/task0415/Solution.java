package com.javarush.task.task04.task0415;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Правило треугольника
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());

        if (a < b + c) {
            if (b < a + c) {
                if (c < b + a) {
                    System.out.println("Треугольник существует.");
                } else {
                    System.out.println("Треугольник не существует.");
                }
            } else {
                System.out.println("Треугольник не существует.");
            }
        } else {
            System.out.println("Треугольник не существует.");
        }
    }
}
