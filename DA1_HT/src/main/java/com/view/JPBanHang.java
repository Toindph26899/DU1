
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
        DefaultTableModel dtm = (DefaultTableModel) this.tblHoaDon.getModel();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblHoaDon = new javax.swing.JTable();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã hóa đơn", "Tên nhân viên", "Tên khách hàng", "Ngày tạo", "Ngày thanh toán", "Tình trạng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblHoaDon);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 680, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblHoaDon;
    // End of variables declaration//GEN-END:variables
}
