package com.bootcoding.java.level_2assignments;

import java.util.Scanner;

public class MonthName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  month number : ");
        int monthNunmber = sc.nextInt();
        if(monthNunmber == 1)
            System.out.println("January");
        else if (monthNunmber == 2)
            System.out.println("February");
        else if (monthNunmber == 3)
            System.out.println("March");
        else if (monthNunmber == 4)
            System.out.println("April");
        else if (monthNunmber == 5)
            System.out.println("May");
        else if (monthNunmber == 6)
            System.out.println("June");
        else if (monthNunmber == 7)
            System.out.println("July");
        else if (monthNunmber == 8)
            System.out.println("August");
        else if (monthNunmber == 9)
            System.out.println("September");
        else if (monthNunmber == 10)
            System.out.println("October");
        else if (monthNunmber == 11)
            System.out.println("November");
        else if (monthNunmber == 12)
            System.out.println("December");
        else
            System.out.println("Invalid Month");
    }
}
