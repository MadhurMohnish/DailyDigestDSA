package com.Binary_Search;

public class OrderAgsBS {
    public static void main(String[] args) {
        int[] arr = {90, 60, 56, 45, 34, 32, 21, 10, 9, 8, 7, 6, 5};
        int target = 32;
        int ans = oabs(arr, target);
        System.out.println(ans);
    }
    static int oabs(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (arr[mid] == target) {
                    return mid;
                }

                if (isAsc) {
                    if (target > arr[mid]) {
                        start = mid + 1;
                    } else if (target < arr[mid]) {
                        end = mid - 1;
                    }
                } else {
                    if (target < arr[mid]) {
                        start = mid + 1;
                    } else if (target > arr[mid]) {
                        end = mid - 1;
                    }
                }
        }
        return -1;
    }
}
