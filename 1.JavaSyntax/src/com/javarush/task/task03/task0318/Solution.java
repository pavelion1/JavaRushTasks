package com.javarush.task.task03.task0318;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
План по захвату мира
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader  = new BufferedReader(new InputStreamReader(System.in));
        InputStreamReader inputStreamReader =  new InputStreamReader(System.in);
        String sYears = bufferedReader.readLine();
        String name = bufferedReader.readLine();
        int a = Integer.parseInt(sYears);
        System.out.println(name+" захватит мир через "+a+" лет. Му-ха-ха!");

    }
}
