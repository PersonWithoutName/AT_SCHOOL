package prikhozhaev;

import java.util.Arrays;

class SortTest {

    static void testReverseSort(int[] arr) {
        System.out.println("Sort.reverseSort method test: ");
        System.out.println("Expected: " + Arrays.toString(SortTest.bubbleReversSorting(arr)));
        System.out.println("Result: " + Arrays.toString(Sort.reverseSort(arr)));
    }

    private static int[] bubbleReversSorting(int[] sortedArray) {
        for (int i = 0; i < sortedArray.length; i++) {
            for (int j = sortedArray.length - 1; j > i; j--) {
                if (sortedArray[i] < sortedArray[j]) {
                    int tmp = sortedArray[i];
                    sortedArray[i] = sortedArray[j];
                    sortedArray[j] = tmp;
                }
            }
        }
        return sortedArray;
    }
}
