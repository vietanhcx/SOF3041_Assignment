package org.example.sof3041sp26sof3041_01.service;

import org.example.sof3041sp26sof3041_01.entity.DienThoai;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DienThoaiServiceTest {

    private DienThoaiService service;

    @BeforeEach
    void setUp() {
        service = new DienThoaiService();
    }

    @Test
    void themDienThoaiWithValidData() {
        DienThoai dt = new DienThoai("DT01", "iPhone 15", "Apple", 1000, 128, true);
        service.themDienThoai(dt);
        assertEquals(1, service.getAll().size());
    }

    @Test
    void themDienThoaiWithEmptyId() {
        DienThoai dt = new DienThoai(" ", "iPhone", "Apple", 1000, 128, true);
        Exception ex = assertThrows(IllegalArgumentException.class, () -> service.themDienThoai(dt));
        assertEquals("ID và Tên không được để trống", ex.getMessage());
    }

    @Test
    void timKiemTheoTenFound() {
        service.themDienThoai(new DienThoai("DT01", "S24", "Samsung", 900, 256, true));
        DienThoai found = service.timKiemTheoTen("S24");
        assertNotNull(found);
        assertEquals("DT01", found.getId());
    }

    @Test
    void timKiemTheoTenNotFound() {
        service.themDienThoai(new DienThoai("DT01", "S24", "Samsung", 900, 256, true));
        DienThoai found = service.timKiemTheoTen("Nokia");
        assertNull(found);
    }
}