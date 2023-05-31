/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.text.ParseException;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import views.LoginJFrame;

/**
 *
 * @author duato
 */
public class Main {
    public static javax.swing.JFrame mainFrame = null;
    public static models.NhanVien nhanVien = null;
    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        java.awt.EventQueue.invokeLater(() -> {
            new LoginJFrame().setVisible(true);
        });
    }
}
