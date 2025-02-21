package com.Linear_Search;

import java.util.Arrays;

public class Searchin2dArray {
    public static void main(String[] args) {
        int[][] arr = {{11, 22, 33}, {34, 76}, {87, 39, 60, 99}};
//        int target = 60;
        int[] ans = max(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] num(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                    if (arr[i][j] == target) {
                        return new int[]{i, j};
                    }
                }
            }
        return new int[]{-1, -1};
    }
    static int[] max(int[][] arr) {
        int max = arr[0][0];
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > max) {
                    max = element;;
                }
            }
        }
        return new int[]{max};
    }

}

