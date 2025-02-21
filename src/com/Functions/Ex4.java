// Write a program to print the sum of two numbers entered by user by defining your own method
package com.Functions;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);;
        System.out.print("Enter first nos: ");
        int a = in.nextInt();
        System.out.print("Enter Second nos: ");
        int b = in.nextInt();

        System.out.println(sum(a, b));
    }
    static int sum(int a, int b) {
        int c = a + b;
        return c;
    }
}
