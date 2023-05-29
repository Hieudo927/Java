/*
 * Project Name:       Phan Mem Quan Ly Tien Dien Java
 * Description:       Bai tap lon Java Quan Ly Tien Dien JDBC + Swing
 * Author:            Nhom 8
 */
package dao;

import java.util.List;
import models.Thang;

/**
 *
 * @author duato
 */
public interface ThangDAO {
    public List<Thang> getList();
    public int createORUpdate(Thang thang);
    public Thang getThang(int thangID);
    public Thang getLastThangOf(int maKH);
    public Thang getLastThang();
}
