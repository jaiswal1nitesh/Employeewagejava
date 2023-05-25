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
    static int numDayPerMonth = 20;


    public static void main(String[] args) {
        System.out.println("Welcome to Employee wage Problem");


        Random rand = new Random();
        //  int num = rand.nextInt(0, 3);
        int totalSalary = 0;

        for (int day = 0; day <= numDayPerMonth; day++) {
            int num = rand.nextInt(0, 3);
            switch (num) {
                case empAbsent:
                    empTotalWage = empAbsentimeWorkingPerHours * empWagePerHours;
                    totalSalary = totalSalary + empTotalWage;
                    break;
                case empPartTime:
                    empTotalWage = empPartTimeWorkingPerHours * empWagePerHours;
                    totalSalary = totalSalary + empTotalWage;
                    break;

                case empPresent:
                    empTotalWage = empFullTimeWorkingPerHours * empWagePerHours;
                    totalSalary = totalSalary + empTotalWage;
                    break;

            }

        }
        System.out.println("Employee salary is   " + totalSalary);


    }

}
