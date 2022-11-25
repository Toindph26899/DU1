package com.services.impl;

import com.custommodel.HoaDonCTCustom;
import com.entities.HoaDonChiTiet;
import com.repositories.IHoaDonCTRepository;
import com.repositories.impl.HoaDonChiTietRepository;
import com.services.IHoaDonChiTietService;
import java.util.List;

public class HoaDonChiTietService implements IHoaDonChiTietService {

    private IHoaDonCTRepository iHoaDonCTRepository = new HoaDonChiTietRepository();
    
    @Override
    public List<HoaDonCTCustom> getHoaDonCT() {
        return iHoaDonCTRepository.getHoaDonCT();
    }

    @Override
    public Boolean add(HoaDonChiTiet hdct) {
        return iHoaDonCTRepository.add(hdct);
    }

    @Override
    public Boolean update(HoaDonChiTiet hdct, String id) {
        return iHoaDonCTRepository.update(hdct, id);
    }

}
