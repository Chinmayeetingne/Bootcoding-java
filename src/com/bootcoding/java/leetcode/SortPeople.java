package com.bootcoding.java.leetcode;

import java.util.Arrays;


public class SortPeople {
    public static void main(String[] args) {
        String [] names = {"Mary" ,"John" ,"Emma"};
        int [] heights = {180,165,170};
        System.out.println(sortPeople(names,heights));
    }

    public static String[] sortPeople(String[] names, int[] heights) {
        int[][] people = new int[names.length][2];
        for (int i = 0; i < names.length; i++) {
            people[i] = new int[] { heights[i], i };
        }

        Arrays.sort(people, (a, b) -> b[0] - a[0]);

        String[] result = new String[names.length];
        for (int i = 0; i < names.length; i++) {
            result[i] = names[people[i][1]];
        }

        return result;
    }
}
