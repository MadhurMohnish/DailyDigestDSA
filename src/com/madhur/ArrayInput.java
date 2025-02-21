package com.madhur;

import javax.naming.PartialResultException;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Array size: ");
        int n = in.nextInt();
        int Arr[] = new int[n];

        for (int i = 0; i < Arr.length; i++) {
            Arr[i] = in.nextInt();
        }

//        for (int i = 0; i < Arr.length; i++) {
//            System.out.print(Arr[i] + " ");
//        }
//
//        for(int num : Arr) {
//            System.out.print(num + " ");
//        }
        System.out.println(Arrays.toString(Arr));
    }
}
