package com.madhur;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Number: ");
        int num = in.nextInt();
        System.out.print("Power: ");
        int pow = in.nextInt();

        System.out.println(Math.pow(num, pow));
    }
}
