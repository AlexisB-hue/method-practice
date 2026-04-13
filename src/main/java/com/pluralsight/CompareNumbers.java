package com.pluralsight;

import java.util.*;

public class CompareNumbers {
    public static void main(String[] args){
        System.out.println(isEven(10));
        System.out.println(isPositive(1));
    }

    public static boolean isEven(int num){
        return num % 2 ==0;
    }

    public static boolean isPositive(double num2){
        return num2 > 0;
    }

}
