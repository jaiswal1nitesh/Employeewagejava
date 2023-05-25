package com.empWage;

import java.util.Random;

public class EmpWage {
    static final int empPresent = 1;
    static final int empAbsent = 0;
    static final int empPartTime = 2;
    static int empWagePerHours = 20;
    static int empFullTimeWorkingPerHours = 8;
    static int empPartTimeWorkingPerHours = 4;
    static int empAbsentimeWorkingPerHours = 0;
    static int empTotalWage;


    public static void main(String[] args) {
        System.out.println("Welcome to Employee wage Problem");


        Random rand = new Random();
        int num = rand.nextInt(0, 3);


        switch (num) {
            case empAbsent:
                System.out.println("Employee is Absent");

                empTotalWage = empAbsentimeWorkingPerHours * empWagePerHours;
                break;
            case empPartTime:
                System.out.println("Employee is Part Time");

                empTotalWage = empPartTimeWorkingPerHours * empWagePerHours;
                break;

            case empPresent:

                System.out.println("Employee is Present");
                empTotalWage =empFullTimeWorkingPerHours * empWagePerHours;
        }
        System.out.println("Employee salary is   "+empTotalWage);


    }

}
