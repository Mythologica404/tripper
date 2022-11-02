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
public class UserPage3 extends javax.swing.JFrame {

    /**
     * Creates new form LoadingSplash
     *
     * @throws java.sql.SQLException
     */
    public UserPage3() throws SQLException {
        initComponents();
        con = Tripper.getKoneksi();
        stat = con.createStatement();
        this.setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 80, 80));

        ButtonHover.setVisible(false);
        LogoutHover.setVisible(false);
        Bt2Hover.setVisible(false);
        Bt1Hover.setVisible(false);
        Notif_Email.setVisible(false);
        Notif_Kosong.setVisible(false);
        Notif_Berhasil.setVisible(false);
        setProfile();
        getProfile();
    }

    Connection con;
    Statement stat;
    ResultSet rs;
    String sql;

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
    
    public void getProfile() throws SQLException {
        sql = "SELECT * FROM db_profil WHERE Username='" + Tripper.getUsername() + "'";
        rs = stat.executeQuery(sql);
        if (rs.next()) {
            nama.setText(rs.getString("Nama"));
            noHP.setText(rs.getString("NoHP"));
            Email.setText(rs.getString("Email"));
            String kel = rs.getString("JK");
            if (kel.equals("P")) {
                RadioP.setSelected(true);
            } else {
                RadioL.setSelected(true);
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

        kelamin = new javax.swing.ButtonGroup();
        LoadingSplash = new javax.swing.JPanel();
        Notif_Berhasil = new javax.swing.JLabel();
        Notif_Email = new javax.swing.JLabel();
        Notif_Kosong = new javax.swing.JLabel();
        RadioP = new javax.swing.JRadioButton();
        RadioL = new javax.swing.JRadioButton();
        Nama = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        noHP = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        female = new javax.swing.JLabel();
        male = new javax.swing.JLabel();
        Bt3Hover = new javax.swing.JLabel();
        Bt1Hover = new javax.swing.JLabel();
        Bt1 = new javax.swing.JLabel();
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

        Notif_Berhasil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Menu3_Berhasil.png"))); // NOI18N
        LoadingSplash.add(Notif_Berhasil);
        Notif_Berhasil.setBounds(131, 475, 172, 16);

        Notif_Email.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Menu3_Email.png"))); // NOI18N
        LoadingSplash.add(Notif_Email);
        Notif_Email.setBounds(120, 475, 194, 20);

        Notif_Kosong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Menu3_Kosong.png"))); // NOI18N
        LoadingSplash.add(Notif_Kosong);
        Notif_Kosong.setBounds(120, 475, 192, 20);

        RadioP.setBackground(new java.awt.Color(255, 255, 255));
        kelamin.add(RadioP);
        RadioP.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        RadioP.setForeground(new java.awt.Color(0, 0, 0));
        RadioP.setText("Perempuan");
        RadioP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LoadingSplash.add(RadioP);
        RadioP.setBounds(223, 440, 122, 28);

        RadioL.setBackground(new java.awt.Color(255, 255, 255));
        kelamin.add(RadioL);
        RadioL.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        RadioL.setForeground(new java.awt.Color(0, 0, 0));
        RadioL.setText("Laki-Laki");
        RadioL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LoadingSplash.add(RadioL);
        RadioL.setBounds(90, 440, 111, 28);

        Nama.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Nama.setForeground(new java.awt.Color(0, 0, 0));
        Nama.setText("a");
        LoadingSplash.add(Nama);
        Nama.setBounds(90, 100, 300, 32);

        Email.setBackground(new java.awt.Color(255, 255, 255));
        Email.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Email.setForeground(new java.awt.Color(0, 0, 0));
        Email.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        LoadingSplash.add(Email);
        Email.setBounds(60, 370, 310, 30);

        noHP.setBackground(new java.awt.Color(255, 255, 255));
        noHP.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        noHP.setForeground(new java.awt.Color(0, 0, 0));
        noHP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        LoadingSplash.add(noHP);
        noHP.setBounds(60, 300, 310, 30);

        nama.setBackground(new java.awt.Color(255, 255, 255));
        nama.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nama.setForeground(new java.awt.Color(0, 0, 0));
        nama.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        LoadingSplash.add(nama);
        nama.setBounds(60, 235, 310, 30);

        female.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/female.png"))); // NOI18N
        LoadingSplash.add(female);
        female.setBounds(30, 70, 45, 61);

        male.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/male.png"))); // NOI18N
        LoadingSplash.add(male);
        male.setBounds(30, 70, 45, 61);

        Bt3Hover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Bg3Hover.png"))); // NOI18N
        Bt3Hover.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        LoadingSplash.add(Bt3Hover);
        Bt3Hover.setBounds(293, 720, 90, 90);

        Bt1Hover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Bg1Hover.png"))); // NOI18N
        Bt1Hover.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bt1Hover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Bt1HoverMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Bt1HoverMouseExited(evt);
            }
        });
        LoadingSplash.add(Bt1Hover);
        Bt1Hover.setBounds(55, 720, 90, 90);

        Bt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Bg1.png"))); // NOI18N
        Bt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Bt1MouseEntered(evt);
            }
        });
        LoadingSplash.add(Bt1);
        Bt1.setBounds(55, 720, 90, 90);

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

        ButtonHover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/EditHover.png"))); // NOI18N
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

        Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Edit.png"))); // NOI18N
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

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Menu3BG.png"))); // NOI18N
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
        if (noHP.getText().equals("") || nama.getText().equals("") || Email.getText().equals("") || !(RadioL.isSelected() || RadioP.isSelected())) {
            Notif_Email.setVisible(false);
            Notif_Kosong.setVisible(true);
            Notif_Berhasil.setVisible(false);
        } else {
            try {
                sql = "SELECT * FROM db_profil WHERE Username='" + Tripper.getUsername() + "'";
                rs = stat.executeQuery(sql);
                String kel = "a";
                if (RadioL.isSelected()) {
                    kel = "L";
                } else if (RadioP.isSelected()) {
                    kel = "P";
                }
                sql = "UPDATE db_profil SET Nama='" + nama.getText() + "',NoHP='" + noHP.getText() + "',Email='" + Email.getText() + "',JK='" + kel + "' WHERE Username='" + Tripper.getUsername() + "'";
                java.sql.PreparedStatement pstAnjay2 = con.prepareStatement(sql);
                pstAnjay2.execute();

                Notif_Email.setVisible(false);
                Notif_Kosong.setVisible(false);
                Notif_Berhasil.setVisible(true);
                setProfile();
            } catch (SQLException ex) {
                Notif_Email.setVisible(true);
                Notif_Kosong.setVisible(false);
                Notif_Berhasil.setVisible(false);
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
            Logger.getLogger(UserPage3.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_LogoutHoverMouseClicked

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
            Logger.getLogger(UserPage3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Bt2HoverMouseClicked

    private void Bt1HoverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bt1HoverMouseClicked
        UserPage lempar;
        try {
            lempar = new UserPage();
            lempar.setVisible(true);
            lempar.pack();
            lempar.setLocationRelativeTo(null);
            lempar.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(UserPage3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Bt1HoverMouseClicked

    private void Bt1HoverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bt1HoverMouseExited
        Bt1.setVisible(true);
        Bt1Hover.setVisible(false);
    }//GEN-LAST:event_Bt1HoverMouseExited

    private void Bt1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bt1MouseEntered
        Bt1.setVisible(false);
        Bt1Hover.setVisible(true);
    }//GEN-LAST:event_Bt1MouseEntered

    private void Bt2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bt2MouseEntered
        Bt2.setVisible(false);
        Bt2Hover.setVisible(true);
    }//GEN-LAST:event_Bt2MouseEntered

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
            java.util.logging.Logger.getLogger(UserPage3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserPage3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserPage3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserPage3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                    new UserPage3().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(UserPage3.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Bt1;
    private javax.swing.JLabel Bt1Hover;
    private javax.swing.JLabel Bt2;
    private javax.swing.JLabel Bt2Hover;
    private javax.swing.JLabel Bt3Hover;
    private javax.swing.JLabel Button;
    private javax.swing.JLabel ButtonHover;
    private javax.swing.JLabel CloseButton;
    private javax.swing.JTextField Email;
    private javax.swing.JPanel LoadingSplash;
    private javax.swing.JLabel Logout;
    private javax.swing.JLabel LogoutHover;
    private javax.swing.JLabel MiniButton;
    private javax.swing.JLabel Nama;
    private javax.swing.JLabel Notif_Berhasil;
    private javax.swing.JLabel Notif_Email;
    private javax.swing.JLabel Notif_Kosong;
    private javax.swing.JRadioButton RadioL;
    private javax.swing.JRadioButton RadioP;
    private javax.swing.JLabel female;
    private javax.swing.ButtonGroup kelamin;
    private javax.swing.JLabel male;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField noHP;
    // End of variables declaration//GEN-END:variables
}