package com.repositories;

import com.custommodel.HoaDonCTCustom;
import com.entities.HoaDonChiTiet;
import java.util.List;

public interface IHoaDonCTRepository {
    
    List<HoaDonCTCustom> getHoaDonCT();
    
    Boolean add(HoaDonChiTiet hdct);
    
    Boolean update(HoaDonChiTiet hdct, String id);
    
}
