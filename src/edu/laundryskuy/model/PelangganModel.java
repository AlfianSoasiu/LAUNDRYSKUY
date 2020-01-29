/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.laundryskuy.model;

import edu.laundryskuy.database.LaundryskuyDatabase;
import edu.laundryskuy.entity.Pelanggan;
import edu.laundryskuy.error.PelangganException;
import edu.laundryskuy.event.PelangganListener;
import edu.laundryskuy.service.PelangganDao;
import java.sql.SQLException;

/**
 *
 * @author Acer
 */
public class PelangganModel {
    
    private Integer no_rak;
    private String nama;
    private Integer berat;
    private String tgl_terima;
    private String tgl_selesai;
    private String telp;
    private Integer total;
    private String ket_lunas;
    private String ket_selesai;
    
    private PelangganListener listener;

    public PelangganListener getListener() {
        return listener;
    }

    public void setListener(PelangganListener listener) {
        this.listener = listener;
    }

    public Integer getNo_rak() {
        return no_rak;
    }

    public void setNo_rak(Integer no_rak) {
        this.no_rak = no_rak;
         fireOnChange();
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
         fireOnChange();
    }

    public Integer getBerat() {
        return berat;
    }

    public void setBerat(Integer berat) {
        this.berat = berat;
         fireOnChange();
    }

    public String getTgl_terima() {
        return tgl_terima;
    }

    public void setTgl_terima(String tgl_terima) {
        this.tgl_terima = tgl_terima;
         fireOnChange();
    }

    public String getTgl_selesai() {
        return tgl_selesai;
    }

    public void setTgl_selesai(String tgl_selesai) {
        this.tgl_selesai = tgl_selesai;
         fireOnChange();
    }

    public String getTelp() {
        return telp;
    }

    public void setTelp(String telp) {
        this.telp = telp;
         fireOnChange();
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
         fireOnChange();
    }

    public String getKet_lunas() {
        return ket_lunas;
    }

    public void setKet_lunas(String ket_lunas) {
        this.ket_lunas = ket_lunas;
         fireOnChange();
    }

    public String getKet_selesai() {
        return ket_selesai;
    }

    public void setKet_selesai(String ket_selesai) {
        this.ket_selesai = ket_selesai;
         fireOnChange();
    }

    
    
    protected void fireOnChange(){
         if (listener != null) {
            listener.onChange(this);
        }
    }
    
    protected void fireOnInsert(Pelanggan pelanggan){
         if (listener != null) {
            listener.onInsert(pelanggan);
        }
    }
    
    protected void fireOnUpdate(Pelanggan pelanggan){
        if (listener != null) {
            listener.onUpdate(pelanggan);
        }
    }
    
    protected void fireOnDelete(){
        if (listener != null) {
            listener.onDelete();
        }
    }
    
    public void insertPelanggan() throws SQLException, PelangganException {
        PelangganDao dao = LaundryskuyDatabase.getPelangganDao();

        Pelanggan pelanggan = new Pelanggan();
        pelanggan.setNo_rak(no_rak);
        pelanggan.setNama(nama);
        pelanggan.setBerat(berat);
        pelanggan.setTgl_terima(tgl_terima);
        pelanggan.setTgl_selesai(tgl_selesai);
        pelanggan.setTelp(telp);
        pelanggan.setTotal(total);
        pelanggan.setKet_lunas(ket_lunas);
        pelanggan.setKet_selesai(ket_selesai);

        dao.insertPelanggan(pelanggan);
        fireOnInsert(pelanggan);
    }
    
    public void updatePelanggan() throws SQLException, PelangganException {
        PelangganDao dao = LaundryskuyDatabase.getPelangganDao();

        Pelanggan pelanggan = new Pelanggan();
        pelanggan.setNo_rak(no_rak);
        pelanggan.setNama(nama);
        pelanggan.setBerat(berat);
        pelanggan.setTgl_terima(tgl_terima);
        pelanggan.setTgl_selesai(tgl_selesai);
        pelanggan.setTelp(telp);
        pelanggan.setTotal(total);
        pelanggan.setKet_lunas(ket_lunas);
        pelanggan.setKet_selesai(ket_selesai);;

        dao.updatePelanggan(pelanggan);
        fireOnUpdate(pelanggan);
    }
    
    public void deletePelanggan() throws SQLException, PelangganException {
        
        PelangganDao dao = LaundryskuyDatabase.getPelangganDao();
        dao.deletePelanggan(no_rak);
        fireOnDelete();
    }
    
    public void resetPelanggan(){
        setNo_rak(0);
        setNama("");
        setBerat(0);
        setTgl_terima("");
        setTgl_selesai("");
        setTelp("");
        setTotal(0);
        setKet_lunas("");
        setKet_selesai("");
    
    }

}