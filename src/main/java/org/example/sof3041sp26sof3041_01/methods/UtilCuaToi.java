package org.example.sof3041sp26sof3041_01.methods;

import java.util.List;

public class UtilCuaToi {

    public int tinhTich(List<Integer> danhSach) {

        if (danhSach == null || danhSach.isEmpty()) {
            return 0;
        }

        int tich = 1;
        for (Integer so : danhSach) {
            tich = tich * so;
        }

        return tich;
    }
}