/*
 * Project Name:       Phan Mem Quan Ly Tien Dien Java
 * Description:       Bai tap lon Java Quan Ly Tien Dien JDBC + Swing
 * Author:            Nhom 8
 */
package views;

import dao.ChiSoDienDAOImpl;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Date;
import javax.swing.JOptionPane;
import models.ChiSoDien;
import models.KhachHang;
import services.ChiSoDienServiceImpl;

/**
 *
 * @author Admin
 */
public class JDialog_SuaChiSoDien extends javax.swing.JDialog {

    /**
     * Creates new form JDialog_SuaChiSoDien
     */
    private final ChiSoDienServiceImpl chiSoDienServiceImpl = new ChiSoDienServiceImpl();
    
    private final KhachHang khachHang;
    private final ChiSoDien chiSoDien;
    
    public JDialog_SuaChiSoDien(KhachHang khachHang, ChiSoDien chiSoDien) {
        super(main.Main.mainFrame, true);
        
        this.khachHang = khachHang;
        this.chiSoDien = chiSoDien;
        
        initComponents();
        initView();
        initEvent();
    }
    
    private void initView(){
        jLabel_Msg.setText("");
        jTextField_MaKH.setText(khachHang.getMaKH() + "");
        jTextField_MaThang.setText(chiSoDien.getThangID() + "");
        jTextField_HoTen.setText(khachHang.getHoTen());
        jTextField_SoDienThoai.setText(khachHang.getSoDienThoai());
        
        ChiSoDien chiSoDienFirst = chiSoDienServiceImpl.getFirstChiSoDien(khachHang.getMaKH());
        
        // neu chinh sua chi so dien dau tien
        if (chiSoDienFirst.getThangID() == chiSoDien.getThangID()){
            // cho phep chinh sua chi so dau tien
            jTextField_ChiSoCu.setEditable(true);
        }
        
        jTextField_ChiSoCu.setText(chiSoDien.getChiSoCu() + "");
        jTextField_ChiSoMoi.setText(chiSoDien.getChiSoMoi() + "");
    }
    
    private void initEvent(){
        KeyAdapter validDataKeyAdapterEvent = new KeyAdapter(){
            @Override
            public void keyPressed(KeyEvent e) {validData();}
            @Override
            public void keyReleased(KeyEvent e) {validData();}
        };
        
        jTextField_ChiSoCu.addKeyListener(validDataKeyAdapterEvent);
        jTextField_ChiSoMoi.addKeyListener(validDataKeyAdapterEvent);
        
        jButton_TroVe.addActionListener((ActionEvent e) -> {
            dispose();
        });
        jButton_LuuThayDoi.addActionListener((ActionEvent e) -> {
            int result = JOptionPane.showConfirmDialog(null, "Đồng ý thay đổi chỉ số điện", "Lưu thay đổi",
                        JOptionPane.YES_NO_CANCEL_OPTION);
            
            switch (result){
                case JOptionPane.YES_OPTION -> {
                    updateChiSoDien();
                    dispose();
                }
                case JOptionPane.NO_OPTION ->{
                    dispose();
                }
                default -> {}
            }
        });
    }
    
    private void updateChiSoDien(){
        ChiSoDien chiSoDienUpdate_1 = new ChiSoDien(chiSoDien.getId(), chiSoDien.getMaKH(), chiSoDien.getThangID(),
                Integer.parseInt(jTextField_ChiSoCu.getText()),
                Integer.parseInt(jTextField_ChiSoMoi.getText()), new Date());

        ChiSoDien chiSoDienUpdate_2 = chiSoDienServiceImpl.getChiSoDien(khachHang.getMaKH(), chiSoDien.getThangID() + 1);
        if (chiSoDienUpdate_2 != null) chiSoDienUpdate_2.setChiSoCu(Integer.parseInt(jTextField_ChiSoMoi.getText()));

        if (chiSoDienServiceImpl.createORUpdate(chiSoDienUpdate_1) != 0
                && chiSoDienServiceImpl.createORUpdate(chiSoDienUpdate_2) != 0){

            JOptionPane.showMessageDialog(null, "Thành công", "", JOptionPane.INFORMATION_MESSAGE);

            // cap nhat ca row duoi nua
        }
        else{
            JOptionPane.showMessageDialog(null, "Có gì đó đéo đúng huhu 2 update toang r");
        }
    }
    
