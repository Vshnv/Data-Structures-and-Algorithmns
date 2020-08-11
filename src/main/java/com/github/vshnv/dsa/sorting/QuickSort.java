package com.github.vshnv.dsa.sorting;

import com.github.vshnv.dsa.ArrayUtil;

public class QuickSort extends SortingAlgorithmn {
    private boolean steps = false;
    int partIndex = 0;
    @Override
    public void sort(int[] arr, boolean steps) {
        this.steps = steps;
        sort(arr, 0, arr.length - 1);
        stepCheck(steps);
    }

    private void sort(int[] arr, int l, int r) {
        if (l < r) {
            partIndex++;
            int index = partition(arr, l, r);
            if (steps) {
                ArrayUtil.printArray(arr, "Partition " + partIndex);
            }
            sort(arr, l, index - 1);
            sort(arr, index + 1, r);
        }
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j <= high- 1; j++) {
            compares++;
            if (arr[j] < pivot) {
                i++;
                swap(arr, i , j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }
}
