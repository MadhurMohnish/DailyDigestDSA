package com.Binary_Search;

public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 7, 8, 2, 3};
        int ans = Mountain(arr);
        System.out.println(ans);
    }
    static int Mountain(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            }
            else {
                start = mid + 1;
            }
        }
        return start;
    }
}
