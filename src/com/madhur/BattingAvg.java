package com.madhur;

import java.util.Scanner;

public class BattingAvg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the runs in every ball: ");
        int arr[] = new int[6];

        for (int i = 0; i < 6; i++) {
            if (in.hasNextInt()) arr[i] = in.nextInt();
        }

        double sum = 0;
        double avg = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            avg = sum / 6;
        }
        System.out.println("The strike rate is: " + avg);
    }
}
