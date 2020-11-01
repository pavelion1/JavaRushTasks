package com.javarush.task.task03.task0325;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Финансовые ожидания
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader (new InputStreamReader (System.in));
        System.out.println("Я буду зарабатывать $" + Integer.parseInt(b.readLine()) + " в час");

    }
}
