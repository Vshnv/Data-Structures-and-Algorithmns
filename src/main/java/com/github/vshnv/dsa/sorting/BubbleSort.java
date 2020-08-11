package com.github.vshnv.dsa.sorting;

import com.github.vshnv.dsa.ArrayUtil;

public class BubbleSort extends SortingAlgorithmn {
    @Override
    public void sort(int[] arr, boolean steps) {
        for (int i = 0; i < arr.length; i++) {
            bubble(arr);
            ArrayUtil.printArray(arr, "Pass " + i);
        }
        stepCheck(steps);
    }



    private void bubble(int[] arr) {
        for (int i = 0; i < arr.length - 1 ; i++) {
            compares++;
            if (arr[i] > arr[i + 1]) {
                swap(arr, i , i + 1);
            }
        }
    }
}
