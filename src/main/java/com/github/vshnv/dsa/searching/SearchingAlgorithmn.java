package com.github.vshnv.dsa.searching;

public abstract class SearchingAlgorithmn {
    int compares = 0;
    public abstract int search(int[] arr, int target, boolean steps);
    protected void printStats(boolean steps) {
        if (steps)
            System.out.printf("Compares done: " + compares);
    }
}
