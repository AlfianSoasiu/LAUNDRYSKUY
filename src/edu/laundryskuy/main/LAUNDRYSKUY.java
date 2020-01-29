/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.laundryskuy.main;

import edu.laundryskuy.error.PelangganException;
import edu.laundryskuy.view.MainHalamanUtama;
import java.sql.SQLException;
import javax.swing.SwingUtilities;


/**
 *
 * @author Acer
 */
public class LAUNDRYSKUY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, PelangganException{
        // TODO code application logic hereLoginDao dao = LaundryskuyDatabase.getLoginDao();
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                try {
                    MainHalamanUtama pelanggan = new MainHalamanUtama();
                    pelanggan.loadDatabase();
                    pelanggan.setVisible(true);
                } catch (SQLException ex) {
                } catch (PelangganException ex) {
                }
            }
        });
    }

}