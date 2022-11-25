package com.entities;

import com.entities.NhanVien;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-11-25T11:32:17", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(ChucVu.class)
public class ChucVu_ { 

    public static volatile SingularAttribute<ChucVu, String> ma;
    public static volatile ListAttribute<ChucVu, NhanVien> nhanVienList;
    public static volatile SingularAttribute<ChucVu, String> id;
    public static volatile SingularAttribute<ChucVu, String> ten;

}