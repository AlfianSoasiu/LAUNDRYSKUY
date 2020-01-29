/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.laundryskuy.database;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import edu.laundryskuy.impl.LoginDaoImpl;
import edu.laundryskuy.impl.PelangganDaoImpl;
import edu.laundryskuy.service.LoginDao;
import edu.laundryskuy.service.PelangganDao;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Acer
 */
public class LaundryskuyDatabase {
    private static Connection connection;
    private static LoginDao loginDao;
    private static PelangganDao pelangganDao;
    
    public static Connection getConnection() throws SQLException{
        if (connection==null) {
            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setURL("jdbc:mysql://localhost:3306/laundryskuy");
            dataSource.setUser("root");
            dataSource.setPassword("");
            connection = dataSource.getConnection();
        }
        return connection;
    }
    public static LoginDao getLoginDao() throws SQLException{
        if (loginDao==null) {
            loginDao = new LoginDaoImpl(getConnection());
        }
    return loginDao;
    }
    public static PelangganDao getPelangganDao() throws SQLException{
        if (pelangganDao==null) {
            pelangganDao = new PelangganDaoImpl(getConnection());
        }
        return pelangganDao;
    }    
}
