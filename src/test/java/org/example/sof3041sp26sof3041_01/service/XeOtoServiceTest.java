package org.example.sof3041sp26sof3041_01.service;

import org.example.sof3041sp26sof3041_01.entity.XeOto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class XeOtoServiceTest {

    private XeOtoService xeOtoService;

    @BeforeEach
    void setUp() {

        xeOtoService = new XeOtoService();
    }

    // suaXeOto()
    @Test
    void updateXeOtoWithValidXeOto() {

        XeOto xe = new XeOto("1", "Toyota", 500, "Moi", 10, "Sedan");

        xeOtoService.suaXeOto(xe, "Toyota Vios");

        assertEquals("Toyota Vios", xe.getTen());
    }

    @Test
    void updateXeOtoWithNull() {

        Exception exception = assertThrows(IllegalArgumentException.class, () -> xeOtoService.suaXeOto(null, "Ten Moi"));
        assertEquals("Xe can not be null", exception.getMessage());
    }

    @Test
    void updateXeOtoWithInvalidTen() {

        XeOto xe = new XeOto("1", "Toyota", 500, "Moi", 10, "Sedan");

        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                xeOtoService.suaXeOto(xe, "Toyota@Vios!"));
        assertEquals("Ten moi khong duoc chua ky tu dac biet", exception.getMessage());
    }

    // xoaXeOto()
    @Test
    void deleteXeOtoWithValidId() {

        XeOto xe = new XeOto("1", "Toyota", 500, "Moi", 10, "Sedan");
        xeOtoService.addXe(xe); // Gia su co ham add de test xoa

        xeOtoService.xoaXeOto("1");

        assertEquals(0, xeOtoService.getAll().size());
    }

    @Test
    void deleteXeOtoWithNonExistId() {

        Exception exception = assertThrows(IllegalArgumentException.class, () -> xeOtoService.xoaXeOto("99"));
        assertEquals("Xe with id 99 does not exist", exception.getMessage());
    }

    // Validation
    @Test
    void addXeOtoWithInvalidSoLuong() {

        // Validate so luong phai > 0
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                xeOtoService.addXe(new XeOto("2", "Honda", 300, "Ben", 0, "Hatchback")));

        assertEquals("So luong phai la so nguyen duong", exception.getMessage());
    }

}