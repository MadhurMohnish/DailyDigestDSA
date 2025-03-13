package com.Recursion;

public class Sum {
    public static void main(String[] args) {
        int ans = sumN(5);
        System.out.println(ans);
    }
    static int sumN(int n) {
        if (n == 0) {
            return n;
        }
        return n + sumN(n - 1);
    }
}
