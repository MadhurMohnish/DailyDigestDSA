package com.madhur;

import java.util.Arrays;

public class Varargs {
    public static void main(String[] args) {
        fun(1, 22, "Madhur", "Shahsank", "Manas");
    }
    static void fun(int a, int b, String ...v) {
        System.out.println(a + " " + b + " " + Arrays.toString(v));
    }
}
