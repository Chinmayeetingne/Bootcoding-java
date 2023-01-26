package com.bootcoding.java.level_2assignments;

public class CountOfEvenDigits {
    public static void main(String[] args) {
        int nums[] = {12,345,2,6,7896};
        System.out.println(countEvenDigit(nums));
    }
    private static int countEvenDigit(int []nums){
    int count = 0;
        for(int i=1;i<nums.length;i++){
        if(nums[i]%2 == 0){
            count++;
        }
    }
        return count;
     }
}
