package com.bootcoding.java.level_2assignments;

import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number :");
        int a = sc.nextInt();
        System.out.println("Enter second number :");
        int b = sc.nextInt();
        int add = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;
        int rem = a % b;
        System.out.println("Sum of two numbers is : " + add);
        System.out.println("Subtraction of two numbers is : " + sub);
        System.out.println("Multiplication of two numbers is : " + mul);
        System.out.println("Division of two numbers is : " + div);
        System.out.println("Remainder of two numbers is : " + rem);
    }
}
