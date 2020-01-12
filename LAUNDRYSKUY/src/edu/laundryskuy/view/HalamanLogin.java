/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.laundryskuy.view;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author Acer
 */
public class HalamanLogin extends javax.swing.JFrame {

    /**
     * Creates new form HalamanUtama
     */
    public HalamanLogin() {
        initComponents();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelUtama = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        TextHeader = new javax.swing.JLabel();
        IconHeader = new javax.swing.JLabel();
        Isi = new javax.swing.JPanel();
        TextLogin = new javax.swing.JLabel();
        TextNama = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        TextPass = new javax.swing.JLabel();
        txtpass = new javax.swing.JTextField();
        btnMasuk = new javax.swing.JPanel();
        TextMasuk = new javax.swing.JLabel();
        btnReset = new javax.swing.JPanel();
        TextReset = new javax.swing.JLabel();
        btnKeluar = new javax.swing.JPanel();
        TextKeluar = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN LAUNDRYSKUY");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        PanelUtama.setBackground(new java.awt.Color(255, 255, 255));
        PanelUtama.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Header.setBackground(new java.awt.Color(87, 138, 175));
        Header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TextHeader.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        TextHeader.setText("LAUNDRYSKUY");
        Header.add(TextHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 30));

        IconHeader.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laundryskuy/Icon/Logo.png"))); // NOI18N
        Header.add(IconHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 10, 40, 50));

        PanelUtama.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 70));

        Isi.setBackground(new java.awt.Color(255, 255, 255));
        Isi.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TextLogin.setFont(new java.awt.Font("Leelawadee", 1, 36)); // NOI18N
        TextLogin.setText("L O G I N");
        Isi.add(TextLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1650, 70, -1, 30));

        TextNama.setFont(new java.awt.Font("Leelawadee", 0, 24)); // NOI18N
        TextNama.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextNama.setText("N A M A  P E T U G A S");
        Isi.add(TextNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 150, 520, 30));

        txtNama.setFont(new java.awt.Font("Leelawadee", 0, 24)); // NOI18N
        txtNama.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtNama.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });
        Isi.add(txtNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 210, 520, 50));

        TextPass.setFont(new java.awt.Font("Leelawadee", 0, 24)); // NOI18N
        TextPass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextPass.setText("P A S S W O R D");
        Isi.add(TextPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 310, 520, 30));

        txtpass.setFont(new java.awt.Font("Leelawadee", 0, 24)); // NOI18N
        txtpass.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpassActionPerformed(evt);
            }
        });
        Isi.add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 370, 520, 50));

        btnMasuk.setBackground(new java.awt.Color(87, 138, 175));
        btnMasuk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMasukMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMasukMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMasukMousePressed(evt);
            }
        });
        btnMasuk.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TextMasuk.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        TextMasuk.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextMasuk.setText("M A S U K");
        btnMasuk.add(TextMasuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 40));

        Isi.add(btnMasuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 470, 520, 40));

        btnReset.setBackground(new java.awt.Color(87, 138, 175));
        btnReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnResetMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnResetMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnResetMousePressed(evt);
            }
        });
        btnReset.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TextReset.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        TextReset.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextReset.setText("R E S E T");
        btnReset.add(TextReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 40));

        Isi.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 540, 260, 40));

        btnKeluar.setBackground(new java.awt.Color(87, 138, 175));
        btnKeluar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnKeluarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnKeluarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnKeluarMousePressed(evt);
            }
        });
        btnKeluar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TextKeluar.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        TextKeluar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextKeluar.setText("K E L U A R");
        btnKeluar.add(TextKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 40));

        Isi.add(btnKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 540, 250, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laundryskuy/Images/Login3.jpg"))); // NOI18N
        Isi.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laundryskuy/Images/Login2.jpg"))); // NOI18N
        Isi.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laundryskuy/Images/Login4.jpg"))); // NOI18N
        Isi.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laundryskuy/Images/Login1.jpg"))); // NOI18N
        Isi.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, -1, -1));

        PanelUtama.add(Isi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1920, 1010));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelUtama, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelUtama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        setExtendedState(JFrame.MAXIMIZED_HORIZ);
        setVisible(true);
        setResizable(false);
    }//GEN-LAST:event_formWindowOpened

    private void txtpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpassActionPerformed

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaActionPerformed

    private void btnKeluarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKeluarMousePressed
        // TODO add your handling code here:
        btnKeluar.setBackground(new Color(62,113,150));
    }//GEN-LAST:event_btnKeluarMousePressed

    private void btnKeluarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKeluarMouseEntered
        // TODO add your handling code here:
        btnKeluar.setBackground(new Color(113,164,201)); 
    }//GEN-LAST:event_btnKeluarMouseEntered

    private void btnKeluarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKeluarMouseExited
        // TODO add your handling code here:
        btnKeluar.setBackground(new Color(87,138,175));
    }//GEN-LAST:event_btnKeluarMouseExited

    private void btnResetMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetMousePressed
        // TODO add your handling code here:
        btnReset.setBackground(new Color(62,113,150));
    }//GEN-LAST:event_btnResetMousePressed

    private void btnResetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetMouseEntered
        // TODO add your handling code here:
        btnReset.setBackground(new Color(113,164,201)); 
    }//GEN-LAST:event_btnResetMouseEntered

    private void btnResetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetMouseExited
        // TODO add your handling code here:
        btnReset.setBackground(new Color(87,138,175));
    }//GEN-LAST:event_btnResetMouseExited

    private void btnMasukMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMasukMousePressed
        // TODO add your handling code here:
        btnMasuk.setBackground(new Color(62,113,150));
    }//GEN-LAST:event_btnMasukMousePressed

    private void btnMasukMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMasukMouseEntered
        // TODO add your handling code here:
        btnMasuk.setBackground(new Color(113,164,201)); 
    }//GEN-LAST:event_btnMasukMouseEntered

    private void btnMasukMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMasukMouseExited
        // TODO add your handling code here:
        btnMasuk.setBackground(new Color(87,138,175));
    }//GEN-LAST:event_btnMasukMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HalamanUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HalamanUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HalamanUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HalamanUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HalamanLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JLabel IconHeader;
    private javax.swing.JPanel Isi;
    private javax.swing.JPanel PanelUtama;
    private javax.swing.JLabel TextHeader;
    private javax.swing.JLabel TextKeluar;
    private javax.swing.JLabel TextLogin;
    private javax.swing.JLabel TextMasuk;
    private javax.swing.JLabel TextNama;
    private javax.swing.JLabel TextPass;
    private javax.swing.JLabel TextReset;
    private javax.swing.JPanel btnKeluar;
    private javax.swing.JPanel btnMasuk;
    private javax.swing.JPanel btnReset;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtpass;
    // End of variables declaration//GEN-END:variables
}
