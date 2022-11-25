package com.repositories;

import com.custommodel.HoaDonCustom;
import com.entities.HoaDon;
import java.util.List;

public interface IHoaDonRepotirory {
    
    List<HoaDonCustom> getHoaDonView();
    
    Boolean add(HoaDon sp);
    
    Boolean update(HoaDon sp, String id);
    
    Boolean delete(String id);
    
    HoaDon getOneHd(String id);
    
    List<HoaDon> listHdToChuaThanhToan(int tinhTrang);
    
}
