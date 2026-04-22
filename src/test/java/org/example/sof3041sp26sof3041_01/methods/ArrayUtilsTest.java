package org.example.sof3041sp26sof3041_01.methods;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArrayUtilsTest {

    private ArrayUtils arrayUtils = new ArrayUtils();

    @Test
    void findMaxWithPositiveNumbers() {
        int[] arr = {1, 5, 3, 9, 2};
        Assertions.assertEquals(9, arrayUtils.findMax(arr));
    }

    @Test
    void findMaxWithNegativeNumbers() {
        int[] arr = {-10, -5, -20, -2};
        Assertions.assertEquals(-2, arrayUtils.findMax(arr));
    }

    @Test
    void findMaxWithSingleElement() {
        int[] arr = {7};
        Assertions.assertEquals(7, arrayUtils.findMax(arr));
    }
}