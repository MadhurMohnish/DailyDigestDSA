package com.Binary_Search;

public class isGreater {
    public static void main(String[] args) {
        int[] arr = {12, 23, 34, 45, 56, 67, 78, 89, 90, 110, 120, 125, 145, 156, 178, 189, 190};
        int target  = 191;
        int ans = greaterFn(arr, target);
        System.out.println(ans);
    }
    static int greaterFn(int[] arr, int target) {;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= target) {
                return arr[i];
            }
        }
        return 0;
    }
}
