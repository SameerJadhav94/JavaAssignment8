package com.company.assignmenteight;

import java.util.Objects;

class CLine{
    // Specifying the Co-ordinates of Two Lines on x-y plane
    double x1, y1, x2, y2, x3, y3, x4,  y4;

    public CLine(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        this.x4 = x4;
        this.y4 = y4;
    }

    public double getLength1(){
        return Math.sqrt((x2-x1)*(x2-x1) - (y2-y1)*(y2-y1));
    }
    public double getLength2(){
        return Math.sqrt((x4-x3)*(x4-x3) - (y4-y3)*(y4-y3));
    }

}


public class CartesianLineOOPS {
    public static void main(String[] args) {
        CLine line  = new CLine(50, 2, 60, 5, 75, 7, 90, 10);

        double Line1 = line.getLength1();
        double Line2 = line.getLength2();

        System.out.println("Length of Line1 is:- " + Line1 + " mm");
        System.out.println("Length of Line2 is:- " + Line2 + " mm");

        //Checking Condition for Equality using .equals
        if (Objects.equals(Line1,Line2)){
            System.out.println("Line 1 equals Line 2");
        }
        else {
            System.out.println("Line1 not equal to Line2");
        }

        //Type-Casting
        String S1 = Double.toString(Line1);
        String S2 = Double.toString(Line2);

        //Comparing two strings and printing the difference.
        System.out.println("Difference Between Both Lines are " + S1.compareTo(S2) + " mm.");

    }
}
