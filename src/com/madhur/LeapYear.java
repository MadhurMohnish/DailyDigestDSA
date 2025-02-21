package com.madhur;

public class LeapYear {
    public static void main(String[] args) {
        int year = 2025;
        if(year % 400 == 0) {
            System.out.println("Leap year");
        } else if (year % 4 == 0) {
            if(year % 100 != 0) {
                System.out.println("Leap year");
            }
        } else {
            System.out.println("Not a Leap year");
        }
    }
}
