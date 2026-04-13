package com.pluralsight;
import java.sql.SQLOutput;
import java.util.*;

public class Format {
    public static void main(String[] args){
        System.out.println(formatName());

    }

    public static String formatName(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your first name?: ");
        String name1 = scanner.nextLine();

        System.out.print("What is your last name?: ");
        String name2 = scanner.nextLine();

        return name2 + " , " +name1;

    }
}
