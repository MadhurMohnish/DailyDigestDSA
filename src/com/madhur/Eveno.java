package com.madhur;

public class Eveno {
    public static void main(String[] args) {
        int num = 1;
        while(num <= 100){
          if(num % 2 != 0) {
                System.out.println(num);
          }
          num++;
        }
//        for(int i = 1; i <= 100; i++) {
//            if(i % 2 == 0) {
//                System.out.println(i);
//            }
//        }
    }
}
