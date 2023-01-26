package com.bootcoding.java.scanner;

import java.util.Scanner;

public class EvenOddArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array");
         int size = sc.nextInt();
         int numbers[] = new int[size];
        for(int i=0;i<numbers.length;i++) {
        System.out.println("Enter number " + (i + 1));
        int number = sc.nextInt();
        numbers[i] = number;

    }
          printEvenArray(numbers);
          printOddArray(numbers);
    }
    private static void printEvenArray(int[] numbers){
        System.out.println("Even elements");
        for(int i=0;i< numbers.length;i++){
            if(numbers[i]%2==0){
                System.out.println(numbers[i]);
            }
        }
    }

    private static void printOddArray(int[] numbers){
        System.out.println("Odd elements");
        for(int i=0;i< numbers.length;i++){
            if(numbers[i]%2!= 0){
                System.out.println(numbers[i]);
            }
        }
    }
}
