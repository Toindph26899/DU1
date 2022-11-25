package com.custommodel;

import java.util.Date;

public class HoaDonCustom {

    private String id;
    private String maHD;
    private String tenNhanVien;
    private String tenKh;
    private Date ngayTao;
    private Date ngayThanhToan;
    private int tinhTrang;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public String getTenKh() {
        return tenKh;
    }

    public void setTenKh(String tenKh) {
        this.tenKh = tenKh;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public Date getNgayThanhToan() {
        return ngayThanhToan;
    }

    public void setNgayThanhToan(Date ngayThanhToan) {
        this.ngayThanhToan = ngayThanhToan;
    }

    public int getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(int tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public HoaDonCustom() {
    }

    public HoaDonCustom(String id, String maHD, String tenNhanVien, String tenKh, Date ngayTao, Date ngayThanhToan, int tinhTrang) {
        this.id = id;
        this.maHD = maHD;
        this.tenNhanVien = tenNhanVien;
        this.tenKh = tenKh;
        this.ngayTao = ngayTao;
        this.ngayThanhToan = ngayThanhToan;
        this.tinhTrang = tinhTrang;
    }

    @Override
    public String toString() {
        return "HoadonCustom{" + "id=" + id + ", maHD=" + maHD + ", tenNhanVien=" + tenNhanVien + ", tenKh=" + tenKh + ", ngayTao=" + ngayTao + ", ngayThanhToan=" + ngayThanhToan + ", tinhTrang=" + tinhTrang + '}';
    }

}
