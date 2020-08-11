package com.github.vshnv.dsa;

public class ArrayUtil {
    public static void printArray(int[] arr, String label) {
        System.out.print(label+": ");
        for (int element: arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void printArray(int[] arr, String label, int start, int end) {
        System.out.print(label+": ");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
