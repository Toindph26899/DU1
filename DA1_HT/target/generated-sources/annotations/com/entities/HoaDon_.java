package com.entities;

import com.entities.GiamGia;
import com.entities.HoaDonChiTiet;
import com.entities.KhachHang;
import com.entities.NhanVien;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-11-24T23:28:56", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(HoaDon.class)
public class HoaDon_ { 

    public static volatile SingularAttribute<HoaDon, String> sdtNguoiShip;
    public static volatile SingularAttribute<HoaDon, GiamGia> idGiamGia;
    public static volatile SingularAttribute<HoaDon, NhanVien> idNhanVien;
    public static volatile SingularAttribute<HoaDon, String> tenKh;
    public static volatile SingularAttribute<HoaDon, KhachHang> idKH;
    public static volatile SingularAttribute<HoaDon, BigInteger> soTienGiam;
    public static volatile SingularAttribute<HoaDon, Date> ngayTao;
    public static volatile SingularAttribute<HoaDon, BigInteger> ngayNhan;
    public static volatile SingularAttribute<HoaDon, String> ma;
    public static volatile SingularAttribute<HoaDon, Date> ngayShip;
    public static volatile SingularAttribute<HoaDon, String> maVanChuyen;
    public static volatile SingularAttribute<HoaDon, Integer> tinhTrang;
    public static volatile SingularAttribute<HoaDon, String> sdtNguoiNhan;
    public static volatile SingularAttribute<HoaDon, Date> ngayThanhToan;
    public static volatile SingularAttribute<HoaDon, String> tenNguoiShip;
    public static volatile SingularAttribute<HoaDon, String> id;
    public static volatile SingularAttribute<HoaDon, BigInteger> tienCoc;
    public static volatile ListAttribute<HoaDon, HoaDonChiTiet> hoaDonChiTietList;
    public static volatile SingularAttribute<HoaDon, BigInteger> tienShip;

}