/*
 * Project Name:       Phan Mem Quan Ly Tien Dien Java
 * Description:       Bai tap lon Java Quan Ly Tien Dien JDBC + Swing
 * Author:            Nhom 8
 */
package views;

import controllers.HoaDonController;

public class HoaDonJPanel extends javax.swing.JPanel {


    public HoaDonJPanel() {
        initComponents();
        HoaDonController controller = new HoaDonController(jpnHoaDonTable, btnThanhToan, jtfSearch, jlbHoTenKH, jlbThang, jlbLuongDienTieuThu, jlbTongTien, jpnLapHoaDonTable, btnLapHoaDon, jcbLoaiDien, jtfLHDSearch, jlbLHDHoTenKH, jlbLHDThang, jlbLHDLuongDienTieuThu, jlbLHDTienDien, jlbLHDThanhTien);
        controller.setDataAndEventToTableHoaDon();
        controller.setDataAndEventToTableLapHoaDon();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnHoaDon = new javax.swing.JPanel();
        jpnHoaDonTitle = new javax.swing.JPanel();
        jlbHoaDonTitle = new javax.swing.JLabel();
        jpnHoaDonMain = new javax.swing.JPanel();
        jpnHoaDonView = new javax.swing.JPanel();
        jpnHoaDonTable = new javax.swing.JPanel();
        jpnHoaDonDetails = new javax.swing.JPanel();
        jpnThongTinThanhToan = new javax.swing.JPanel();
        jlbHDTenKH = new javax.swing.JLabel();
        jlbHDThang = new javax.swing.JLabel();
        jlbHDDien = new javax.swing.JLabel();
        jlbHDTien = new javax.swing.JLabel();
        jlbHoTenKH = new javax.swing.JLabel();
        jlbThang = new javax.swing.JLabel();
        jlbLuongDienTieuThu = new javax.swing.JLabel();
        jlbTongTien = new javax.swing.JLabel();
        btnThanhToan = new javax.swing.JButton();
        jtfSearch = new javax.swing.JTextField();
        jpnLapHoaDon = new javax.swing.JPanel();
        jpnLapHoaDonView = new javax.swing.JPanel();
        jpnLapHoaDonTable = new javax.swing.JPanel();
        jpnLapHoaDonDetails = new javax.swing.JPanel();
        jpnLapHoaDonChiTiet = new javax.swing.JPanel();
        jlbALoaiDien = new javax.swing.JLabel();
        jcbLoaiDien = new javax.swing.JComboBox<>();
        jlbAHoTenKH = new javax.swing.JLabel();
        jlbAThang = new javax.swing.JLabel();
        jlbASoDien = new javax.swing.JLabel();
        jlbATienDien = new javax.swing.JLabel();
        jtfLHDSearch = new javax.swing.JTextField();
        btnLapHoaDon = new javax.swing.JButton();
        jlbLHDHoTenKH = new javax.swing.JLabel();
        jlbLHDThang = new javax.swing.JLabel();
        jlbLHDLuongDienTieuThu = new javax.swing.JLabel();
        jlbLHDTienDien = new javax.swing.JLabel();
        jlbAThanhTien = new javax.swing.JLabel();
        jlbLHDThanhTien = new javax.swing.JLabel();

        jpnHoaDonTitle.setBackground(new java.awt.Color(51, 204, 0));
        jpnHoaDonTitle.setPreferredSize(new java.awt.Dimension(1075, 100));

        jlbHoaDonTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlbHoaDonTitle.setForeground(new java.awt.Color(255, 255, 255));
        jlbHoaDonTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbHoaDonTitle.setText("QUẢN LÝ HOÁ ĐƠN - IN HOÁ ĐƠN");

        javax.swing.GroupLayout jpnHoaDonTitleLayout = new javax.swing.GroupLayout(jpnHoaDonTitle);
        jpnHoaDonTitle.setLayout(jpnHoaDonTitleLayout);
        jpnHoaDonTitleLayout.setHorizontalGroup(
            jpnHoaDonTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbHoaDonTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpnHoaDonTitleLayout.setVerticalGroup(
            jpnHoaDonTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbHoaDonTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpnHoaDonTableLayout = new javax.swing.GroupLayout(jpnHoaDonTable);
        jpnHoaDonTable.setLayout(jpnHoaDonTableLayout);
        jpnHoaDonTableLayout.setHorizontalGroup(
            jpnHoaDonTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 755, Short.MAX_VALUE)
        );
        jpnHoaDonTableLayout.setVerticalGroup(
            jpnHoaDonTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpnHoaDonViewLayout = new javax.swing.GroupLayout(jpnHoaDonView);
        jpnHoaDonView.setLayout(jpnHoaDonViewLayout);
        jpnHoaDonViewLayout.setHorizontalGroup(
            jpnHoaDonViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnHoaDonViewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnHoaDonTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnHoaDonViewLayout.setVerticalGroup(
            jpnHoaDonViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnHoaDonViewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnHoaDonTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnThongTinThanhToan.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin thanh toán", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 12), new java.awt.Color(0, 153, 153))); // NOI18N

        jlbHDTenKH.setText("Họ tên khách hàng:");

        jlbHDThang.setText("Tháng:");

        jlbHDDien.setText("Lượng điện tiêu thụ:");

        jlbHDTien.setText("Thành tiền:");

        jlbHoTenKH.setForeground(new java.awt.Color(255, 51, 51));
        jlbHoTenKH.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlbHoTenKH.setText("NULL");
        jlbHoTenKH.setPreferredSize(new java.awt.Dimension(150, 14));

        jlbThang.setForeground(new java.awt.Color(255, 51, 51));
        jlbThang.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlbThang.setText("NULL");
        jlbThang.setPreferredSize(new java.awt.Dimension(150, 14));

        jlbLuongDienTieuThu.setForeground(new java.awt.Color(255, 51, 51));
        jlbLuongDienTieuThu.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlbLuongDienTieuThu.setText("0");
        jlbLuongDienTieuThu.setPreferredSize(new java.awt.Dimension(150, 14));

        jlbTongTien.setForeground(new java.awt.Color(255, 51, 51));
        jlbTongTien.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlbTongTien.setText("0");
        jlbTongTien.setPreferredSize(new java.awt.Dimension(150, 14));

        javax.swing.GroupLayout jpnThongTinThanhToanLayout = new javax.swing.GroupLayout(jpnThongTinThanhToan);
        jpnThongTinThanhToan.setLayout(jpnThongTinThanhToanLayout);
        jpnThongTinThanhToanLayout.setHorizontalGroup(
            jpnThongTinThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnThongTinThanhToanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnThongTinThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnThongTinThanhToanLayout.createSequentialGroup()
                        .addGroup(jpnThongTinThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbHDThang)
                            .addComponent(jlbHDTenKH))
                        .addGap(10, 10, 10)
                        .addGroup(jpnThongTinThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbHoTenKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlbThang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jpnThongTinThanhToanLayout.createSequentialGroup()
                        .addGroup(jpnThongTinThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbHDDien)
                            .addComponent(jlbHDTien))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpnThongTinThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbLuongDienTieuThu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlbTongTien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jpnThongTinThanhToanLayout.setVerticalGroup(
            jpnThongTinThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnThongTinThanhToanLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jpnThongTinThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbHDTenKH)
                    .addComponent(jlbHoTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpnThongTinThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbHDThang)
                    .addComponent(jlbThang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpnThongTinThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbHDDien)
                    .addComponent(jlbLuongDienTieuThu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpnThongTinThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbHDTien)
                    .addComponent(jlbTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        btnThanhToan.setBackground(new java.awt.Color(0, 204, 204));
        btnThanhToan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnThanhToan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/print.png"))); // NOI18N
        btnThanhToan.setText("Thanh Toán - In Hoá Đơn");
        btnThanhToan.setBorder(null);
        btnThanhToan.setPreferredSize(new java.awt.Dimension(150, 20));

        jtfSearch.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtfSearch.setPreferredSize(new java.awt.Dimension(200, 30));

        javax.swing.GroupLayout jpnHoaDonDetailsLayout = new javax.swing.GroupLayout(jpnHoaDonDetails);
        jpnHoaDonDetails.setLayout(jpnHoaDonDetailsLayout);
        jpnHoaDonDetailsLayout.setHorizontalGroup(
            jpnHoaDonDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnHoaDonDetailsLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jpnHoaDonDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnThanhToan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtfSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnThongTinThanhToan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpnHoaDonDetailsLayout.setVerticalGroup(
            jpnHoaDonDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnHoaDonDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnThongTinThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpnHoaDonMainLayout = new javax.swing.GroupLayout(jpnHoaDonMain);
        jpnHoaDonMain.setLayout(jpnHoaDonMainLayout);
        jpnHoaDonMainLayout.setHorizontalGroup(
            jpnHoaDonMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnHoaDonMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnHoaDonView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpnHoaDonDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpnHoaDonMainLayout.setVerticalGroup(
            jpnHoaDonMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnHoaDonMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnHoaDonMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpnHoaDonDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 262, Short.MAX_VALUE)
                    .addComponent(jpnHoaDonView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jpnLapHoaDonTableLayout = new javax.swing.GroupLayout(jpnLapHoaDonTable);
        jpnLapHoaDonTable.setLayout(jpnLapHoaDonTableLayout);
        jpnLapHoaDonTableLayout.setHorizontalGroup(
            jpnLapHoaDonTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 793, Short.MAX_VALUE)
        );
        jpnLapHoaDonTableLayout.setVerticalGroup(
            jpnLapHoaDonTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpnLapHoaDonViewLayout = new javax.swing.GroupLayout(jpnLapHoaDonView);
        jpnLapHoaDonView.setLayout(jpnLapHoaDonViewLayout);
        jpnLapHoaDonViewLayout.setHorizontalGroup(
            jpnLapHoaDonViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnLapHoaDonViewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnLapHoaDonTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnLapHoaDonViewLayout.setVerticalGroup(
            jpnLapHoaDonViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnLapHoaDonViewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnLapHoaDonTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnLapHoaDonChiTiet.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lập hoá đơn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 12), new java.awt.Color(0, 204, 204))); // NOI18N

        jlbALoaiDien.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlbALoaiDien.setLabelFor(jcbLoaiDien);
        jlbALoaiDien.setText("Loại điện:");

        jcbLoaiDien.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jcbLoaiDien.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Điện sinh hoạt", "Điện sản xuất", "Điện kinh doanh" }));

        jlbAHoTenKH.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlbAHoTenKH.setLabelFor(jcbLoaiDien);
        jlbAHoTenKH.setText("Họ tên khách hàng:");

        jlbAThang.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlbAThang.setLabelFor(jcbLoaiDien);
        jlbAThang.setText("Tháng:");

        jlbASoDien.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlbASoDien.setLabelFor(jcbLoaiDien);
        jlbASoDien.setText("Số điện:");

        jlbATienDien.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlbATienDien.setLabelFor(jcbLoaiDien);
        jlbATienDien.setText("Tiền điện:");

        btnLapHoaDon.setBackground(new java.awt.Color(0, 153, 153));
        btnLapHoaDon.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLapHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        btnLapHoaDon.setText("Lập Hoá Đơn");
        btnLapHoaDon.setBorder(null);

        jlbLHDHoTenKH.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlbLHDHoTenKH.setForeground(new java.awt.Color(255, 0, 0));
        jlbLHDHoTenKH.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlbLHDHoTenKH.setLabelFor(jcbLoaiDien);
        jlbLHDHoTenKH.setText("null");

        jlbLHDThang.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlbLHDThang.setForeground(new java.awt.Color(255, 0, 0));
        jlbLHDThang.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlbLHDThang.setLabelFor(jcbLoaiDien);
        jlbLHDThang.setText("null");

        jlbLHDLuongDienTieuThu.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlbLHDLuongDienTieuThu.setForeground(new java.awt.Color(255, 0, 0));
        jlbLHDLuongDienTieuThu.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlbLHDLuongDienTieuThu.setLabelFor(jcbLoaiDien);
        jlbLHDLuongDienTieuThu.setText("0");

        jlbLHDTienDien.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlbLHDTienDien.setForeground(new java.awt.Color(255, 0, 0));
        jlbLHDTienDien.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlbLHDTienDien.setLabelFor(jcbLoaiDien);
        jlbLHDTienDien.setText("0");

        jlbAThanhTien.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlbAThanhTien.setLabelFor(jcbLoaiDien);
        jlbAThanhTien.setText("Thành tiền(+10%VAT):");

        jlbLHDThanhTien.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlbLHDThanhTien.setForeground(new java.awt.Color(255, 0, 0));
        jlbLHDThanhTien.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlbLHDThanhTien.setLabelFor(jcbLoaiDien);
        jlbLHDThanhTien.setText("0");

        javax.swing.GroupLayout jpnLapHoaDonChiTietLayout = new javax.swing.GroupLayout(jpnLapHoaDonChiTiet);
        jpnLapHoaDonChiTiet.setLayout(jpnLapHoaDonChiTietLayout);
        jpnLapHoaDonChiTietLayout.setHorizontalGroup(
            jpnLapHoaDonChiTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnLapHoaDonChiTietLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jpnLapHoaDonChiTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtfLHDSearch)
                    .addComponent(btnLapHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jpnLapHoaDonChiTietLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnLapHoaDonChiTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnLapHoaDonChiTietLayout.createSequentialGroup()
                        .addComponent(jlbALoaiDien, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcbLoaiDien, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpnLapHoaDonChiTietLayout.createSequentialGroup()
                        .addComponent(jlbATienDien)
                        .addGap(54, 54, 54)
                        .addComponent(jlbLHDTienDien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpnLapHoaDonChiTietLayout.createSequentialGroup()
                        .addComponent(jlbAHoTenKH)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlbLHDHoTenKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpnLapHoaDonChiTietLayout.createSequentialGroup()
                        .addComponent(jlbAThang, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(jlbLHDThang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpnLapHoaDonChiTietLayout.createSequentialGroup()
                        .addComponent(jlbASoDien, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(jlbLHDLuongDienTieuThu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpnLapHoaDonChiTietLayout.createSequentialGroup()
                        .addComponent(jlbAThanhTien)
                        .addGap(54, 54, 54)
                        .addComponent(jlbLHDThanhTien, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpnLapHoaDonChiTietLayout.setVerticalGroup(
            jpnLapHoaDonChiTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnLapHoaDonChiTietLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnLapHoaDonChiTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbALoaiDien)
                    .addComponent(jcbLoaiDien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpnLapHoaDonChiTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbAHoTenKH)
                    .addComponent(jlbLHDHoTenKH))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpnLapHoaDonChiTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbAThang)
                    .addComponent(jlbLHDThang))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpnLapHoaDonChiTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbASoDien)
                    .addComponent(jlbLHDLuongDienTieuThu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpnLapHoaDonChiTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbATienDien)
                    .addComponent(jlbLHDTienDien))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpnLapHoaDonChiTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbLHDThanhTien)
                    .addComponent(jlbAThanhTien))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jtfLHDSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLapHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jpnLapHoaDonDetailsLayout = new javax.swing.GroupLayout(jpnLapHoaDonDetails);
        jpnLapHoaDonDetails.setLayout(jpnLapHoaDonDetailsLayout);
        jpnLapHoaDonDetailsLayout.setHorizontalGroup(
            jpnLapHoaDonDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnLapHoaDonChiTiet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpnLapHoaDonDetailsLayout.setVerticalGroup(
            jpnLapHoaDonDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnLapHoaDonChiTiet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpnLapHoaDonLayout = new javax.swing.GroupLayout(jpnLapHoaDon);
        jpnLapHoaDon.setLayout(jpnLapHoaDonLayout);
        jpnLapHoaDonLayout.setHorizontalGroup(
            jpnLapHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnLapHoaDonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnLapHoaDonDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnLapHoaDonView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnLapHoaDonLayout.setVerticalGroup(
            jpnLapHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnLapHoaDonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnLapHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpnLapHoaDonView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnLapHoaDonDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jpnHoaDonLayout = new javax.swing.GroupLayout(jpnHoaDon);
        jpnHoaDon.setLayout(jpnHoaDonLayout);
        jpnHoaDonLayout.setHorizontalGroup(
            jpnHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnHoaDonTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 1116, Short.MAX_VALUE)
            .addComponent(jpnHoaDonMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnLapHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpnHoaDonLayout.setVerticalGroup(
            jpnHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnHoaDonLayout.createSequentialGroup()
                .addComponent(jpnHoaDonTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnLapHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnHoaDonMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLapHoaDon;
    private javax.swing.JButton btnThanhToan;
    private javax.swing.JComboBox<String> jcbLoaiDien;
    private javax.swing.JLabel jlbAHoTenKH;
    private javax.swing.JLabel jlbALoaiDien;
    private javax.swing.JLabel jlbASoDien;
    private javax.swing.JLabel jlbAThang;
    private javax.swing.JLabel jlbAThanhTien;
    private javax.swing.JLabel jlbATienDien;
    private javax.swing.JLabel jlbHDDien;
    private javax.swing.JLabel jlbHDTenKH;
    private javax.swing.JLabel jlbHDThang;
    private javax.swing.JLabel jlbHDTien;
    private javax.swing.JLabel jlbHoTenKH;
    private javax.swing.JLabel jlbHoaDonTitle;
    private javax.swing.JLabel jlbLHDHoTenKH;
    private javax.swing.JLabel jlbLHDLuongDienTieuThu;
    private javax.swing.JLabel jlbLHDThang;
    private javax.swing.JLabel jlbLHDThanhTien;
    private javax.swing.JLabel jlbLHDTienDien;
    private javax.swing.JLabel jlbLuongDienTieuThu;
    private javax.swing.JLabel jlbThang;
    private javax.swing.JLabel jlbTongTien;
    private javax.swing.JPanel jpnHoaDon;
    private javax.swing.JPanel jpnHoaDonDetails;
    private javax.swing.JPanel jpnHoaDonMain;
    private javax.swing.JPanel jpnHoaDonTable;
    private javax.swing.JPanel jpnHoaDonTitle;
    private javax.swing.JPanel jpnHoaDonView;
    private javax.swing.JPanel jpnLapHoaDon;
    private javax.swing.JPanel jpnLapHoaDonChiTiet;
    private javax.swing.JPanel jpnLapHoaDonDetails;
    private javax.swing.JPanel jpnLapHoaDonTable;
    private javax.swing.JPanel jpnLapHoaDonView;
    private javax.swing.JPanel jpnThongTinThanhToan;
    private javax.swing.JTextField jtfLHDSearch;
    private javax.swing.JTextField jtfSearch;
    // End of variables declaration//GEN-END:variables
}
