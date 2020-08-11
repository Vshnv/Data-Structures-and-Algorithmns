package com.github.vshnv.dsa;

import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

public class Sorting {
    private Random random = new Random();

    @Test
    public void testSelectionbSortSimple() {
        int[] input = {5, 8, 6, 9, 7, 4, 1, 3, 2};
        SortingUtil.insertionSort(input);
        assert Arrays.equals(input, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
    }

    @Test
    public void testSelectionSort1() {
        int n = Math.abs(random.nextInt(100));
        int[] input = new int[n];
        populateRandom(input);
        int[] result = input.clone();
        Arrays.sort(result);

        ArrayUtil.printArray(input, "UnSorted");
        SortingUtil.selectionSort(input);
        ArrayUtil.printArray(input, "Sorted");
        ArrayUtil.printArray(result, "Expected");

        assert Arrays.equals(input, result);
    }

    @Test
    public void testBubbleSortSimple() {
        int[] input = {5, 8, 6, 9, 7, 4, 1, 3, 2};
        SortingUtil.bubbleSort(input);
        assert Arrays.equals(input, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
    }

    @Test
    public void testBubbleSort1() {
        int n = Math.abs(random.nextInt(100));
        int[] input = new int[n];
        populateRandom(input);
        int[] result = input.clone();
        Arrays.sort(result);

        ArrayUtil.printArray(input, "UnSorted");
        SortingUtil.bubbleSort(input);
        ArrayUtil.printArray(input, "Sorted");
        ArrayUtil.printArray(result, "Expected");

        assert Arrays.equals(input, result);
    }

    @Test
    public void testInsertionSortSimple() {
        int[] input = {5, 8, 6, 9, 7, 4, 1, 3, 2};
        SortingUtil.insertionSort(input);
        assert Arrays.equals(input, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
    }

    @Test
    public void testInsertionSort1() {
        int n = Math.abs(random.nextInt(100));
        int[] input = new int[n];
        populateRandom(input);
        int[] result = input.clone();
        Arrays.sort(result);

        ArrayUtil.printArray(input, "UnSorted");
        SortingUtil.insertionSort(input);
        ArrayUtil.printArray(input, "Sorted");
        ArrayUtil.printArray(result, "Expected");

        assert Arrays.equals(input, result);
    }

    @Test
    public void testMergeSortSimple() {
        int[] input = {5, 8, 6, 9, 7, 4, 1, 3, 2};
        SortingUtil.mergeSort(input);
        assert Arrays.equals(input, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
    }


    @Test
    public void testMergeSort1() {
        int n = Math.abs(random.nextInt(100));
        int[] input = new int[n];
        populateRandom(input);
        int[] result = input.clone();
        Arrays.sort(result);

        ArrayUtil.printArray(input, "UnSorted");
        SortingUtil.mergeSort(input);
        ArrayUtil.printArray(input, "Sorted");
        ArrayUtil.printArray(result, "Expected");

        assert Arrays.equals(input, result);
    }

    @Test
    public void testQuickSortSimple() {
        int[] input = {5, 8, 6, 9, 7, 4, 1, 3, 2};
        SortingUtil.quickSort(input);
        assert Arrays.equals(input, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
    }







    void populateRandom(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt();
        }
    }
}
