package com.entities;

import com.entities.Camera;
import com.entities.Chipse;
import com.entities.DongSP;
import com.entities.HoaDonChiTiet;
import com.entities.Imei;
import com.entities.ManHinh;
import com.entities.MauSac;
import com.entities.PhanLoaiHang;
import com.entities.Pin;
import com.entities.Ram;
import com.entities.Rom;
import com.entities.SanPham;
import com.entities.XuatXu;
import java.math.BigInteger;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-11-25T11:32:17", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(ChiTietSP.class)
public class ChiTietSP_ { 

    public static volatile SingularAttribute<ChiTietSP, BigInteger> giaNhap;
    public static volatile SingularAttribute<ChiTietSP, Rom> idRom;
    public static volatile SingularAttribute<ChiTietSP, BigInteger> giaBan;
    public static volatile SingularAttribute<ChiTietSP, ManHinh> idManHinh;
    public static volatile SingularAttribute<ChiTietSP, Camera> idCamera;
    public static volatile SingularAttribute<ChiTietSP, SanPham> idSP;
    public static volatile SingularAttribute<ChiTietSP, Pin> idPin;
    public static volatile SingularAttribute<ChiTietSP, MauSac> idMauSac;
    public static volatile SingularAttribute<ChiTietSP, Imei> idImei;
    public static volatile SingularAttribute<ChiTietSP, Chipse> idChipse;
    public static volatile SingularAttribute<ChiTietSP, Integer> soLuongTon;
    public static volatile SingularAttribute<ChiTietSP, Integer> trangThai;
    public static volatile SingularAttribute<ChiTietSP, Ram> idRam;
    public static volatile SingularAttribute<ChiTietSP, PhanLoaiHang> idPhanLoaiHang;
    public static volatile SingularAttribute<ChiTietSP, String> id;
    public static volatile SingularAttribute<ChiTietSP, Integer> namBH;
    public static volatile SingularAttribute<ChiTietSP, XuatXu> idXuatXu;
    public static volatile ListAttribute<ChiTietSP, HoaDonChiTiet> hoaDonChiTietList;
    public static volatile SingularAttribute<ChiTietSP, String> moTa;
    public static volatile SingularAttribute<ChiTietSP, DongSP> idDongSP;

}