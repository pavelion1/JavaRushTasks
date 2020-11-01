package com.javarush.task.task04.task0412;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Положительное и отрицательное число
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(bufferedReader.readLine());
        if (i<0)
        {
            System.out.println(i+1);
        }
        else
            if (i>0)
            {
                System.out.println(i*2);
            }
            else
                System.out.println(i);
    }

}