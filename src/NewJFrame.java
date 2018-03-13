
import com.sun.prism.j2d.J2DPipeline;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class NewJFrame extends javax.swing.JFrame {

    
   
    public NewJFrame() {
        initComponents();
        dataGetir();
        siparisgetir();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblSiparisler = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtAraAdi = new javax.swing.JTextField();
        txtAraSoyadi = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMusteriBilgileri = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SU SATIŞ OTOMASYONU");

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Sipariş İşlemleri"));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/if_user_delete_64940.png"))); // NOI18N
        jButton5.setText("Seçili Olanı Sil");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/if_group_delete_36092.png"))); // NOI18N
        jButton6.setText("Tümünü Sil");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/if_cart_add_10105.png"))); // NOI18N
        jButton7.setText("Bugünün Siparişleri");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton5)
                .addGap(18, 18, 18)
                .addComponent(jButton6)
                .addGap(18, 18, 18)
                .addComponent(jButton7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(jButton7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Siparişler"));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/if_Add_132019.png"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/if_army_hammer_44650.png"))); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/if_ok_61805.png"))); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        tblSiparisler.setModel(new javax.swing.table.DefaultTableModel(
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
        tblSiparisler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSiparislerMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblSiparisler);

        jLabel6.setText("Yeni Sipariş");

        jLabel7.setText("Yola Çıktı");

        jLabel8.setText("Teslim Edildi");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jButton8)
                        .addGap(60, 60, 60)
                        .addComponent(jButton9)
                        .addGap(54, 54, 54)
                        .addComponent(jButton10)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel6)
                .addGap(80, 80, 80)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(74, 74, 74))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton9)
                            .addComponent(jButton10)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Kayıt Arama"));

        jLabel1.setText("Müşteri Adı");

        jLabel2.setText("Müşteri Soyadı");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/if_zoom_45067.png"))); // NOI18N
        jButton1.setText("ARA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtAraAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtAraSoyadi, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(52, 52, 52))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAraAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAraSoyadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Müşteri Bilgileri"));

        tblMusteriBilgileri.setModel(new javax.swing.table.DefaultTableModel(
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
        tblMusteriBilgileri.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMusteriBilgileriMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMusteriBilgileri);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/if_Accept-Male-User_49575.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/if_Male-User-Help_49594.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/if_Remove-Male-User_49612.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel3.setText("Ekle");

        jLabel4.setText("Değiştir");

        jLabel5.setText("Sil");

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/if_Refresh_22731.png"))); // NOI18N
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jLabel9.setText("Yenile");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jButton2))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel3)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jButton3)
                        .addGap(28, 28, 28)
                        .addComponent(jButton4)
                        .addGap(0, 0, 0))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel4)
                        .addGap(76, 76, 76)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton11)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(33, 33, 33)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel4)
                        .addComponent(jLabel3))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jButton11))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(mID.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen seçim yapınız");
        }else {
        duzenle dz = new duzenle(mID);
        dz.setVisible(true);

         dispose();
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    DB db = new DB();

    public void dataGetir() { 
        try {
            String musteriQuery = "select *from musteriBilgileri";
            ResultSet rs = db.baglan().executeQuery(musteriQuery);
            DefaultTableModel dtm = new DefaultTableModel();
            dtm.addColumn("ID");
            dtm.addColumn("Adı");
            dtm.addColumn("Soyadı");
            dtm.addColumn("Telefon");
            dtm.addColumn("Adres");
              while (rs.next()) {
                dtm.addRow(new String[]{rs.getString("mID"), rs.getString("adi"), rs.getString("soyadi"), rs.getString("telefon"), rs.getString("adres")});//sutunun ısmını yazdık ınt olanı tercıh etseydık no yazıp sayıyla bakcktk
              }

            tblMusteriBilgileri.setModel(dtm);

        } catch (Exception e) {
            System.out.println("data getirme hatası" + e);
        } finally {
            db.kapat();
        }
    }

    public void dataSiparisGetir() { 
        try {
            String siparisQuery = "select *from siparisBilgileri";
            ResultSet rs = dbs.baglan().executeQuery(siparisQuery);
            DefaultTableModel dtm = new DefaultTableModel();
            dtm.addColumn("ID");
            dtm.addColumn("Adı");
            dtm.addColumn("Soyadı");
            dtm.addColumn("Adres");
            dtm.addColumn("TeslimDurumu");

           
            while (rs.next()) {
                dtm.addRow(new String[]{rs.getString("mID"), rs.getString("adi"), rs.getString("soyadi"), rs.getString("adres"), rs.getString("teslimDurumu")});//sutunun ısmını yazdık ınt olanı tercıh etseydık no yazıp sayıyla bakcktk

            }

            new NewJFrame().tblSiparisler.setModel(dtm); 

        } catch (Exception e) {
            System.out.println("data getirme hatası" + e);
        } finally {
            dbs.kapat();
        }
    }

    kayit ky = null;
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

       
            ky = new kayit();
            ky.setVisible(true);
            dispose();
        

    }//GEN-LAST:event_jButton2ActionPerformed


    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        if (mID.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen seçim yapınız!");
        } else {
            int cevap = JOptionPane.showConfirmDialog(rootPane, "silmek istediğinizden emin misiniz", "UYARI", JOptionPane.YES_NO_OPTION);

            try {
                if (cevap == 0) {
                    String silQuery = "delete from musteriBilgileri where mID='" + mID + "' ";
                    int silSonuc = db.baglan().executeUpdate(silQuery);
                    if (silSonuc > 0) {
                        db.kapat();
                        dataGetir();
                        JOptionPane.showMessageDialog(rootPane, "silme işlemi başarılı");
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "silme hatası!");
                    }
                }
            } catch (Exception e) {
                System.err.println("silme hatası:" + e);
            } finally {
                db.kapat();
            }
        }


    }//GEN-LAST:event_jButton4ActionPerformed

    String mID = "";
    private void tblMusteriBilgileriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMusteriBilgileriMouseClicked

        int row = tblMusteriBilgileri.getSelectedRow();
        if (row > -1) {
            mID = "" + tblMusteriBilgileri.getValueAt(row, 0);
        }
    }//GEN-LAST:event_tblMusteriBilgileriMouseClicked

    DBS dbs = new DBS();
    yeniSiparis ys = null;
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

        if (mID.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "lutfen secim yapınız");
        } else {

            if (!yeniSiparis.drm) {
                ys = new yeniSiparis();
                int row = tblMusteriBilgileri.getSelectedRow();
                ys.setVisible(true);
                dispose();

                TableModel model = tblMusteriBilgileri.getModel();

                String mID = model.getValueAt(row, 0).toString();
                String adi = model.getValueAt(row, 1).toString();
                String soyadi = model.getValueAt(row, 2).toString();
                String adres = model.getValueAt(row, 4).toString();

                ys.setVisible(true);
                ys.setLocationRelativeTo(null);

                ys.txtAd.setText(adi);
                ys.txtSoyad.setText(soyadi);
                ys.txtAdres.setText(adres);

            }

        }
    }//GEN-LAST:event_jButton8ActionPerformed
    public void siparisgetir() {

        String siparisgetir = "select * from siparisBilgileri";

        try {
            ResultSet abb = dbs.baglan().executeQuery(siparisgetir);
            DefaultTableModel dtmm = new DefaultTableModel();

            dtmm.addColumn("ID");
            dtmm.addColumn("Adı");
            dtmm.addColumn("Soyadı");
            dtmm.addColumn("Adres");
            dtmm.addColumn("Fiyat");
            dtmm.addColumn("Teslim Durumu");

            while (abb.next()) {

                dtmm.addRow(new String[]{abb.getString("mID"), abb.getString("adi"), abb.getString("soyadi"), abb.getString("adres"), abb.getString("fiyat"), abb.getString("teslimDurumu")});

            }
            tblSiparisler.setModel(dtmm);

        } catch (SQLException ex) {
            System.out.println("sipariş okuma hatası :" + ex);
        } finally {
            dbs.kapat();
        }

    }
    String mid = "";
    private void tblSiparislerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSiparislerMouseClicked

        int row = tblSiparisler.getSelectedRow();
        mid = "" + tblSiparisler.getValueAt(row, 0);
       

    }//GEN-LAST:event_tblSiparislerMouseClicked

    ArrayList<String> ls = new ArrayList<>();

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String ad = txtAraAdi.getText();
        String soyad = txtAraSoyadi.getText();
        String musteriQuery = "select *from musteriBilgileri where adi='" + ad + "' and soyadi='" + soyad + "'";

        try {
            DB db = new DB();
            ResultSet rs = db.baglan().executeQuery(musteriQuery);
            DefaultTableModel dt = new DefaultTableModel();
            dt.addColumn("ID");
            dt.addColumn("Adı");
            dt.addColumn("Soyad");
            dt.addColumn("Telefon");
            dt.addColumn("Adres");

            while (rs.next()) {
                dt.addRow(new String[]{rs.getString("mID"), rs.getString("adi"), rs.getString("soyadi"), rs.getString("telefon"), rs.getString("adres"),});
            }

            tblMusteriBilgileri.setModel(dt);

        } catch (Exception e) {
        }


    }//GEN-LAST:event_jButton1ActionPerformed


    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        if (mid.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen seçim yapınız!");
        } else {
            int cevap = JOptionPane.showConfirmDialog(rootPane, "silmek istediğinizden emin misiniz", "UYARI", JOptionPane.YES_NO_OPTION);

            try {
                if (cevap == 0) {
                    String silQuery = "delete from siparisBilgileri where mID='" + mid + "' ";
                    int silSonuc = dbs.baglan().executeUpdate(silQuery);
                    if (silSonuc > 0) {
                        dbs.kapat();
                        dataSiparisGetir();
                        JOptionPane.showMessageDialog(rootPane, "silme işlemi başarılı");
                        NewJFrame  a=new NewJFrame();
                        a.setVisible(true);
                        dispose();
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "silme hatası!");
                    }
                }
            } catch (Exception e) {
                System.err.println("silme hatası:" + e);
            } finally {
                dbs.kapat();
            }
        }


    }//GEN-LAST:event_jButton5ActionPerformed


    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed

        if (mid.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen seçim yapınız!");
        } else {

            try {

                String yolQuery = "update siparisBilgileri set teslimDurumu='yola çıktı' where mID='" + mid + "'";
                int yazSonuc = dbs.baglan().executeUpdate(yolQuery);
                if (yazSonuc > 0) { 
                    dbs.kapat();
                    new NewJFrame().dataSiparisGetir();

                    JOptionPane.showMessageDialog(rootPane, "yazma işlemi başarılı");
                    NewJFrame gg = new NewJFrame();
                    gg.setVisible(true);
                    dispose();
                }
            } catch (Exception e) {
            } finally {
                dbs.kapat();
            }
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed

        if (mid.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen seçim yapınız!");
        } else {

            try {

                String yolQuery = "update siparisBilgileri set teslimDurumu='teslim edildi' where mID='" + mid + "'";
                int yazSonuc = dbs.baglan().executeUpdate(yolQuery);
                if (yazSonuc > 0) { 
                    dbs.kapat();
                    new NewJFrame().dataSiparisGetir();

                    JOptionPane.showMessageDialog(rootPane, "yazma işlemi başarılı");
                    NewJFrame gg = new NewJFrame();
                    gg.setVisible(true);
                    dispose();
                }
            } catch (Exception e) {
            } finally {
                dbs.kapat();
            }
        }


    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        try {

            String yolQuery = "select count(teslimDurumu) from siparisBilgileri  where teslimDurumu='teslim edildi'";
            ResultSet rs = dbs.baglan().executeQuery(yolQuery);
            while (rs.next()) {
               new NewJFrame().dataSiparisGetir();

                ImageIcon icon=new ImageIcon("img\\if_Cart_605508.png");
                JOptionPane.showMessageDialog(rootPane, rs.getString(1), "SATIŞ MİKTARI", HEIGHT, icon);
               
                NewJFrame gg = new NewJFrame();
                gg.setVisible(true);
                dispose();
                dbs.kapat();
            }


        } catch (SQLException e) {
            System.err.println("hata:" + e);

        } finally {
            dbs.kapat();
        }


    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

         int cevap = JOptionPane.showConfirmDialog(rootPane, "silmek istediğinizden emin misiniz", "UYARI", JOptionPane.YES_NO_OPTION);

            try {
                if (cevap == 0) {
                    String silQuery = "delete from siparisBilgileri  ";
                    int silSonuc = dbs.baglan().executeUpdate(silQuery);
                    if (silSonuc > 0) {
                        dbs.kapat();
                        dataSiparisGetir();
                        JOptionPane.showMessageDialog(rootPane, "silme işlemi başarılı");
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "silme hatası!");
                    }
                }
            } catch (Exception e) {
                System.err.println("silme hatası:" + e);
            } finally {
                dbs.kapat();
            }
        
        
        
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        dataGetir();
    }//GEN-LAST:event_jButton11ActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblMusteriBilgileri;
    public javax.swing.JTable tblSiparisler;
    private javax.swing.JTextField txtAraAdi;
    private javax.swing.JTextField txtAraSoyadi;
    // End of variables declaration//GEN-END:variables
}
