package com.github.vshnv.dsa.sorting;

import com.github.vshnv.dsa.ArrayUtil;

public class InsertionSort extends SortingAlgorithmn {
    @Override
    public void sort(int[] arr, boolean steps) {
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            while (j >= 0 && arr[j] > arr[j + 1]) {
                compares++;
                swap(arr, j , j + 1);
                j--;
            }
            compares++;

            if (steps) {
                ArrayUtil.printArray(arr, "Insertion " + i);
            }
        }
        stepCheck(steps);
    }
}
