package com.bootcoding.java.scanner;

import java.util.Scanner;

public class PrimeNumberInArray {
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

        printPrimeNumber(numbers);
    }
    private static void printPrimeNumber(int[] numbers){
        System.out.println("Prime NUmber");
            boolean flag = false;
            for (int i = 2; i <= numbers.length / 2; ++i) {
                int temp = numbers[i];
                if (temp % i == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag)
                System.out.println(numbers[0]+ " is a prime number.");
            else
                System.out.println(numbers[0] + " is not a prime number.");
        }
}



