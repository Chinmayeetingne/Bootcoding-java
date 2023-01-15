package com.bootcoding.java.level_2assignments;

import java.util.Scanner;

public class EmployeeId {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee ID : ");
        int a = sc.nextInt();
        System.out.println("Enter the working hours : ");
        double b = sc.nextDouble();
        System.out.println("Enter the salary(amount/hr) : ");
        double c = sc.nextDouble();
        double totalSalary = b * c;
        System.out.println("Employee Id : 0342 " );
        System.out.println("total salary : " + " U$ " + totalSalary);


        }
    }

