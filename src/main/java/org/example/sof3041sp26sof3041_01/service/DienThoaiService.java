package org.example.sof3041sp26sof3041_01.service;

import org.example.sof3041sp26sof3041_01.entity.DienThoai;
import java.util.ArrayList;
import java.util.List;

public class DienThoaiService {
    private List<DienThoai> list = new ArrayList<>();

    public void themDienThoai(DienThoai dt) {
        if (dt.getId() == null || dt.getId().trim().isEmpty() || dt.getTen() == null || dt.getTen().trim().isEmpty()) {
            throw new IllegalArgumentException("ID và Tên không được để trống");
        }
        if (dt.getGia() <= 0 || dt.getBoNho() <= 0) {
            throw new IllegalArgumentException("Giá và Bộ nhớ phải > 0");
        }
        list.add(dt);
    }

    public DienThoai timKiemTheoTen(String ten) {
        for (DienThoai dt : list) {
            if (dt.getTen().equalsIgnoreCase(ten)) {
                return dt;
            }
        }
        return null;
    }

    public List<DienThoai> getAll() { return list; }
}