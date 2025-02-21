package com.Functions;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();
        System.out.println(factorial(n));
    }
    static int factorial(int n) {
        int fact = 1;
        while (fact <= n) {
            fact = fact * n;
            fact++;
        }
        return -1;
    }
}
