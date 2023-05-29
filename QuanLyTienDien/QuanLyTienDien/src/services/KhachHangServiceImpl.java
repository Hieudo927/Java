/*
 * Project Name:       Phan Mem Quan Ly Tien Dien Java
 * Description:       Bai tap lon Java Quan Ly Tien Dien JDBC + Swing
 * Author:            Nhom 8
 */
package services;

import dao.KhachHangDAO;
import dao.KhachHangDAOImpl;
import java.util.List;
import models.KhachHang;

/**
 *
 * @author duato
 */
public class KhachHangServiceImpl implements KhachHangService{
    
    private KhachHangDAO khachHangDAO = null;

    public KhachHangServiceImpl() {
        khachHangDAO = new KhachHangDAOImpl();
    }
    
    
    @Override
    public List<KhachHang> getList() {
        return khachHangDAO.getList();
    }

    @Override
    public int createORUpdate(KhachHang khachHang) {
        return khachHangDAO.createORUpdate(khachHang);
    }

    @Override
    public boolean deleteData(KhachHang khachHang) {
        return khachHangDAO.deleteData(khachHang);
    }

    @Override
    public KhachHang getKhachHang(int maKH) {
        return khachHangDAO.getKhachHang(maKH);
    }
    
}
