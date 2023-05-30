package com.empWage;

import java.util.Random;

public class EmpWage {
    static final int empPresent = 1;
    static final int empAbsent = 0;
    static final int empPartTime = 2;
    static int empWorkingHours ;
    static int empWagePerHours = 20;
    static int empTotalWage;
    static int numDayPerMonth = 20;
    static int day = 1;


    public static void main(String[] args) {
        System.out.println("Welcome to Employee wage Problem");


        Random rand = new Random();
        int totalSalary = 0;
        int totalWorkingHours = 0;
        while (day < 20 && totalWorkingHours < 100) {
            int num = rand.nextInt(0, 3);
            switch (num) {
                case empAbsent:
                    int empWorkingHours = 0;
                    empTotalWage = empWorkingHours * empWagePerHours;
                    totalWorkingHours+=empWorkingHours;

                    break;
                case empPartTime:
                    empWorkingHours = 4;
                    empTotalWage = empWorkingHours * empWagePerHours;
                    totalWorkingHours+=empWorkingHours;
                    break;

                case empPresent:
                    empWorkingHours = 8;
                    empTotalWage = empWorkingHours * empWagePerHours;
                    totalWorkingHours+=empWorkingHours;
                    break;

            }
            totalSalary = totalSalary + empTotalWage;

                      if(totalWorkingHours>100){
                          int extraWorkingHrs=totalWorkingHours-100;
                          totalWorkingHours=totalWorkingHours-extraWorkingHrs;
                          totalSalary = totalSalary + empTotalWage;}
                      else {
                          int salary= empWagePerHours* empWorkingHours;
                          totalSalary=totalSalary+salary;





                      }
                      day++;


        }
        System.out.println("Employee salary is   " + totalSalary);
        System.out.println("Day is  " + day + "  and Total Working Hours  is  " + totalWorkingHours);


    }

}
