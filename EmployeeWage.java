package com.company.assignmenteight;

import java.util.concurrent.ThreadLocalRandom;

class Wage{
    int Full_Time=1;
    int Part_Time=2;
    int Wage_per_hr=20;
    int Working_days_per_Month=20;


    /***
     *
     * @return
     */
    public int getEmpWage(){
        int salary=0;
        int emphrs = 0;
        for ( int days=1; days<=Working_days_per_Month; days++ ) {
            int EmplCheck= ThreadLocalRandom.current().nextInt(0,3);

            if ( EmplCheck == Full_Time ) {
                emphrs=8;
            }
            else if ( EmplCheck == Part_Time ) {
                emphrs=4;
            }
            else {
                emphrs=0;
            }
            int Emp_Wages=( emphrs * Wage_per_hr );
            salary=(salary + Emp_Wages);
        }
        return salary;
    }
}

public class EmployeeWage {

    public static void main(String[] args) {
        Wage wage = new Wage();
        System.out.println("Employee Salary for the Month:- " + wage.getEmpWage());

    }
}
