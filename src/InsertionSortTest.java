import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Arrays;


class InsertionSortTest {
    private InsertionSort is;

    @Before
    public void setUp() {
        is = new InsertionSort();
    }

    // Run test for unsorted list
    @org.junit.jupiter.api.Test
    @Test
    public void testUnsortedArray() {
        int[] nums = {9,8,7,6,5,4,3,2,1};
        int[] sortedNum = {1,2,3,4,5,6,7,8,9};

        is.insertionSort(nums);
        Assertions.assertArrayEquals(nums,sortedNum);


    }

    // Run test for sorted list
    @org.junit.jupiter.api.Test
    @Test
    public void testSortedArray() {
        int [] testArray = {1,2,3,4,5,6,7,8,9};
        int [] sortedArray = {1,2,3,4,5,6,7,8,9};

        is.insertionSort(testArray);
        Assertions.assertArrayEquals(testArray,sortedArray);
    }

    // Run test for empty list
    @org.junit.jupiter.api.Test
    @Test
    public void testingEmptyArray() {
        int[] empty_array = new int[] {};
        int[] empty_result = new int[] {};

        is.insertionSort(empty_array);
        Assertions.assertEquals(Arrays.toString(empty_array),Arrays.toString(empty_result));
    }

    @After
    public void cleanUp() {
        is = null;
    }
}