/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack.view;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import pack.control.c_koneksi;
import pack.control.controllerToko;
import pack.model.m_toko;

/**
 *
 * @author ika
 */
public class home extends javax.swing.JFrame {
    controllerToko ctoko;
    List<m_toko> listdata = new ArrayList<>();

    /**
     * Creates new form home
     */
    public home() {
        initComponents();
        ctoko = new controllerToko(this);
        ctoko.isiTable();
        getCbKategori().setSelectedItem(null);
        getCbJenis().setSelectedItem(null);
    }

    public JTextField getTxtKode(){ 
        return txtkode;
    }

    public JTextField getTxtNama() {
        return txtnama;
    }

    public JTextField getTxtHarga() {
        return txtharga;
    }

    public JComboBox getCbKategori() {
        return cbKategoriBrg;
    }

    public JComboBox getCbJenis() {
        return cbjenis;
    }

    public JComboBox getCbCariKategori() {
        return CbCariKategori;
    }

    public JButton getButtonHapus() {
        return Btn_Hapus;
    }

    public JButton getButtonBersih() {
        return Btn_Bersih;
    }

    public JButton getButtonSimpan() {
        return Btn_Simpan;
    }

    public JButton getButtonUbah() {
        return Btn_Ubah;
    }

    public JButton getButtonKeluar() {
        return Btn_Keluar;
    }

    public JTable getTableData() {
        return Tabel1;
    }
    public void setAdmin (String admin) {
        txtadmin.setText(admin);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        txtadmin = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtharga = new javax.swing.JTextField();
        txtkode = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbjenis = new javax.swing.JComboBox<>();
        cbKategoriBrg = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        Btn_Keluar = new javax.swing.JButton();
        Btn_Simpan = new javax.swing.JButton();
        Btn_Ubah = new javax.swing.JButton();
        Btn_Bersih = new javax.swing.JButton();
        Btn_Hapus = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        CbCariKategori = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabel1 = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(txtadmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 70, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Data Barang di Toko");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 190, 40));

        jLabel1.setText("Admin Toko :");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 90, 30));

        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 0, 890, 100);

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(txtharga, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 440, -1));
        jPanel2.add(txtkode, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 440, -1));
        jPanel2.add(txtnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 440, -1));

        jLabel3.setText("Kode Barang");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 100, 20));

        jLabel4.setText("Nama Barang");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 100, 20));

        jLabel5.setText("Kategori Barang");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 90, 20));

        jLabel6.setText("Jenis Packaging");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 110, 20));

        jLabel7.setText("Harga");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 50, 20));

        cbjenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pack" }));
        jPanel2.add(cbjenis, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 440, -1));

        cbKategoriBrg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Makanan", "Baju", "Celana", "Barang Lain" }));
        jPanel2.add(cbKategoriBrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 440, -1));

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 100, 660, 210);

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Btn_Keluar.setText("Keluar");
        Btn_Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_KeluarActionPerformed(evt);
            }
        });
        jPanel3.add(Btn_Keluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 120, -1));

        Btn_Simpan.setText("Simpan");
        Btn_Simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SimpanActionPerformed(evt);
            }
        });
        jPanel3.add(Btn_Simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 120, -1));

        Btn_Ubah.setText("Ubah");
        Btn_Ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_UbahActionPerformed(evt);
            }
        });
        jPanel3.add(Btn_Ubah, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 120, -1));

        Btn_Bersih.setText("Bersihkan");
        Btn_Bersih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_BersihActionPerformed(evt);
            }
        });
        jPanel3.add(Btn_Bersih, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 120, -1));

        Btn_Hapus.setText("Hapus");
        Btn_Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_HapusActionPerformed(evt);
            }
        });
        jPanel3.add(Btn_Hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 120, -1));

        getContentPane().add(jPanel3);
        jPanel3.setBounds(660, 100, 230, 210);

        jButton6.setText("Cari");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(580, 320, 100, 30);

        CbCariKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Makanan", "Baju", "Celana", "Barang Lain" }));
        getContentPane().add(CbCariKategori);
        CbCariKategori.setBounds(370, 320, 170, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Pencarian Berdasarkan Kategori Makanan");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 320, 290, 30);

        jPanel5.setBackground(new java.awt.Color(0, 153, 153));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tabel1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Kode Barang", "Nama Barang", "Kategori", "Packaging", "Harga"
            }
        ));
        Tabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabel1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabel1);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 600, 140));

        getContentPane().add(jPanel5);
        jPanel5.setBounds(0, 370, 660, 180);

        jPanel6.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel6);
        jPanel6.setBounds(660, 370, 230, 180);

        setSize(new java.awt.Dimension(907, 588));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_SimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SimpanActionPerformed
        // TODO add your handling code here:
        ctoko.SimpanData();
        ctoko.isiTable();
    }//GEN-LAST:event_Btn_SimpanActionPerformed

    private void Btn_UbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_UbahActionPerformed
        // TODO add your handling code here:
        ctoko.Ubah();
        ctoko.isiTable();
    }//GEN-LAST:event_Btn_UbahActionPerformed

    private void Btn_BersihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_BersihActionPerformed
        // TODO add your handling code here:
        ctoko.Reset();
    }//GEN-LAST:event_Btn_BersihActionPerformed

    private void Btn_HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_HapusActionPerformed
        // TODO add your handling code here:
        ctoko.Hapus();
        ctoko.isiTable();
    }//GEN-LAST:event_Btn_HapusActionPerformed

    private void Btn_KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_KeluarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_Btn_KeluarActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        ctoko.CariKategori();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void Tabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabel1MouseClicked
        // TODO add your handling code here:
        int baris = Tabel1.getSelectedRow();
        if (baris != -1) {
            txtkode.setText(Tabel1.getValueAt(baris, 0).toString());
            txtnama.setText((String) Tabel1.getValueAt(baris, 1));
            cbKategoriBrg.setSelectedItem(Tabel1.getValueAt(baris, 2).toString());
            cbjenis.setSelectedItem(Tabel1.getValueAt(baris, 3).toString());
            txtharga.setText(Tabel1.getValueAt(baris, 4).toString());
        }
    }//GEN-LAST:event_Tabel1MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {                                  
        String user = login.user;
        txtadmin.setText(" "+user);
    }  
    
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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Bersih;
    private javax.swing.JButton Btn_Hapus;
    private javax.swing.JButton Btn_Keluar;
    private javax.swing.JButton Btn_Simpan;
    private javax.swing.JButton Btn_Ubah;
    private javax.swing.JComboBox<String> CbCariKategori;
    private javax.swing.JTable Tabel1;
    private javax.swing.JComboBox<String> cbKategoriBrg;
    private javax.swing.JComboBox<String> cbjenis;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtadmin;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txtkode;
    private javax.swing.JTextField txtnama;
    // End of variables declaration//GEN-END:variables
}
