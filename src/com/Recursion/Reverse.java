package com.Recursion;

public class Reverse {
    public static void main(String[] args) {
        revnum(4356);
        System.out.println(sum);
    }
    static int sum = 0;
    static void revnum(int n) {

        if (n == 0) {
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        revnum(n / 10);
    }
}
