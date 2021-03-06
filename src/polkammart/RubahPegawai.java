/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polkammart;

import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
/**
 *
 * @author oryza
 */
public class RubahPegawai extends javax.swing.JInternalFrame {
    String namafile = null;
    byte[] fotokaryawan = null;

    /**
     * Creates new form TambahPegawai
     */
    String id_pengguna="";
    public RubahPegawai() {
        initComponents();
        this.setTitle("Rubah Data Pegawai");
        nama.disable();
        try{
            //membuat statemen pemanggilan data pada table tblGaji dari database
            Statement stat = (Statement) Koneksi.getKoneksi().createStatement( );
    
            String sql = "Select * from pengguna where nama='"+GetDataPengguna.getUserLogin()+"'";
            ResultSet res = stat.executeQuery(sql);
            //penelusuran baris pada tabel tblGaji dari database
            while(res.next ()){
                nama.setText(res.getString("nama"));
                int lvl=Integer.parseInt(res.getString("level"));
                tingkat.setSelectedIndex(lvl-1);
                id_pengguna=Integer.toString(Integer.parseInt(res.getString("id"))+1);
            }
        }catch(SQLException err){
            JOptionPane.showMessageDialog(null, err.getMessage() );
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        sandi = new javax.swing.JTextField();
        tambah = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tingkat = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        Image = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Upload = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 0, 204));
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Edit Karyawan");

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));

        jLabel2.setText("Nama : ");

        nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaActionPerformed(evt);
            }
        });

        jLabel1.setText("Sandi : ");

        tambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Ok_48px.png"))); // NOI18N
        tambah.setText("EDIT");
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });

        jLabel3.setText("Level : ");

        tingkat.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Admin", "Pegawai" }));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Undo_48px.png"))); // NOI18N
        jButton1.setText("KEMBALI");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tambah)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(0, 117, Short.MAX_VALUE))
                    .addComponent(sandi)
                    .addComponent(tingkat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nama))
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sandi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(tingkat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tambah)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(153, 153, 0));

        Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Customer_64px.png"))); // NOI18N

        jLabel5.setText("DISINI DAPAT DITAMBAHKAN GAMBAR");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(Image)
                        .addGap(70, 70, 70))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(Image)
                .addGap(39, 39, 39)
                .addComponent(jLabel5)
                .addGap(52, 52, 52))
        );

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("EDIT KARYAWAN");

        Upload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/0 - login batal.png"))); // NOI18N
        Upload.setText("UPLOAD");
        Upload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UploadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Upload)
                        .addGap(56, 56, 56)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(225, 225, 225))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Upload)))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaActionPerformed

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
        // TODO add your handling code here:
        Enkripsi s=new Enkripsi();
        String z=nama.getText();
        String y=s.encryptPasswordMD5(sandi.getText());
        String l=Integer.toString(tingkat.getSelectedIndex()+1);
//        System.out.println("Nama : "+z+" Sandi : "+y+" "+l);
        DataKaryawan peg=new DataKaryawan();
        try {
            //membuat statemen pemanggilan data pada table tblGaji dari database
            Statement stat = (Statement) Koneksi.getKoneksi().createStatement();
//            String query="Select * from pengguna, level where pengguna.level=level.no";
//            ResultSet res = stat.executeQuery(query);
            
//            }
            String sql = "UPDATE pengguna SET sandi='"+y+"',level='"+l+"' WHERE nama='"+z+"'";
            stat.executeUpdate(sql);
            JOptionPane.showMessageDialog(this,"Perubahan Data Berhasil ");
            
            peg.AmbilData();
//            this.getParent().removeAll();
            this.getParent().add(peg);
            peg.setVisible(true);
            peg.setSize(this.getWidth(),this.getHeight());
            peg.setLocation(0,0);
            this.dispose();
            
        } catch (SQLException ex) {
            Logger.getLogger(RubahPegawai.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_tambahActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
            DataKaryawan peg=new DataKaryawan();
            peg.AmbilData();
            this.getParent().add(peg);
            peg.setVisible(true);
            peg.setSize(this.getWidth(),this.getHeight());
            peg.setLocation(0,0);
            this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void UploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UploadActionPerformed
        // TODO add your handling code here:
        JFileChooser file = new JFileChooser();
        file.showOpenDialog(null);
        File f = file.getSelectedFile();
        namafile = f.getAbsolutePath();
        ImageIcon imageicon = new ImageIcon(new ImageIcon(namafile).getImage().getScaledInstance(Image.getWidth(),Image.getHeight(),Image.SCALE_SMOOTH));
        Image.setIcon(imageicon);
        
        try{
            File image = new File(namafile);
            FileInputStream tis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            for(int readnum;(readnum = tis.read(buf))!=-1;){
                bos.write(buf,0,readnum);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_UploadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Image;
    private javax.swing.JButton Upload;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField sandi;
    private javax.swing.JButton tambah;
    private javax.swing.JComboBox tingkat;
    // End of variables declaration//GEN-END:variables
}
