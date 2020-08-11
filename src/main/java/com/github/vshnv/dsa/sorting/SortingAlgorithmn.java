package com.github.vshnv.dsa.sorting;

public abstract class SortingAlgorithmn {
    int compares = 0;
    int swaps = 0;
    abstract void sort(int[] arr, boolean steps);

    final protected void swap(int[] arr, int i, int j) {
        swaps++;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    final protected void stepCheck(boolean print) {
        if (print) {
            System.out.printf("Swaps performed = %d\nComparisions performed = %d\n", swaps, compares);
        }
    }
}
