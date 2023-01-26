package com.bootcoding.java.leetcode;

public class ConcatenationOfArray {
    public static void main(String[] args) {

        int[] nums = {1, 2, 1};
        int[] n = getConcatenation(nums);
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }


    }
    public static int[] getConcatenation(int[] nums){
        int n = nums.length;
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ans[i] = ans[i + n] = nums[i];
        }
        return ans;
    }
}
