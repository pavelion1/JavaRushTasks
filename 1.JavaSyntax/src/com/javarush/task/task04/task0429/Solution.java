package com.javarush.task.task04.task0429;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Положительные и отрицательные числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());
        int d = 0;
        if (a > 0){
            d = 1 + d;
        }
        if (b > 0){
            d = 1 + d;
        }
        if (c > 0){
            d = 1 + d;
        }
        int f = 0;
        if (a < 0){
            f = 1 + f;
        }
        if (b < 0){
            f = 1 + f;
        }
        if (c < 0){
            f = 1 + f;
        }

        System.out.print("количество отрицательных чисел: " + f  );
        System.out.println("");
        System.out.println("количество положительных чисел: " + d );

    }

}
