package com.madhur;
import java.util.Scanner;

public class DigiSum {
    public static void main(String[] args) {
//        // Create a Scanner object to read input from the keyboard
        Scanner in = new Scanner(System.in);
//
//        // Prompt the user to enter a string
//        System.out.print("Enter a string: ");
//
//        // Read the input string from the user
//        String inputString = scanner.nextLine();
//
//        // Print the input string
//        System.out.println("You entered: " + inputString);
//
//        // Close the scanner to avoid resource leaks
//        scanner.close();
        System.out.println("Enter the number: ");
        int num = in.nextInt();
        int n1 = 0;
        while(num > 0) {
            n1 = num % 10;
            num = n1;
            n1 = n1 + num;
            num--;
        }
        System.out.println(n1);
    }
}