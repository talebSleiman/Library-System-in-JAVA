
package projet301;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.UIManager;


public class showMedia extends javax.swing.JFrame {
    public static int user,media;
    Connection con = null;
    Statement st = null;
    ResultSet rs=null;
    String url = "jdbc:mysql://localhost:3306/database301";
    String usr = "root";
    String mdp = "taleb@849523.";
    public String vname,vtype,vcopy;
    public int copynbr;

    public showMedia() {
        connecter();
        initComponents();
        this.setLocationRelativeTo(null);
    }
    public showMedia(int a,int b){
        this.user=a;
        this.media=b;
        connecter();
        initComponents();
        mediainfo(media);
        this.setLocationRelativeTo(null);
    }
    public void mediainfo(int media){
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
    copytxt.setEnabled(false);
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
        reserver = new javax.swing.JButton();
        emprunter = new javax.swing.JButton();
        cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Show Media Info");
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

        reserver.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
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

        emprunter.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
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

        cancel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(reserver)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(emprunter))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(copy, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(typetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(copytxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(31, 31, 31)
                        .addComponent(cancel)))
                .addContainerGap(36, Short.MAX_VALUE))
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
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reserver)
                    .addComponent(emprunter)
                    .addComponent(cancel))
                .addGap(0, 71, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void reserverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reserverActionPerformed
        reserver();
        dispose();
    }//GEN-LAST:event_reserverActionPerformed

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

    private void emprunterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emprunterActionPerformed
        emprunter();
        dispose();
    }//GEN-LAST:event_emprunterActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
       dispose();
    }//GEN-LAST:event_cancelActionPerformed

    private void cancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseEntered
        cancel.setBackground(Color.black);
        cancel.setForeground(Color.white);
    }//GEN-LAST:event_cancelMouseEntered

    private void cancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseExited
        cancel.setBackground(Color.white);
        cancel.setForeground(Color.black);
    }//GEN-LAST:event_cancelMouseExited
    
    public void reserver(){
    copynbr=Integer.parseInt(vcopy);
    String req="select count(*) from reserver where id_adherant='"+user+"'";
    Statement st=null;
    ResultSet rs1=null;
    try{
    st=con.createStatement();
    rs1=st.executeQuery(req);
    rs1.next();
    if(rs1.getInt(1) < 2){
    if(copynbr > 0){
    String req1 = "INSERT INTO reserver(id_adherant,id_media) VALUES(?,?)";
    String req2="update media set nbr_copy=? where id_media = '"+media+"'";
    PreparedStatement pst1;
    PreparedStatement pst2;
       
                pst1 = con.prepareStatement(req1);
                pst1.setInt(1, user);
                pst1.setInt(2,media);
                pst2=con.prepareStatement(req2);
                pst2.setInt(1,copynbr-1);
                pst1.executeUpdate(); 
                pst2.executeUpdate();
    }
    else{
        JOptionPane.showMessageDialog(this, "No copy reste now");}}
    else{  
        JOptionPane.showMessageDialog(this, "You can't reserver any media more");
    }
    }catch(SQLException ex){System.out.println(ex.getMessage());}
    }
    
    private void emprunter(){
    copynbr=Integer.parseInt(vcopy);
    String req="select count(*) from emprunter where id_adherant='"+user+"'";
    Statement st=null;
    ResultSet rs1=null;
    LocalDate date =  LocalDate.now();
    LocalDate date1 =  LocalDate.now().plusDays(3);
    try{
    st=con.createStatement();
    rs1=st.executeQuery(req);
    rs1.next();
    if(rs1.getInt(1) < 5){
    if(copynbr > 0){
    String req1 = "INSERT INTO emprunter(id_adherant,id_media,date_emprunter,date_retourn) VALUES(?,?,?,?)";
    String req2="update media set nbr_copy=? where id_media = '"+media+"'";
    PreparedStatement pst1;
    PreparedStatement pst2;
       
                pst1 = con.prepareStatement(req1);
                pst1.setInt(1,user);
                pst1.setInt(2,media);
                pst1.setDate(3,Date.valueOf(date));
                pst1.setDate(4,Date.valueOf(date1));
                pst2=con.prepareStatement(req2);
                pst2.setInt(1,copynbr-1);
                pst1.executeUpdate(); 
                pst2.executeUpdate();
    }
    else{
        JOptionPane.showMessageDialog(this, "No copy reste now");}}
    else{  
        JOptionPane.showMessageDialog(this, "You can't emprunter any media more");
    }
    }catch(SQLException ex){System.out.println(ex.getMessage());}
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
                new showMedia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JLabel copy;
    private javax.swing.JTextField copytxt;
    private javax.swing.JButton emprunter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel name;
    private javax.swing.JTextField nametxt;
    private javax.swing.JButton reserver;
    private javax.swing.JLabel type;
    private javax.swing.JTextField typetxt;
    // End of variables declaration//GEN-END:variables
}
