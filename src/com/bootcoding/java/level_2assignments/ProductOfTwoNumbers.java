package com.bootcoding.java.level_2assignments;


import java.util.Scanner;

public class ProductOfTwoNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number :");
        int a = sc.nextInt();
        System.out.println("Enter second number :");
        int b = sc.nextInt();
        int c = a * b;
        System.out.println("Product of two numbers is : " + c);
    }
}