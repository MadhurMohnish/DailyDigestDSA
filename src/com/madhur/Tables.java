//Write a program to print tables
package com.madhur;

public class Tables {
    public static void main(String[] args) {
        int num = 10;
        int i = 1;
        while(i <= 10) {
            int tab = num * i;
            System.out.println(num + " X " + i + " = " + tab);
            i++;
        }
    }
}