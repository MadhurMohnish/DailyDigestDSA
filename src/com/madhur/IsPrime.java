package com.madhur;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
//        System.out.println(IsPrime(n));
        System.out.println(isArmstrong(n));
    }
//  Check Armstrong Number:
    static boolean isArmstrong(int n){
        int sum = 0;
        int original = n;
        while(n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem*rem*rem;
        }
        return sum == original;
    }

//  Check Prime Number:
    static boolean IsPrime(int n) {
        if(n <= 1) {
            return false;
        }
        int c = 2;
        while(c * c <= n){
            if(n % c == 0) {
                return false;
            } c++;
        }
        return c * c > n;
    }
}
