package com.entities;

import com.entities.HoaDon;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-11-24T23:28:56", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(GiamGia.class)
public class GiamGia_ { 

    public static volatile ListAttribute<GiamGia, HoaDon> hoaDonList;
    public static volatile SingularAttribute<GiamGia, Date> ngayDienRa;
    public static volatile SingularAttribute<GiamGia, String> ma;
    public static volatile SingularAttribute<GiamGia, String> id;
    public static volatile SingularAttribute<GiamGia, String> tenCT;
    public static volatile SingularAttribute<GiamGia, BigInteger> soTienGiam;
    public static volatile SingularAttribute<GiamGia, Date> ngayTao;
    public static volatile SingularAttribute<GiamGia, Date> ngayKetThuc;

}