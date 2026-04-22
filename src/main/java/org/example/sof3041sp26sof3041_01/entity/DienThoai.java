package org.example.sof3041sp26sof3041_01.entity;

public class DienThoai {
    private String id;
    private String ten;
    private String hang;
    private double gia;
    private int boNho;
    private boolean trangThai;

    public DienThoai() {
    }

    public DienThoai(String id, String ten, String hang, double gia, int boNho, boolean trangThai) {
        this.id = id;
        this.ten = ten;
        this.hang = hang;
        this.gia = gia;
        this.boNho = boNho;
        this.trangThai = trangThai;
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

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getBoNho() {
        return boNho;
    }

    public void setBoNho(int boNho) {
        this.boNho = boNho;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }
}
