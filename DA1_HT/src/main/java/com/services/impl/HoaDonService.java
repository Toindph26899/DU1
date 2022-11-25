package com.services.impl;

import com.entities.HoaDon;
import com.repositories.IHoaDonRepotirory;
import com.repositories.impl.HoaDonRepository;
import com.services.IHoaDonService;
import com.custommodel.HoaDonCustom;
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
        return repo_HoaDon.add(h);
    }

    @Override
    public Boolean update(HoaDon h, String id) {
        return repo_HoaDon.update(h, id);
    }

    @Override
    public Boolean delete(String id) {
        return repo_HoaDon.delete(id);
    }

    @Override
    public HoaDon getOneHd(String id) {
        return repo_HoaDon.getOneHd(id);
    }

    @Override
    public List<HoaDon> listHdToChuaThanhToan(int tinhTrang) {
        return repo_HoaDon.listHdToChuaThanhToan(tinhTrang);
    }
    
    public static void main(String[] args) {
        IHoaDonService h = new HoaDonService();
        System.out.println(h.getListHoaDon().toString());
    }
}
