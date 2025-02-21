package com.Linear_Search;

public class SearchinRange {
    public static void main(String[] args) {
        int[] arr = {1, 33, 56, 34, 78, 54, 23, 89};
        int ans = LinearSearch3(arr, 33, 1, 4);
        System.out.println(ans);
    }

    static int LinearSearch3(int[] arr, int target, int start, int end) {
        if(arr.length == 0) {
            return -1;
        }
        for (int i = start; i <= end; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        return -1;
    }
}
