//Write a program to calculate profit or loss
package com.madhur;
import java.util.Scanner;

public class Pl {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.print("Enter the Cost Price: ");
        float cp = in.nextFloat();
        System.out.print("Enter the Sell Price: ");
        float sp = in.nextFloat();
        if(sp > cp) {
            float pf = sp - cp;
            float pfper = (pf / cp) * 100;
            System.out.println("The Profit is: " + pf);
            System.out.println("Your Profit is: " + pfper + "%");
        }
        else {
            float pf2 = sp - cp;
            float pfper2 = ((cp - sp) / sp) * 100;
            System.out.println("Your Profit is: " + pf2);
            System.out.print("You got a " + pfper2 + "% " + "Loss");
        }
    }
}
