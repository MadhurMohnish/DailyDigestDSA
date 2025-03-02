package com.Sorting;
import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {8, 6, 7, 3, 5, 2, 1, 4, 10};
        Cycle(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Cycle(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
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
