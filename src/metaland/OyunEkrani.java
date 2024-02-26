/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package metaland;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Orhan UZEL
 */
public class OyunEkrani extends javax.swing.JFrame {
   static int idm;
  int[][] oyunAlani=new int [4][4];//static ekliyorum yeni değerler atayabilmem için bouton içersinde//işe yaramadı kaldırdım  
    static int arsaSecmeBelirteci=0;
    static int secilenIsletmeTuru=0;//staticti
   static int aksiyonDisi=0;
   static  int satir,sutun=0;
    int donguCikisi=0;
public int idAl(int id){
    idm=id;
    return id;
    
}    
public void ekrandaKullaniciBilgisiGosterFonk(String ad,String soyad,int id) {
    labelKullaniciAdiSoyadi.setText("USER: "+ad+" "+soyad);
    String ids=String.valueOf(id);
    labelId.setText(ids);
    
} 
public void ekrandaBaslangicKalanBilgisiGosterFonk(int  basYemek,int basPara,int basEsya) {
     String strbasYemek=String.valueOf(basYemek);
     String strbasPara=String.valueOf(basPara);
     String strbasEsya=String.valueOf(basEsya);
    
    labelKalanEsya.setText(strbasEsya);
    labelKalanPara.setText(strbasPara);
    labelKalanYemek.setText( strbasYemek);
    
}
    /**
     * Creates new form oyunEkrani
     */
    public OyunEkrani() {
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                oyunAlani[i][j]=0;
            }
        }
        //oyunAlani[0][0]=3;//ben sonradan ekeledim deneme amaçlı 
        oyunAlani[0][1]=1;
        oyunAlani[0][2]=2;
        oyunAlani[0][3]=3;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(oyunAlani[i][j]);
            }
            System.out.println();
        }
        initComponents();
         Image arsa = new ImageIcon(this.getClass().getResource("/icons/icons8_field_100px.png")).getImage();
         Image emlak = new ImageIcon(this.getClass().getResource("/icons/icons8_mortgage_96px_1.png")).getImage();
         Image market = new ImageIcon(this.getClass().getResource("/icons/icons8_hamper_96px_2.png")).getImage();
         Image magaza = new ImageIcon(this.getClass().getResource("/icons/icons8_Clothes_on_Sale_96px.png")).getImage();
      //   Object butonlar [] = new Object[16];
      
        String dizis [] = new String[16];
        javax.swing.JButton butonlar[][]= new javax.swing.JButton[4][4];
         dizis[0]=buton0.getText();
           dizis[1]=buton1.getText();
             dizis[2]=buton2.getText();
               dizis[3]=buton3.getText();
                 dizis[4]=buton4.getText();
                   dizis[5]=buton5.getText();
                     dizis[6]=buton6.getText();
                       dizis[7]=buton7.getText();
                         dizis[8]=buton8.getText();
                           dizis[9]=buton9.getText();
                             dizis[10]=buton10.getText();
                               dizis[11]=buton11.getText();
                                 dizis[12]=buton12.getText();
                                   dizis[13]=buton13.getText();
                                     dizis[14]=buton14.getText();
                                       dizis[15]=buton15.getText();
                                       
     
         
         butonlar[0][0]=buton0;
           butonlar[0][1]=buton1;
             butonlar[0][2]=buton2;
               butonlar[0][3]=buton3;
                 butonlar[1][0]=buton4;
                   butonlar[1][1]=buton5;
                     butonlar[1][2]=buton6;
                       butonlar[1][3]=buton7;
                         butonlar[2][0]=buton8;
                           butonlar[2][1]=buton9;
                             butonlar[2][2]=buton10;
                               butonlar[2][3]=buton11;
                                 butonlar[3][0]=buton12;
                                   butonlar[3][1]=buton13;
                                     butonlar[3][2]=buton14;
                                       butonlar[3][3]=buton15;
    //     String simdikiMeblalar="update kullanici_bilgileri set kullanici_yemek_miktari = ?,kullanici_esya_miktari=?,kullanici_para_miktari=? where id ='"+idm+"'";
      //   veritabani meblaGuncellemeVt=new veritabani();
      //  meblaGuncellemeVt.guncellemeFonk(simdikiMeblalar);                              
                                       
                                       
                                       
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                
                 if(oyunAlani[i][j]==0){///arsa işlemleri
                     while(donguCikisi==0){
                       if(girisEkrani.oyunEkrani.aksiyonDisi==0){///doğru arsaya işletme yerleştirmek için 
                        satir=i;
                        sutun=j;
                        break;
                    }
                       else{
                          donguCikisi=1;
                           System.out.println("donguden cikildi");
                          break;
                       }
                         
                         
                     }
                   
                    
               butonlar[i][j].setIcon(new ImageIcon(arsa));
               
                  
    butonlar[i][j].addActionListener(new ActionListener(){  
           
           
    public void actionPerformed(ActionEvent e){ 
   
       
        if(arsaSecmeBelirteci==0){
          
        }else{
            girisEkrani.oyunEkrani.aksiyonDisi=1;
         aksiyonDisi=1;
            System.out.println(aksiyonDisi);
          
            oyunAlani[satir][sutun]=secilenIsletmeTuru;
            //  oyunAlani[i][j]=secilenIsletmeTuru;
                 for(int a=0;a<4;a++){
            for(int b=0;b<4;b++){
                System.out.print(oyunAlani[a][b]);
                //System.out.println("slaak");
            }
            System.out.println();
        }
      
              JOptionPane.showMessageDialog(null, "SEÇİMİNİZİ TAMAMLADINIZ");
        
        }
            
    }  
    });    
                 if(aksiyonDisi==1){////buraya neden girmiyorrr
                     System.out.println(aksiyonDisi);
                     System.out.println(secilenIsletmeTuru);
         oyunAlani[i][j]=secilenIsletmeTuru; 
              for(int a=0;a<4;a++){
            for(int b=0;b<4;b++){
                System.out.print(oyunAlani[a][b]);
                //System.out.println("slaak");
            }
            System.out.println();
        } 
        
    }  
                   
                 }
                   
                  //  if(oyunAlani[i][j]==1&&dizis[k]=="1"){
                      //  butonlar[k].seti
                   else if(oyunAlani[i][j]==1){////EMLAK
                   butonlar[i][j].setIcon(new ImageIcon(emlak));
                 butonlar[i][j].addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        if(arsaSecmeBelirteci==0){
           EmlakEkrani emlakEkrani=new EmlakEkrani();
      setVisible(false); 
      emlakEkrani.setVisible(true); 
        }else{
              JOptionPane.showMessageDialog(null, "İŞLETME KURMAK İÇİN YALNIZCA ARSA SEÇEBİLİRSİNİNİZ");
        }
            
    }  
    }); 
                     }
                 else if(oyunAlani[i][j]==2){/////MAĞAZA
                    butonlar[i][j].setIcon(new ImageIcon(magaza)); 
                     butonlar[i][j].addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){
         if(arsaSecmeBelirteci==0){
            MagazaEkrani magazaEkrani=new MagazaEkrani();
     setVisible(false);
       magazaEkrani.setVisible(true);
         }
         else{
             JOptionPane.showMessageDialog(null, "İŞLETME KURMAK İÇİN YALNIZCA ARSA SEÇEBİLİRSİNİNİZ"); 
         }
    }  
    });
                     }
                 else if(oyunAlani[i][j]==3){////MARKET
                      butonlar[i][j].setIcon(new ImageIcon(market));
                       butonlar[i][j].addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){
        if(arsaSecmeBelirteci==0){
            MarketEkrani marketEkrani=new MarketEkrani();
      setVisible(false);
       marketEkrani.setVisible(true);
        }
        else{
                 JOptionPane.showMessageDialog(null, "İŞLETME KURMAK İÇİN YALNIZCA ARSA SEÇEBİLİRSİNİNİZ"); 
        }
        }  
    });
                 }
                
               
            }
            
        }
