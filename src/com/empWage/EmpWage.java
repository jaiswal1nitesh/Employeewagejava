package com.empWage;

import java.util.Random;

public class EmpWage {
    static final int empPresent = 1;
    static final int empAbsent = 0;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee \n" +
                "Wage Computation \n" +
                "Program");


        Random rand = new Random();
        int num = rand.nextInt(0, 2);

        if (num == empAbsent)
            System.out.println("Employee is Absent");
        else
            System.out.println("Employee is Present");


    }

}
