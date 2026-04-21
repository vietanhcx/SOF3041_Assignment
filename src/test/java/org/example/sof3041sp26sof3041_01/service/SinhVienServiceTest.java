package org.example.sof3041sp26sof3041_01.service;

import org.example.sof3041sp26sof3041_01.entity.SinhVien;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class SinhVienServiceTest {

    private SinhVienService sinhVienService;

    @BeforeEach
    void setUp() {

        sinhVienService = new SinhVienService();
    }

    // addSinhVien()
    @Test
    void addSinhVienWithValidSinhVien() {

        SinhVien sv = new SinhVien("SV01", "Anh", 19, 9.0f, 3, "PTPM");
        sinhVienService.addSinhVien(sv);

        assertEquals(1, sinhVienService.getAllSinhViens().size());
        assertEquals("Anh", sinhVienService.getSinhVienByMa("SV01").getTen());
    }

    @Test
    void addSinhVienWithNull() {

        Exception exception = assertThrows(IllegalArgumentException.class, () -> sinhVienService.addSinhVien(null));
        assertEquals("SinhVien can not be null", exception.getMessage());
    }

    @Test
    void addSinhVienWithEmptyFields() {

        SinhVien sv = new SinhVien("", "", 19, 9.0f, 3, "PTPM");
        Exception exception = assertThrows(IllegalArgumentException.class, () -> sinhVienService.addSinhVien(sv));
        assertEquals("Fields can not be empty", exception.getMessage());
    }

    // updateSinhVien
    @Test
    void updateSinhVienWithValidSinhVien() {

        SinhVien sv = new SinhVien("SV01", "Anh", 19, 9.0f, 3, "PTPM");
        sinhVienService.addSinhVien(sv);

        sv.setTen("Viet Anh");
        sinhVienService.updateSinhVien(sv);

        assertEquals("Viet Anh", sinhVienService.getSinhVienByMa("SV01").getTen());
    }

    @Test
    void updateSinhVienWithNonExistId() {

        SinhVien sv = new SinhVien("SV99", "NoName", 20, 5.0f, 1, "PTPM");
        Exception exception = assertThrows(IllegalArgumentException.class, () -> sinhVienService.updateSinhVien(sv));
        assertEquals("SinhVien with ma SV99 does not exist", exception.getMessage());
    }
}