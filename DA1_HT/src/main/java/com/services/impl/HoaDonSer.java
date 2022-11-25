/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.services.impl;

import com.custommodel.QLHoaDon;
import com.entities.HoaDon;
import com.repositories.IHoaDonRepo;
import com.repositories.impl.HoaDonRepo;
import com.services.IHoaDonSer;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class HoaDonSer implements IHoaDonSer {

    private IHoaDonRepo hdr;
    private List<QLHoaDon> ls;

    public HoaDonSer() {
        hdr = new HoaDonRepo();
        ls = new ArrayList<>();
    }

    @Override
    public List<QLHoaDon> getAll() {
        var hoaDon = hdr.getAll();
        for (HoaDon x : hoaDon) {
            ls.add(new QLHoaDon(x.getId(), x.getIdKH().getTen(), x.getIdKH().getSdt(),
                    x.getIdNhanVien().getMa(), x.getNgayTao().toString(), x.getNgayThanhToan().toString(),
                    x.getTenKh(), x.getTenKh()));
        }
        return ls;
    }

    @Override
    public QLHoaDon update(QLHoaDon hd) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public static void main(String[] args) {
        HoaDonSer s = new HoaDonSer();
        System.out.println(s.getAll());
    }

}
