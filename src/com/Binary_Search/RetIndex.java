package com.Binary_Search;

public class RetIndex {
    public static void main(String[] args) {
        int[] arr = {10, 20, 22, 45, 56, 67, 78, 89, 90, 99, 102, 125, 129, 158, 169, 178, 189};
        int target = 158;
        int ans = BinarySearch(arr, target);
        System.out.println(ans);
    }
    static int BinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }

        }
        return -1;
    }
}
