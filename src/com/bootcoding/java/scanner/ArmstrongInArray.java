package com.bootcoding.java.scanner;

import java.util.Scanner;

public class ArmstrongInArray {
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

        printArmstrong(numbers);
    }
     private static void printArmstrong(int[] numbers){
         System.out.println("Armstrong Number");
           for(int i=0;i< numbers.length;i++){
               int temp = numbers[i];
               int rem =0;
               int sum = 0;
               while(numbers[i]!=0){
                   int div = numbers[i]/10;
                   rem = numbers[i] % 10;
                   sum = sum + (rem * rem *rem);
                   numbers[i] = div;
               }
               if(sum == temp){
                   System.out.println(sum);
               }
           }
            }
}
