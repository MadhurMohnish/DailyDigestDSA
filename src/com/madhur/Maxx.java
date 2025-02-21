package com.madhur;

import java.util.Arrays;

public class Maxx {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 45, 5, 6};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start < end) {
            swpfn(arr, start, end);
            start++;
            end--;
        }
    }

    static void swpfn(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    static int max(int[] arr) {
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > c) {
                c = arr[i];
            }
        }
        return c;
    }
}
