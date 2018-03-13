
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class duzenle extends javax.swing.JFrame {

    MyValidator my=new MyValidator();
   String id = "";
   DB db=new DB();
    public duzenle(String id) {
        this.id=id;
        initComponents();
        
         
        try {
            String q = "select *from musteriBilgileri where mID = '"+id+"'";
            ResultSet rs = db.baglan().executeQuery(q);
            if(rs.next()) { 
                txtAd.setText(rs.getString("adi"));
                txtSoyad.setText(rs.getString("soyadi"));
                txtTelefon.setText(rs.getString("telefon"));
                txtAdres.setText(rs.getString("adres"));
                
            }
        } catch (Exception e) {
        }finally {
            db.kapat();
        }
        
    }

    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtAd = new javax.swing.JTextField();
        txtSoyad = new javax.swing.JTextField();
        txtTelefon = new javax.swing.JTextField();
        txtAdres = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Sipariş Al"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Ad");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jLabel2.setText("Soyad");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel3.setText("Telefon");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jLabel4.setText("Adres");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));
        jPanel1.add(txtAd, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 221, -1));
        jPanel1.add(txtSoyad, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 221, -1));

        txtTelefon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonActionPerformed(evt);
            }
        });
        jPanel1.add(txtTelefon, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 219, -1));
        jPanel1.add(txtAdres, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 219, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/if_gtk-apply_48086.png"))); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cc41499aa.jpg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-140, -20, 560, 370));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTelefonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

    }//GEN-LAST:event_jButton1MouseClicked

    String mid="";
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
       
       
        String adi = txtAd.getText().trim();
        String soyadi = txtSoyad.getText().trim();
        String telefon= txtTelefon.getText().trim();
        String adres=txtAdres.getText().trim();

       if (adi.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "lutfen adınızı gırınız");
            txtAd.requestFocus();
        } else if (soyadi.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "lutfen soyadınızı gırınız");
            txtSoyad.requestFocus();
        } else if (telefon.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "lutfen telefon numaranızı gırınız");
            txtTelefon.requestFocus();
            
        } else if (adres.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "lutfen adres bilginizi gırınız");
            txtAdres.requestFocus();
        } else {
            if(my.adSoyadValidator(adi)==1 && my.adSoyadValidator(soyadi)==1 && my.telefonValidator(telefon)==1 && my.adSoyadValidator(adres)==1){
                
                try {
            String q = "update musteriBilgileri set adi = '"+adi+"', "
                    + "soyadi = '"+soyadi+"', telefon = '"+telefon+"', "
                    + "adres = '"+adres+"' where mID = '"+id+"'";
            System.out.println(q);
            int duzenle = db.baglan().executeUpdate(q);
            if (duzenle > 0) {
               // System.out.println("girdim");
                NewJFrame js = new NewJFrame();
                js.setVisible(true);
                dispose();
            }
        } catch (Exception e) {
            System.err.println("Düzenleme Hatası : " + e);
        }finally {
            db.kapat();
        }
    
    
        
            }else{
               if(my.adSoyadValidator(adi)==-1){
                   JOptionPane.showMessageDialog(rootPane, "Ad alanı sadece harf içermelidir!");
                   txtAd.setText("");
                   txtAd.requestFocus();
               }else if(my.adSoyadValidator(soyadi)==-1){
                   JOptionPane.showMessageDialog(rootPane, "Soyad alanı sadece harf içermelidir!");
                   txtSoyad.setText("");
                   txtSoyad.requestFocus();
               }else if(my.telefonValidator(telefon)==-2){
                    JOptionPane.showMessageDialog(rootPane, "Telefon numarası on haneli olmalıdır!");
                   txtTelefon.setText("");
                   txtTelefon.requestFocus();
               }else if(my.telefonValidator(telefon)==-1){
                    JOptionPane.showMessageDialog(rootPane, "Telefon numarasında tüm karakterler rakam olmalıdır!");
                   txtTelefon.setText("");
                   txtTelefon.requestFocus();
               }else if(my.telefonValidator(telefon)==0){
                    JOptionPane.showMessageDialog(rootPane, "Telefon numarası 5 ile başlamalıdır!");
                   txtTelefon.setText("");
                   txtTelefon.requestFocus();
               }else if(my.adSoyadValidator(adres)==-1){
                    JOptionPane.showMessageDialog(rootPane, "Adres alanı sadece harf içermelidir!");
                   txtAdres.setText("");
                   txtAdres.requestFocus();
               }
            }
            
            
        }
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(duzenle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(duzenle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(duzenle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(duzenle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new duzenle("").setVisible(true);
            }
        });
    }

    
    
    
     
    
    
    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField txtAd;
    public javax.swing.JTextField txtAdres;
    public javax.swing.JTextField txtSoyad;
    public javax.swing.JTextField txtTelefon;
    // End of variables declaration//GEN-END:variables
}
