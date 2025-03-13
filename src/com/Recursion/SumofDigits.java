package com.Recursion;

public class SumofDigits {
    public static void main(String[] args) {
        int ans = proD(1432);
        System.out.println(ans);

    }
    static int sumD(int n) {
        if (n == 0) {
            return 0;
        }
        int rem = n % 10;
        n = n / 10;
        return rem + sumD(n);
    }
    static int proD(int n) {
        if (n % 10 == n) {
            return n;
        }
        int rem = n % 10;
        n = n / 10;
        return rem * proD(n);
    }
}
