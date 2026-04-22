package org.example.sof3041sp26sof3041_01.service;

import org.example.sof3041sp26sof3041_01.entity.XeOto;
import java.util.ArrayList;
import java.util.List;

public class XeOtoService {

    private List<XeOto> danhSachXe = new ArrayList<>();

    public void addXe(XeOto xe) {
        // Validate số lượng dương và tên không chứa ký tự đặc biệt
        if (xe.getSoLuong() <= 0) {
            throw new IllegalArgumentException("So luong phai la so nguyen duong");
        }
        if (!xe.getTen().matches("^[a-zA-Z0-9 ]*$")) {
            throw new IllegalArgumentException("Ten khong duoc chua ky tu dac biet");
        }
        danhSachXe.add(xe);
    }

    public void suaXeOto(XeOto xe, String tenMoi) {
        if (xe == null) {
            throw new IllegalArgumentException("Xe can not be null");
        }
        // Validate tên mới
        if (!tenMoi.matches("^[a-zA-Z0-9 ]*$")) {
            throw new IllegalArgumentException("Ten moi khong duoc chua ky tu dac biet");
        }
        xe.setTen(tenMoi);
    }

    public void xoaXeOto(String id) {
        boolean removed = danhSachXe.removeIf(xe -> xe.getId().equals(id));
        if (!removed) {
            throw new IllegalArgumentException("Xe with id " + id + " does not exist");
        }
    }

    public List<XeOto> getAll() { return danhSachXe; }
}