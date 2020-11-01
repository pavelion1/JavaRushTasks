package com.javarush.task.task04.task0417;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Существует ли пара?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());

        if (a == b) {
            if (b == c) {
                System.out.println(a + " " + b + " " + c);
            } else
                System.out.println(a + " " + b);
        } else if (c == a) {
            System.out.println(c + " " + a);
        } else if (b == c) {
            System.out.println(b + " " + c);
        }


    }
}