package com.example.thiet_ke_giao_dien;

public class SanPham {
    private int anhSanPham;
    private String tenSanPham;
    private int soLuong;
    private String tacGia;
    private int giaBan;

    public SanPham(int anhSanPham, String tenSanPham, int soLuong, String tacGia, int giaBan) {
        this.anhSanPham = anhSanPham;
        this.tenSanPham = tenSanPham;
        this.soLuong = soLuong;
        this.tacGia = tacGia;
        this.giaBan = giaBan;
    }

    public int getAnhSanPham() {
        return anhSanPham;
    }

    public void setAnhSanPham(int anhSanPham) {
        this.anhSanPham = anhSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }
}
