package com.bootcoding.java.leetcode;

import java.util.HashMap;

public class UniqueElementsInArray {
    public static void main(String[] args) {
        int nums[] = {1 ,2,3,2};

        HashMap<Integer , Integer> store = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(store.containsKey(nums[i])){
                int value = store.get(nums[i]);
                store.put(nums[i] ,value + 1);
            }
            else{
                store.put(nums[i] ,1);
            }
        }
        int sum =0;
        for(Integer key : store.keySet()){
            int value =  store.get(key); // no. of occurences)
            if(value == 1){
                sum += key;
            }
        }
        System.out.println(sum);
      }

}


