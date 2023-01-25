package com.bootcoding.java.leetcode;

import java.util.HashMap;

public class ClimbStairs {
    public static void main(String[] args) {
        int n= 2;
        System.out.println(climbStairs(n));
    }
    static HashMap<Integer ,Integer> cache = new HashMap<>();
    public static int climbStairs(int n) {
        if(n == 0 || n == 1){
            return 1;
        }
        if (cache.containsKey(n)){
            return cache.get(n);
        }
        cache.put(n,climbStairs(n-1)+ climbStairs(n-2));
        return cache.get(n);
    }
}
