package com.bootcoding.java.leetcode;

public class SquareOfArray {
    public static int[] SquareOfArrayElements(int[] digits) {

        for (int i = 0; i < digits.length; i++) {
            digits[i] = digits[i] * digits[i];
        }
        return digits;
    }

    public static void main(String[] args) {
        int temp = 0;
        int[] nums = {-4, -1, 0, 3, 10};
        int[] result = SquareOfArrayElements(nums);
        System.out.println("Original array is :");
        for (int i = 0; i < nums.length; i++) {

            System.out.println( result[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        System.out.println("Sorted array is: ");
        for (int i = 0; i < nums.length; i++) {

            System.out.println(nums[i] + " ");
        }
    }
}
