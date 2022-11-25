package com.entities;

import com.entities.ChiTietSP;
import com.entities.HoaDon;
import com.entities.ImeiDaBan;
import java.math.BigInteger;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-11-25T11:32:17", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(HoaDonChiTiet.class)
public class HoaDonChiTiet_ { 

    public static volatile SingularAttribute<HoaDonChiTiet, HoaDon> idHoaDon;
    public static volatile SingularAttribute<HoaDonChiTiet, Integer> trangThai;
    public static volatile ListAttribute<HoaDonChiTiet, ImeiDaBan> imeiDaBanList;
    public static volatile SingularAttribute<HoaDonChiTiet, ChiTietSP> idChiTietSP;
    public static volatile SingularAttribute<HoaDonChiTiet, String> id;
    public static volatile SingularAttribute<HoaDonChiTiet, Integer> soLuong;
    public static volatile SingularAttribute<HoaDonChiTiet, BigInteger> donGia;

}