package com.repositories.impl;

import com.config.HibernateUtils;
import com.custommodel.HoaDonCustom;
import com.entities.HoaDon;
import com.repositories.IHoaDonRepotirory;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Query;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class HoaDonRepository implements IHoaDonRepotirory {

    private static Logger logger = Logger.getLogger(HoaDonRepository.class);
    private Session session = HibernateUtils.getFACTORY().openSession();

    @Override
    public List<HoaDonCustom> getHoaDonView() {
//        Session ss = HibernateUtils.getFACTORY().openSession();
        String hql = "select new com.custommodel.HoaDonCustom("
                + "hd.id,"
                + "hd.ma,"
                + "nv.ten,"
                + "hd.tenKh,"
                + "hd.ngayTao,"
                + "hd.ngayThanhToan,"
                + "hd.tinhTrang)"
                + "from com.entities.HoaDon hd join hd.idNhanVien nv";
        Query query = session.createQuery(hql);
        List<HoaDonCustom> ds = query.getResultList();

        return ds;
    }

    @Override
    public Boolean add(HoaDon hd) {
        Transaction transaction = null;
        int result = 0;
        try ( Session session = HibernateUtils.getFACTORY().openSession()) {
            
            transaction = session.beginTransaction();
            session.save(hd);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        }

        return false;
    }

    @Override
    public Boolean update(HoaDon hd, String id) {
        Transaction transaction = null;
        int result = 0;
        try ( Session session = HibernateUtils.getFACTORY().openSession()) {
            String hql = "UPDATE HoaDon set TenKh = :TenKh, NgayThanhToan = :NgayThanhToan, "
                    + "TinhTrang = :TinhTrang "
                    + "Where id = :id";
            transaction = session.beginTransaction();
            Query query = session.createQuery(hql);
            query.setParameter("TenKh", hd.getTenKh());
            query.setParameter("NgayThanhToan", hd.getNgayThanhToan());
            query.setParameter("TinhTrang", hd.getTinhTrang());
            query.setParameter("id", id);

            result = query.executeUpdate();
            transaction.commit();

            return result > 0;
        } catch (Exception e) {
            e.printStackTrace();
//            if (transaction != null) {
//                transaction.rollback();
//            }
        }
        return null;
    }

    @Override
    public Boolean delete(String id) {
        Transaction transaction = null;
        int row = 0;
        try ( Session session = HibernateUtils.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            String hql = "DELETE FROM HoaDon Where id = :id";

            Query query = session.createQuery(hql);
            query.setParameter("id", id);
            row = query.executeUpdate();
            transaction.commit();

            return row > 0;
        } catch (Exception e) {
            e.printStackTrace();
//            if (transaction != null) {
//                transaction.rollback();
//            }
        }
        return false;
    }

    @Override
    public HoaDon getOneHd(String id) {
        String hql = "FROM HoaDon Where id = :id";
        Query query = session.createQuery(hql, HoaDon.class);
        query.setParameter("id", id);
        HoaDon hoaDon = (HoaDon) query.getSingleResult();
        return hoaDon;
    }

    @Override
    public List<HoaDon> listHdToChuaThanhToan(int tinhTrang) {
        String hql = "FROM HoaDon WHERE TinhTrang = :TinhTrang";
        Query query = session.createQuery(hql, HoaDon.class);
        query.setParameter("TinhTrang", tinhTrang);
        List<HoaDon> hoaDons = query.getResultList();
        if (hoaDons.isEmpty()) {
            logger.debug("Loi select");
        }

        return hoaDons == null ? new ArrayList<>() : hoaDons;
    }

    public static void main(String[] args) {
        IHoaDonRepotirory h = new HoaDonRepository();

        HoaDon hd = new HoaDon();

        hd.setMa("HD123");
        hd.setIdNhanVien(null);
        hd.setTenKh("Pham Anh Tuan");
        hd.setNgayTao(new Date());
        hd.setNgayThanhToan(new Date());
        hd.setTinhTrang(1);
        
        h.add(hd);
//        h.update(hd, "4e3e957b-2fb9-4c50-a6b1-84c1a08cec5d");
//        h.delete("4e3e957b-2fb9-4c50-a6b1-84c1a08cec5d");
//        System.out.println(h.listHdToChuaThanhToan(0));
//        System.out.println(h.getHoaDonView());
    }
}
