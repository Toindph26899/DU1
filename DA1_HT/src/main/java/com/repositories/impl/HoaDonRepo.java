/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.repositories.impl;

import com.config.HibernateUtils;
import com.entities.HoaDon;
import com.repositories.IHoaDonRepo;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author ADMIN
 */
public class HoaDonRepo implements IHoaDonRepo {

    @Override
    public List<HoaDon> getAll() {
        List<HoaDon> ds;
        try ( Session session = HibernateUtils.getFACTORY().openSession()) {
            String hql = "select h from HoaDon h";
            TypedQuery<HoaDon> query = session.createQuery(hql, HoaDon.class);
            ds = query.getResultList();
            return ds;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public HoaDon update(HoaDon hd) {
        try ( Session session = HibernateUtils.getFACTORY().openSession()) {
            Transaction trans = session.getTransaction();
            trans.begin();
            try {
                session.update(hd);
                trans.commit();
            } catch (Exception e) {
                e.printStackTrace();
                trans.rollback();
                hd = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return hd;
    }
    
    public static void main(String[] args) {
         HoaDonRepo hd = new HoaDonRepo();
         hd.getAll().forEach(s -> System.out.println(s.toString()));
    }

}
