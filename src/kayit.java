
import java.awt.Component;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import jdk.nashorn.internal.ir.BreakNode;



public class kayit extends javax.swing.JFrame {

  
     MyValidator my=new MyValidator();
    static boolean durum=false;
    public kayit() {
        initComponents();
        durum=true;
        
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtAd = new javax.swing.JTextField();
        txtSoyad = new javax.swing.JTextField();
        txtTelefon = new javax.swing.JTextField();
        txtAdres = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("ADI");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 38, -1));

        jLabel2.setText("SOYADI");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel3.setText("TELEFON");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel4.setText("ADRES");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 44, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/if_gtk-apply_48086.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, -1));
        jPanel1.add(txtAd, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 224, -1));
        jPanel1.add(txtSoyad, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 224, -1));
        jPanel1.add(txtTelefon, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 224, -1));
        jPanel1.add(txtAdres, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 224, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cc41499aa.jpg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -20, 400, 360));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  
    
    
    NewJFrame nf=new NewJFrame();
    DB db=new DB();
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        //nf.setVisible(true);
        String adi = txtAd.getText().trim();
        String soyadi = txtSoyad.getText().trim();
        String telefon = txtTelefon.getText().trim();
        String adres = txtAdres.getText().trim();

        
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
                
                String[] musteriBilgi={adi,soyadi,telefon,adres};
                String yazQuery=new DB().dizi("musteriBilgileri", musteriBilgi);
                int yazSonuc = db.baglan().executeUpdate(yazQuery);
                if (yazSonuc > 0) {
                    db.kapat();
                    JOptionPane.showMessageDialog(rootPane, "yazma işlemi başarılı");
                    new NewJFrame().setVisible(true);
                    dispose();

                } else {
                    JOptionPane.showMessageDialog(rootPane, "yazma işlemi basarılı oldu!");
                }
            } catch (SQLException ex) {
                System.out.println("yazma hatası"+ex);
               
            } finally {
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

    
    
    
    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        new NewJFrame().setVisible(true);
        durum=false;
    }//GEN-LAST:event_formWindowClosed

    
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
            java.util.logging.Logger.getLogger(kayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kayit().setVisible(true);
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
    private javax.swing.JTextField txtAd;
    private javax.swing.JTextField txtAdres;
    private javax.swing.JTextField txtSoyad;
    private javax.swing.JTextField txtTelefon;
    // End of variables declaration//GEN-END:variables
}
