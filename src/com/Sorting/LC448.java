//package com.Sorting;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class LC448 {
//    public List<Integer>(String[] args) {
//        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
//
//    }
//    void Cycle(int[] nums) {
//        int i = 0;
//        while (i < nums.length) {
//            int correct = nums[i] - 1;
//            if (nums[i] != nums[correct]) {
//                swap(nums, i, correct);
//            } else {
//                i++;
//            }
//        }
//        //just find missing numbers now
//        List<Integer> ans = new ArrayList<>();
//        for (int index = 0; index < nums.length; index++) {
//            if (nums[index] != index + 1) {
//                ans.add(index + 1);
//            }
//        }
//        return ans;
//    }
//    void swap(int[] arr, int first, int second) {
//        int temp = arr[first];
//        arr[first] = arr[second];
//        arr[second] = temp;
//    }
//}
