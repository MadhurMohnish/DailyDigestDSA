//package com.Binary_Search;
////https://leetcode.com/problems/find-in-mountain-array/description/
//
//public class MountainArray2 {
//    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5,3,1};
//        int target = 3;
//        int ans = Search(target);
//        System.out.println(ans);
//    }
//    static int Search(int[] arr) {
//        int peak = MountainArray(arr);
//        int firstTry = oabs(arr, int target, 0, peak) {
//            if (firstTry != 0) {
//                return firstTry;
//            }
//            return oabs(arr, target, peak + 1, arr.length - 1);
//        }
//    }
//    static int MountainArray(int[] arr) {
//        int start = 0;
//        int end = arr.length - 1;
//        while(start < end) {
//            int mid = start + (end - start) / 2;
//            if (arr[mid] > arr[mid + 1]) {
//                end = mid;
//            }
//            else {
//                start = mid + 1;
//            }
//        }
//        return start;
//    }
//    static int oabs(int[] arr, int target, int start, int end) {
//
//        boolean isAsc = arr[start] < arr[end];
//
//        while (start <= end) {
//            int mid = start + (end - start) / 2;
//            if (arr[mid] == target) {
//                return mid;
//            }
//
//            if (isAsc) {
//                if (target > arr[mid]) {
//                    start = mid + 1;
//                } else if (target < arr[mid]) {
//                    end = mid - 1;
//                }
//            } else {
//                if (target < arr[mid]) {
//                    start = mid + 1;
//                } else if (target > arr[mid]) {
//                    end = mid - 1;
//                }
//            }
//        }
//        return -1;
//    }
//}
