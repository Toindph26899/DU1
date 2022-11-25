
package com.view;

import com.services.IHoaDonService;
import com.services.impl.HoaDonService;
import com.custommodel.HoaDonCustom;
import java.util.List;
import javax.swing.table.DefaultTableModel;


public class JPBanHang extends javax.swing.JPanel {

    private IHoaDonService service_HoaDon = new HoaDonService();
    
    
    public JPBanHang() {
        initComponents();
        loadTable(service_HoaDon.getListHoaDon());
    }

    private void loadTable(List<HoaDonCustom> list) {
//        DefaultTableModel dtm = (DefaultTableModel) this.tblHoaDon.getModel();
        dtm.setRowCount(0);
        
        int stt = 1;
        
        for (HoaDonCustom h : list) {
            Object[] rowData = {
                stt,
                h.getMaHD(),
                h.getTenNhanVien(),
                h.getTenKh(),
                h.getNgayTao(),
                h.getNgayThanhToan(),
                h.getTinhTrang() == 0 ? "Chua Thanh Toan" : "Da Thanh Toan"
            };
            dtm.addRow(rowData);
            stt++;
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
