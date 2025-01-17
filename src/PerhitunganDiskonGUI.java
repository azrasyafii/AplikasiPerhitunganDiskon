/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
/**
 *
 * @author Pongo
 */
public class PerhitunganDiskonGUI extends javax.swing.JFrame {

    /**
     * Creates new form PerhitunganDiskonGUI
     */
    public PerhitunganDiskonGUI() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtHarga = new javax.swing.JTextField();
        cmbDiskon = new javax.swing.JComboBox<>();
        btnHitung = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtHasil = new javax.swing.JTextField();
        txtHemat = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtRiwayat = new javax.swing.JTextArea();
        sliderDiskon = new javax.swing.JSlider();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtKupon = new javax.swing.JTextField();
        btnReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));

        jLabel1.setFont(new java.awt.Font("Calisto MT", 1, 24)); // NOI18N
        jLabel1.setText("APLIKASI PERHITUNGAN DISKON");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("MASUKKAN HARGA");

        txtHarga.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtHargaMouseClicked(evt);
            }
        });
        txtHarga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHargaKeyTyped(evt);
            }
        });

        cmbDiskon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DISKON 0%", "DISKON 20%", "DISKON 40%", "DISKON 60%", "DISKON 80%", " " }));
        cmbDiskon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDiskonActionPerformed(evt);
            }
        });

        btnHitung.setBackground(new java.awt.Color(255, 51, 51));
        btnHitung.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnHitung.setText("HITUNG");
        btnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("PILIH DISKON");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("HARGA SETELAH DISKON");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setText("TOTAL YANG DIHEMAT");

        txtHasil.setEditable(false);

        txtHemat.setEditable(false);

        txtRiwayat.setEditable(false);
        txtRiwayat.setColumns(20);
        txtRiwayat.setRows(5);
        jScrollPane1.setViewportView(txtRiwayat);

        sliderDiskon.setBackground(new java.awt.Color(255, 204, 204));
        sliderDiskon.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        sliderDiskon.setMajorTickSpacing(20);
        sliderDiskon.setMaximum(80);
        sliderDiskon.setPaintLabels(true);
        sliderDiskon.setPaintTicks(true);
        sliderDiskon.setValue(0);
        sliderDiskon.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderDiskonStateChanged(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Riwayat ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel7.setText("Kode Kupon");

        btnReset.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnReset.setText("RESET");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5))
                                    .addGap(54, 54, 54)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtHarga, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                                        .addComponent(cmbDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtHasil)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(txtHemat, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnReset)
                                            .addGap(14, 14, 14))))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(42, 42, 42)
                                            .addComponent(jLabel7)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtKupon, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(sliderDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(40, 40, 40)
                                    .addComponent(btnHitung, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(sliderDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtKupon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(btnHitung, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtHasil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtHemat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 650, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitungActionPerformed
       try {
        // Validasi input harga
        if (txtHarga.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Masukkan harga terlebih dahulu!", 
                                          "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Ambil input harga dan validasi nilai negatif
        double harga = Double.parseDouble(txtHarga.getText());
        if (harga <= 0) {
            JOptionPane.showMessageDialog(this, "Harga harus lebih besar dari 0!", 
                                          "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Tentukan sumber diskon (JComboBox atau JSlider)
        int diskon;
        if (sliderDiskon.getValue() == Integer.parseInt(cmbDiskon.getSelectedItem().toString().replaceAll("[^0-9]", ""))) {
            diskon = sliderDiskon.getValue();
        } else {
            diskon = Integer.parseInt(cmbDiskon.getSelectedItem().toString().replaceAll("[^0-9]", ""));
        }

        // Ambil kode kupon (opsional)
        String kodeKupon = txtKupon.getText();
        double tambahanDiskon = 0;

        // Validasi kode kupon
        if (!kodeKupon.isEmpty() && !kodeKupon.equalsIgnoreCase("DISKON10")) {
            JOptionPane.showMessageDialog(this, "Kode kupon tidak valid! Diskon tambahan tidak diterapkan.", 
                                          "Kode Kupon Salah", JOptionPane.WARNING_MESSAGE);
        } else if (kodeKupon.equalsIgnoreCase("DISKON10")) {
            tambahanDiskon = 10;  // Tambahkan diskon jika kupon valid
        }

        // Hitung diskon total
        double totalDiskon = harga * (diskon + tambahanDiskon) / 100;
        double hargaSetelahDiskon = harga - totalDiskon;

        // Tampilkan hasil
        txtHasil.setText(String.format("%.2f", hargaSetelahDiskon));
        txtHemat.setText(String.format("%.2f", totalDiskon));

          // Tambahkan riwayat
        String riwayat = String.format("Harga: %.2f, Diskon: %d%%, Kupon: %s, Hemat: %.2f, Harga Akhir: %.2f\n",
                                       harga, diskon, kodeKupon.isEmpty() ? "-" : kodeKupon, totalDiskon, hargaSetelahDiskon);
        txtRiwayat.append(riwayat);

    } catch (NumberFormatException e) {
        // Tangani jika input harga bukan angka
        JOptionPane.showMessageDialog(this, "Masukkan angka yang valid untuk harga!", 
                                      "Input Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnHitungActionPerformed

    private void sliderDiskonStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderDiskonStateChanged
         // Ketika slider berubah, sinkronkan dengan JComboBox
    int nilaiDiskon = sliderDiskon.getValue();
    cmbDiskon.setSelectedItem("DISKON " + nilaiDiskon + "%");
    }//GEN-LAST:event_sliderDiskonStateChanged

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtHarga.setText("");
    txtKupon.setText("");
    txtHasil.setText("");
    txtHemat.setText("");
    txtRiwayat.setText("");
    cmbDiskon.setSelectedIndex(0);
    sliderDiskon.setValue(0);  // Set slider ke default 20%
    }//GEN-LAST:event_btnResetActionPerformed

    private void txtHargaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHargaKeyTyped
        char input = evt.getKeyChar();

        // Validasi input: hanya angka, satu titik (.), dan backspace
        if (!Character.isDigit(input) && input != '.' && input != '\b') {
            // Tampilkan peringatan
            JOptionPane.showMessageDialog(null, "Hanya angka dan tanda desimal (.) yang diperbolehkan!", 
                                          "Input Tidak Valid", JOptionPane.WARNING_MESSAGE);
            evt.consume(); // Batalkan input
            return;
        }

        // Cegah lebih dari satu titik
        if (input == '.' && txtHarga.getText().contains(".")) {
            // Tampilkan peringatan
            JOptionPane.showMessageDialog(null, "Hanya boleh ada satu tanda desimal (.)!", 
                                          "Input Tidak Valid", JOptionPane.WARNING_MESSAGE);
            evt.consume(); // Batalkan input
        }
    }//GEN-LAST:event_txtHargaKeyTyped

    private void cmbDiskonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDiskonActionPerformed
        // Ketika JComboBox berubah, sinkronkan dengan slider
    String diskonText = cmbDiskon.getSelectedItem().toString();
    int diskon = Integer.parseInt(diskonText.replaceAll("[^0-9]", ""));
    sliderDiskon.setValue(diskon);
    }//GEN-LAST:event_cmbDiskonActionPerformed

    private void txtHargaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtHargaMouseClicked
        // Kosongkan isi text field ketika diklik
    txtHarga.setText("");
    }//GEN-LAST:event_txtHargaMouseClicked

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
            java.util.logging.Logger.getLogger(PerhitunganDiskonGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PerhitunganDiskonGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PerhitunganDiskonGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PerhitunganDiskonGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PerhitunganDiskonGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHitung;
    private javax.swing.JButton btnReset;
    private javax.swing.JComboBox<String> cmbDiskon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider sliderDiskon;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtHasil;
    private javax.swing.JTextField txtHemat;
    private javax.swing.JTextField txtKupon;
    private javax.swing.JTextArea txtRiwayat;
    // End of variables declaration//GEN-END:variables
}
