package com.madhur;
import java.util.Scanner;

public class Sum2num {
    public static void main(String[] args) {
        int ans = sum();
        System.out.println(ans);
    }

    static int sum() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first num: ");
        int num1 = in.nextInt();
        System.out.println("Enter the second num: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
//        System.out.println("The sum is: " + sum);
        return sum;
    }
}
