package com.madhur;

import java.util.Scanner;

public class Ebill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the units consumed: ");
        float unit = in.nextFloat();
        if(unit <= 100 && unit >= 0) {
            float amt = unit * 10;
            System.out.println("Total amount to be paid: " + amt);
        } else if (unit >= 100 && unit <= 200) {
            float amt = unit * 15;
            System.out.println("Total amount to be paid: " + amt);
        } else if (unit >= 200 && unit <= 300) {
            float amt = unit * 20;
            System.out.println("Total amount to be paid: " + amt);
        } else if (unit >= 300) {
            float amt = unit * 25;
            System.out.println("Total amount to be paid: " + amt);
        } else {
            System.out.println("Enter a Valid Unit!!");
        }

    }
}
