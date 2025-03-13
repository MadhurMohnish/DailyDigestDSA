package com.Sorting;
// https://leetcode.com/problems/majority-element/description/

import java.util.Arrays;

public class LC169 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 5, 6, 6, 7};
        int ans = majorityElement(arr);
        System.out.println(ans);
    }
//    static void count(int[] arr, int uniqueArr) {
//        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == uniqueArr) {
//                count++;
//            }
//        }
//    }
    static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
