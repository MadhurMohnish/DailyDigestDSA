package com.Sorting;

public class LC217 {
    static boolean duplicate(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {3, 45, 56, 78, 56};
        boolean ans = duplicate(arr);
        System.out.println(ans);
    }
}
