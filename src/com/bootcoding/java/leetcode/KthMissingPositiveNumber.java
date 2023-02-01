package com.bootcoding.java.leetcode;

public class KthMissingPositiveNumber {
    public static void main(String[] args) {
        int[] arr = {1,2};
        System.out.println(findKthPositive(arr,1));
    }
    public static int findKthPositive(int[] arr, int k){
        int missingPos = 1;
        int i=0;
        while(true){
            if(missingPos == arr[i]){
                i++;
            }else{
                --k;
                if(k == 0){
                    return missingPos;
                }
            }
            missingPos++;
            if(i == arr.length){
                --i;
            }

        }
    }

}
