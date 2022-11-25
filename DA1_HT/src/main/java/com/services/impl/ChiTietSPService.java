package com.services.impl;

import com.custommodel.ChiTietSPCustom;
import com.repositories.impl.ChiTietSPRepository;
import com.services.IChiTietSPService;
import java.util.List;
import com.repositories.IChiTietSPRepository;

public class ChiTietSPService implements IChiTietSPService {

    private IChiTietSPRepository iSanPhamRepository = new ChiTietSPRepository();

    @Override
    public List<ChiTietSPCustom> listChiTietSp() {
        return iSanPhamRepository.listChiTietSP();
    }

}
