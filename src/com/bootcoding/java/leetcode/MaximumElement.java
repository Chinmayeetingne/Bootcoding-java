package com.bootcoding.java.leetcode;

import java.util.HashMap;

public class MaximumElement {
    public static void main(String[] args) {
         int nums[] = {3,2,3};
             System.out.println(majorityElement(nums));
         }
    public static int majorityElement(int[] nums) {
        int max = nums[0];
        HashMap<Integer, Integer> store = new HashMap<>();
        for(int i =0;i<nums.length;i++) {
            if (store.containsKey(nums[i])) {
                int value = store.get(nums[i]);
                store.put(nums[i], value + 1);
            } else {
                store.put(nums[i], 1);
            }
        }

        for (Integer key : store.keySet()) {
            int value = store.get(key);
            if (value > (nums.length/2)) {
                 max = key;
            }
        }
        return max;
    }
}
