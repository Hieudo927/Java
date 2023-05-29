/*
 * Project Name:       Phan Mem Quan Ly Tien Dien Java
 * Description:       Bai tap lon Java Quan Ly Tien Dien JDBC + Swing
 * Author:            Nhom 8
 */
package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import models.Thang;

/**
 *
 * @author Admin
 */
public class ThongKeDAOImpl implements ThongKeDAO{

    @Override
    public List<List<Object>> getRawData() {
        Connection cons = MySQLConnect.getConnection();
        String sql = "select thang.thangid, ngaydau, ngaycuoi, sum(LuongDienTieuThu) as tongdientieuthutrongthang, sum(tongtien) as tongtientrongthang\n" +
                    "from `thang` inner join `hoadon` on `thang`.ThangID = `hoadon`.ThangID\n" +
                    "where tinhtrang = true\n" +
                    "group by thangid";
        List<List<Object>> list = new ArrayList<>();
        try {
            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int thangID = rs.getInt("thangid");
                Date ngayDau = new Date(rs.getDate("ngaydau").getTime());
                Date ngayCuoi = new Date(rs.getDate("ngaycuoi").getTime());
                long tongLuongDienTieuThu = rs.getLong("tongdientieuthutrongthang");
                long tongTien = rs.getLong("tongtientrongthang");

                List<Object> lis = Arrays.asList(thangID, ngayDau, ngayCuoi, tongLuongDienTieuThu, tongTien);
                list.add(lis);
            }
            ps.close();
            MySQLConnect.disconnect();
        } catch (SQLException e) {
            MySQLConnect.disconnect();
            System.err.println(e.getMessage());
        }
        return list;
    }
    
}
