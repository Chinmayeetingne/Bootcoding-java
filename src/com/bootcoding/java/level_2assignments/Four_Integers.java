package com.bootcoding.java.level_2assignments;

import oops.inheritance.DressingTable;

import java.util.Scanner;

public class Four_Integers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first integer : ");
        int p = sc.nextInt();
        System.out.println("Enter the second integer :");
        int q = sc.nextInt();
        System.out.println("Enter the third integer :");
        int r = sc.nextInt();
        System.out.println("Enter the fourth integer :");
        int s= sc.nextInt();
        if( (p%2==0) && q>r && s>p && r+s > p+q)
        {
            System.out.println("Correct values");
        }
        else
            System.out.println("Wrong values");

    }
}
