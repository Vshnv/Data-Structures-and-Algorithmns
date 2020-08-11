package com.github.vshnv.dsa.searching;

public class LinearSearch extends SearchingAlgorithmn {
    @Override
    public int search(int[] arr, int target, boolean steps) {
        for (int i = 0; i < arr.length; i++) {
            compares++;
            if (arr[i] == target) {
                printStats(steps);
                return i;
            }
        }
        printStats(steps);
        return -1;
    }
}
