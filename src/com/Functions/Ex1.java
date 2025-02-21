package com.Functions;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int num = in.nextInt();
        System.out.print("Enter the elements: ");
        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(max(arr));
        System.out.println(min(arr));
//        for (int i = 0; i < num; i++) {
//            System.out.print(arr[i] + " ");
    }

    static int max(int[] arr) {
        int maximum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (maximum < arr[i]) {
                maximum = arr[i];
            }
        }
        return maximum;
    }

    static int min(int[] arr) {
        int minimum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minimum) {
                minimum = arr[i];
            }
        }
        return minimum;
    }
}
