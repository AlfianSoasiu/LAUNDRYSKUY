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
    private String ket;
    
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
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Integer getBerat() {
        return berat;
    }

    public void setBerat(Integer berat) {
        this.berat = berat;
    }

    public String getTgl_terima() {
        return tgl_terima;
    }

    public void setTgl_terima(String tgl_terima) {
        this.tgl_terima = tgl_terima;
    }

    public String getTgl_selesai() {
        return tgl_selesai;
    }

    public void setTgl_selesai(String tgl_selesai) {
        this.tgl_selesai = tgl_selesai;
    }

    public String getTelp() {
        return telp;
    }

    public void setTelp(String telp) {
        this.telp = telp;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public String getKet() {
        return ket;
    }

    public void setKet(String ket) {
        this.ket = ket;
    }
    
    protected void fireOnChage(){
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
        pelanggan.setKet(ket);

        dao.insertPelanggan(pelanggan);
        fireOnInsert(pelanggan);
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
        setKet("");
    
    }

    public void setTotal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}