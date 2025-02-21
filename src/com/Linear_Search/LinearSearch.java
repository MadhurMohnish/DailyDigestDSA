package com.Linear_Search;

public class LinearSearch {
    public static void main(String[] args) {
        int[] num = {11, 22, 12, 45, 67, 32, 51, 44};
        int target = 67;
        int ans = LinearSearch2(num, 51);
        System.out.println(ans);
    }

    static int LinearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    //Search the target and return the element
    static int LinearSearch2(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }
        return -1;
    }
}