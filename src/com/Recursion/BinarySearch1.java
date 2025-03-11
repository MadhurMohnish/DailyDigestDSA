package com.Recursion;

public class BinarySearch1 {
    public static void main(String[] args) {
        int[] arr = {1, 22, 44, 56, 76, 90, 93};
        int target = 901;
        System.out.println(BinarySearch(arr, target, 0, arr.length - 1));
    }
    static int BinarySearch(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (target < arr[mid]) {
            return BinarySearch(arr, target, start, mid - 1);
        }
        return BinarySearch(arr, target, mid + 1, end);
    }
}
