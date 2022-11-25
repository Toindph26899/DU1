package com.custommodel;

import java.math.BigInteger;

public class HoaDonCTCustom {

    private String id;
    private String idHoaDon;
    private String idChiTietSP;
    private String tenSP;
    private int soLuong;
    private BigInteger donGia;
    private int trangThai;

    public HoaDonCTCustom() {
    }

    public HoaDonCTCustom(String id, String idHoaDon, String idChiTietSP, String tenSP, int soLuong, BigInteger donGia, int trangThai) {
        this.id = id;
        this.idHoaDon = idHoaDon;
        this.idChiTietSP = idChiTietSP;
        this.tenSP = tenSP;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.trangThai = trangThai;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdHoaDon() {
        return idHoaDon;
    }

    public void setIdHoaDon(String idHoaDon) {
        this.idHoaDon = idHoaDon;
    }

    public String getIdChiTietSP() {
        return idChiTietSP;
    }

    public void setIdChiTietSP(String idChiTietSP) {
        this.idChiTietSP = idChiTietSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public BigInteger getDonGia() {
        return donGia;
    }

    public void setDonGia(BigInteger donGia) {
        this.donGia = donGia;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "HoaDonCTCustom{" + "id=" + id + ", idHoaDon=" + idHoaDon + ", idChiTietSP=" + idChiTietSP + ", tenSP=" + tenSP + ", soLuong=" + soLuong + ", donGia=" + donGia + ", trangThai=" + trangThai + '}';
    }

}
