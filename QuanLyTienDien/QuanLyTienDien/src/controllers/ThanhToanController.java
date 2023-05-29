
package controllers;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import models.ChiSoDien;
import models.HoaDon;
import models.KhachHang;
import models.Thang;
import services.ChiSoDienServiceImpl;
import services.HoaDonServiceImpl;
import services.KhachHangServiceImpl;
import services.ThangServiceImpl;
import utility.JCustomTable;
import utility.JCustomTableBuilder;

/**
 *
 * @author Admin
 */
public class ThanhToanController {

    JComboBox jComboBox_Thang;
    JScrollPane jScrollPane_ChuaGhiSoDien;
    JScrollPane jScrollPane_DaThanhToan;

    public ThanhToanController(JComboBox jComboBox_Thang, JScrollPane jScrollPane_ChuaGhiSoDien, JScrollPane jScrollPane_DaThanhToan) {
        this.jComboBox_Thang = jComboBox_Thang;
        this.jScrollPane_ChuaGhiSoDien = jScrollPane_ChuaGhiSoDien;
        this.jScrollPane_DaThanhToan = jScrollPane_DaThanhToan;
    }

    private final ThangServiceImpl thangServiceImpl = new ThangServiceImpl();
    private final ChiSoDienServiceImpl chiSoDienServiceImpl = new ChiSoDienServiceImpl();
    private final KhachHangServiceImpl khachHangServiceImpl = new KhachHangServiceImpl();
    private final HoaDonServiceImpl hoaDonServiceImpl = new HoaDonServiceImpl();
    
    private JCustomTable jCustomTable_ChuaNhapSoDien;
    private JCustomTable jCustomTable_DaThanhToan;
    
    public void initData(){
        List<Thang> list = thangServiceImpl.getList();
        
        DefaultComboBoxModel aModel = new DefaultComboBoxModel(list.toArray());
        jComboBox_Thang.setModel(aModel);
    }
    
    public void initTable(){
        jCustomTable_ChuaNhapSoDien = new JCustomTableBuilder(jScrollPane_ChuaGhiSoDien)
                .addColumnName("Mã khách hàng")
                .addColumnName("Họ tên")
                .addColumnName("Địa chỉ")
                .addColumnName("CCCD")
                .addColumnName("Ngày sinh")
                .addColumnName("Số điện thoại")
                .build();
        
        Thang selectedThang = (Thang)jComboBox_Thang.getSelectedItem();
        
        refreshjTable_ChuaNhapSoDien(selectedThang);
        
        jCustomTable_DaThanhToan = new JCustomTableBuilder(jScrollPane_DaThanhToan)
                .addColumnName("Mã khách hàng")
                .addColumnName("Họ tên")
                .addColumnName("Địa chỉ")
                .addColumnName("CCCD")
                .addColumnName("Ngày sinh")
                .addColumnName("Số điện thoại")
                .build();
        
        refreshjTable_DaThanhToan(selectedThang);
        
        
    }
    
    private void refreshjTable_ChuaNhapSoDien(Thang thang){
        jCustomTable_ChuaNhapSoDien.clear();
        
        List<KhachHang> listKhachHang = khachHangServiceImpl.getList();
        List<ChiSoDien> listChiSoDien = chiSoDienServiceImpl.getListOfThang(thang);
        
        listChiSoDien.forEach(chiSoDien -> {
            listKhachHang.removeIf(khachHang -> (khachHang.getMaKH() == chiSoDien.getMaKH()));
        });
        
        List<List<Object>> obj = new ArrayList<>();
        listKhachHang.forEach(khachHang -> { obj.add(khachHang.getAsList()); });
        
        jCustomTable_ChuaNhapSoDien.addRows(obj);
    }
    
    private void refreshjTable_DaThanhToan(Thang thang){
        jCustomTable_DaThanhToan.clear();
        
        List<HoaDon> listHoaDonOfThang = hoaDonServiceImpl.getListOfThang(thang);
        
        List<List<Object>> obj = new ArrayList<>();
        listHoaDonOfThang.forEach(hoaDon -> { obj.add(khachHangServiceImpl.getKhachHang(hoaDon.getMaKH()).getAsList()); });
        
        jCustomTable_DaThanhToan.addRows(obj);
    }
    
    public void initEvent(){
        jComboBox_Thang.addActionListener((ActionEvent e) -> {
            Thang selectedThang = (Thang)jComboBox_Thang.getSelectedItem();
            refreshjTable_ChuaNhapSoDien(selectedThang);
            refreshjTable_DaThanhToan(selectedThang);
        });
    }
}
