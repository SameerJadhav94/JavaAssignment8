package com.company.assignmenteight;

import java.util.Objects;
import java.util.Scanner;

class Line{

    public double getLength1(double x1, double x2, double y1, double y2){
        return Math.sqrt((x2-x1)*(x2-x1) - (y2-y1)*(y2-y1));
    }
    public double getLength2(double x3, double x4, double y3, double y4){
        return Math.sqrt((x4-x3)*(x4-x3) - (y4-y3)*(y4-y3));
    }

}

public class EqualityOfLines {
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
        System.out.println("Enter the value of x3 in mm: ");
        double x3 = sc.nextDouble();
        System.out.println("Enter the value of y3 in mm: ");
        double y3 = sc.nextDouble();
        System.out.println("Enter the value of x4 in mm: ");
        double x4 = sc.nextDouble();
        System.out.println("Enter the value of y4 in mm: ");
        double y4 = sc.nextDouble();

        Line l1 = new Line();
        double Line1 = l1.getLength1(x1,x2,y1,y2);

        Line l2 = new Line();
        double Line2 = l2.getLength2(x3,x4,y3,y4);

        System.out.println("Length of Line L1 is:- " + Line1 + " mm");
        System.out.println("Length of Line L2 is:- " + Line2 + " mm");

        //Checking Condition for Equality using .equals
        if (Objects.equals(Line1,Line2)){
            System.out.println("Line 1 equals Line 2");
        }
        else {
            System.out.println("Line1 not equal to Line2");
        }




    }
}
