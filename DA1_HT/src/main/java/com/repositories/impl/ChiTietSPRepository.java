package com.repositories.impl;

import com.config.HibernateUtils;
import com.custommodel.ChiTietSPCustom;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import com.repositories.IChiTietSPRepository;

public class ChiTietSPRepository implements IChiTietSPRepository{
    
    private Session session = HibernateUtils.getFACTORY().openSession();
    
    @Override
    public List<ChiTietSPCustom> listChiTietSP() {
        String hql = "select new com.custommodel.ChiTietSPCustom( "
                + "spct.id,"
                + "sp.ten,"
                + "spct.giaBan,"
                + "spct.soLuongTon"
                + ")"
                + " from com.entities.ChiTietSP spct join spct.idSP sp";
        
        Query query = session.createQuery(hql);
        List<ChiTietSPCustom> listChiTietSP = query.getResultList();
        return listChiTietSP;
    }
    
    public static void main(String[] args) {
        ChiTietSPRepository c = new ChiTietSPRepository();
        
        System.out.println(c.listChiTietSP());
    }

}
