/*
 * Project Name:       Phan Mem Quan Ly Tien Dien Java
 * Description:       Bai tap lon Java Quan Ly Tien Dien JDBC + Swing
 * Author:            Nhom 8
 */
package views;

import controllers.ThanhToanController;

/**
 *
 * @author duato
 */
public class ThanhToanJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ThanhToanJPanel
     */
    public ThanhToanJPanel() {
        initComponents();
        ThanhToanController controller = new ThanhToanController(jComboBox_Thang, jScrollPane_ChuaGhiSoDien, jScrollPane_DaThanhToan);
        controller.initData();
        controller.initTable();
        controller.initEvent();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnThanhToan = new javax.swing.JPanel();
        jpnThanhToanTitle = new javax.swing.JPanel();
        jlbThanhToanTitle = new javax.swing.JLabel();
        jpnThanhToanMain = new javax.swing.JPanel();
        jPanel_Root = new javax.swing.JPanel();
        jLabel_Thang = new javax.swing.JLabel();
        jComboBox_Thang = new javax.swing.JComboBox<>();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane_ChuaGhiSoDien = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane_DaThanhToan = new javax.swing.JScrollPane();

        jpnThanhToanTitle.setBackground(new java.awt.Color(51, 204, 0));

        jlbThanhToanTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlbThanhToanTitle.setForeground(new java.awt.Color(255, 255, 255));
        jlbThanhToanTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbThanhToanTitle.setText("DANH SÁCH HỘ TIÊU THỤ NỘP - CHƯA NỘP TIỀN ĐIỆN");

        javax.swing.GroupLayout jpnThanhToanTitleLayout = new javax.swing.GroupLayout(jpnThanhToanTitle);
        jpnThanhToanTitle.setLayout(jpnThanhToanTitleLayout);
        jpnThanhToanTitleLayout.setHorizontalGroup(
            jpnThanhToanTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbThanhToanTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpnThanhToanTitleLayout.setVerticalGroup(
            jpnThanhToanTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnThanhToanTitleLayout.createSequentialGroup()
                .addComponent(jlbThanhToanTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel_Thang.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel_Thang.setText("Tháng:");

        jComboBox_Thang.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jComboBox_Thang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane_ChuaGhiSoDien, javax.swing.GroupLayout.DEFAULT_SIZE, 1030, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane_ChuaGhiSoDien, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Danh sách hộ chưa nhập số điện", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane_DaThanhToan, javax.swing.GroupLayout.DEFAULT_SIZE, 1030, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane_DaThanhToan, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Danh sách hộ đã thanh toán trong tháng", jPanel2);

        javax.swing.GroupLayout jPanel_RootLayout = new javax.swing.GroupLayout(jPanel_Root);
        jPanel_Root.setLayout(jPanel_RootLayout);
        jPanel_RootLayout.setHorizontalGroup(
            jPanel_RootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_RootLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_RootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_RootLayout.createSequentialGroup()
                        .addComponent(jTabbedPane1)
                        .addContainerGap())
                    .addGroup(jPanel_RootLayout.createSequentialGroup()
                        .addComponent(jLabel_Thang)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox_Thang, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel_RootLayout.setVerticalGroup(
            jPanel_RootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_RootLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_RootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Thang)
                    .addComponent(jComboBox_Thang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 77, Short.MAX_VALUE)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout jpnThanhToanMainLayout = new javax.swing.GroupLayout(jpnThanhToanMain);
        jpnThanhToanMain.setLayout(jpnThanhToanMainLayout);
        jpnThanhToanMainLayout.setHorizontalGroup(
            jpnThanhToanMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Root, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpnThanhToanMainLayout.setVerticalGroup(
            jpnThanhToanMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Root, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpnThanhToanLayout = new javax.swing.GroupLayout(jpnThanhToan);
        jpnThanhToan.setLayout(jpnThanhToanLayout);
        jpnThanhToanLayout.setHorizontalGroup(
            jpnThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnThanhToanTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnThanhToanMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpnThanhToanLayout.setVerticalGroup(
            jpnThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnThanhToanLayout.createSequentialGroup()
                .addComponent(jpnThanhToanTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnThanhToanMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnThanhToan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnThanhToan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox_Thang;
    private javax.swing.JLabel jLabel_Thang;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel_Root;
    private javax.swing.JScrollPane jScrollPane_ChuaGhiSoDien;
    private javax.swing.JScrollPane jScrollPane_DaThanhToan;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel jlbThanhToanTitle;
    private javax.swing.JPanel jpnThanhToan;
    private javax.swing.JPanel jpnThanhToanMain;
    private javax.swing.JPanel jpnThanhToanTitle;
    // End of variables declaration//GEN-END:variables
}
