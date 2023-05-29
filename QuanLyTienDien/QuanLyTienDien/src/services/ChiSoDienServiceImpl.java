/*
 * Project Name:       Phan Mem Quan Ly Tien Dien Java
 * Description:       Bai tap lon Java Quan Ly Tien Dien JDBC + Swing
 * Author:            Nhom 8
 */
package services;

import dao.ChiSoDienDAOImpl;
import java.util.List;
import models.ChiSoDien;
import models.Thang;

/**
 *
 * @author duato
 */
public class ChiSoDienServiceImpl implements ChiSoDienService{

    private ChiSoDienDAOImpl chiSoDienDAOImpl = null;

    public ChiSoDienServiceImpl() {
        chiSoDienDAOImpl = new ChiSoDienDAOImpl();
    }
    
    @Override
    public List<ChiSoDien> getList() {
        return chiSoDienDAOImpl.getList();
    }

    @Override
    public List<ChiSoDien> getListExcludedInHoaDon() {
        return chiSoDienDAOImpl.getListExcludedInHoaDon();
    }

    @Override
    public ChiSoDien getChiSoDien(int maKH, int thangID) {
        return chiSoDienDAOImpl.getChiSoDien(maKH, thangID);
    }

    @Override
    public ChiSoDien getLastChiSoDien(int maKH) {
        return chiSoDienDAOImpl.getLastChiSoDien(maKH);
    }

    @Override
    public ChiSoDien getFirstChiSoDien(int maKH) {
        return chiSoDienDAOImpl.getFirstChiSoDien(maKH);
    }

    @Override
    public int createORUpdate(ChiSoDien chiSoDien) {
        return chiSoDienDAOImpl.createORUpdate(chiSoDien);
    }

    @Override
    public List<ChiSoDien> getListOfThang(Thang thang) {
        return chiSoDienDAOImpl.getListOfThang(thang);
    }
    
}
