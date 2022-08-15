package projet301;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class LoginForm extends javax.swing.JFrame {

    Connection con = null;
    Statement st = null;
    ResultSet rs1 = null;
    ResultSet rs2 = null;
    ResultSet rs3 = null;
    String url = "jdbc:mysql://localhost:3306/database301";
    String usr = "root";
    String mdp = "taleb@849523.";
    public int userid;

    private void connecter() {
        try {
            con = DriverManager.getConnection(url, usr, mdp);
            st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);        
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public LoginForm() {
        connecter();
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Jemail = new javax.swing.JLabel();
        Jpsswrd = new javax.swing.JLabel();
        TextUser = new javax.swing.JTextField();
        Buttonlogin = new javax.swing.JButton();
        resetbutton = new javax.swing.JButton();
        Textpsswrd = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Page");
        setBackground(new java.awt.Color(255, 255, 255));
        setLocation(new java.awt.Point(300, 300));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Login:");
        jLabel1.setMaximumSize(new java.awt.Dimension(50, 19));
        jLabel1.setName(""); // NOI18N

        Jemail.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Jemail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jemail.setText("Email :");

        Jpsswrd.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Jpsswrd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jpsswrd.setText("Password :");

        Buttonlogin.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Buttonlogin.setText("Login");
        Buttonlogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ButtonloginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ButtonloginMouseExited(evt);
            }
        });
        Buttonlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonloginActionPerformed(evt);
            }
        });

        resetbutton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        resetbutton.setText("Reset");
        resetbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                resetbuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                resetbuttonMouseExited(evt);
            }
        });
        resetbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Buttonlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                .addComponent(resetbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Jemail, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Jpsswrd, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Textpsswrd, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                                    .addComponent(TextUser)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jemail, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jpsswrd, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Textpsswrd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resetbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Buttonlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void Clear() {
        TextUser.setText("");
        Textpsswrd.setText("");
    }
    private void ButtonloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonloginActionPerformed
        String email = TextUser.getText();
        String psswrd = Textpsswrd.getText();
        String requet1 = "select * from admin where email ='" + email + "' and password ='" + psswrd + "'";
        String requet2 = "select * from personnel where email ='" + email + "' and password ='" + psswrd + "'";
        String requet3 = "select * from adherant where email ='" + email + "' and password ='" + psswrd + "'";
        try {
            Statement pst1 = con.createStatement();
            rs1 = pst1.executeQuery(requet1);
            Statement pst2 = con.createStatement();
            rs2 = pst2.executeQuery(requet2);
            Statement pst3 = con.createStatement();
            rs3 = pst3.executeQuery(requet3);
            if (rs1.next()) {
                userid=rs1.getInt("Id_admin");
                dispose();
                new AdminPage(userid).setVisible(true);
            } else{        
                if (rs2.next()) {
                    userid=rs2.getInt("Id_personnel");
                    dispose();
                    new PersonnelPage(userid).setVisible(true);
                 }else{ 
                if (rs3.next()) {
                userid=rs3.getInt("Id_adherant");
                dispose();
                new AdherantPage(userid).setVisible(true);
                }else{ 
                Clear();
                JOptionPane.showMessageDialog(this, "Email or Password incorrect");
                }
                }}
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_ButtonloginActionPerformed

    private void resetbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbuttonActionPerformed
        Clear();
    }//GEN-LAST:event_resetbuttonActionPerformed

    private void ButtonloginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonloginMouseEntered
        Buttonlogin.setBackground(Color.black);
        Buttonlogin.setForeground(Color.white);
    }//GEN-LAST:event_ButtonloginMouseEntered

    private void resetbuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetbuttonMouseEntered
        resetbutton.setBackground(Color.black);
        resetbutton.setForeground(Color.white);
    }//GEN-LAST:event_resetbuttonMouseEntered

    private void ButtonloginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonloginMouseExited
        Buttonlogin.setBackground(Color.white);
        Buttonlogin.setForeground(Color.black);
    }//GEN-LAST:event_ButtonloginMouseExited

    private void resetbuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetbuttonMouseExited
        resetbutton.setBackground(Color.white);
        resetbutton.setForeground(Color.black);
    }//GEN-LAST:event_resetbuttonMouseExited


    public static void main(String args[]) {
        try {
           // UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buttonlogin;
    private javax.swing.JLabel Jemail;
    private javax.swing.JLabel Jpsswrd;
    private javax.swing.JTextField TextUser;
    private javax.swing.JPasswordField Textpsswrd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton resetbutton;
    // End of variables declaration//GEN-END:variables
}
