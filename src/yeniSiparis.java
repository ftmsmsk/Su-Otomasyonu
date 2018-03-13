
import com.sun.org.apache.xalan.internal.xsltc.compiler.util.StringStack;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Serhat Şimşek
 */
public class yeniSiparis extends javax.swing.JFrame {

    
    static boolean drm=false;
    public yeniSiparis() {
        initComponents();
        
        drm=true;
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
        txtAdres = new javax.swing.JTextField();
        txtFiyat = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Sipariş Al"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Ad");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 44, -1, -1));

        jLabel2.setText("Soyad");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 82, -1, -1));

        jLabel3.setText("Adres");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 120, -1, -1));

        jLabel4.setText("Fiyat");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 158, -1, -1));
        jPanel1.add(txtAd, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 41, 221, -1));
        jPanel1.add(txtSoyad, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 79, 221, -1));

        txtAdres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAdresActionPerformed(evt);
            }
        });
        jPanel1.add(txtAdres, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 117, 221, -1));
        jPanel1.add(txtFiyat, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 155, 221, -1));

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
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 212, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cc41499aa.jpg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 350, 340));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtAdresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAdresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAdresActionPerformed

    
    
   
    
    
    
    
    
    
    
    
    
    
    DBS dbs=new DBS();
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//        String sayi="0123456789";

        String adi = txtAd.getText().trim();
        String soyadi = txtSoyad.getText().trim();
        String adres= txtAdres.getText().trim();
        String fiyat=txtFiyat.getText().trim();
        boolean kontrol=false;
        
        for(char harf:fiyat.toCharArray())
        {
       if(!(Character.isDigit(harf))){
           kontrol=true;
            JOptionPane.showMessageDialog(rootPane,"Hatalı giriş,lütfen sayı girişi yapınız!");
            txtFiyat.setText("");
            txtFiyat.requestFocus();
          break;
       }
        }
        if(!kontrol){
            
      
            
            try {
              String siparis=fiyat;
              String teslimDurumu="sipariş alındı";
              String yazQuery = "insert into siparisBilgileri values(null,'" + adi + "','" + soyadi + "','" + adres + "','" + fiyat + "','" + teslimDurumu + "')";
              
                int yazSonuc = dbs.baglan().executeUpdate(yazQuery);
                if (yazSonuc > 0) { //yukarıda ınt dond ıcın >0 de ınceledk işlem yapıldıysagırıo buraya
                    dbs.kapat();
                   new NewJFrame().dataSiparisGetir();
                 
                    JOptionPane.showMessageDialog(rootPane, "yazma işlemi başarılı");
                    NewJFrame gg = new NewJFrame();
                    gg.setVisible(true);
                    dispose();

                } else {
                    JOptionPane.showMessageDialog(rootPane, "yazma işlemi basarısız oldu!");
                }
              
            } catch (Exception ex) {
                System.out.println("yazma hatası"+ex);
            }finally{
                dbs.kapat();
            }
            
            
            
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        drm=false;
    }//GEN-LAST:event_formWindowClosed

    
   
    
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

       
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(yeniSiparis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(yeniSiparis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(yeniSiparis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(yeniSiparis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new yeniSiparis().setVisible(true);
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
    public javax.swing.JTextField txtFiyat;
    public javax.swing.JTextField txtSoyad;
    // End of variables declaration//GEN-END:variables
}
