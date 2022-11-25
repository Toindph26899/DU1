package com.repositories.impl;

import com.config.HibernateUtils;
import com.custommodel.HoaDonCTCustom;
import com.entities.HoaDonChiTiet;
import com.repositories.IHoaDonCTRepository;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class HoaDonChiTietRepository implements IHoaDonCTRepository{

    private Session session = HibernateUtils.getFACTORY().openSession();
    
    @Override
    public List<HoaDonCTCustom> getHoaDonCT() {
        String hql = "select new com.custommodel.HoaDonCTCustom("
                + " hdct.id,"
                + " h.id,"
                + " ctsp.id,"
                + " sp.ten,"
                + " hdct.soLuong,"
                + " hdct.donGia,"
                + " hdct.trangThai"
                + ")"
                + " from com.entities.HoaDonChiTiet hdct join hdct.idHoaDon h join hdct.idChiTietSP ctsp join ctsp.idSP sp";
        
        Query query = session.createQuery(hql);
        List<HoaDonCTCustom> listHDCT = query.getResultList();
        
        return listHDCT;
    }

    @Override
    public Boolean add(HoaDonChiTiet hdct) {
        Transaction transaction = null;
        int check = 0;
        try(Session session = HibernateUtils.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.save(hdct);
            transaction.commit();
            return check > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Boolean update(HoaDonChiTiet hdct, String id) {
        String hql = "UPDATE HoaDonChiTiet set idHoaDon = :idHoaDon, idChiTietSP = :idChiTietSP, soLuong = :soLuong,"
                + "donGia = :donGia, trangThai = :trangThai WHERE id = :id";
        Transaction transaction = null;
        int check = 0;
        try(Session session = HibernateUtils.getFACTORY().openSession()){
            transaction = session.beginTransaction();
            Query query = session.createQuery(hql);
            
            query.setParameter("idHoaDon", hdct.getIdHoaDon());
            query.setParameter("idChiTietSP", hdct.getIdChiTietSP());
            query.setParameter("soLuong", hdct.getSoLuong());
            query.setParameter("donGia", hdct.getDonGia());
            query.setParameter("trangThai", hdct.getTrangThai());
            query.setParameter("id", id);
            
            check = query.executeUpdate();
            transaction.commit();
            return check > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return null;
    }

    public static void main(String[] args) {
        HoaDonChiTietRepository hdct = new HoaDonChiTietRepository();
        
        System.out.println(hdct.getHoaDonCT());
    }
    
}
