package com.entities;

import com.entities.ChucVu;
import com.entities.HoaDon;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-11-25T11:32:17", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(NhanVien.class)
public class NhanVien_ { 

    public static volatile SingularAttribute<NhanVien, String> sdt;
    public static volatile SingularAttribute<NhanVien, String> matKhau;
    public static volatile SingularAttribute<NhanVien, ChucVu> idChucVu;
    public static volatile SingularAttribute<NhanVien, String> ghiChu;
    public static volatile SingularAttribute<NhanVien, Date> ngayTao;
    public static volatile ListAttribute<NhanVien, HoaDon> hoaDonList;
    public static volatile SingularAttribute<NhanVien, String> diaChi;
    public static volatile SingularAttribute<NhanVien, String> ma;
    public static volatile SingularAttribute<NhanVien, Integer> trangThai;
    public static volatile SingularAttribute<NhanVien, Date> ngaySinh;
    public static volatile SingularAttribute<NhanVien, String> id;
    public static volatile SingularAttribute<NhanVien, String> ten;
    public static volatile SingularAttribute<NhanVien, String> email;

}