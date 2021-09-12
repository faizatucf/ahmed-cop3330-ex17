/*
 *  UCF COP3330 Fall 2021 Assignment 17 Solution
 *  Copyright 2021 Faiz Ahmed
 */

import java.util.*;
public class bac {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double BAC,r, a, w,h;
        int check;
        System.out.println("Enter a 1 is you are male or a 2 if you are female:");
        check = sc.nextInt();
        if(check == 1)
        r = 0.73;
        else
        r = 0.66;
        System.out.println("How many ounces of alcohol did you have?");
        a = sc.nextDouble();
        System.out.println("What is your weight, in pounds?");
        w = sc.nextDouble();
        System.out.println("How many hours has it been since your last drink?");
        h = sc.nextDouble();
        BAC = a*(5.14/w*r) - 0.015 * h;
        System.out.println("BAC: " + BAC);
        if(BAC < 0.08)
        System.out.println(String.format("Your BAC is %.4f\nIt is legal for you to drive.", BAC));
        else
        System.out.println(String.format("Your BAC is %.4f\nIt is not legal for you to drive.", BAC));
    }
}