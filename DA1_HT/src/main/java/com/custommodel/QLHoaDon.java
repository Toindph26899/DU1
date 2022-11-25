 
package com.custommodel;

 
public class QLHoaDon {
     private String id;
     private String tenKH;
     private String sdtKH;
     private String maNV;
     private String ngayTao;
     private String ngayThanhToan;
     private String hinhThucThanhToan;
     private String ghiChu;

    public QLHoaDon() {
    }

    public QLHoaDon(String id, String tenKH, String sdtKH, String maNV, String ngayTao, String ngayThanhToan, String hinhThucThanhToan, String ghiChu) {
        this.id = id;
        this.tenKH = tenKH;
        this.sdtKH = sdtKH;
        this.maNV = maNV;
        this.ngayTao = ngayTao;
        this.ngayThanhToan = ngayThanhToan;
        this.hinhThucThanhToan = hinhThucThanhToan;
        this.ghiChu = ghiChu;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getSdtKH() {
        return sdtKH;
    }

    public void setSdtKH(String sdtKH) {
        this.sdtKH = sdtKH;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(String ngayTao) {
        this.ngayTao = ngayTao;
    }

    public String getNgayThanhToan() {
        return ngayThanhToan;
    }

    public void setNgayThanhToan(String ngayThanhToan) {
        this.ngayThanhToan = ngayThanhToan;
    }

    public String getHinhThucThanhToan() {
        return hinhThucThanhToan;
    }

    public void setHinhThucThanhToan(String hinhThucThanhToan) {
        this.hinhThucThanhToan = hinhThucThanhToan;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
     
    
}
