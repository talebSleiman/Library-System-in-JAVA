
package projet301;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.UIManager;

public class PersonnelPage extends javax.swing.JFrame {
    public static int user;
    public String fname,lname;
    Connection con = null;
    Statement st = null;
    ResultSet rs=null;
    String url = "jdbc:mysql://localhost:3306/database301";
    String usr = "root";
    String mdp = "taleb@849523.";
    
    public PersonnelPage() {
        connecter();
        initComponents();
        this.setLocationRelativeTo(null);
    }
    public PersonnelPage(int userid){
        this.user=userid;
        connecter();
        userinfo(user);
        initComponents();
        this.setLocationRelativeTo(null);
    }
    private void userinfo(int user){  
    String requet="select * from personnel where id_personnel='"+user+"'";
    ResultSet rs1=null;
    try{
    Statement st1=con.createStatement();
    rs1=st1.executeQuery(requet);
    rs1.next();
    fname=rs1.getString("FIRST_NAME");
    lname=rs1.getString("LAST_NAME");
    }catch(SQLException ex)
    {System.out.println(ex.getMessage());}
  }
    private void connecter() {
        try {
            con = DriverManager.getConnection(url, usr, mdp);
            st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);        
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        ajouterA = new javax.swing.JButton();
        supprimerA = new javax.swing.JButton();
        modifierA = new javax.swing.JButton();
        logout = new javax.swing.JLabel();
        changepsswrd = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        reserver = new javax.swing.JButton();
        emprunter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Personnel Page");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Hello "+fname+" "+lname);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Gerer Adherant:");

        ajouterA.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ajouterA.setText("Ajouter");
        ajouterA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ajouterAMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ajouterAMouseExited(evt);
            }
        });
        ajouterA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouterAActionPerformed(evt);
            }
        });

        supprimerA.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        supprimerA.setText("Supprimer");
        supprimerA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                supprimerAMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                supprimerAMouseExited(evt);
            }
        });
        supprimerA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprimerAActionPerformed(evt);
            }
        });

        modifierA.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        modifierA.setText("Modifier");
        modifierA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                modifierAMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                modifierAMouseExited(evt);
            }
        });
        modifierA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifierAActionPerformed(evt);
            }
        });

        logout.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        logout.setText("Logout");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });

        changepsswrd.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        changepsswrd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        changepsswrd.setText("Change password");
        changepsswrd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changepsswrdMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Gerer Reservation:");

        reserver.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        reserver.setText("Reserver");
        reserver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reserverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reserverMouseExited(evt);
            }
        });
        reserver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reserverActionPerformed(evt);
            }
        });

        emprunter.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        emprunter.setText("Emprunter");
        emprunter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                emprunterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                emprunterMouseExited(evt);
            }
        });
        emprunter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emprunterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(changepsswrd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ajouterA, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(supprimerA, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(modifierA, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(reserver, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(emprunter, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changepsswrd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ajouterA, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(supprimerA, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modifierA, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jLabel3)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reserver, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emprunter, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        dispose();
        new LoginForm().setVisible(true);
    }//GEN-LAST:event_logoutMouseClicked

    private void ajouterAMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajouterAMouseEntered
        ajouterA.setBackground(Color.black);
        ajouterA.setForeground(Color.white);
    }//GEN-LAST:event_ajouterAMouseEntered

    private void ajouterAMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajouterAMouseExited
        ajouterA.setBackground(Color.white);
        ajouterA.setForeground(Color.black);
    }//GEN-LAST:event_ajouterAMouseExited

    private void supprimerAMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supprimerAMouseEntered
        supprimerA.setBackground(Color.black);
        supprimerA.setForeground(Color.white);
    }//GEN-LAST:event_supprimerAMouseEntered

    private void supprimerAMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supprimerAMouseExited
        supprimerA.setBackground(Color.white);
        supprimerA.setForeground(Color.black);
    }//GEN-LAST:event_supprimerAMouseExited

    private void modifierAMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modifierAMouseEntered
        modifierA.setBackground(Color.black);
        modifierA.setForeground(Color.white);
    }//GEN-LAST:event_modifierAMouseEntered

    private void modifierAMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modifierAMouseExited
        modifierA.setBackground(Color.white);
        modifierA.setForeground(Color.black);
    }//GEN-LAST:event_modifierAMouseExited

    private void changepsswrdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changepsswrdMouseClicked
        new ChangePasswordP(user).setVisible(true);
    }//GEN-LAST:event_changepsswrdMouseClicked

    private void ajouterAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterAActionPerformed
        new SubmitFormA().setVisible(true);
    }//GEN-LAST:event_ajouterAActionPerformed

    private void supprimerAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprimerAActionPerformed
        new DeleteFormA().setVisible(true);
    }//GEN-LAST:event_supprimerAActionPerformed

    private void modifierAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifierAActionPerformed
        new RechercherAdherant().setVisible(true);
    }//GEN-LAST:event_modifierAActionPerformed

    private void reserverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reserverMouseEntered
        reserver.setBackground(Color.black);
        reserver.setForeground(Color.white);
    }//GEN-LAST:event_reserverMouseEntered

    private void reserverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reserverMouseExited
        reserver.setBackground(Color.white);
        reserver.setForeground(Color.black);
    }//GEN-LAST:event_reserverMouseExited

    private void emprunterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emprunterMouseEntered
        emprunter.setBackground(Color.black);
        emprunter.setForeground(Color.white);
    }//GEN-LAST:event_emprunterMouseEntered

    private void emprunterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emprunterMouseExited
        emprunter.setBackground(Color.white);
        emprunter.setForeground(Color.black);
    }//GEN-LAST:event_emprunterMouseExited

    private void reserverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reserverActionPerformed
        new showReserver().setVisible(true);
    }//GEN-LAST:event_reserverActionPerformed

    private void emprunterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emprunterActionPerformed
        new showEmprunter().setVisible(true);
    }//GEN-LAST:event_emprunterActionPerformed

    public static void main(String args[]) {
        try {
           // UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersonnelPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ajouterA;
    private javax.swing.JLabel changepsswrd;
    private javax.swing.JButton emprunter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel logout;
    private javax.swing.JButton modifierA;
    private javax.swing.JButton reserver;
    private javax.swing.JButton supprimerA;
    // End of variables declaration//GEN-END:variables
}
