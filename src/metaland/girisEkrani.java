/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package metaland;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Orhan UZEL
 */
public class girisEkrani extends javax.swing.JFrame {
    static  OyunEkrani oyunEkrani =new  OyunEkrani();//butonadn sonraydı normalde//static de sonradan eklendi //başka classta doğrudan erişim yapabilmek için ekledim 
    String kullanici_ad;
    String kullanici_soyad;
    int kullanici_id;
    int belirtec=0;
 static   int kullanici_bas_para;//statici ekliyorum market alışverişi kranımda kullanabilmek için 
 static   int kullanici_bas_esya;
 static   int kullanici_bas_yemek;

    public int getKullanici_bas_para() {
        return kullanici_bas_para;
    }

    public void setKullanici_bas_para(int kullanici_bas_para) {
        this.kullanici_bas_para = kullanici_bas_para;
    }

    public int getKullanici_bas_esya() {
        return kullanici_bas_esya;
    }

    public void setKullanici_bas_esya(int kullanici_bas_esya) {
        this.kullanici_bas_esya = kullanici_bas_esya;
    }

    public int getKullanici_bas_yemek() {
        return kullanici_bas_yemek;
    }

    public void setKullanici_bas_yemek(int kullanici_bas_yemek) {
        this.kullanici_bas_yemek = kullanici_bas_yemek;
    }
    
int sorgu_sonucu=0;
String sorgu;
static String kullanici_no;
static String sifre;
String k_adi;
String k_sifre;
//String yeni_k_adi;
	DefaultTableModel modelim = new DefaultTableModel();
	Object[] kolonlar = {"ID No","Kullanici Adi","Sifre"};
	Object[] satirlar = new Object[3];
    /**
     * Creates new form girisEkrani
     */
    public girisEkrani() {
      
        initComponents();
    
    }

    public int getKullanici_id() {
        return kullanici_id;
    }

    public String getKullanici_soyad() {
        return kullanici_soyad;
    }

