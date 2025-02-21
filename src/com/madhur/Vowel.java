//Write a program to input any alphabet and check whether it is vowel or consonant
package com.madhur;

public class Vowel {
    public static void main(String[] args) {
        char a = 'E';
        if(a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u' || a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U') {
            System.out.println("The given Alphabet " + a + " is a Vowel");
        } else {
            System.out.println("The given Alphabet " + a + " is a Consonent");
        }
    }
}
