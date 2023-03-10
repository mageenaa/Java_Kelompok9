package tubespbo_kel9;

import com.mysql.jdbc.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author zaida
 */
public class Form_booking extends javax.swing.JFrame {

    String Tanggal;
    
    private void datatable(){
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("Kode");
        tbl.addColumn("Lapangan");
        tbl.addColumn("Harga");
        tbl.addColumn("Jam Mulai");
        tbl.addColumn("Jam Selesai");
        tbl.addColumn("Nama");
        tbl.addColumn("Team");
        tbl.addColumn("No HP");
        tbl.addColumn("DP");
        tblpesanan.setModel(tbl);
        
        try {
            Statement statement = (Statement) connectDB.getConnection().createStatement();
            ResultSet res = statement.executeQuery("SELECT * FROM bookingfutsal");
            while(res.next()){
                tbl.addRow(new Object[]{
                    res.getString(1),
                    res.getString(2),
                    res.getString(3),
                    res.getString(4),
                    res.getString(5),
                    res.getString(6),
                    res.getString(7),
                    res.getString(8),
                    res.getString(9),});
                tblpesanan.setModel(tbl);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Salah");
        }
    }
    
    private void clear(){
        kode.setSelectedItem("-PILIH-");
        namalp.setText("");
        harga.setText("");
        Jam1.setSelectedItem("-PILIH-");
        Jam2.setSelectedItem("-PILIH-");
        txtnama.setText("");
        txtteam.setText("");
        txtno.setText("");
        txtdp.setText("");
    }
    
    private void enabled(){
        kode.setEnabled(true);
        namalp.setEnabled(true);
        harga.setEnabled(true);
        Jam1.setEnabled(true);
        Jam2.setEnabled(true);
        txtnama.setEnabled(true);
        txtteam.setEnabled(true);
        txtno.setEnabled(true);
        txtdp.setEnabled(true);
        kode.requestFocus();
    }
    
    private void desabled(){
        kode.setEnabled(false);
        namalp.setEnabled(false);
        harga.setEnabled(false);
        Jam1.setEnabled(false);
        Jam2.setEnabled(false);
        txtnama.setEnabled(false);
        txtteam.setEnabled(false);
        txtno.setEnabled(false);
        txtdp.setEnabled(false);
    }
    
    public Form_booking() {
        
        // center form
        this.setLocationRelativeTo(null);
        
        initComponents();
        
        datatable();
       
        kode.addItem("-PILIH-");
        kode.addItem("Out01");
        kode.addItem("Out02");
        kode.addItem("In01");
        kode.addItem("In02");
        kode.addItem("In03");
      
        Jam1.addItem("-PILIH-");
        Jam1.addItem("08.00");
        Jam1.addItem("09.00");
        Jam1.addItem("10.00");
        Jam1.addItem("11.00");
        Jam1.addItem("12.00");
        Jam1.addItem("13.00");
        Jam1.addItem("14.00");
        Jam1.addItem("15.00");
        Jam1.addItem("16.00");
        Jam1.addItem("17.00");
        Jam1.addItem("18.00");
        Jam1.addItem("19.00");
        Jam1.addItem("20.00");
        Jam1.addItem("21.00");
       
        Jam2.addItem("-PILIH-");
        Jam2.addItem("09.00");
        Jam2.addItem("10.00");
        Jam2.addItem("11.00");
        Jam2.addItem("12.00");
        Jam2.addItem("13.00");
        Jam2.addItem("14.00");
        Jam2.addItem("15.00");
        Jam2.addItem("16.00");
        Jam2.addItem("17.00");
        Jam2.addItem("18.00");
        Jam2.addItem("19.00");
        Jam2.addItem("20.00");
        Jam2.addItem("21.00");
        Jam2.addItem("22.00");
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
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtnama = new javax.swing.JTextField();
        Jam1 = new javax.swing.JComboBox<>();
        Jam2 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        namalp = new javax.swing.JTextField();
        harga = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtno = new javax.swing.JTextField();
        txtteam = new javax.swing.JTextField();
        txtdp = new javax.swing.JTextField();
        btnsimpan = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblpesanan = new javax.swing.JTable();
        kode = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setToolTipText("");
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setBackground(new java.awt.Color(0, 0, 102));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Data Transaksi");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel1.setOpaque(true);

        jLabel3.setText("Nama");

        jLabel4.setText("Jam Selesai");

        jLabel5.setText("Jam Mulai");

        jLabel6.setText("Kode Booking");

        jLabel7.setText("Nama Lapangan");

        jLabel8.setText("Harga");

        jLabel9.setText("Uang DP");

        jLabel10.setText("Nama Team");

        jLabel11.setText("No HP");

        btnsimpan.setText("Simpan");
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });

