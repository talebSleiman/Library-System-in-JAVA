
package projet301;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.UIManager;

public class AdherantPage extends javax.swing.JFrame {
    public static int user;
    public String fname,lname;
    Connection con = null;
    Statement st = null;
    ResultSet rs=null;
    String url = "jdbc:mysql://localhost:3306/database301";
    String usr = "root";
    String mdp = "taleb@849523.";
    
    public AdherantPage() {
        connecter();
        initComponents();
        this.setLocationRelativeTo(null);
    }
        public AdherantPage(int userid){
        this.user=userid;
        connecter();
        userinfo(user);
        initComponents();
        this.setLocationRelativeTo(null);
    }
    private void userinfo(int user){  
    String requet="select * from adherant where id_adherant='"+user+"'";
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

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jLabel1 = new javax.swing.JLabel();
        search = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        logout = new javax.swing.JLabel();
        change = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        showE = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        showR = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        jMenu1.setText("jMenu1");

        jMenuItem2.setText("jMenuItem2");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Adherant Page");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Hello "+fname+" "+lname);

        search.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        search.setText("Search");
        search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchMouseExited(evt);
            }
        });
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        logout.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        logout.setText("Logout");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });

        change.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        change.setText("Change password");
        change.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Pour reserver ou emprunter un media Click sur le boutton Search:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Pour voir le media qui a emprunter Click sur le boutton Show Emprnter:");

        showE.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        showE.setText("Show Emprunter");
        showE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                showEMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                showEMouseExited(evt);
            }
        });
        showE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showEActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Pour voir le media qui a reserver Click sur le boutton Show Reserver:");

        showR.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        showR.setText("Show Reserver");
        showR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                showRMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                showRMouseExited(evt);
            }
        });
        showR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(change)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logout)
                .addContainerGap())
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(showE)
                    .addComponent(jLabel4)
                    .addComponent(showR))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(change)
                    .addComponent(logout))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(showE, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(showR, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        new SearchMedia(user).setVisible(true);
    }//GEN-LAST:event_searchActionPerformed

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        dispose();
        new LoginForm().setVisible(true);
    }//GEN-LAST:event_logoutMouseClicked

    private void changeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changeMouseClicked
        new ChangePasswordA(user).setVisible(true);
    }//GEN-LAST:event_changeMouseClicked

    private void searchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseEntered
        search.setBackground(Color.black);
        search.setForeground(Color.white);
    }//GEN-LAST:event_searchMouseEntered

    private void searchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseExited
        search.setBackground(Color.white);
        search.setForeground(Color.black);
    }//GEN-LAST:event_searchMouseExited

    private void showEMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showEMouseEntered
        showE.setBackground(Color.black);
        showE.setForeground(Color.white);
    }//GEN-LAST:event_showEMouseEntered

    private void showEMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showEMouseExited
        showE.setBackground(Color.white);
        showE.setForeground(Color.black);
    }//GEN-LAST:event_showEMouseExited

    private void showEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showEActionPerformed
        new showE(user).setVisible(true);
    }//GEN-LAST:event_showEActionPerformed

    private void showRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showRActionPerformed
        new showR(user).setVisible(true);
    }//GEN-LAST:event_showRActionPerformed

    private void showRMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showRMouseEntered
        showR.setBackground(Color.black);
        showR.setForeground(Color.white);
    }//GEN-LAST:event_showRMouseEntered

    private void showRMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showRMouseExited
        showR.setBackground(Color.white);
        showR.setForeground(Color.black);
    }//GEN-LAST:event_showRMouseExited

    public static void main(String args[]) {
        try {
           // UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdherantPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel change;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel logout;
    private javax.swing.JButton search;
    private javax.swing.JButton showE;
    private javax.swing.JButton showR;
    // End of variables declaration//GEN-END:variables
}
