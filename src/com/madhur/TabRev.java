package com.madhur;

public class TabRev {
    public static void main(String[] args) {
        int num = 10;
        for (int i = num; i > 0; i--) {
            int tab = num * i;
            System.out.println(num + " X " + i + " = " + tab);
        }
    }
}
