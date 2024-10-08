package com.example.thiet_ke_giao_dien;

public class DonHang {
    private String maDonHang;
    private String maKhachHang;
    private String ngayDatHang;
    private String trangThai;

    public DonHang(String maDonHang, String maKhachHang, String ngayDatHang, String trangThai) {
        this.maDonHang = maDonHang;
        this.maKhachHang = maKhachHang;
        this.ngayDatHang = ngayDatHang;
        this.trangThai = trangThai;
    }

    public String getMaDonHang() {
        return maDonHang;
    }

    public void setMaDonHang(String maDonHang) {
        this.maDonHang = maDonHang;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getNgayDatHang() {
        return ngayDatHang;
    }

    public void setNgayDatHang(String ngayDatHang) {
        this.ngayDatHang = ngayDatHang;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
}
