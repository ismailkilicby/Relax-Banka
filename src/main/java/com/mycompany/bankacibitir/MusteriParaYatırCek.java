package com.mycompany.bankacibitir;
import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.Connection;
public class MusteriParaYatırCek extends javax.swing.JFrame {

    Connection conn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    public MusteriParaYatırCek() {
        initComponents();
        
        conn=Baglanti.connecrb();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        text_mst_pr_ytr = new javax.swing.JTextField();
        text_mst_pr_ckm = new javax.swing.JTextField();
        btn_pr_ckm = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btn_pr_ytr = new javax.swing.JButton();
        gnc_bkyniz = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        mst_gvn_kll = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(63, 245, 245));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Para Yatırma ve Çekme Menüsü");

        jLabel1.setText("Yatırmak istediğiniz tutarı giriniz:");

        jLabel2.setText("Çekmek istediğiniz tutarı giriniz: ");

        text_mst_pr_ytr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_mst_pr_ytrActionPerformed(evt);
            }
        });

        text_mst_pr_ckm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_mst_pr_ckmActionPerformed(evt);
            }
        });

        btn_pr_ckm.setBackground(new java.awt.Color(0, 153, 153));
        btn_pr_ckm.setText("Çek");
        btn_pr_ckm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pr_ckmActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 153, 153));
        jButton2.setText("GERİ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btn_pr_ytr.setBackground(new java.awt.Color(0, 153, 153));
        btn_pr_ytr.setText("Yatır");
        btn_pr_ytr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pr_ytrActionPerformed(evt);
            }
        });

        gnc_bkyniz.setText("Güncel bakiyeniz: ");

        jLabel4.setText("Lütfen güvenlik amaçlı kullanıcı adınızı giriniz: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(text_mst_pr_ckm, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mst_gvn_kll, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(text_mst_pr_ytr, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addComponent(btn_pr_ytr, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(101, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_pr_ckm, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gnc_bkyniz, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(137, 137, 137))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(mst_gvn_kll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_mst_pr_ytr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(btn_pr_ytr)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_mst_pr_ckm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_pr_ckm)
                .addGap(18, 18, 18)
                .addComponent(gnc_bkyniz, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 491, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 322, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void text_mst_pr_ytrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_mst_pr_ytrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_mst_pr_ytrActionPerformed

    private void text_mst_pr_ckmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_mst_pr_ckmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_mst_pr_ckmActionPerformed

    private void btn_pr_ckmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pr_ckmActionPerformed
       int cekilecekTutar=Integer.parseInt(text_mst_pr_ckm.getText());
       String guvenlikKullanici=mst_gvn_kll.getText();
        String sqlquery="SELECT * FROM musteri WHERE mst_kll='"+guvenlikKullanici+"'";
        int bakiye=0;
        try {
            pst=conn.prepareStatement(sqlquery);
            rs=pst.executeQuery();
            while(rs.next()){
                bakiye=rs.getInt("mst_bky");
                
            }
            if(cekilecekTutar<0){
                JOptionPane.showMessageDialog(null,"Lütfen pozitif sayı yazınız!");
            }
            else if(cekilecekTutar<bakiye+1){
                   String sqlupdate="UPDATE musteri SET mst_bky='"+(bakiye-cekilecekTutar)+"' WHERE mst_kll='"+guvenlikKullanici+"'";
                   pst=conn.prepareStatement(sqlupdate);
                   pst.executeUpdate();
                   gnc_bkyniz.setText("Güncel bakiyeniz: "+(bakiye-cekilecekTutar));
            }
            
            else{
                JOptionPane.showMessageDialog(null, "Bakiyeniz yetersiz!");
            }
        }

        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_btn_pr_ckmActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Musteri mg=new Musteri();
        mg.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btn_pr_ytrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pr_ytrActionPerformed
        int yatirilacakTutar=Integer.parseInt(text_mst_pr_ytr.getText());
        String guvenlikKullanici=mst_gvn_kll.getText();
        String sqlquery="SELECT * FROM musteri WHERE mst_kll='"+guvenlikKullanici+"'";
        int bakiye=0;
        try {
            pst=conn.prepareStatement(sqlquery);
            rs=pst.executeQuery();
            while(rs.next()){
                bakiye=rs.getInt("mst_bky");
                
            }
            if(yatirilacakTutar>0){
                   String sqlupdate="UPDATE musteri SET mst_bky='"+(bakiye+yatirilacakTutar)+"' WHERE mst_kll='"+guvenlikKullanici+"'";
                   pst=conn.prepareStatement(sqlupdate);
                   int sonuc=pst.executeUpdate();
                   gnc_bkyniz.setText("Güncel bakiyeniz: "+(bakiye+yatirilacakTutar));
            }
            
            else{
                JOptionPane.showMessageDialog(null, "Lütfen pozitif sayı yazınız!");
            }
        }

        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btn_pr_ytrActionPerformed

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
            java.util.logging.Logger.getLogger(MusteriParaYatırCek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MusteriParaYatırCek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MusteriParaYatırCek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MusteriParaYatırCek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MusteriParaYatırCek().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_pr_ckm;
    private javax.swing.JButton btn_pr_ytr;
    private javax.swing.JLabel gnc_bkyniz;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField mst_gvn_kll;
    private javax.swing.JTextField text_mst_pr_ckm;
    private javax.swing.JTextField text_mst_pr_ytr;
    // End of variables declaration//GEN-END:variables
}
