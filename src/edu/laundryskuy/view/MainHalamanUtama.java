/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.laundryskuy.view;

import edu.laundryskuy.error.PelangganException;
import java.sql.SQLException;

/**
 *
 * @author Acer
 */
public class MainHalamanUtama extends javax.swing.JFrame {

    /**
     * Creates new form MainHalamanUtama
     */
    public MainHalamanUtama() {
        initComponents();
    }

    public void loadDatabase() throws SQLException, PelangganException {
        halamanUtama1.loadDatabase();
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        halamanUtama1 = new edu.laundryskuy.view.HalamanUtama();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().add(halamanUtama1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private edu.laundryskuy.view.HalamanUtama halamanUtama1;
    // End of variables declaration//GEN-END:variables
}
