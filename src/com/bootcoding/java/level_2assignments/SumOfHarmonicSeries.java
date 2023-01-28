package com.bootcoding.java.level_2assignments;

import java.util.Scanner;

public class SumOfHarmonicSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms : ");
        int a = sc.nextInt();
        double sum =0;
        for(double i=1;i<=a;i++) {
            sum = sum + 1 / i;
        }
            System.out.println("Sum of Series upto 5 terms : " + sum);

    }
}
