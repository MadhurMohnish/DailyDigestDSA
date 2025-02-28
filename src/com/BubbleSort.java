package com;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {21, 11, 45, 56, 32, 21};
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void BubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if(arr[j] < arr[j - 1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }
}
