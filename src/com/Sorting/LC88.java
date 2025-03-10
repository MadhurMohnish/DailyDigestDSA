package com.Sorting;
import java.util.Arrays;
//I have solved this Question using Insertion sort but is giving error in leetcode.
// Works well in local machine. Google sugessts to do this with Two-pointer method.

public class LC88 {
    public static void main(String[] args) {
        int[] num1 = {1, 2, 3, 0, 0, 0};
        int[] num2 = {2, 5, 6};
        int[] ans = MergeArray(num1, num2);
//        System.out.println(Arrays.toString(ans));
        int[] sort = Insertion(num1);
        System.out.println(Arrays.toString(sort));
    }
    static int[] MergeArray(int[] arr1, int[] arr2) {
        int index = 0;
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] == 0 && index < arr2.length) {
                arr1[i] = arr2[index];
                index++;
            }
        }
        return arr1;
    }
    static int[] Insertion(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
        return arr;
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
