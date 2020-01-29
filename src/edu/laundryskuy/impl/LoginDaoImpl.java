/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.laundryskuy.impl;

import com.toedter.calendar.JDateChooser;
import edu.laundryskuy.entity.Login;
import edu.laundryskuy.error.LoginException;
import edu.laundryskuy.service.LoginDao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author Acer
 */
public class LoginDaoImpl implements LoginDao{

    private Connection connection;
    
    private final String insertLogin = "INSERT INTO LOGIN "
            + "(NAMA,TANGGAL,PASSwORD) "
            + "VALUES (?,?,?)";

    public LoginDaoImpl(Connection Connection) {
        this.connection = Connection;
    }

    @Override
    public void insertLogin(Login login) throws LoginException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(insertLogin);
            statement.setString(1,login.getNama());
            statement.setString(2,login.getTanggal());
            statement.setString(3,login.getPassword());
            statement.executeUpdate();
            connection.commit();
        } catch (SQLException e){
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            throw new LoginException(e.getMessage());
        } finally{
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                }
                
            }
        }
    }
            
    
    
}
