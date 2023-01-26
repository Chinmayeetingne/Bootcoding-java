package com.bootcoding.java.leetcode;



public class ArrayFromPermutation {

    public static void main(String[] args) {
        int nums[] = {0, 2, 1, 5, 3, 4};
        int n[] = buildArray(nums);
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }
    }

         public static int[] buildArray(int[] nums){
             int n = nums.length;
             for(int i=0;i<n;i++){
                 nums[i]=n*(nums[nums[i]]%n)+nums[i];
             }
             for(int i=0;i<n;i++){
                 nums[i]=nums[i]/n;
             }
             return nums;
         }
         }

