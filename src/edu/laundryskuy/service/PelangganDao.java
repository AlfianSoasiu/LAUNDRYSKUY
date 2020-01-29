/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.laundryskuy.service;

import edu.laundryskuy.entity.Pelanggan;
import edu.laundryskuy.error.PelangganException;
import java.util.List;

/**
 *
 * @author Acer
 */
public interface PelangganDao {
    
    public void insertPelanggan(Pelanggan pelanggan) throws PelangganException;
    
    public void updatePelanggan(Pelanggan pelanggan) throws PelangganException;
    
    public void deletePelanggan(Integer no_rak) throws PelangganException;
    
    public List<Pelanggan> selectAllPelanggan() throws PelangganException;
    
    
    
}
