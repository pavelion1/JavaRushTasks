package com.javarush.task.task04.task0419;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Максимум четырех чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine()); // 8
        int b = Integer.parseInt(reader.readLine()); // 9
        int c = Integer.parseInt(reader.readLine()); // 5
        int d = Integer.parseInt(reader.readLine()); // 8
        if (a > b && a > c && a > d) {System.out.println(a);}
        else
            if (b > a && b > c && b > d) {System.out.println(b);}
        else
            if (c > a && c > b && c > d) {System.out.println(c);}
        else
            if (d > a && d > b && d > c) {System.out.println(d);}

        else
            if (a >= b & a >= c & a >= d) {System.out.println(a);}
        else
            if (b >= a & b >= c & b >= d) {System.out.println(b);}
        else
            if (c >= a & c >= b & c >= d) {System.out.println(c);}
        else
            if (d >= a & d >= b & d >= c) {System.out.println(d);}

    }
}
