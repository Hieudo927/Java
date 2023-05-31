
package controllers;

import javax.swing.JOptionPane;
import main.Main;
import views.NhanVienDialog;

/**
 *
 * @author duato
 */
public class MenuController {

    public MenuController() {
    }
    
    public static void setMenuBar(javax.swing.JMenuBar jMenuBar) {
        
        /* jMenuHeThong (jMenuItemUser, Separator, jMenuItemLogout, jMenuItemExit) */
        javax.swing.JMenu jMenuHeThong = new javax.swing.JMenu();
        jMenuHeThong.setIcon(new javax.swing.ImageIcon(MenuController.class.getResource("/images/system.png"))); // NOI18N
        jMenuHeThong.setMnemonic('H');
        jMenuHeThong.setText("Hệ Thống");
        
        // Chỉ thêm nếu là admin 
        if (main.Main.nhanVien.getChucVu().equalsIgnoreCase("QuanLy")) {
            
    
            javax.swing.JMenuItem jMenuItemUser = new javax.swing.JMenuItem();
            jMenuItemUser.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_DOWN_MASK));
            jMenuItemUser.setIcon(new javax.swing.ImageIcon(MenuController.class.getResource("/images/user.png"))); // NOI18N
            jMenuItemUser.setText("Người dùng");
            jMenuItemUser.addActionListener(new java.awt.event.ActionListener() {
                @Override
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    new NhanVienDialog(Main.mainFrame, true).setVisible(true);
                }
            });
            jMenuHeThong.add(new javax.swing.JPopupMenu.Separator());
            // Add  menu
            jMenuHeThong.add(jMenuItemUser);
        }

        javax.swing.JMenuItem jMenuItemLogout = new javax.swing.JMenuItem();
        jMenuItemLogout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemLogout.setIcon(new javax.swing.ImageIcon(MenuController.class.getResource("/images/logout.png"))); // NOI18N
        jMenuItemLogout.setText("Đăng xuất");
        jMenuItemLogout.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                int dialogResult = JOptionPane.showConfirmDialog(main.Main.mainFrame,
                                "Bạn muốn đăng xuất khỏi hệ thống?", "Thoát khỏi phiên" , JOptionPane.YES_NO_OPTION);
                if(dialogResult == JOptionPane.YES_OPTION) {
                    //destroy session data
                    main.Main.nhanVien = null;
                    new views.LoginJFrame().setVisible(true);
                    main.Main.mainFrame.dispose();
                }
            }
        });

        javax.swing.JMenuItem jMenuItemExit = new javax.swing.JMenuItem();
        jMenuItemExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemExit.setIcon(new javax.swing.ImageIcon(MenuController.class.getResource("/images/power-button.png"))); // NOI18N
        jMenuItemExit.setText("Thoát");
        jMenuItemExit.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                int dialogResult = JOptionPane.showConfirmDialog(main.Main.mainFrame,
                        "Bạn muốn thoát khỏi hệ thống?", "Đóng chương trình", JOptionPane.YES_NO_OPTION);
                if (dialogResult == JOptionPane.YES_OPTION) {
                    //destroy session data
                    main.Main.nhanVien = null;
                    System.exit(0);
                }
            }
        });
        // Thêm 
        jMenuHeThong.add(jMenuItemLogout);
        jMenuHeThong.add(jMenuItemExit);



        jMenuBar.add(jMenuHeThong);


    }

}
