package com.entities;

import com.entities.ChiTietSP;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-11-24T23:28:56", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(SanPham.class)
public class SanPham_ { 

    public static volatile SingularAttribute<SanPham, String> ma;
    public static volatile ListAttribute<SanPham, ChiTietSP> chiTietSPList;
    public static volatile SingularAttribute<SanPham, String> id;
    public static volatile SingularAttribute<SanPham, String> ten;

}