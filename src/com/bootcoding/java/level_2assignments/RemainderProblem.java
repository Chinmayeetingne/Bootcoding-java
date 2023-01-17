package com.bootcoding.java.level_2assignments;

import java.util.Scanner;

public class RemainderProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int a = sc.nextInt();
        for(int i=0;i<=100;i++){
            if(i%a == 3){
                System.out.println(i);
            }
        }
    }
}
