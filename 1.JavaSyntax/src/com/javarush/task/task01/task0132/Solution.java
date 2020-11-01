package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int x = number/100;
        int y = (number/10)-x*10;
        int z = number-y*10-x*100;
        int sumDigitsInNumber = (x+y+z);
        return sumDigitsInNumber;
    }
}