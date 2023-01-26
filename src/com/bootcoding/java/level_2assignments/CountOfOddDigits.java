package com.bootcoding.java.level_2assignments;

public class CountOfOddDigits {
    public static void main(String[] args) {
        int nums[] = {555,901,483,1771, 4};
        System.out.println(countOddNum(nums));
    }

    private static int countOddNum(int nums[]){
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2 == 1){
                count++;
            }
        }
        return count;
    }
}
