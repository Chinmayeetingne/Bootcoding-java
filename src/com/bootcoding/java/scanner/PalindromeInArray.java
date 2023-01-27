package com.bootcoding.java.scanner;

import java.util.Scanner;

public class PalindromeInArray {

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

        printPalindrome(numbers);
    }

    private static void printPalindrome(int[] numbers) {
        System.out.println("Palindrome number ");

            for(int i=0;i<numbers.length;i++){
                int rem = 0;
                int temp = numbers[i];
                while(numbers[i]>0){
                    int div = numbers[i] / 10;
                    rem= rem *10 + numbers[i] % 10;
                    numbers[i] = div;
                }
                if(rem == temp){
                    System.out.println(temp);
                }
            }
        }
    }

