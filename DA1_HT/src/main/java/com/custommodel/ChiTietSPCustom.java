package com.custommodel;

import java.math.BigInteger;

public class ChiTietSPCustom {

    private String id;
    private String anh;
    private String tenSp;
    private BigInteger giaBan;
    private int soLuong;

//    public ChiTietSPCustom(String id, String anh, String tenSp, String giaBan, int soLuong) {
//        this.id = id;
//        this.anh = anh;
//        this.tenSp = tenSp;
//        this.giaBan = giaBan;
//        this.soLuong = soLuong;
//    }
    
    public ChiTietSPCustom(String id, String tenSp, BigInteger giaBan, int soLuong) {
        this.id = id;
        this.tenSp = tenSp;
        this.giaBan = giaBan;
        this.soLuong = soLuong;
    }

    public ChiTietSPCustom() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public BigInteger getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(BigInteger giaBan) {
        this.giaBan = giaBan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        return "ChiTietSPCustom{" + "id=" + id + ", anh=" + anh + ", tenSp=" + tenSp + ", giaBan=" + giaBan + ", soLuong=" + soLuong + '}';
    }

}
