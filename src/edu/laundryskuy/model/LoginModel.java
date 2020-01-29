/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.laundryskuy.model;

import edu.laundryskuy.database.LaundryskuyDatabase;
import edu.laundryskuy.entity.Login;
import edu.laundryskuy.error.LoginException;
import edu.laundryskuy.event.LoginListener;
import edu.laundryskuy.service.LoginDao;
import java.sql.SQLException;
import java.text.ParseException;

/**
 *
 * @author Acer
 */
public class LoginModel {
    private String nama;
    private String tanggal;
    private String password;
    
    private LoginListener listener;

    public LoginListener getListener() {
        return listener;
    }

    public void setListener(LoginListener listener) {
        this.listener = listener;
    }
    

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    protected void fireOnInsert(Login login){
        if (listener!=null) {
            listener.onInsert(login);
        }
    }
    
    public void insertLogin() throws SQLException, LoginException, ParseException{
        LoginDao dao = LaundryskuyDatabase.getLoginDao();
        Login login = new Login();
        login.setNama(nama);
        login.setTanggal(tanggal);
        login.setPassword(password);
        
        dao.insertLogin(login);
        fireOnInsert(login);
    }
    
    public void resetLogin(){
        setNama("");
        setTanggal("");
        setPassword("");
    }

  
    
}
