package com.madhur;

public class Max3 {
    public static void main(String[] args) {
        int a = 500;
        int b = 600;
        int c = 700;
        int max = 0;
        if(a > b) {
            max = a;
        }
        else {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.println(max);
    }
}
