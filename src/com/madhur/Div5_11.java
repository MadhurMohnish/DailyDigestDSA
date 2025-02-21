//Write a program to check whether a number is divisible by 5 and 11 or not
package com.madhur;

public class Div5_11 {
    public static void main(String[] args) {
        int num = 54;
        if(num % 5 == 0 || num % 11 == 0) {
            System.out.println("The number " + num + " is Divisible by 5 or 11");
        }
        else {
            System.out.println("The number " + num + " is not Divisible by 5 or 11");
        }
    }
}
