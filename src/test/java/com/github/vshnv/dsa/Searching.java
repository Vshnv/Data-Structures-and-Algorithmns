package com.github.vshnv.dsa;

import com.github.vshnv.dsa.searching.BinarySearch;
import com.github.vshnv.dsa.searching.LinearSearch;
import org.junit.Test;

public class Searching {
    @Test
    public void testLinearSearch() {
        int[] arr = {1,2,3,8,9,6,5,4,4,5,6,7,8,9};
        assert new LinearSearch().search(arr, 5, true) == 7;
    }
    @Test
    public void testBinarySearch() {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        assert new BinarySearch().search(arr, 5, true) == 4;
    }
}
