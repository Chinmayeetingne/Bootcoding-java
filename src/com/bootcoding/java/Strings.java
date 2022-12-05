package com.bootcoding.java;

public class Strings {
    public static void main(String [] args)
    {
        System.out.println("Sum of given array is " + sum());
    }
    public static int sum()
    {
        int sum = 0;
        int i;
        int arr [] = {1,5,-3,2,11};


        for (i = 0; i < arr.length; i++)
        {
            if (arr [i] > 0){
                sum += arr[i];
            }
        }
        return sum;
    }
}
