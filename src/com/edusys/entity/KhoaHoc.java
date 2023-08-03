package com.edusys.entity;
public class KhoaHoc {
    public int MaKH;
    public String MaCD;
    public int ThoiLuong;
    public String NgayKG;
    public String GhiChu;
    public String MaNV;
    public String NgayTao;

    public KhoaHoc() {
    }

    public KhoaHoc(int MaKH, String MaCD, int ThoiLuong, String NgayKG, String GhiChu, String MaNV, String NgayTao) {
        this.MaKH = MaKH;
        this.MaCD = MaCD;
        this.ThoiLuong = ThoiLuong;
        this.NgayKG = NgayKG;
        this.GhiChu = GhiChu;
        this.MaNV = MaNV;
        this.NgayTao = NgayTao;
    }

    public int getMaKH() {
        return MaKH;
    }

    public void setMaKH(int MaKH) {
        this.MaKH = MaKH;
    }

    public String getMaCD() {
        return MaCD;
    }

    public void setMaCD(String MaCD) {
        this.MaCD = MaCD;
    }

    public int getThoiLuong() {
        return ThoiLuong;
    }

    public void setThoiLuong(int ThoiLuong) {
        this.ThoiLuong = ThoiLuong;
    }

    public String getNgayKG() {
        return NgayKG;
    }

    public void setNgayKG(String NgayKG) {
        this.NgayKG = NgayKG;
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

    public String getNgayTao() {
        return NgayTao;
    }

    public void setNgayTao(String NgayTao) {
        this.NgayTao = NgayTao;
    }
    
}
