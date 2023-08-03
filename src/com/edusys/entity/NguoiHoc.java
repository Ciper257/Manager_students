package com.edusys.entity;

public class NguoiHoc {
    public String MaKH;
    public String HoTen;
    public String NgaySinh;
    public Boolean GioiTinh;
    public String DienThoai;
    public String GhiChu;
    public String MaNV;
    public String NgayDK;

    public NguoiHoc() {
    }

    public NguoiHoc(String MaKH, String HoTen, String NgaySinh, Boolean GioiTinh, String DienThoai, String GhiChu, String MaNV, String NgayDK) {
        this.MaKH = MaKH;
        this.HoTen = HoTen;
        this.NgaySinh = NgaySinh;
        this.GioiTinh = GioiTinh;
        this.DienThoai = DienThoai;
        this.GhiChu = GhiChu;
        this.MaNV = MaNV;
        this.NgayDK = NgayDK;
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public Boolean getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(Boolean GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getDienThoai() {
        return DienThoai;
    }

    public void setDienThoai(String DienThoai) {
        this.DienThoai = DienThoai;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getNgayDK() {
        return NgayDK;
    }

    public void setNgayDK(String NgayDK) {
        this.NgayDK = NgayDK;
    }
    
}
