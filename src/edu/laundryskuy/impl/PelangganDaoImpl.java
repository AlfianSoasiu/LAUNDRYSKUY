/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.laundryskuy.impl;

import edu.laundryskuy.entity.Pelanggan;
import edu.laundryskuy.error.PelangganException;
import edu.laundryskuy.service.PelangganDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author Acer
 */
public class PelangganDaoImpl implements PelangganDao{
    
    private Connection connection;
    
    private final String insertPelanggan = "INSERT INTO PELANGGAN"
            + "(NO_RAK,NAMA,BERAT,TGL_TERIMA,TGL_SELESAI,TELP,TOTAL,KET) VALUES"
            + "(?,?,?,?,?,?,?,?)";

    private final String updatePelanggan = "UPDATE PELANGGAN SET NO_RAK=?,NAMA=?,BERAT=?,TGL_TERIMA=?,TGL_SELESAI=?,TELP=?,TOTAL=?,KET=? WHERE NO_RAK=?";

    private final String deletePelanggan = "DELETE FROM PELANGGAN WHERE NO_RAK=?";

    private final String getById = "SELECT * FROM PELANGGAN WHERE NO_RAK=?";

    private final String selectAll = "SELECT * FROM PELANGGAN";

    public PelangganDaoImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void insertPelanggan(Pelanggan pelanggan) throws PelangganException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(insertPelanggan, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, pelanggan.getNo_rak());
            statement.setString(2, pelanggan.getNama());
            statement.setInt(3, pelanggan.getBerat());
            statement.setString(4, pelanggan.getTgl_terima());
            statement.setString(5, pelanggan.getTgl_selesai());
            statement.setString(6, pelanggan.getTelp());
            statement.setInt(7, pelanggan.getTotal());
            statement.setString(8, pelanggan.getKet());
            statement.executeUpdate();
            
            connection.commit();
        } catch (SQLException exception) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            throw new PelangganException(exception.getMessage());
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException exception) {
                }
            }
        }
    }


    @Override
    public void updatePelanggan(Pelanggan pelanggan) throws PelangganException {
    }

    @Override
    public void deletePelanggan(Integer no_rak) throws PelangganException {
         PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(deletePelanggan);
            statement.setInt(1, no_rak);
            statement.executeUpdate();
            connection.commit();
        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            throw new PelangganException(e.getMessage());
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException exception) {
                }
            }
        }
    }

    @Override
    public Pelanggan getPelanggan(Integer no_rak) throws PelangganException {
        return null;
    }

    @Override
    public List<Pelanggan> selectAllPelanggan() throws PelangganException {
        return null;
    }
}
