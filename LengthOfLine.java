package com.company.assignmenteight;

import java.util.Scanner;

public class LengthOfLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Specify the Co-ordinates of Line on x-y plane
        System.out.println("Enter the value of x1 in mm: ");
        double x1 = sc.nextDouble();
        System.out.println("Enter the value of y1 in mm: ");
        double y1 = sc.nextDouble();
        System.out.println("Enter the value of x2 in mm: ");
        double x2 = sc.nextDouble();
        System.out.println("Enter the value of y2 in mm: ");
        double y2 = sc.nextDouble();

        //Finding the Length of a Line Cartesian System

        double length = Math.sqrt((x2-x1)*(x2-x1) - (y2-y1)*(y2-y1));
        System.out.println("Length of Line is:- " + length + " mm");
    }
}