    public static String getKullanici_no() {
        return kullanici_no;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        metin_kullanici_adi = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        metin_sifre = new javax.swing.JPasswordField();
        checkboxSifreyiGoster = new javax.swing.JCheckBox();
        buton_giris_yap = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Kullanıcı Adı :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 100, 81));

        metin_kullanici_adi.setBackground(new java.awt.Color(204, 255, 255));
        metin_kullanici_adi.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(metin_kullanici_adi, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 142, 81));

        jLabel2.setBackground(new java.awt.Color(153, 153, 255));
        jLabel2.setText("Şifre :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 108, -1));

        metin_sifre.setBackground(new java.awt.Color(204, 255, 255));
        metin_sifre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        metin_sifre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                metin_sifreActionPerformed(evt);
            }
        });
        jPanel1.add(metin_sifre, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 140, 80));

        checkboxSifreyiGoster.setBackground(new java.awt.Color(204, 255, 255));
        checkboxSifreyiGoster.setText("Parolayı Göster");
        checkboxSifreyiGoster.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        checkboxSifreyiGoster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkboxSifreyiGosterActionPerformed(evt);
            }
        });
        jPanel1.add(checkboxSifreyiGoster, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, 112, -1));

        buton_giris_yap.setBackground(new java.awt.Color(204, 255, 255));
        buton_giris_yap.setText("GİRİŞ YAP  ");
        buton_giris_yap.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buton_giris_yap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton_giris_yapActionPerformed(evt);
            }
        });
        jPanel1.add(buton_giris_yap, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 226, 49));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("OYUNUMUZA HOŞ GELDİNİZ");
        jLabel3.setToolTipText("");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 260, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 754, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void metin_sifreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_metin_sifreActionPerformed
        
    }//GEN-LAST:event_metin_sifreActionPerformed

    private void buton_giris_yapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton_giris_yapActionPerformed
        System.out.println(metin_sifre.getText());
         System.out.println(k_adi);
         System.out.println(k_sifre);
        System.out.println( metin_kullanici_adi.getText());
       
      String yeni_sifre= metin_sifre.getText();
      String yeni_k_adi= metin_kullanici_adi.getText();
      kullanici_no = metin_kullanici_adi.getText();
				sifre =metin_sifre.getText();
				String sql_sorgum = "select count(id) as giris from kullanici_bilgileri where kullanici_no='"+kullanici_no+
						"' and kullanici_sifre='"+sifre+"'";
				String sql_sorgu = "select count(id) as giris from kullanici where kullanici_adi='"+kullanici_no+
						"' and sifre='"+sifre+"'";
                                String sql_sorgus = "select count(yeterid) as giris from yeter where ad='"+kullanici_no+
						"' and soyad='"+sifre+"'";
				String bilgiTutmaSorgum="SELECT  * FROM kullanici_bilgileri WHERE kullanici_no ='"+kullanici_no+
                                        "'and kullanici_sifre='"+sifre+"'";
			/*	ResultSet kullanici_bilgilerim = veritabani.yap();
			 kullanici_bilgilerim = veritabani.sorgula(sql_sorgus);//resultset üst taraftaydı 
				OyunEkrani oyunEkrani = new OyunEkrani();
				try {
					while(kullanici_bilgilerim.next()){
						if(kullanici_bilgilerim.getInt("giris")==1) {
						//buton_giris_yap.setText("basarili giris");
                                            //      Object[] kullanici_ad_objesi = new Object[1];
                                            //    Object[] kullanici_soyad_objesi = new Object[1];

                                             //   kullanici_ad=kullanici_bilgilerim.getString("kullanici_no");
                                             //   kullanici_soyad=kullanici_bilgilerim.getString("kullanici_soyad");
                                             
                                          //   satirlar[0] = kullanici_bilgilerim.getString("yeterid");
				          satirlar[1] = kullanici_bilgilerim.getString("ad");
				         satirlar[2] = kullanici_bilgilerim.getString("soyad");
                                                    System.out.println(satirlar[1]);
                                                oyunEkrani.ekrandaKullaniciBilgisiGosterFonk(kullanici_ad,kullanici_soyad);
                                              JOptionPane.showMessageDialog(null, "GIRIS BASARILI");
                                            //  kullanici_ad=kullanici_bilgilerim.getNString("kullanici_ad");
                                            //  kullanici_soyad=kullanici_bilgilerim.getNString("kullanici_soyad");
                                              
                                               //  OyunEkrani oyunEkrani = new OyunEkrani();
							oyunEkrani.setVisible(true);
                                                 //       oyunEkrani.ekrandaKullaniciBilgisiGosterFonk(kullanici_ad,kullanici_soyad);
							setVisible(false);
						} else { 
                                                    //buton_giris_yap.setText("hatali giris");
                                                JOptionPane.showMessageDialog(null, "GIRIS BASARISIZ");
                                                }
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}*/
     ResultSet kullanici_bilgilerim2 = veritabani.yap();
			 kullanici_bilgilerim2 = veritabani.sorgula(bilgiTutmaSorgum);//resultset üst taraftaydı
               //          PreparedStatament ps=veritabani.conn.prepareStatement(bilgiTutmaSorgum);
      try {
					while(kullanici_bilgilerim2.next()){
                                            belirtec=1;
                                       //   kullanici_ad=kullanici_bilgilerim2.getString("kullanici_ad");
                                              kullanici_soyad=kullanici_bilgilerim2.getString("kullanici_soyad");
                                             kullanici_id= kullanici_bilgilerim2.getInt("id");
                                             
                                             kullanici_ad= kullanici_bilgilerim2.getString("kullanici_ad");
                                             kullanici_ad=kullanici_ad.toUpperCase();
                                             kullanici_soyad=kullanici_soyad.toUpperCase();
                                             kullanici_bas_para=kullanici_bilgilerim2.getInt("kullanici_para_miktari");
                                             kullanici_bas_esya=kullanici_bilgilerim2.getInt("kullanici_esya_miktari");
                                             kullanici_bas_yemek=kullanici_bilgilerim2.getInt("kullanici_yemek_miktari");
                                             oyunEkrani.ekrandaBaslangicKalanBilgisiGosterFonk(kullanici_bas_yemek, kullanici_bas_para, kullanici_bas_esya);
                                              JOptionPane.showMessageDialog(null, "GIRIS BASARILI");
                                              oyunEkrani.ekrandaKullaniciBilgisiGosterFonk(kullanici_ad,kullanici_soyad,kullanici_id);
                                              oyunEkrani.idAl(kullanici_id);
                                             oyunEkrani.idm=kullanici_id;
                                              oyunEkrani.setVisible(true);
                                        }}
      catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

      if(belirtec==0){
           JOptionPane.showMessageDialog(null, "GIRIS  BASARISIZ");
      }      
      
    }//GEN-LAST:event_buton_giris_yapActionPerformed

    private void checkboxSifreyiGosterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkboxSifreyiGosterActionPerformed
     if(checkboxSifreyiGoster.isSelected()){
         metin_sifre.setEchoChar((char)0);
     }
     else{
         metin_sifre.setEchoChar('*');
     }
        
    }//GEN-LAST:event_checkboxSifreyiGosterActionPerformed

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
            java.util.logging.Logger.getLogger(girisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(girisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(girisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(girisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new girisEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buton_giris_yap;
    private javax.swing.JCheckBox checkboxSifreyiGoster;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JTextField metin_kullanici_adi;
    private javax.swing.JPasswordField metin_sifre;
    // End of variables declaration//GEN-END:variables
}
