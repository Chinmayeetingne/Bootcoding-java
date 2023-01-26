package com.bootcoding.java.level_2assignments;

import java.util.Scanner;

public class AverageConsumption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total distance in km : ");
        int distance = sc.nextInt();
        System.out.println("Enter total fuel spent in liters : ");
        float fuel = sc.nextFloat();
        float AverageConsumption =  distance / fuel;
        System.out.println("Average Consumption(km/lt) : " +  AverageConsumption);

    }
}
