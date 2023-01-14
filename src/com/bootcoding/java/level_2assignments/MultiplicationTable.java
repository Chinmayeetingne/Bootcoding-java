package com.bootcoding.java.level_2assignments;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Multiplication table of :");
        int a = sc.nextInt();
        for(int i=1; i<=10; i++)
        {
            System.out.print(i * a + " ");
        }
        System.out.println();
    }
}
