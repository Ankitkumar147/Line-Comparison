package com.Bridgelabz.RFP;

import java.util.Scanner;

public class LineComparison {

    public static void main(String[] args) {
        //float x1,x2,y1,y2;
        System.out.println("Welcome to the Line Comparison Computation Program");
        System.out.println("Enter the line point according to cartesian System as (x1,y1) & (x2,y2) ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of point x1 :-  ");
        float x1 = scanner.nextFloat();
        System.out.println("Enter the value of point y1 :-  ");
        float y1 = scanner.nextFloat();
        System.out.println("Enter the value of point x2 :-  ");
        float x2 = scanner.nextFloat();
        System.out.println("Enter the value of point y2 :-  ");
        float y2 = scanner.nextFloat();
        System.out.println("You have entered"+ "("+x1+","+y1+") & ("+x2+","+y2+")");
    }
}

