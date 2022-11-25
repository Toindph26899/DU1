package com.services;

import com.entities.HoaDon;
import com.custommodel.HoaDonCustom;
import java.util.List;

public interface IHoaDonService {

    List<HoaDonCustom> getListHoaDon();

    Boolean add(HoaDon h);

    Boolean update(HoaDon h, String id);

    Boolean delete(String id);

    HoaDon getOneHd(String id);

    List<HoaDon> listHdToChuaThanhToan(int tinhTrang);
}
