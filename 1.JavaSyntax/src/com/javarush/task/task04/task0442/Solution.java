package com.javarush.task.task04.task0442;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = 0;
        while (true) {
            int number = Integer.parseInt(bufferedReader.readLine());
            a = a + number;
            if (number == -1)
            break;
        }
        System.out.println(a);

    }
}
