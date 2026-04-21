package org.example.sof3041sp26sof3041_01.service;

import org.example.sof3041sp26sof3041_01.entity.SinhVien;
import java.util.ArrayList;
import java.util.List;

public class SinhVienService {

    private List<SinhVien> sinhViens = new ArrayList<>();

    public void addSinhVien(SinhVien sinhVien) {

        if (sinhVien == null) {
            throw new IllegalArgumentException("SinhVien can not be null");
        }

        // Validate các trường không được để trống theo đề bài
        if (sinhVien.getMaSV() == null || sinhVien.getMaSV().isEmpty() ||
                sinhVien.getTen() == null || sinhVien.getTen().isEmpty()) {
            throw new IllegalArgumentException("Fields can not be empty");
        }

        sinhViens.add(sinhVien);
    }

    public SinhVien getSinhVienByMa(String maSV) {

        for (SinhVien sinhVien : sinhViens) {
            if (sinhVien.getMaSV().equals(maSV)) {
                return sinhVien;
            }
        }

        return null;
    }

    public void updateSinhVien(SinhVien sinhVien) {

        if (sinhVien == null) {
            throw new IllegalArgumentException("SinhVien can not be null");
        }

        for (int i = 0; i < sinhViens.size(); ++i) {

            if (sinhViens.get(i).getMaSV().equals(sinhVien.getMaSV())) {
                sinhViens.set(i, sinhVien);
                return;
            }
        }

        throw new IllegalArgumentException("SinhVien with ma " + sinhVien.getMaSV() + " does not exist");
    }

    public List<SinhVien> getAllSinhViens() {

        return sinhViens;
    }
}