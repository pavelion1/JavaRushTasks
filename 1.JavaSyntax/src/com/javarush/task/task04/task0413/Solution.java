package com.javarush.task.task04.task0413;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
День недели
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int dayNumber = Integer.parseInt(bufferedReader.readLine());
        if (dayNumber == 1)
            System.out.println("понедельник");
        else
            if (dayNumber == 2)
                System.out.println("вторник");
            else
                if (dayNumber == 3)
                    System.out.println("среда");
                else
                    if (dayNumber == 4)
                        System.out.println("четверг");
                    else
                        if (dayNumber == 5)
                            System.out.println("пятница");
                        else
                            if (dayNumber == 6)
                                System.out.println("суббота");
                            else
                                if (dayNumber == 7)
                                    System.out.println("воскресение");
                                else
                                            System.out.println("такого дня недели не существует");

    }
}