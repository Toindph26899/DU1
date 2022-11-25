package com.services.impl;

import com.entities.HoaDon;
import com.repositories.IHoaDonRepotirory;
import com.repositories.impl.HoaDonRepository;
import com.services.IHoaDonService;
import com.custommodel.HoaDonCustom;
import java.util.ArrayList;
import java.util.List;

public class HoaDonService implements IHoaDonService{
    
    public final IHoaDonRepotirory repo_HoaDon = new HoaDonRepository();
    private List<HoaDonCustom> list;
    
    @Override
    public List<HoaDonCustom> getListHoaDon() {
        return repo_HoaDon.getHoaDonView();
    }

    @Override
    public Boolean add(HoaDon h) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Boolean update(HoaDon h, String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Boolean delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public static void main(String[] args) {
        IHoaDonService h = new HoaDonService();
        System.out.println(h.getListHoaDon().toString());
    }
}
