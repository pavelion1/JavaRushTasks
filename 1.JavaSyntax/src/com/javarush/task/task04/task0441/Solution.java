package com.javarush.task.task04.task0441;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Как-то средненько
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());
        if (a > b) {
            if (b > c) {
                System.out.println(b);
            } else {
                if (a > c) {
                    System.out.println(c);
                } else {
                    System.out.println(a);
                }
            }
        } else {
            if (a > c) {
                System.out.println(a);
            } else {
                if (b > c) {
                    System.out.println(c);
                } else
                    System.out.println(b);

            }

        }
    }
}