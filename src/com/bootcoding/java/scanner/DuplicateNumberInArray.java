package com.bootcoding.java.scanner;

import java.util.Scanner;

public class DuplicateNumberInArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter number " + (i + 1));
            int number = sc.nextInt();
            numbers[i] = number;
        }
        printDuplicateNumber(numbers);
    }

    private static void printDuplicateNumber(int[] number) {
        System.out.println("Duplicate number");
        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                if (number[i] == number[j]) {
                    System.out.println(number[0]);
                }
            }
        }
    }
}