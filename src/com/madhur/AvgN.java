package com.madhur;

import java.util.Scanner;

public class AvgN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How many numbers: ");
        int num = 0;
        if (in.hasNextInt()) {
            num = in.nextInt();
        }

        int arr[] = new int[num];
        System.out.print("Enter the elements of the Array: ");
        for (int i = 0; i < num; i++) {
            if (in.hasNextInt()) arr[i] = in.nextInt();
        }
//        for (int i = 0; i < num; i++) {
//            System.out.print(arr[i] + " ");
//        }
        int sum = 0;
        double avg = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            avg = sum / num;
        }
        System.out.println("Average of Array: " + avg);
    }
}
