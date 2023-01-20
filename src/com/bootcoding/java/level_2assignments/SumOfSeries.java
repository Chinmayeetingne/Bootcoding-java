package com.bootcoding.java.level_2assignments;

import java.util.Scanner;

public class SumOfSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms : ");
        int a = sc.nextInt();
        int sum = 0, j = 1;
        for (int i = 1; i <= a; i++) {
            sum = sum + j;
            j = (j * 10) + 1;
        }
        System.out.println(sum);
    }

}
