package com.madhur;

import java.util.Scanner;

public class LoopAss26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many Numbers? ");
        int num = in.nextInt();

        System.out.println("Enter all the elements: ");
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            if (in.hasNextInt()) {
                arr[i] = in.nextInt();
            }
            System.out.print(arr[i] + " ");
        }

        int possum = 0;
        int possumodd = 0;
        int negsum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 0) {
                possum += arr[i];
            } else if (arr[i] > 0 && arr[i] % 2 != 0) {
                possumodd += arr[i];
            } else if (arr[i] < 0) {
                negsum += arr[i];
            }
        }
        System.out.println();
        System.out.println("The Sum of all +ve nos are: " + possum);
        System.out.println("The Sum of all +ve odd nos are: " + possumodd);
        System.out.println("The Sum of all -ve nos are: " + negsum);
    }
}