        tblpesanan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblpesanan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblpesananMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblpesanan);

        kode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kodeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtteam, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(Jam1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(Jam2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtno, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtdp, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(namalp, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(harga, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(kode, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(btnsimpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jam1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namalp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jam2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtteam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsimpan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
        if (btnsimpan.getText() == "Tambah"){
           enabled();
           clear();
           btnsimpan.setText("Simpan");
          
       }else{
           String Kode = kode.getSelectedItem().toString();
           String Lapangan = namalp.getText();
           String Harga = harga.getText();
           String Jam_Mulai = Jam1.getSelectedItem().toString();
           String Jam_Selesai = Jam2.getSelectedItem().toString();
           String Nama = txtnama.getText();
           String Team = txtteam.getText();
           String No_HP = txtno.getText();
           String DP = txtdp.getText();
         
           try{
               connectDB tmb = new connectDB();
               tmb.insertUpdateDeleteStudent('i', Kode, Lapangan, HEIGHT, Jam_Mulai, Jam_Selesai, Nama, Team, WIDTH, WIDTH);
               JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
               clear();
               desabled();
               btnsimpan.setText("Tambah"); 
           } catch(Exception ex){
               JOptionPane.showMessageDialog(null, "Data Gagal Disimpan");
           }
           
     }
    }//GEN-LAST:event_btnsimpanActionPerformed

    private void tblpesananMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblpesananMouseClicked
      
        connectDB tampil = new connectDB();
        tampil.fillTableData(tblpesanan, Tanggal);
        int row = tblpesanan.getSelectedRow();
        kode.setSelectedItem((String)tblpesanan.getValueAt(row, 0));
        namalp.setText((String)tblpesanan.getValueAt(row, 1));
        harga.setText((String)tblpesanan.getValueAt(row, 2));
        Jam1.setSelectedItem((String)tblpesanan.getValueAt(row, 4));
        Jam2.setSelectedItem((String)tblpesanan.getValueAt(row, 5));
        txtnama.setText((String)tblpesanan.getValueAt(row, 6));
        txtteam.setText((String)tblpesanan.getValueAt(row, 7));
        txtno.setText((String)tblpesanan.getValueAt(row, 8));
        txtdp.setText((String)tblpesanan.getValueAt(row, 9));
    }//GEN-LAST:event_tblpesananMouseClicked

    private void kodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kodeActionPerformed
        // TODO add your handling code here:
        if(kode.getSelectedItem()=="Out01"){
            namalp.setText("Outdoor 01");
            harga.setText("100000");
        }else if (kode.getSelectedItem()=="Out02"){
            namalp.setText("Outdoor 02");
            harga.setText("100000");
        }else if (kode.getSelectedItem()=="In01"){
            namalp.setText("Indoor 01");
            harga.setText("150000");
        }else if (kode.getSelectedItem()=="In02"){
            namalp.setText("Indoor 02");
            harga.setText("150000");
        }else if (kode.getSelectedItem()=="In03"){
            namalp.setText("Indoor 03");
            harga.setText("150000");
        }
    }//GEN-LAST:event_kodeActionPerformed

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
            java.util.logging.Logger.getLogger(Form_booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_booking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Jam1;
    private javax.swing.JComboBox<String> Jam2;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JTextField harga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> kode;
    private javax.swing.JTextField namalp;
    private javax.swing.JTable tblpesanan;
    private javax.swing.JTextField txtdp;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtno;
    private javax.swing.JTextField txtteam;
    // End of variables declaration//GEN-END:variables
}
