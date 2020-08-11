package com.github.vshnv.dsa;

import com.github.vshnv.dsa.sorting.*;

public class SortingUtil {
    static void selectionSort(int[] arr) {
        new SelectionSort().sort(arr, true);
    }
    static void bubbleSort(int[] arr) {
        new BubbleSort().sort(arr, true);
    }
    static void insertionSort(int[] arr) {
        new InsertionSort().sort(arr, true);
    }
    static void mergeSort(int[] arr) {
        new MergeSort().sort(arr, true);
    }
    static void quickSort(int[] arr) {
        new QuickSort().sort(arr, true);
    }
}
