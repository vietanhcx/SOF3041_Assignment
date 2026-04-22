package org.example.sof3041sp26sof3041_01.entity;

public class XeOto {

        private String id;
        private String ten;
        private float gia;
        private String ghiChu;
        private int soLuong;
        private String danhMuc;

    public XeOto() {
    }

    public XeOto(String id, String ten, float gia, String ghiChu, int soLuong, String danhMuc) {
        this.id = id;
        this.ten = ten;
        this.gia = gia;
        this.ghiChu = ghiChu;
        this.soLuong = soLuong;
        this.danhMuc = danhMuc;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getDanhMuc() {
        return danhMuc;
    }

    public void setDanhMuc(String danhMuc) {
        this.danhMuc = danhMuc;
    }
}
