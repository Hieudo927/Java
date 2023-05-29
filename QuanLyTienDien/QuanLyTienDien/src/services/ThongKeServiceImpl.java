/*
 * Project Name:       Phan Mem Quan Ly Tien Dien Java
 * Description:       Bai tap lon Java Quan Ly Tien Dien JDBC + Swing
 * Author:            Nhom 8
 */
package services;

import dao.ThongKeDAOImpl;
import java.util.List;


public class ThongKeServiceImpl implements ThongKeService {

    ThongKeDAOImpl thongKeDAOImpl = new ThongKeDAOImpl();
    @Override
    public List<List<Object>> getRawData() {
        return thongKeDAOImpl.getRawData();
    }
    
}
