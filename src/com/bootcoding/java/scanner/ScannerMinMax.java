package com.bootcoding.java.scanner;

import java.util.Scanner;

public class ScannerMinMax {

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

          printMax(numbers);
          printMin(numbers);
    }
    private static void printMax(int[] numbers){
        int max =0;
        System.out.println("Maximum elements");
        for(int i=0;i< numbers.length;i++)
        {
            if(numbers[i]>max){
                max=numbers[i];
            }
        }
        System.out.println(max);
    }
    private static void printMin(int [] numbers){
        int min = numbers[0];
        System.out.println("Minimum Element");
        for(int i=0;i< numbers.length;i++)
        {
            for(int j = i+1; j < numbers.length; j++){
                if(numbers[j] < min) {
                    min = numbers[j];
                }
            }

        }
        System.out.println(min);
    }

    }

