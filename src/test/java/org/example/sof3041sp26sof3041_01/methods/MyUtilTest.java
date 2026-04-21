package org.example.sof3041sp26sof3041_01.methods;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class MyUtilTest {

    static MyUtil myUtil;

    //
    @BeforeAll
    static void setUpBeforeAll() {

        System.out.println("Set up before all");
        myUtil = new MyUtil();
    }

    @AfterAll
    static void tearDownAfterAll() {

        System.out.println("Tear down after all");
    }

    @BeforeEach
    void setUp() {

        System.out.println("Set up before each");
    }

    @AfterEach
    void tearDown() {

        System.out.println("Tear down after each");
    }

    @Test
    @DisplayName("Tinh tong mang so nguyen")
    void test_tinhTong() {
        int[] mang = {1, 2, 3, 4, 5};
        Assertions.assertEquals(15, myUtil.tinhTong(mang));
    }

    @Test
    @DisplayName("Tinh tong mang rong")
    void test_tinhTongRong() {
        int[] mang = {};
        Assertions.assertEquals(0, myUtil.tinhTong(mang));
    }

    @Test
    @DisplayName("Cong")
    void add() {

        int result = myUtil.add(1, 2);

        Assertions.assertEquals(3, result);

    }

    @Test
    @DisplayName("Dao nguoc thu tu")
    void reverse() {

        Assertions.assertEquals("cba", myUtil.reverse("abc"));
    }

    //
    @Test
    @DisplayName("assertNull")
    void test_assertNull() {

        Assertions.assertNull(null);
    }

    @Test
    @DisplayName("assertNotNull")
    void test_assertNotNull() {

        Assertions.assertNotNull(1);
    }

    @Test
    @DisplayName("assertSame")
    void test_assertSame() {

        Assertions.assertSame("Hi", "Hi");
    }

    @Test
    @DisplayName("assertNotSame")
    void test_assertNotSame() {

        Assertions.assertNotSame("Hi", "Hello");
    }

    @Test
    @DisplayName("assertTrue")
    void test_assertTrue() {

        Assertions.assertTrue(3 > 0);
    }

    //
    @Test
    @DisplayName("for Arrays")
    void test_assertArrayEquals() {

        String[] s1 = {"A", "B"};
        String[] s2 = {"A", "B"};
        Assertions.assertArrayEquals(s1, s2);
    }

    //
    @Test
    @DisplayName("assertThrows")
    void test_assertThrows() {

        Assertions.assertThrows(RuntimeException.class, () -> {
           throw new RuntimeException();
        });
    }
}