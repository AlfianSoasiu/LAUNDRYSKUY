/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.laundryskuy.entity;

import java.util.Objects;

/**
 *
 * @author Acer
 */
public class Pelanggan {
    private Integer no_rak;
    private String nama;
    private Integer berat;
    private String tgl_terima;
    private String tgl_selesai;
    private String telp;
    private Integer total;
    private String ket_lunas;
    private String ket_selesai;
    
    public Pelanggan(){
        
    }

    public Pelanggan(Integer no_rak, String nama, Integer berat, String tgl_terima, String tgl_selesai, String telp, Integer total, String ket) {
        this.no_rak = no_rak;
        this.nama = nama;
        this.berat = berat;
        this.tgl_terima = tgl_terima;
        this.tgl_selesai = tgl_selesai;
        this.telp = telp;
        this.total = total;
        this.ket_lunas = ket_lunas;
        this.ket_selesai = ket_selesai;
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

    public String getKet_lunas() {
        return ket_lunas;
    }

    public void setKet_lunas(String ket_lunas) {
        this.ket_lunas = ket_lunas;
    }
    
    public String getKet_selesai() {
        return ket_selesai;
    }

    public void setKet_selesai(String ket_selesai) {
        this.ket_selesai = ket_selesai;
    }

    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.no_rak);
        hash = 83 * hash + Objects.hashCode(this.nama);
        hash = 83 * hash + Objects.hashCode(this.berat);
        hash = 83 * hash + Objects.hashCode(this.tgl_terima);
        hash = 83 * hash + Objects.hashCode(this.tgl_selesai);
        hash = 83 * hash + Objects.hashCode(this.telp);
        hash = 83 * hash + Objects.hashCode(this.total);
        hash = 83 * hash + Objects.hashCode(this.ket_lunas);
        hash = 83 * hash + Objects.hashCode(this.ket_selesai);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pelanggan other = (Pelanggan) obj;
        if (!Objects.equals(this.no_rak, other.no_rak)) {
            return false;
        }
        if (!Objects.equals(this.nama, other.nama)) {
            return false;
        }
        if (!Objects.equals(this.berat, other.berat)) {
            return false;
        }
        if (!Objects.equals(this.tgl_terima, other.tgl_terima)) {
            return false;
        }
        if (!Objects.equals(this.tgl_selesai, other.tgl_selesai)) {
            return false;
        }
        if (!Objects.equals(this.telp, other.telp)) {
            return false;
        }
        if (!Objects.equals(this.total, other.total)) {
            return false;
        }
        if (!Objects.equals(this.ket_lunas, other.ket_lunas)) {
            return false;
        }
        if (!Objects.equals(this.ket_selesai, other.ket_selesai)) {
            return false;
        }
        return true;
    }
  

    
    

    
    
    
    
}
