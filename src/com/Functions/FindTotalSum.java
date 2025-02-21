package com.Functions;

import java.util.Scanner;

public class FindTotalSum {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {1, 2, 3, 6, 4};
        int sum = FindTotalSum(n, arr, 3);
        System.out.println(sum);
    }
    static int FindTotalSum(int n, int[] arr, int Start) {
        int sum = 0;
        int prev = arr[Start - 1];

        for (int i = 0; i < n; i++) {
            sum += Math.abs(arr[i] - prev);
            prev = arr[i];
        }
        return sum;
    }
}
