package com.Binary_Search;
//https://leetcode.com/problems/single-element-in-a-sorted-array/description/

import java.rmi.dgc.VMID;

public class SingleElement {
    public static void main(String[] args) {
        int[] nums = {1, 1, 3, 3, 4, 4, 8, 8, 9, 10, 10 };
        int ans = singleNonDuplicate(nums);
        System.out.println(ans);
    }
    static int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while(start < end) {
            int mid = start + (end - start) / 2;

            if (mid % 2 == 1) {
                mid--;
            }
            if (nums[mid] != nums[mid + 1]) {
                end = mid;
            }
            else {
                start = mid + 2;
            }
        }
        return nums[start];
    }
}
