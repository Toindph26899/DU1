package com.entities;

import com.entities.HoaDon;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-11-24T23:28:56", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(KhachHang.class)
public class KhachHang_ { 

    public static volatile ListAttribute<KhachHang, HoaDon> hoaDonList;
    public static volatile SingularAttribute<KhachHang, String> diaChi;
    public static volatile SingularAttribute<KhachHang, String> sdt;
    public static volatile SingularAttribute<KhachHang, String> ma;
    public static volatile SingularAttribute<KhachHang, Integer> trangThai;
    public static volatile SingularAttribute<KhachHang, String> ghiChu;
    public static volatile SingularAttribute<KhachHang, Date> ngaySinh;
    public static volatile SingularAttribute<KhachHang, Integer> soLanMua;
    public static volatile SingularAttribute<KhachHang, String> id;
    public static volatile SingularAttribute<KhachHang, Integer> gioiTinh;
    public static volatile SingularAttribute<KhachHang, String> ten;

}