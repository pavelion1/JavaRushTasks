package com.javarush.task.task04.task0421;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Настя или Настя?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name = bufferedReader.readLine();
        String name2 = bufferedReader.readLine();

        if (name.equals(name2)){
            System.out.println("Имена идентичны");
        } else
            if (name.length() == name2.length()){
                System.out.println("Длины имен равны");
            }
    }
}
