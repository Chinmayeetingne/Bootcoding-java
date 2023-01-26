package com.bootcoding.java.leetcode;

import java.util.Arrays;

public class MaximumProduct {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        System.out.println(maximumProduct(nums));
    }
    public static int maximumProduct(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);

        return Math.max(nums[n-1]*nums[n-2]*nums[n-3], nums[n-1]*nums[0]*nums[1]);
    }
}

