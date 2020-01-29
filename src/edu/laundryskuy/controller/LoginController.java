/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.laundryskuy.controller;

import edu.laundryskuy.model.LoginModel;
import edu.laundryskuy.view.HalamanLogin;
import edu.laundryskuy.view.MainHalamanUtama;
import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class LoginController {
    private LoginModel model;

    public void setModel(LoginModel model) {
        this.model = model;
    }
    
    public void resetLogin(HalamanLogin halaman){
        model.resetLogin();
    }
    
    public void insertLogin(HalamanLogin halaman){
        String nama = halaman.getTxtNama().getText();
        String tanggal = halaman.getTxtTanggal().getText();
        String password = halaman.getTxtpass().getText();
        
        if (nama.trim().equals("")) {
            JOptionPane.showMessageDialog(halaman, "Nama Masih Kosong");
        } else if (tanggal.equals("")){
            JOptionPane.showMessageDialog(halaman, "Tanggal Masih Kosong");
        } else if (password.equals("")){
            JOptionPane.showMessageDialog(halaman, "Password Masih Kosong");
        } else if (password.length()>8){
            JOptionPane.showMessageDialog(halaman, "Password Lebih Dari 8 Digit");
        } else {
            model.setNama(nama);
            model.setTanggal(tanggal);
            model.setPassword(password);
            
            try {
                model.insertLogin();
                JOptionPane.showMessageDialog(halaman, "Berhasil Masuk");
                MainHalamanUtama utama = new MainHalamanUtama();
                utama.setVisible(true);
                model.resetLogin();
            } catch (Throwable throwable) {
                JOptionPane.showMessageDialog(halaman, new Object[]{"Terjadi Error di Database dengan Pesan ", throwable.getMessage()});
            }
        }
    }
}
