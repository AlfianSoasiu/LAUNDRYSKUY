/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.laundryskuy.controller;

import edu.laundryskuy.model.PelangganModel;
import edu.laundryskuy.view.HalamanUtama;
import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class PelangganController {
    
    PelangganModel model;

    public void setModel(PelangganModel model) {
        this.model = model;
    }
    
    public void resetPelanggan(HalamanUtama u){
        model.resetPelanggan();
    }
    
   
    public void insertPelanggan(HalamanUtama u){
        Integer no_rak = Integer.parseInt(u.getTxtNo().getText());
        String nama = u.getTxtNama().getText();
        Integer berat = Integer.parseInt(u.getTxtBerat().getText());
        String tgl_terima = u.getTxtTerima().getText();
        String tgl_selesai = u.getTxtSelesai().getText();
        String telp = u.getTxtTelp().getText();
        Integer total = Integer.parseInt(u.getTxtTotal().getText());
        String ket_lunas = u.getTxtKetLunas().getText();
        String ket_selesai = u.getTxtKetSelesai().getText();
        
        if (no_rak.equals(0)) {
            JOptionPane.showMessageDialog(u, "Nomor Rak Masih Kosong");
        } else if (nama.trim().equals("")) {
            JOptionPane.showMessageDialog(u, "Nama Masih Kosong");
        } else {
            model.setNo_rak(no_rak);
            model.setNama(nama);
            model.setBerat(berat);
            model.setTgl_terima(tgl_terima);
            model.setTgl_selesai(tgl_selesai);
            model.setTelp(telp);
            model.setTotal(total);
            model.setKet_lunas(ket_lunas);
            model.setKet_selesai(ket_selesai);
            try {
                model.insertPelanggan();
                JOptionPane.showMessageDialog(u, "Pelanggan Berhasil Ditambahkan");
                model.resetPelanggan();
            } catch (Throwable throwable) {
                JOptionPane.showMessageDialog(u, new Object[]{
                    "Terjadi error di database dengan pesan ", throwable.getMessage()
                });
            }
        }
    }
    public void updatePelanggan(HalamanUtama u){
         if (u.getTablePelanggan().getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(u, "Silahkan Seleksi baris data yang akan diubah");
            return;
        }
         Integer no_rak = Integer.parseInt(u.getTxtNo().getText());
        String nama = u.getTxtNama().getText();
        Integer berat = Integer.parseInt(u.getTxtBerat().getText());
        String tgl_terima = u.getTxtTerima().getText();
        String tgl_selesai = u.getTxtSelesai().getText();
        String telp = u.getTxtTelp().getText();
        Integer total = Integer.parseInt(u.getTxtTotal().getText());
        String ket_lunas = u.getTxtKetLunas().getText();
        String ket_selesai = u.getTxtKetSelesai().getText();
        
        if (nama.trim().equals("")) {
            JOptionPane.showMessageDialog(u, "Nama Masih Kosong");
        } else {
            model.setNo_rak(no_rak);
            model.setNama(nama);
            model.setBerat(berat);
            model.setTgl_terima(tgl_terima);
            model.setTgl_selesai(tgl_selesai);
            model.setTelp(telp);
            model.setTotal(total);
            model.setKet_lunas(ket_lunas);
            model.setKet_selesai(ket_selesai);
            try {
                model.insertPelanggan();
                JOptionPane.showMessageDialog(u, "Pelanggan Berhasil Diubah");
                model.resetPelanggan();
            } catch (Throwable throwable) {
                JOptionPane.showMessageDialog(u, new Object[]{
                    "Terjadi error di database dengan pesan ", throwable.getMessage()
                });
            }
        }
    }
    
    public void deletePelanggan(HalamanUtama u){
    //jika tidak ada yang diseleksi kasih peringatan
        if (u.getTablePelanggan().getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(u, "Silahkan Seleksi baris data yang akan dihapus");
            return;
        }

        if (JOptionPane.showConfirmDialog(u, "Anda yakin akan menghapus?")
                == JOptionPane.OK_OPTION) {

            Integer no = Integer.parseInt(u.getTxtNo().getText());
            model.setNo_rak(no);

            try {
                model.deletePelanggan();
                JOptionPane.showMessageDialog(u, "Data Pelanggan Berhasil Di Hapus");
                model.resetPelanggan();
            } catch (Throwable throwable) {
                JOptionPane.showMessageDialog(u, new Object[]{
                    "Terjadi error di database dengan pesan ", throwable.getMessage()
                });
            }
        }
    }

}
