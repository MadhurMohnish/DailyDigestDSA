package com.Sorting;

import java.util.Arrays;

public class LC287 {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        Cycle(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void Cycle(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != i + 1) {
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                } else {
                    return;
                }
                } else {
                     i++;
                }
        }
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
