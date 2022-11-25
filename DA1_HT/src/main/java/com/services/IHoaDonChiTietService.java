package com.services;

import com.custommodel.HoaDonCTCustom;
import com.entities.HoaDonChiTiet;
import java.util.List;

public interface IHoaDonChiTietService {

    List<HoaDonCTCustom> getHoaDonCT();

    Boolean add(HoaDonChiTiet hdct);

    Boolean update(HoaDonChiTiet hdct, String id);

}
