package com.javarush.task.task04.task0416;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переходим дорогу вслепую
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        double minuts = Double.parseDouble(bufferedReader.readLine());

        double minutsMod5 = minuts%5;

        if (minutsMod5<3){
            System.out.println("зелёный");
        }
         else
             if (minutsMod5<4){
                 System.out.println("жёлтый");
             }
          else
              if (minutsMod5<5){
                  System.out.println("красный");
              }

    }
}