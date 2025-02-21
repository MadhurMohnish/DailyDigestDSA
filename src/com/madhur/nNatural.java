package com.madhur;
import java.util.Scanner;

public class nNatural {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = in.nextInt();
        int sum = 0;

        for(int i = 1; i <= num; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        } System.out.println(sum);
    }
}
