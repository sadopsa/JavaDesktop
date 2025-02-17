/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TB_040_048;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import TB_040_048.koneksi;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class Form_Ekskul extends javax.swing.JFrame {

    /**
     * Creates new form Form_Ekskul
     */
    public Form_Ekskul() {
        initComponents();
    tabelekskul();
    tampil_combo();
    }
       
     public void tampil_combo()
    {
        
      
        try {
        Connection conn = koneksi.getConnection();
        Statement sttm = conn.createStatement();
        String sql = "select NIS from SISWA order by NIS asc";      // disini saya menampilkan NIM, anda dapat menampilkan
        ResultSet reslt = sttm.executeQuery(sql);                                // yang anda ingin kan
        
        while(reslt.next()){
            Object[] ob = new Object[3];
            ob[0] = reslt.getString(1);
            
            comboNIS.addItem(ob[0]);                                      // fungsi ini bertugas menampung isi dari database
        }
        reslt.close(); sttm.close();
         
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void tabelekskul(){
        DefaultTableModel tabbrg = new DefaultTableModel();
        tabbrg.addColumn("NO");
        tabbrg.addColumn("EKSKUL");
        tabbrg.addColumn("NIS");
        
        jTable1_ekskul.setModel(tabbrg);
        
        try {
            Statement stat = (Statement)koneksi.getConnection().createStatement();
            ResultSet result = stat.executeQuery("SELECT * FROM EKSKUL ORDER BY NO ASC");
            while (result.next()){
                tabbrg.addRow(new Object[]{
                    result.getString("NO"),
                    result.getString("NAMA_EKSKUL"), 
                    result.getString("NIS"),
                });
                jTable1_ekskul.setModel(tabbrg);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Data Gagal Ditampilkan");
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

        jComboBox1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField2_ekskul = new javax.swing.JTextField();
        B_TAMBAH = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1_ekskul = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        B_RESET = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jTextField1_NO = new javax.swing.JTextField();
        B_EDIT = new javax.swing.JButton();
        B_HAPUS = new javax.swing.JButton();
        comboNIS = new javax.swing.JComboBox();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("NO");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("DATA EKSTRAKULIKULER");

        B_TAMBAH.setText("TAMBAH");
        B_TAMBAH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_TAMBAHActionPerformed(evt);
            }
        });

        jLabel3.setText("EKSKUL");

        jTable1_ekskul.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1_ekskul.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1_ekskulMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1_ekskul);

        jLabel4.setText("NIS");

        B_RESET.setText("RESET");
        B_RESET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_RESETActionPerformed(evt);
            }
        });

        jButton1.setText("HOME");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        B_EDIT.setText("EDIT");
        B_EDIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_EDITActionPerformed(evt);
            }
        });

        B_HAPUS.setText("HAPUS");
        B_HAPUS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_HAPUSActionPerformed(evt);
            }
        });

        comboNIS.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Siswa", " " }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(81, 81, 81))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(B_TAMBAH, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B_EDIT, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(B_HAPUS, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B_RESET, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextField1_NO, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                                    .addComponent(jTextField2_ekskul, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                                    .addComponent(comboNIS, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1_NO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2_ekskul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(comboNIS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B_TAMBAH)
                    .addComponent(B_EDIT)
                    .addComponent(B_HAPUS)
                    .addComponent(B_RESET))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B_TAMBAHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_TAMBAHActionPerformed
        EEkskul ekskul = new EEkskul();
        ekskul.setno(Integer.parseInt(jTextField1_NO.getText()));
        ekskul.setnama(jTextField2_ekskul.getText());
        ekskul.setnis(comboNIS.getItemAt(comboNIS.getSelectedIndex()).toString());

        cCari control = new cCari();
        control.tambahekskul(ekskul);
        tabelekskul();
        B_RESETActionPerformed(evt);
    }//GEN-LAST:event_B_TAMBAHActionPerformed

    private void jTable1_ekskulMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1_ekskulMouseClicked
        int baris = jTable1_ekskul.getSelectedRow();
        if(baris==-1){
            JOptionPane.showMessageDialog(this, "Pilih Data");
        }else{
            jTextField1_NO.setText((String)jTable1_ekskul.getValueAt(baris, 0));
            jTextField2_ekskul.setText((String)jTable1_ekskul.getValueAt(baris, 1));
            comboNIS.setSelectedItem((String)jTable1_ekskul.getValueAt(baris, 2));   
            
        }
    }//GEN-LAST:event_jTable1_ekskulMouseClicked

    private void B_RESETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_RESETActionPerformed
        jTextField2_ekskul.setText("");
        jTextField1_NO.setText("");
        comboNIS.setSelectedItem("Siswa");
    }//GEN-LAST:event_B_RESETActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Form_Menu tampil;
        tampil=new Form_Menu();
        tampil.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void B_EDITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_EDITActionPerformed
          EEkskul ekskul = new EEkskul();
        ekskul.setno(Integer.parseInt(jTextField1_NO.getText()));
        ekskul.setnama(jTextField2_ekskul.getText());
        ekskul.setnis(comboNIS.getItemAt(comboNIS.getSelectedIndex()).toString());

        cCari control = new cCari();
        control.ubahekskul(ekskul);
        tabelekskul();
        B_RESETActionPerformed(evt);
    }//GEN-LAST:event_B_EDITActionPerformed

    private void B_HAPUSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_HAPUSActionPerformed
            int pertanyaan = JOptionPane.showConfirmDialog(null,"Yakin Data ini mau dihapus ... ?","Konfirmasi",
                JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
        
        if(pertanyaan == JOptionPane.CANCEL_OPTION){
      System.out.println("Kamu menekan tombol CANCEL");
      }else if(pertanyaan == JOptionPane.OK_OPTION){
          
           EEkskul ekskul = new EEkskul();
        ekskul.setno(Integer.parseInt(jTextField1_NO.getText()));
       

        cCari control = new cCari();
        control.hapusekskul(ekskul);
        tabelekskul();
        System.out.println("Anda Menghapus data");
      }else if(pertanyaan == JOptionPane.CLOSED_OPTION){
      System.out.println("Kamu menekan tombol CLOSE");
}
       
        B_RESETActionPerformed(evt);
    }//GEN-LAST:event_B_HAPUSActionPerformed

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
            java.util.logging.Logger.getLogger(Form_Ekskul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_Ekskul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_Ekskul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_Ekskul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_Ekskul().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_EDIT;
    private javax.swing.JButton B_HAPUS;
    private javax.swing.JButton B_RESET;
    private javax.swing.JButton B_TAMBAH;
    private javax.swing.JComboBox comboNIS;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1_ekskul;
    private javax.swing.JTextField jTextField1_NO;
    private javax.swing.JTextField jTextField2_ekskul;
    // End of variables declaration//GEN-END:variables
}
