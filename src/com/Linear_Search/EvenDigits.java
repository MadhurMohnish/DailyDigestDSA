package com.Linear_Search;

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896, 52};
        System.out.println(findnumbers(nums));
    }
    static int findnumbers(int[] nums) {
        int count = 0;
        for(int num : nums) {
            if(even(num)) {
                count++;
            }
        }
        return count;
    }
    static boolean even(int num) {
        int numberOfDigits = digits(num);
        return numberOfDigits % 2 == 0;
    }
    static int digits(int num) {
        if(num < 0) {
            num = num * -1;
        }
        int count = 0;
        while(num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }
}
