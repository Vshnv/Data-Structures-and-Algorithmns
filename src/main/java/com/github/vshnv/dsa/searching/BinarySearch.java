package com.github.vshnv.dsa.searching;

import java.util.Arrays;

public class BinarySearch extends SearchingAlgorithmn {
    @Override
    public int search(int[] arr, int target, boolean steps) {
        Arrays.sort(arr);
        return binarySearch(arr, 0, arr.length - 1, target);
    }


    private int binarySearch(int arr[], int l, int r, int target) {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == target) return mid;


            if (arr[mid] > target) return binarySearch(arr, l, mid - 1, target);
            return binarySearch(arr, mid + 1, r, target);
        }
        return -1;
    }
}