//ekrandaKullaniciBilgisiGosterFonk();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        oyunPaneli = new javax.swing.JPanel();
        labelKullaniciAdiSoyadi = new javax.swing.JLabel();
        labelKalanPara = new javax.swing.JLabel();
        buton1 = new javax.swing.JButton();
        buton2 = new javax.swing.JButton();
        buton3 = new javax.swing.JButton();
        labelKalanEsya = new javax.swing.JLabel();
        labelKalanYemek = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        buton5 = new javax.swing.JButton();
        buton6 = new javax.swing.JButton();
        buton7 = new javax.swing.JButton();
        buton8 = new javax.swing.JButton();
        buton9 = new javax.swing.JButton();
        buton10 = new javax.swing.JButton();
        buton11 = new javax.swing.JButton();
        buton12 = new javax.swing.JButton();
        buton0 = new javax.swing.JButton();
        buton14 = new javax.swing.JButton();
        buton15 = new javax.swing.JButton();
        buton13 = new javax.swing.JButton();
        buton4 = new javax.swing.JButton();
        labelId = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        oyunPaneli.setBackground(new java.awt.Color(153, 255, 153));
        oyunPaneli.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        oyunPaneli.setName(""); // NOI18N
        oyunPaneli.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelKullaniciAdiSoyadi.setFont(new java.awt.Font("Noto Serif", 1, 14)); // NOI18N
        labelKullaniciAdiSoyadi.setForeground(new java.awt.Color(255, 51, 51));
        labelKullaniciAdiSoyadi.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelKullaniciAdiSoyadi.setText("KULLANİCİ ADİ SOYADİ ");
        oyunPaneli.add(labelKullaniciAdiSoyadi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, 55));

        labelKalanPara.setBackground(new java.awt.Color(153, 153, 255));
        labelKalanPara.setForeground(new java.awt.Color(0, 51, 255));
        labelKalanPara.setText("kalan para miktarı");
        labelKalanPara.setToolTipText("");
        labelKalanPara.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        oyunPaneli.add(labelKalanPara, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 0, 51, 50));

        buton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_mortgage_96px_1.png"))); // NOI18N
        buton1.setText("alan1");
        buton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        oyunPaneli.add(buton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 98, -1, -1));

        buton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Clothes_on_Sale_96px.png"))); // NOI18N
        buton2.setText("alan2");
        buton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton2ActionPerformed(evt);
            }
        });
        oyunPaneli.add(buton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 98, -1, -1));

        buton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_hamper_96px_2.png"))); // NOI18N
        buton3.setText("alan3");
        buton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton3ActionPerformed(evt);
            }
        });
        oyunPaneli.add(buton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 96, -1, 107));

        labelKalanEsya.setForeground(new java.awt.Color(51, 51, 255));
        labelKalanEsya.setText("kalan esya miktarı");
        labelKalanEsya.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                labelKalanEsyaİnputMethodTextChanged(evt);
            }
        });
        oyunPaneli.add(labelKalanEsya, new org.netbeans.lib.awtextra.AbsoluteConstraints(884, 62, 47, 39));

        labelKalanYemek.setForeground(new java.awt.Color(51, 51, 255));
        labelKalanYemek.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelKalanYemek.setText("     kalany");
        oyunPaneli.add(labelKalanYemek, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 107, 51, 37));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_coat_48px_1.png"))); // NOI18N
        oyunPaneli.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(793, 62, -1, 39));
        oyunPaneli.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(841, 358, -1, -1));
        oyunPaneli.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(582, 105, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_cut_of_meat_48px_1.png"))); // NOI18N
        oyunPaneli.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(793, 107, -1, 37));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_turkish_lira_48px_1.png"))); // NOI18N
        oyunPaneli.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(793, 0, -1, 56));

        buton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_field_100px.png"))); // NOI18N
        buton5.setText("alan0");
        oyunPaneli.add(buton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 231, -1, -1));

        buton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_field_100px.png"))); // NOI18N
        buton6.setText("alan0");
        oyunPaneli.add(buton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 231, -1, -1));

        buton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_field_100px.png"))); // NOI18N
        buton7.setText("alan0");
        oyunPaneli.add(buton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(596, 231, -1, -1));

        buton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_field_100px.png"))); // NOI18N
        buton8.setText("alan0");
        oyunPaneli.add(buton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 365, -1, -1));

        buton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_field_100px.png"))); // NOI18N
        buton9.setText("alan0");
        oyunPaneli.add(buton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 365, -1, -1));

        buton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_field_100px.png"))); // NOI18N
        buton10.setText("alan0");
        oyunPaneli.add(buton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 365, -1, -1));

        buton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_field_100px.png"))); // NOI18N
        buton11.setText("alan0");
        oyunPaneli.add(buton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(596, 365, -1, -1));

        buton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_field_100px.png"))); // NOI18N
        buton12.setText("alan0");
        oyunPaneli.add(buton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 501, -1, -1));

        buton0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_field_100px.png"))); // NOI18N
        buton0.setText("alan0");
        oyunPaneli.add(buton0, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 97, -1, 100));

        buton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_field_100px.png"))); // NOI18N
        buton14.setText("alan0");
        oyunPaneli.add(buton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 501, -1, -1));

        buton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_field_100px.png"))); // NOI18N
        buton15.setText("alan0");
        oyunPaneli.add(buton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(596, 501, -1, -1));

        buton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_field_100px.png"))); // NOI18N
        buton13.setText("alan0");
        oyunPaneli.add(buton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 501, -1, -1));

        buton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_field_100px.png"))); // NOI18N
        buton4.setText("alan0");
        buton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton4ActionPerformed(evt);
            }
        });
        oyunPaneli.add(buton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 231, -1, -1));

        labelId.setText("id:");
        oyunPaneli.add(labelId, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        oyunPaneli.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, -1, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(oyunPaneli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(oyunPaneli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton3ActionPerformed
    //  MarketEkrani marketEkrani=new MarketEkrani();
      // this.setVisible(false);
      // marketEkrani.setVisible(true);
    }//GEN-LAST:event_buton3ActionPerformed

    private void buton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton2ActionPerformed
       //MagazaEkrani magazaEkrani=new MagazaEkrani();
      // this.setVisible(false);
      // magazaEkrani.setVisible(true);
       
    }//GEN-LAST:event_buton2ActionPerformed

    private void buton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton4ActionPerformed
   //  Image img = new ImageIcon(this.getClass().getResource("/icons/icons8_rent_80px.png")).getImage();
	//	buton4.setIcon(new ImageIcon(img));//resimler değişiyor mu değişmiyor mu deneme amaçlı yazılmıştuı 
    }//GEN-LAST:event_buton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     String simdikiMeblalar="update kullanici_bilgileri set kullanici_yemek_miktari = ?,kullanici_esya_miktari=?,kullanici_para_miktari=? where id ='"+idm+"'";
         veritabani meblaGuncellemeVt=new veritabani();
       // meblaGuncellemeVt.guncellemeFonk(simdikiMeblalar,girisEkrani.kullanici_bas_yemek,girisEkrani.kullanici_bas_esya,girisEkrani.kullanici_bas_para);   
    }//GEN-LAST:event_jButton1ActionPerformed

    private void labelKalanEsyaİnputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_labelKalanEsyaİnputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_labelKalanEsyaİnputMethodTextChanged

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
            java.util.logging.Logger.getLogger(OyunEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OyunEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OyunEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OyunEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OyunEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buton0;
    private javax.swing.JButton buton1;
    private javax.swing.JButton buton10;
    private javax.swing.JButton buton11;
    private javax.swing.JButton buton12;
    private javax.swing.JButton buton13;
    private javax.swing.JButton buton14;
    private javax.swing.JButton buton15;
    private javax.swing.JButton buton2;
    private javax.swing.JButton buton3;
    private javax.swing.JButton buton4;
    private javax.swing.JButton buton5;
    private javax.swing.JButton buton6;
    private javax.swing.JButton buton7;
    private javax.swing.JButton buton8;
    private javax.swing.JButton buton9;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel labelId;
    private javax.swing.JLabel labelKalanEsya;
    private javax.swing.JLabel labelKalanPara;
    private javax.swing.JLabel labelKalanYemek;
    private javax.swing.JLabel labelKullaniciAdiSoyadi;
    private javax.swing.JPanel oyunPaneli;
    // End of variables declaration//GEN-END:variables
}
