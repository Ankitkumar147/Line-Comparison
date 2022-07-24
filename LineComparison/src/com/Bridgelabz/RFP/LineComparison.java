package com.Bridgelabz.RFP;

import java.util.Scanner;

public class LineComparison {

    public static void main(String[] args) {
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
        System.out.println("Enter the Value of Points a1 :- ");
        float a1 = scanner.nextFloat();
        System.out.println("Enter the Value of Points b1 :- ");
        float b1 = scanner.nextFloat();
        System.out.println("Enter the Value of Points a2 :- ");
        float a2 = scanner.nextFloat();
        System.out.println("Enter the Value of Points b2 :- ");
        float b2 = scanner.nextFloat();
        System.out.println("You have entered" + "(" + x1 + "," + y1 + ") & (" + x2 + "," + y2 + ")");
        System.out.println("You have entered" + "(" + a1 + "," + b1 + ") & (" + a2 + "," + b2 + ")");
        float firstLineLength = (float) Math.sqrt(Math.pow(x2 - x1, 2) + (Math.pow(y2 - y1, 2)));
        float secondLineLength = (float) Math.sqrt(Math.pow(a2 - a1, 2) + (Math.pow(b2 - b1, 2)));
        System.out.println("First Line Length :- " + firstLineLength);
        System.out.println("Second Line Length :- " + secondLineLength);
        int compareValue = Float.compare(firstLineLength , secondLineLength);
        if (compareValue == 0) {
            System.out.println("Both lines are Equal");
        } else if (compareValue > 0) {
            System.out.println("First Lines is greater than second line");
        } else {
            System.out.println("Second Line greater than First Line");
        }
    }
}

