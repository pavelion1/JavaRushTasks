package com.javarush.task.task04.task0420;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Сортировка трех чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine()); // 8
        int b = Integer.parseInt(bufferedReader.readLine()); // 9
        int c = Integer.parseInt(bufferedReader.readLine()); // 10
        if (a > b) {
            if (b > c) {
                System.out.println(a + " " + b + " " + c);
            } else {
                if (a > c){
                    System.out.println(a + " " + c + " " + b);
                } else {
                    System.out.println(c + " " + a + " " + b);
                }
            }
        } else {
            if (a > c) {
                System.out.println(b + " " + a + " " + c);
            } else {
                if (b > c){
                    System.out.println(b + " " + c + " " + a);
                } else
                    System.out.println(c + " " + b + " " + a);
            }
        }

    }
}
