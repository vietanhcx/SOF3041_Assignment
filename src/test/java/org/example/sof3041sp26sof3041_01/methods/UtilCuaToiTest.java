package org.example.sof3041sp26sof3041_01.methods;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

class UtilCuaToiTest {

    private UtilCuaToi utilCuaToi;

    @BeforeEach
    void setUp() {
        utilCuaToi = new UtilCuaToi();
    }

    @Test
    void testTinhTichBinhThuong() {
        Assertions.assertEquals(24, utilCuaToi.tinhTich(Arrays.asList(2, 3, 4)));
    }

    @Test
    void testTinhTichCoSo0() {
        Assertions.assertEquals(0, utilCuaToi.tinhTich(Arrays.asList(5, 0, 10)));
    }

    @Test
    void testTinhTichCoSoAm() {
        Assertions.assertEquals(-30, utilCuaToi.tinhTich(Arrays.asList(5, -2, 3)));
    }
}