
package projet301;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.UIManager;


public class updateMedia extends javax.swing.JFrame {
    public static int media;
    Connection con = null;
    Statement st = null;
    ResultSet rs=null;
    ResultSet rs1 =null;
    String url = "jdbc:mysql://localhost:3306/database301";
    String usr = "root";
    String mdp = "taleb@849523.";
    public String vname,vtype,vcopy;

    public updateMedia() {
        connecter();
        initComponents();
        this.setLocationRelativeTo(null);
    }
    public updateMedia(int b){
        this.media=b;
        connecter();
        initComponents();
        mediainfo(media);
        this.setLocationRelativeTo(null);
    }
    private void mediainfo(int media){
    String requet="select * from media where id_media='"+media+"'";
    ResultSet rs1=null;
    try{
    Statement st1=con.createStatement();
    rs1=st1.executeQuery(requet);
    rs1.next();
    vname=rs1.getString("NAME");
    vtype=rs1.getString("TYPE");
    vcopy=rs1.getString("NBR_COPY");
    nametxt.setText(vname);
    typetxt.setText(vtype);
    copytxt.setText(vcopy);
    nametxt.setEnabled(false);
    typetxt.setEnabled(false);
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
        name = new javax.swing.JLabel();
        nametxt = new javax.swing.JTextField();
        type = new javax.swing.JLabel();
        typetxt = new javax.swing.JTextField();
        copy = new javax.swing.JLabel();
        copytxt = new javax.swing.JTextField();
        update = new javax.swing.JButton();
        cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Update Media Info");
        setLocation(new java.awt.Point(300, 300));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Media Info");

        name.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name.setText("Name:");

        type.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        type.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        type.setText("Type:");

        copy.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        copy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        copy.setText("Quantite:");

        update.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        update.setText("Update");
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateMouseExited(evt);
            }
        });
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        cancel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cancel.setText("Cancel");
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancelMouseExited(evt);
            }
        });
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(copy, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(typetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(copytxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name)
                    .addComponent(nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(type)
                    .addComponent(typetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(copy)
                    .addComponent(copytxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        dispose();
    }//GEN-LAST:event_cancelActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        if(updatemedia() == true);
        dispose();
    }//GEN-LAST:event_updateActionPerformed

    private void updateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseEntered
        update.setBackground(Color.black);
        update.setForeground(Color.white);
    }//GEN-LAST:event_updateMouseEntered

    private void cancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseEntered
        cancel.setBackground(Color.black);
        cancel.setForeground(Color.white);
    }//GEN-LAST:event_cancelMouseEntered

    private void cancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseExited
        cancel.setBackground(Color.white);
        cancel.setForeground(Color.black);
    }//GEN-LAST:event_cancelMouseExited

    private void updateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseExited
        update.setBackground(Color.white);
        update.setForeground(Color.black);
    }//GEN-LAST:event_updateMouseExited
   
    private boolean updatemedia(){
        String requet = "update media set nbr_copy=? where id_media = '"+media+"'";
        PreparedStatement pst;
        int vcopyint=Integer.parseInt(vcopy);
        int copyint=Integer.parseInt(copytxt.getText());
    try {   
                if(copyint >= vcopyint){
                pst = con.prepareStatement(requet);
                pst.setString(1, copytxt.getText());
                pst.executeUpdate();} 
                else{
                JOptionPane.showMessageDialog(this, "Value doit etre plus grand que le value ancient");
                copytxt.setText(vcopy);
                return false;
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            } 
    return true;
    }
    public static void main(String args[]) {
        try {
            //UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updateMedia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JLabel copy;
    private javax.swing.JTextField copytxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel name;
    private javax.swing.JTextField nametxt;
    private javax.swing.JLabel type;
    private javax.swing.JTextField typetxt;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
