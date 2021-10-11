package com.company.assignmenteight;

public class ComparisonUsingCompareTo {
    public static void main(String[] args) {
        // Specifying the Co-ordinates of Line on x-y plane
        double x1 = 50, y1 = 2, x2 = 60, y2 = 5, x3 = 75, y3 = 7, x4 = 90,  y4 = 10;

        // Finding Length of Line Using Cartesian Co-ordinate System Formula....
        double Line1 = Math.sqrt((x2-x1)*(x2-x1) - (y2-y1)*(y2-y1));
        double Line2 = Math.sqrt((x4-x3)*(x4-x3) - (y4-y3)*(y4-y3));

        System.out.println("Line1:- " + Line1 + " mm");
        System.out.println("Line1:- " + Line2 + " mm");

        //Type-Casting
        String S1 = Double.toString(Line1);
        String S2 = Double.toString(Line2);

        //Comparing two strings and printing the difference.
        System.out.println("Difference Between Both Lines are " + S1.compareTo(S2) + " mm.");


    }
}
