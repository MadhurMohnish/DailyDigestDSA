package com.Functions;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();
        System.out.println(isPrime(n));
    }
    static boolean isPrime(int kaka) {
        if (kaka <= 1) {
            return false;
        }
        for (int i = 2; i < kaka; i++) {
            if (kaka % i == 0) {
                return false;
            }
        }
        return true;
    }
}
