package com.madhur;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.print("Enter the Number: ");
       int n = in.nextInt();
       int fact = 1;
       while(n > 0){
           fact = fact * n;
           n--;
       }
       System.out.println(fact);
    }
}
