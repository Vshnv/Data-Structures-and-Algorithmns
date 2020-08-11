package com.github.vshnv.dsa.sorting;

import com.github.vshnv.dsa.ArrayUtil;

public class MergeSort extends SortingAlgorithmn {
    private boolean steps = false;
    private int mergeCount = 0;
    @Override
    public void sort(int[] arr, boolean steps) {
        this.steps = steps;
        sort(arr, 0, arr.length - 1);
        stepCheck(steps);
    }


    private void sort(int[] arr, int left, int right) {
        if (left >= right) return;

        int middle = (left + right) / 2;

        sort(arr, left, middle);
        sort(arr, middle + 1, right);

        merge(arr, left, middle, right);
    }

    private void merge(int[] arr, int left, int middle, int right) { // 0 5 10
        mergeCount++;
        int[] lArr = new int[middle - left + 1];
        int[] rArr = new int[right - middle];
        fillSubArray(arr, lArr, left, middle);
        fillSubArray(arr, rArr, middle + 1, right);
        int i = 0;
        int j = 0;
        int index = left;

        while (i < lArr.length && j < rArr.length) {
            compares++;
            if (lArr[i] <= rArr[j]) {
                arr[index] = lArr[i];
                i++;
            } else {
                arr[index] = rArr[j];
                j++;
            }
            index++;
        }

        while (i < lArr.length) {
            compares++;
            arr[index] = lArr[i];
            i++;
            index++;
        }

        while (j < rArr.length) {
            compares++;
            arr[index] = rArr[j];
            j++;
            index++;
        }
        compares+=3;
        if (steps) {
            ArrayUtil.printArray(arr, "Merge " + mergeCount++, left, right);
        }
    }

    private void fillSubArray(int[] originalArr, int[] nArr, int left, int right) {
        for (int i = left; i <= right; i++) {
            nArr[i - left] = originalArr[i];
        }
    }
}
