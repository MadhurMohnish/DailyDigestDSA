package com.Sorting;
// https://leetcode.com/problems/majority-element/description/

import java.util.Arrays;

public class LC169 {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int[] uniqueArr = Arrays.stream(arr).distinct().toArray();
        System.out.println(Arrays.toString(uniqueArr));
    }
    static int[] count(int[] arr, int[] uniqueArr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == uniqueArr[i]) {
                count++;
            }
        }
    }
}
