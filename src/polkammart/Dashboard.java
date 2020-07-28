/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polkammart;

import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author oryza
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    SelamatDatang sel;
    DataKaryawan peg;
    TambahPegawai tamPeg;
    DataBarang bar;
    Transaksi trans;
    GetData data=new GetData();
    
    public Dashboard() {
        initComponents();
        setExtendedState(getExtendedState()|Dashboard.MAXIMIZED_BOTH);
        
        /**
            * Membuat Instan dari kelas SelamatDatang.java
            * kemudian menambahkan DesktopPane dengan frame SelamatDatang
            * dan membuat full screen dari DesktopPane
        */

        sel=new SelamatDatang();
        peg=new DataKaryawan();
        bar=new DataBarang();
        tamPeg=new TambahPegawai();
        trans=new Transaksi();
        DesktopPane.add(tamPeg);
        DesktopPane.add(peg);
        DesktopPane.add(sel);
        DesktopPane.add(bar);
        DesktopPane.add(trans);
        
        DesktopPane.moveToFront(sel);
        sel.setVisible(true);
        sel.setSize(DesktopPane.getWidth(),DesktopPane.getHeight());
          try {
            sel.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(SelamatDatang.class.getName()).log(Level.SEVERE, null, ex);
        }
        sel.setLocation(0,0);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        DesktopPane = new javax.swing.JDesktopPane();
        Menu = new javax.swing.JMenuBar();
        DataBarang = new javax.swing.JMenu();
        DataKaryawan = new javax.swing.JMenu();
        Transaksi = new javax.swing.JMenu();
        Keluar = new javax.swing.JMenu();

        jMenu6.setText("File");
        jMenuBar2.add(jMenu6);

        jMenu7.setText("Edit");
        jMenuBar2.add(jMenu7);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DASHBOARD SYSTEM");
        setResizable(false);

        javax.swing.GroupLayout DesktopPaneLayout = new javax.swing.GroupLayout(DesktopPane);
        DesktopPane.setLayout(DesktopPaneLayout);
        DesktopPaneLayout.setHorizontalGroup(
            DesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 488, Short.MAX_VALUE)
        );
        DesktopPaneLayout.setVerticalGroup(
            DesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 227, Short.MAX_VALUE)
        );

        DataBarang.setText("Data Barang");
        DataBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DataBarangMouseClicked(evt);
            }
        });
        Menu.add(DataBarang);

        DataKaryawan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/1 - user.png"))); // NOI18N
        DataKaryawan.setText("Data Karyawan");
        DataKaryawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DataKaryawanMouseClicked(evt);
            }
        });
        Menu.add(DataKaryawan);

        Transaksi.setText("Transaksi");
        Transaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TransaksiMouseClicked(evt);
            }
        });
        Menu.add(Transaksi);

        Keluar.setText("Keluar");
        Keluar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KeluarMouseClicked(evt);
            }
        });
        Menu.add(Keluar);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DesktopPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DesktopPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DataBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DataBarangMouseClicked
        // TODO add your handling code here:
        sel.setVisible(false);
        peg.setVisible(false);
        bar.setVisible(true);
        bar.setSize(DesktopPane.getWidth(),DesktopPane.getHeight());
          try {
            bar.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(DataKaryawan.class.getName()).log(Level.SEVERE, null, ex);
        }
        bar.setLocation(0,0);
    }//GEN-LAST:event_DataBarangMouseClicked

    private void DataKaryawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DataKaryawanMouseClicked
        // TODO add your handling code here:
        sel.setVisible(false);
        peg.setVisible(true);
        peg.setSize(DesktopPane.getWidth(),DesktopPane.getHeight());
          try {
            peg.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(DataKaryawan.class.getName()).log(Level.SEVERE, null, ex);
        }
        peg.setLocation(0,0);
    }//GEN-LAST:event_DataKaryawanMouseClicked

    private void TransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TransaksiMouseClicked
        // TODO add your handling code here:
        sel.setVisible(false);
        peg.setVisible(false);
        bar.setVisible(false);
        trans.setVisible(true);
        trans.setSize(DesktopPane.getWidth(),DesktopPane.getHeight());
          try {
            trans.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(DataKaryawan.class.getName()).log(Level.SEVERE, null, ex);
        }
        trans.setLocation(0,0);
    }//GEN-LAST:event_TransaksiMouseClicked

    private void KeluarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KeluarMouseClicked
        // TODO add your handling code here:
        Login log= new Login();
        log.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_KeluarMouseClicked
    
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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu DataBarang;
    private javax.swing.JMenu DataKaryawan;
    private javax.swing.JDesktopPane DesktopPane;
    private javax.swing.JMenu Keluar;
    private javax.swing.JMenuBar Menu;
    private javax.swing.JMenu Transaksi;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar2;
    // End of variables declaration//GEN-END:variables
}
