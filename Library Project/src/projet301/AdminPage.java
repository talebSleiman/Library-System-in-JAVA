package projet301;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.UIManager;

public class AdminPage extends javax.swing.JFrame {

    public static int user;
    public String fname, lname;
    Connection con = null;
    Statement st = null;
    ResultSet rs = null;
    String url = "jdbc:mysql://localhost:3306/database301";
    String usr = "root";
    String mdp = "password";

    public AdminPage() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public AdminPage(int userid) {
        this.user = userid;
        connecter();
        userinfo(user);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    private void userinfo(int user) {
        String requet = "select * from admin where id_admin='" + user + "'";
        ResultSet rs1 = null;
        try {
            Statement st1 = con.createStatement();
            rs1 = st1.executeQuery(requet);
            rs1.next();
            fname = rs1.getString("FIRST_NAME");
            lname = rs1.getString("LAST_NAME");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
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

        titre = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        ajouterP = new javax.swing.JButton();
        supprimerP = new javax.swing.JButton();
        modifierP = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        addmedia = new javax.swing.JButton();
        modifiermedia = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Page");

        titre.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        titre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titre.setText("Hello "+fname+" "+lname);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Gerer Personnel:");

        ajouterP.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ajouterP.setText("Ajouter");
        ajouterP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ajouterPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ajouterPMouseExited(evt);
            }
        });
        ajouterP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouterPActionPerformed(evt);
            }
        });

        supprimerP.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        supprimerP.setText("Supprimer");
        supprimerP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                supprimerPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                supprimerPMouseExited(evt);
            }
        });
        supprimerP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprimerPActionPerformed(evt);
            }
        });

        modifierP.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        modifierP.setText("Modifier");
        modifierP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                modifierPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                modifierPMouseExited(evt);
            }
        });
        modifierP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifierPActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Gerer Media:");

        addmedia.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        addmedia.setText("Ajouter");
        addmedia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addmediaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addmediaMouseExited(evt);
            }
        });
        addmedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addmediaActionPerformed(evt);
            }
        });

        modifiermedia.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        modifiermedia.setText("Modifier");
        modifiermedia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                modifiermediaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                modifiermediaMouseExited(evt);
            }
        });
        modifiermedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifiermediaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Logout");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ajouterP, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addmedia, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(supprimerP)
                                .addGap(28, 28, 28)
                                .addComponent(modifierP, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(modifiermedia, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(titre, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(jLabel3)
                        .addGap(9, 9, 9)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(titre, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ajouterP, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(supprimerP, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modifierP, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addmedia, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modifiermedia, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ajouterPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterPActionPerformed
        new SubmitFormP().setVisible(true);
    }//GEN-LAST:event_ajouterPActionPerformed

    private void supprimerPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprimerPActionPerformed
        new DeleteFormP().setVisible(true);
    }//GEN-LAST:event_supprimerPActionPerformed

    private void addmediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addmediaActionPerformed
        new AddMedia().setVisible(true);
    }//GEN-LAST:event_addmediaActionPerformed

    private void modifiermediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifiermediaActionPerformed
        new RechercherMedia().setVisible(true);
    }//GEN-LAST:event_modifiermediaActionPerformed

    private void modifierPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifierPActionPerformed
        new RechercherPersonnel().setVisible(true);
    }//GEN-LAST:event_modifierPActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        dispose();
        new LoginForm().setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void ajouterPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajouterPMouseEntered
        ajouterP.setBackground(Color.black);
        ajouterP.setForeground(Color.white);
    }//GEN-LAST:event_ajouterPMouseEntered

    private void supprimerPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supprimerPMouseEntered
        supprimerP.setBackground(Color.black);
        supprimerP.setForeground(Color.white);
    }//GEN-LAST:event_supprimerPMouseEntered

    private void modifierPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modifierPMouseEntered
        modifierP.setBackground(Color.black);
        modifierP.setForeground(Color.white);
    }//GEN-LAST:event_modifierPMouseEntered

    private void ajouterPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajouterPMouseExited
        ajouterP.setBackground(Color.white);
        ajouterP.setForeground(Color.black);
    }//GEN-LAST:event_ajouterPMouseExited

    private void supprimerPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supprimerPMouseExited
        supprimerP.setBackground(Color.white);
        supprimerP.setForeground(Color.black);
    }//GEN-LAST:event_supprimerPMouseExited

    private void modifierPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modifierPMouseExited
        modifierP.setBackground(Color.white);
        modifierP.setForeground(Color.black);
    }//GEN-LAST:event_modifierPMouseExited

    private void addmediaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addmediaMouseEntered
        addmedia.setBackground(Color.black);
        addmedia.setForeground(Color.white);
    }//GEN-LAST:event_addmediaMouseEntered

    private void addmediaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addmediaMouseExited
        addmedia.setBackground(Color.white);
        addmedia.setForeground(Color.black);
    }//GEN-LAST:event_addmediaMouseExited

    private void modifiermediaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modifiermediaMouseEntered
        modifiermedia.setBackground(Color.black);
        modifiermedia.setForeground(Color.white);
    }//GEN-LAST:event_modifiermediaMouseEntered

    private void modifiermediaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modifiermediaMouseExited
        modifiermedia.setBackground(Color.white);
        modifiermedia.setForeground(Color.black);
    }//GEN-LAST:event_modifiermediaMouseExited

    public static void main(String args[]) {
        try {
            //UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addmedia;
    private javax.swing.JButton ajouterP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton modifierP;
    private javax.swing.JButton modifiermedia;
    private javax.swing.JButton supprimerP;
    private javax.swing.JLabel titre;
    // End of variables declaration//GEN-END:variables
}
