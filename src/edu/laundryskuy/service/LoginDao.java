/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.laundryskuy.service;

import edu.laundryskuy.entity.Login;
import edu.laundryskuy.error.LoginException;

/**
 *
 * @author Acer
 */
public interface LoginDao {
    
    public void insertLogin(Login login) throws LoginException;
}
