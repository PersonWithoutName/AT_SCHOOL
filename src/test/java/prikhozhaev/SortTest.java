package prikhozhaev;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SortTest {

    public void testSort() {
        testReverseSort();
    }

//    @ParameterizedTest
//    @MethodSource("prikhozhaev.Providers#testSort")
    @Test
    @DisplayName("Тест метода prikhozhaev.Sort.reverseSort(int[] arr)")
    public void testReverseSort() {
            Assert.assertArrayEquals(new Integer[]{22, 5, 4, -1, -3}, Sort.reverseSort(new Integer[]{-3, -1, 4, 5, 22}));
    }
}
