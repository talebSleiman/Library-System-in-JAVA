
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
import javax.swing.table.DefaultTableModel;

public class showR extends javax.swing.JFrame {
    Connection con = null;
    Statement st = null;
    ResultSet rs1 = null;
    String url = "jdbc:mysql://localhost:3306/database301";
    String usr = "root";
    String mdp = "taleb@849523.";
    public static int user;
    public String id_adh,id_m,name;

    public showR() {
        connecter();
        initComponents();
        showdata();
        this.setLocationRelativeTo(null);
    }
    
    public showR(int userid){
    this.user=userid;
    connecter();
    initComponents();
    showdata();
    this.setLocationRelativeTo(null);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        Jtable = new javax.swing.JTable();
        back = new javax.swing.JButton();
        reserver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Show E");

        Jtable.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Jtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID_ADHERANT", "ID_MEDI", "NAME"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Jtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JtableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Jtable);

        back.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        back.setText("Back");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backMouseExited(evt);
            }
        });
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        reserver.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        reserver.setText("Unreserver");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(reserver)
                .addGap(53, 53, 53)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reserver, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 7, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        dispose();
    }//GEN-LAST:event_backActionPerformed

    private void backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseEntered
        back.setBackground(Color.black);
        back.setForeground(Color.white);
    }//GEN-LAST:event_backMouseEntered

    private void backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseExited
        back.setBackground(Color.white);
        back.setForeground(Color.black);
    }//GEN-LAST:event_backMouseExited
    
    private void refreche(){
        DefaultTableModel mod=(DefaultTableModel)Jtable.getModel();
        mod.setRowCount(0);
        showdata(); 
    }
    
    private void reserverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reserverActionPerformed
        DefaultTableModel mod=(DefaultTableModel)Jtable.getModel();
        if(Jtable.getSelectedRowCount()==1){
            int id1=Integer.parseInt(id_adh);
            int id2=Integer.parseInt(id_m);
            int nbr;
            String req1="delete from reserver where id_adherant=? and id_media=?";
            String req2="update media set nbr_copy=? where id_media='"+id2+"'";
            String req3="select nbr_copy from media where id_media='"+id2+"'";
            PreparedStatement pst1=null,pst2=null;
            Statement st1=null;
            try {
                st1=con.createStatement();
                pst1 = con.prepareStatement(req1);
                pst2 = con.prepareStatement(req2);
                pst1.setInt(1,id1);
                pst1.setInt(2,id2);
                pst1.executeUpdate();
                rs1 = st1.executeQuery(req3); 
                rs1.next();
                nbr=rs1.getInt(1);
                pst2.setInt(1,nbr+1); 
                pst2.executeUpdate();
                mod.removeRow(Jtable.getSelectedRow());
            } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            }       
        }else{
            if(Jtable.getSelectedRowCount()==0){ 
                JOptionPane.showMessageDialog(this, "Choose a row");
            }
            else{
                JOptionPane.showMessageDialog(this, "Choose one row");}
        }
        refreche();
    }//GEN-LAST:event_reserverActionPerformed

    private void reserverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reserverMouseEntered
        reserver.setBackground(Color.black);
        reserver.setForeground(Color.white);
    }//GEN-LAST:event_reserverMouseEntered

    private void reserverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reserverMouseExited
        reserver.setBackground(Color.white);
        reserver.setForeground(Color.black);
    }//GEN-LAST:event_reserverMouseExited

    private void JtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JtableMouseClicked
        DefaultTableModel mod=(DefaultTableModel)Jtable.getModel();
        id_adh=mod.getValueAt(Jtable.getSelectedRow(),0).toString();
        id_m=mod.getValueAt(Jtable.getSelectedRow(),1).toString();
        name=mod.getValueAt(Jtable.getSelectedRow(),2).toString();
    }//GEN-LAST:event_JtableMouseClicked
    private void showdata(){
    String req="select R.id_adherant,R.id_media,M.name from reserver as R, media as M where R.id_media=M.id_media and R.id_adherant='"+user+"'";
    
        try {
           Statement st1=con.createStatement();
            rs1=st1.executeQuery(req);             
            while(rs1.next()){
                String id1=rs1.getString(1);
                String id2=rs1.getString(2);;
                String name=rs1.getString(3);
                String[] row={id1,id2,name};
                DefaultTableModel mod=(DefaultTableModel) Jtable.getModel();
                mod.addRow(row);
            }        
        } catch (SQLException ex) {
             System.out.println(ex.getMessage());
        }
    }
    
    public static void main(String args[]) {
        try {
           // UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new showR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Jtable;
    private javax.swing.JButton back;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton reserver;
    // End of variables declaration//GEN-END:variables
}
