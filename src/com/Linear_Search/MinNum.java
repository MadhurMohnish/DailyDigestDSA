package com.Linear_Search;

public class MinNum {
    public static void main(String[] args) {
        int[] arr = {1, 2, -2, 43, 56, 3};
        System.out.println(min(arr));
        System.out.println(max(arr));
    }
    static int min(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    static int max(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
