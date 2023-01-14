package com.bootcoding.java.scanner;

import java.util.Scanner;

public class SquareOfEachElementInArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        for(int i=0;i< numbers.length;i++){
            System.out.println("Enter number " + (i+1));
            int number = sc.nextInt();
            numbers[i] = number;

    }
        printSquare(numbers);
 }

    private static void printSquare(int[] digits){
        System.out.println("Square of each element is");
        for (int i = 0; i < digits.length; i++) {
            digits[i] = digits[i] * digits[i];
            System.out.println(digits[i]);
        }
        //return digits;
    }
}