    private boolean validData(){
        if (dataNotNull()){
            if (validChiSo(jTextField_ChiSoCu.getText(), jTextField_ChiSoMoi.getText())){
                jLabel_Msg.setText("");
                return true;
            }
        }
        return false;
    }
    
    private boolean dataNotNull(){
        if (jTextField_ChiSoCu.getText().isBlank() || jTextField_ChiSoCu.getText().isEmpty()){
            jLabel_Msg.setText("Không để trống chỉ số cũ");
            return false;
        }
        if (jTextField_ChiSoMoi.getText().isBlank() || jTextField_ChiSoMoi.getText().isEmpty()){
            jLabel_Msg.setText("Không để trống chỉ số mới");
            return false;
        }
        return true;
    }
    
    private boolean validChiSo(String chiSoCu_text, String chiSoMoi_text){
        try{
            int chiSoCu = Integer.parseInt(chiSoCu_text);
            if (chiSoCu < 0){
                jLabel_Msg.setText("Chỉ số cũ không được âm");
                return false;
            }
            int chiSoMoi = Integer.parseInt(chiSoMoi_text);
            if (chiSoMoi < 0){
                jLabel_Msg.setText("Chỉ số mới không được âm");
                return false;
            }
            
            if (chiSoCu > chiSoMoi){
                jLabel_Msg.setText("Chỉ số mới phải lớn hơn chỉ số cũ");
                return false;
            }
            
            ChiSoDien chiSoDienSau = chiSoDienServiceImpl.getChiSoDien(khachHang.getMaKH(), chiSoDien.getThangID() + 1);
            // neu co chi so dien sau
            if (chiSoDienSau != null){ 
                // cap nhat ca chi so moi cua thang nay va thang sau
                if (chiSoMoi > chiSoDienSau.getChiSoMoi()){
                    jLabel_Msg.setText("Chỉ số mới không thể lớn hơn chỉ số mới của tháng sau (" + 
                            chiSoDienSau.getChiSoMoi() + ")");
                    return false;
                }
            }
            
            return true;
        }
        catch (NumberFormatException e){
            jLabel_Msg.setText("Chỉ số cũ sai định dạng");
            return false;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_Root = new javax.swing.JPanel();
        jPanel_Data = new javax.swing.JPanel();
        jLabel_MaKH = new javax.swing.JLabel();
        jLabel_HoTen = new javax.swing.JLabel();
        jLabel_MaThang = new javax.swing.JLabel();
        jLabel_SoDienThoai = new javax.swing.JLabel();
        jTextField_MaKH = new javax.swing.JTextField();
        jTextField_HoTen = new javax.swing.JTextField();
        jTextField_SoDienThoai = new javax.swing.JTextField();
        jTextField_MaThang = new javax.swing.JTextField();
        jLabel_HoTen1 = new javax.swing.JLabel();
        jTextField_ChiSoCu = new javax.swing.JTextField();
        jTextField_ChiSoMoi = new javax.swing.JTextField();
        jLabel_HoTen2 = new javax.swing.JLabel();
        jLabel_Msg = new javax.swing.JLabel();
        jButton_TroVe = new javax.swing.JButton();
        jButton_LuuThayDoi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel_Root.setBackground(new java.awt.Color(255, 255, 255));

        jPanel_Data.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_Data.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sửa chỉ số điện", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel_MaKH.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel_MaKH.setText("Mã khách hàng:");

        jLabel_HoTen.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel_HoTen.setText("Họ tên khách hàng:");

        jLabel_MaThang.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel_MaThang.setText("Mã tháng");

        jLabel_SoDienThoai.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel_SoDienThoai.setText("Số điện thoại:");

        jTextField_MaKH.setEditable(false);
        jTextField_MaKH.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jTextField_MaKH.setText("0");

        jTextField_HoTen.setEditable(false);
        jTextField_HoTen.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jTextField_SoDienThoai.setEditable(false);
        jTextField_SoDienThoai.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jTextField_MaThang.setEditable(false);
        jTextField_MaThang.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jTextField_MaThang.setText("0");

        jLabel_HoTen1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel_HoTen1.setText("Chỉ số cũ");

        jTextField_ChiSoCu.setEditable(false);
        jTextField_ChiSoCu.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jTextField_ChiSoCu.setText("0");

        jTextField_ChiSoMoi.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jLabel_HoTen2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel_HoTen2.setText("Chỉ số mới");

        javax.swing.GroupLayout jPanel_DataLayout = new javax.swing.GroupLayout(jPanel_Data);
        jPanel_Data.setLayout(jPanel_DataLayout);
        jPanel_DataLayout.setHorizontalGroup(
            jPanel_DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_DataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTextField_ChiSoCu)
                        .addComponent(jLabel_MaKH, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel_HoTen, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField_MaKH, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                        .addComponent(jTextField_HoTen, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLabel_HoTen1))
                .addGap(41, 41, 41)
                .addGroup(jPanel_DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_MaThang)
                    .addComponent(jTextField_SoDienThoai)
                    .addGroup(jPanel_DataLayout.createSequentialGroup()
                        .addGroup(jPanel_DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_MaThang)
                            .addComponent(jLabel_SoDienThoai))
                        .addGap(0, 195, Short.MAX_VALUE))
                    .addGroup(jPanel_DataLayout.createSequentialGroup()
                        .addComponent(jLabel_HoTen2)
                        .addGap(143, 143, 143))
                    .addComponent(jTextField_ChiSoMoi))
                .addContainerGap())
        );
        jPanel_DataLayout.setVerticalGroup(
            jPanel_DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_DataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel_DataLayout.createSequentialGroup()
                        .addComponent(jTextField_MaThang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_SoDienThoai)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_SoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_DataLayout.createSequentialGroup()
                        .addGroup(jPanel_DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_MaKH)
                            .addComponent(jLabel_MaThang))
                        .addGap(5, 5, 5)
                        .addComponent(jTextField_MaKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_HoTen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_HoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel_DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel_DataLayout.createSequentialGroup()
                        .addComponent(jLabel_HoTen1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_ChiSoCu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_DataLayout.createSequentialGroup()
                        .addComponent(jLabel_HoTen2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_ChiSoMoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel_Msg.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel_Msg.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_Msg.setText("...");

        jButton_TroVe.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton_TroVe.setText("Trở về");

        jButton_LuuThayDoi.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton_LuuThayDoi.setText("Lưu thay đổi");

        javax.swing.GroupLayout jPanel_RootLayout = new javax.swing.GroupLayout(jPanel_Root);
        jPanel_Root.setLayout(jPanel_RootLayout);
        jPanel_RootLayout.setHorizontalGroup(
            jPanel_RootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_RootLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_RootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_RootLayout.createSequentialGroup()
                        .addComponent(jButton_TroVe, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_LuuThayDoi, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel_Msg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel_Data, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel_RootLayout.setVerticalGroup(
            jPanel_RootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_RootLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel_Data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_Msg, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel_RootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_TroVe, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_LuuThayDoi, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(91, 91, 91))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Root, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Root, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_LuuThayDoi;
    private javax.swing.JButton jButton_TroVe;
    private javax.swing.JLabel jLabel_HoTen;
    private javax.swing.JLabel jLabel_HoTen1;
    private javax.swing.JLabel jLabel_HoTen2;
    private javax.swing.JLabel jLabel_MaKH;
    private javax.swing.JLabel jLabel_MaThang;
    private javax.swing.JLabel jLabel_Msg;
    private javax.swing.JLabel jLabel_SoDienThoai;
    private javax.swing.JPanel jPanel_Data;
    private javax.swing.JPanel jPanel_Root;
    private javax.swing.JTextField jTextField_ChiSoCu;
    private javax.swing.JTextField jTextField_ChiSoMoi;
    private javax.swing.JTextField jTextField_HoTen;
    private javax.swing.JTextField jTextField_MaKH;
    private javax.swing.JTextField jTextField_MaThang;
    private javax.swing.JTextField jTextField_SoDienThoai;
    // End of variables declaration//GEN-END:variables
}
