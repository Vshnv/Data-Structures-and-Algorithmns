package com.github.vshnv.dsa.sorting;

import com.github.vshnv.dsa.ArrayUtil;

public class SelectionSort extends SortingAlgorithmn{
    @Override
    public void sort(int[] arr, boolean steps) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                compares++;
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
            if (steps) {
                ArrayUtil.printArray(arr, "Swap " + i);
            }
        }

        stepCheck(steps);
    }
}
