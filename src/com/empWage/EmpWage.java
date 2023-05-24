package com.empWage;

import java.util.Random;

public class EmpWage {
    static final int empPresent = 1;
    static final int empAbsent = 0;
    static int empWagePerHours = 20;
    static int empTotalWage;


    public static void main(String[] args) {
        System.out.println("Welcome to Employee wage Problem");


        Random rand = new Random();
        int num = rand.nextInt(0, 2);

        if (num == empAbsent) {
            System.out.println("Employee is Absent");
            int empWorkingPerHours = 0;
            empTotalWage = empWorkingPerHours * empWagePerHours;

        } else {
            int empWorkingPerHours = 8;
            System.out.println("Employee is Present");
            empTotalWage = empWorkingPerHours * empWagePerHours;
        }
        System.out.println(empTotalWage);


    }

}
