/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tripper;

import java.awt.geom.RoundRectangle2D;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class UserPage extends javax.swing.JFrame {

    /**
     * Creates new form LoadingSplash
     * @throws java.sql.SQLException
     */
    public UserPage() throws SQLException {
        initComponents();
        con = Tripper.getKoneksi();
        stat = con.createStatement();
        this.setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 80, 80));
        
        ButtonHover.setVisible(false);
        LogoutHover.setVisible(false);
        Bt2Hover.setVisible(false);
        Bt3Hover.setVisible(false);
        Notif_Paket.setVisible(false);
        Notif_Kosong.setVisible(false);
        Notif_Berhasil.setVisible(false);
        setProfile();
        initPaket();
    }

    Connection con;
    Statement stat;
    ResultSet rs;
    String sql;
    
    public void initPaket() throws SQLException {
        
        cbox.removeAllItems();
        sql = "SELECT * FROM db_paket WHERE 1";
        rs = stat.executeQuery(sql);
        while (rs.next()) {
            cbox.addItem(rs.getString("KodePaket"));
        }
    }
    
    public void setSelected() throws SQLException {
        sql = "SELECT * FROM db_paket WHERE KodePaket='" + cbox.getSelectedItem() + "'";
        rs = stat.executeQuery(sql);
        while (rs.next()) {
            namaPaket.setText(rs.getString("NamaPaket"));
            hargaPaket.setText("Rp. " + rs.getString("Harga"));
        }
        
    }
    
    public String setBulan(int i) {
        switch (i) {
            case 1:
                return "JAN";
            case 2:
                return "FEB";
            case 3:
                return "MAR";
            case 4:
                return "APR";
            case 5:
                return "MEI";
            case 6:
                return "JUN";
            case 7:
                return "JUL";
            case 8:
                return "AGU";
            case 9:
                return "SEP";
            case 10:
                return "OKT";
            case 11:
                return "NOV";
            case 12:
                return "DES";
        }
        return "a";
    }
    
    public String getKode(int i) {
        if (i < 10) {
            return "00" + i;
        } else if (i < 100) {
            return "0" + i;
        } else {
            return String.valueOf(i);
        }
    }
    
    public void setProfile() throws SQLException {
        sql = "SELECT * FROM db_profil WHERE Username='" + Tripper.getUsername() + "'";
        rs = stat.executeQuery(sql);
        if (rs.next()) {
            Nama.setText(rs.getString("Nama"));
            if (rs.getString("JK").equals("L")) {
                male.setVisible(true);
                female.setVisible(false);
            } else if (rs.getString("JK").equals("P")) {
                male.setVisible(false);
                female.setVisible(true);
            }
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

        LoadingSplash = new javax.swing.JPanel();
        Nama = new javax.swing.JLabel();
        Notif_Paket = new javax.swing.JLabel();
        Notif_Kosong = new javax.swing.JLabel();
        Notif_Berhasil = new javax.swing.JLabel();
        refresh = new javax.swing.JLabel();
        jumlah = new javax.swing.JTextField();
        hargaPaket = new javax.swing.JTextField();
        namaPaket = new javax.swing.JTextField();
        cbox = new javax.swing.JComboBox<>();
        female = new javax.swing.JLabel();
        male = new javax.swing.JLabel();
        Bt3Hover = new javax.swing.JLabel();
        Bt3 = new javax.swing.JLabel();
        Bt1Hover = new javax.swing.JLabel();
        Bt2Hover = new javax.swing.JLabel();
        Bt2 = new javax.swing.JLabel();
        LogoutHover = new javax.swing.JLabel();
        Logout = new javax.swing.JLabel();
        ButtonHover = new javax.swing.JLabel();
        Button = new javax.swing.JLabel();
        MiniButton = new javax.swing.JLabel();
        CloseButton = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(435, 844));
        setUndecorated(true);

        LoadingSplash.setMaximumSize(new java.awt.Dimension(435, 844));
        LoadingSplash.setMinimumSize(new java.awt.Dimension(435, 844));
        LoadingSplash.setPreferredSize(new java.awt.Dimension(435, 844));
        LoadingSplash.setLayout(null);

        Nama.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Nama.setForeground(new java.awt.Color(0, 0, 0));
        Nama.setText("a");
        LoadingSplash.add(Nama);
        Nama.setBounds(90, 100, 300, 32);

        Notif_Paket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Menu1_Paket.png"))); // NOI18N
        LoadingSplash.add(Notif_Paket);
        Notif_Paket.setBounds(115, 475, 208, 16);

        Notif_Kosong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Menu1_JumlahKosong.png"))); // NOI18N
        LoadingSplash.add(Notif_Kosong);
        Notif_Kosong.setBounds(85, 475, 262, 20);

        Notif_Berhasil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Menu1_Berhasil.png"))); // NOI18N
        LoadingSplash.add(Notif_Berhasil);
        Notif_Berhasil.setBounds(115, 475, 198, 16);

        refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/refresh.png"))); // NOI18N
        refresh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshMouseClicked(evt);
            }
        });
        LoadingSplash.add(refresh);
        refresh.setBounds(390, 240, 27, 27);

        jumlah.setBackground(new java.awt.Color(255, 255, 255));
        jumlah.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jumlah.setForeground(new java.awt.Color(0, 0, 0));
        jumlah.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        LoadingSplash.add(jumlah);
        jumlah.setBounds(60, 440, 310, 30);

        hargaPaket.setEditable(false);
        hargaPaket.setBackground(new java.awt.Color(255, 255, 255));
        hargaPaket.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        hargaPaket.setForeground(new java.awt.Color(0, 0, 0));
        hargaPaket.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        LoadingSplash.add(hargaPaket);
        hargaPaket.setBounds(60, 370, 310, 30);

        namaPaket.setEditable(false);
        namaPaket.setBackground(new java.awt.Color(255, 255, 255));
        namaPaket.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        namaPaket.setForeground(new java.awt.Color(0, 0, 0));
        namaPaket.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        LoadingSplash.add(namaPaket);
        namaPaket.setBounds(60, 300, 310, 30);

        cbox.setBackground(new java.awt.Color(255, 255, 255));
        cbox.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbox.setForeground(new java.awt.Color(0, 0, 0));
        cbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbox.setBorder(null);
        cbox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboxMouseClicked(evt);
            }
        });
        cbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxActionPerformed(evt);
            }
        });
        LoadingSplash.add(cbox);
        cbox.setBounds(60, 235, 310, 35);

        female.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/female.png"))); // NOI18N
        LoadingSplash.add(female);
        female.setBounds(30, 70, 45, 61);

        male.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/male.png"))); // NOI18N
        LoadingSplash.add(male);
        male.setBounds(30, 70, 45, 61);

        Bt3Hover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Bg3Hover.png"))); // NOI18N
        Bt3Hover.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bt3Hover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Bt3HoverMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Bt3HoverMouseExited(evt);
            }
        });
        LoadingSplash.add(Bt3Hover);
        Bt3Hover.setBounds(293, 720, 90, 90);

        Bt3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Bg3.png"))); // NOI18N
        Bt3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Bt3MouseEntered(evt);
            }
        });
        LoadingSplash.add(Bt3);
        Bt3.setBounds(293, 720, 90, 90);

        Bt1Hover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Bg1Hover.png"))); // NOI18N
        Bt1Hover.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        LoadingSplash.add(Bt1Hover);
        Bt1Hover.setBounds(55, 720, 90, 90);

        Bt2Hover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Bg2Hover.png"))); // NOI18N
        Bt2Hover.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bt2Hover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Bt2HoverMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Bt2HoverMouseExited(evt);
            }
        });
        LoadingSplash.add(Bt2Hover);
        Bt2Hover.setBounds(174, 720, 90, 90);

        Bt2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Bg2.png"))); // NOI18N
        Bt2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Bt2MouseEntered(evt);
            }
        });
        LoadingSplash.add(Bt2);
        Bt2.setBounds(174, 720, 90, 90);

        LogoutHover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LogoutHover.png"))); // NOI18N
        LogoutHover.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LogoutHover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutHoverMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LogoutHoverMouseExited(evt);
            }
        });
        LoadingSplash.add(LogoutHover);
        LogoutHover.setBounds(300, 60, 114, 29);

        Logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LogoutButton.png"))); // NOI18N
        Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LogoutMouseEntered(evt);
            }
        });
        LoadingSplash.add(Logout);
        Logout.setBounds(300, 60, 114, 29);

        ButtonHover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/OrderHover.png"))); // NOI18N
        ButtonHover.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonHover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonHoverMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ButtonHoverMouseExited(evt);
            }
        });
        LoadingSplash.add(ButtonHover);
        ButtonHover.setBounds(40, 500, 353, 64);

        Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/OrderButton.png"))); // NOI18N
        Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ButtonMouseEntered(evt);
            }
        });
        LoadingSplash.add(Button);
        Button.setBounds(40, 500, 353, 64);

        MiniButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MiniButton.png"))); // NOI18N
        MiniButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MiniButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MiniButtonMouseClicked(evt);
            }
        });
        LoadingSplash.add(MiniButton);
        MiniButton.setBounds(340, 20, 33, 33);

        CloseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CloseButton.png"))); // NOI18N
        CloseButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CloseButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseButtonMouseClicked(evt);
            }
        });
        LoadingSplash.add(CloseButton);
        CloseButton.setBounds(380, 20, 33, 33);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Menu1BG.png"))); // NOI18N
        LoadingSplash.add(Background);
        Background.setBounds(0, 0, 435, 844);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoadingSplash, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoadingSplash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MiniButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MiniButtonMouseClicked
        this.setState(1);
    }//GEN-LAST:event_MiniButtonMouseClicked

    private void CloseButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseButtonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CloseButtonMouseClicked

    private void ButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonMouseEntered
        ButtonHover.setVisible(true);
        Button.setVisible(false);
    }//GEN-LAST:event_ButtonMouseEntered

    private void ButtonHoverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonHoverMouseExited
        ButtonHover.setVisible(false);
        Button.setVisible(true);
    }//GEN-LAST:event_ButtonHoverMouseExited

    private void ButtonHoverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonHoverMouseClicked
        if (namaPaket.getText().equals("")) {
            Notif_Paket.setVisible(true);
            Notif_Berhasil.setVisible(false);
            Notif_Kosong.setVisible(false);
        } else if (jumlah.getText().equals("")) {
            Notif_Paket.setVisible(false);
            Notif_Berhasil.setVisible(false);
            Notif_Kosong.setVisible(true);
        } else {
            
            try {
                String nama = null;
                sql = "SELECT * FROM db_profil WHERE Username='" + Tripper.getUsername() + "'";
                rs = stat.executeQuery(sql);
                if (rs.next()) {
                    nama = rs.getString("Nama");
                }
                String kode = cbox.getSelectedItem().toString();
            
                Date date = new Date();
                Calendar cal = Calendar.getInstance();
                cal.setTime(date);
                int month = cal.get(Calendar.MONTH);
                int day = cal.get(Calendar.DATE);

                String tgl;
                String bulan = setBulan(month + 1);
                if (day < 10) {
                    tgl = "0" + day;
                } else {
                    tgl = String.valueOf(day);
                }
                String pkt = kode + "/" + bulan + tgl + "/";
                int i = 1;
                String sqlCek = "SELECT * FROM db_order WHERE Invoice LIKE'%" + pkt + "%'";
                ResultSet cek = stat.executeQuery(sqlCek);
                while (cek.next()) {
                    if (cek.getString("Invoice").equals(pkt + getKode(i))) {
                        i++;
                    }
                }
                pkt += getKode(i);
                
                int hrg = Integer.valueOf(jumlah.getText()) * Integer.valueOf(hargaPaket.getText().substring(4));
                

                sql = "INSERT INTO db_order VALUES ('" + pkt + "','" + nama + "','" + cbox.getSelectedItem().toString() + "','" + jumlah.getText() + "','" + hrg + "','" + Tripper.getUsername() + "')";
                java.sql.PreparedStatement pst = con.prepareStatement(sql);
                pst.execute();
                Notif_Paket.setVisible(false);
                Notif_Berhasil.setVisible(true);
                Notif_Kosong.setVisible(false);
                
            } catch (SQLException ex) {
                Logger.getLogger(UserPage.class.getName()).log(Level.SEVERE, null, ex);
            }
               
        }
    }//GEN-LAST:event_ButtonHoverMouseClicked

    private void LogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseEntered
        LogoutHover.setVisible(true);
        Logout.setVisible(false);
    }//GEN-LAST:event_LogoutMouseEntered

    private void LogoutHoverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutHoverMouseExited
        LogoutHover.setVisible(false);
        Logout.setVisible(true);
    }//GEN-LAST:event_LogoutHoverMouseExited

    private void LogoutHoverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutHoverMouseClicked
        Login login;
        try {
            login = new Login();
            login.setVisible(true);
            login.pack();
            login.setLocationRelativeTo(null);
            login.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(UserPage.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }//GEN-LAST:event_LogoutHoverMouseClicked

    private void Bt2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bt2MouseEntered
        Bt2.setVisible(false);
        Bt2Hover.setVisible(true);
    }//GEN-LAST:event_Bt2MouseEntered

    private void Bt2HoverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bt2HoverMouseExited
        Bt2.setVisible(true);
        Bt2Hover.setVisible(false);
    }//GEN-LAST:event_Bt2HoverMouseExited

    private void Bt2HoverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bt2HoverMouseClicked
        UserPage2 lempar;
        try {
            lempar = new UserPage2();
            lempar.setVisible(true);
            lempar.pack();
            lempar.setLocationRelativeTo(null);
            lempar.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(UserPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Bt2HoverMouseClicked

    private void Bt3HoverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bt3HoverMouseClicked
        UserPage3 lempar;
        try {
            lempar = new UserPage3();
            lempar.setVisible(true);
            lempar.pack();
            lempar.setLocationRelativeTo(null);
            lempar.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(UserPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Bt3HoverMouseClicked

    private void Bt3HoverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bt3HoverMouseExited
        Bt3.setVisible(true);
        Bt3Hover.setVisible(false);
    }//GEN-LAST:event_Bt3HoverMouseExited

    private void Bt3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bt3MouseEntered
        Bt3.setVisible(false);
        Bt3Hover.setVisible(true);
    }//GEN-LAST:event_Bt3MouseEntered

    private void cboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboxMouseClicked

    }//GEN-LAST:event_cboxMouseClicked

    private void cboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxActionPerformed

    }//GEN-LAST:event_cboxActionPerformed

    private void refreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseClicked
        try {
            setSelected();
        } catch (SQLException ex) {
            Logger.getLogger(UserPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_refreshMouseClicked

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
            java.util.logging.Logger.getLogger(UserPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new UserPage().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(UserPage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Bt1Hover;
    private javax.swing.JLabel Bt2;
    private javax.swing.JLabel Bt2Hover;
    private javax.swing.JLabel Bt3;
    private javax.swing.JLabel Bt3Hover;
    private javax.swing.JLabel Button;
    private javax.swing.JLabel ButtonHover;
    private javax.swing.JLabel CloseButton;
    private javax.swing.JPanel LoadingSplash;
    private javax.swing.JLabel Logout;
    private javax.swing.JLabel LogoutHover;
    private javax.swing.JLabel MiniButton;
    private javax.swing.JLabel Nama;
    private javax.swing.JLabel Notif_Berhasil;
    private javax.swing.JLabel Notif_Kosong;
    private javax.swing.JLabel Notif_Paket;
    private javax.swing.JComboBox<String> cbox;
    private javax.swing.JLabel female;
    private javax.swing.JTextField hargaPaket;
    private javax.swing.JTextField jumlah;
    private javax.swing.JLabel male;
    private javax.swing.JTextField namaPaket;
    private javax.swing.JLabel refresh;
    // End of variables declaration//GEN-END:variables
}
