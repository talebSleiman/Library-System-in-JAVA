
package projet301;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class showE extends javax.swing.JFrame {
    Connection con = null;
    Statement st = null;
    ResultSet rs1 = null;
    String url = "jdbc:mysql://localhost:3306/database301";
    String usr = "root";
    String mdp = "taleb@849523.";
    public static int user;


    public showE() {
        connecter();
        initComponents();
        showdata();
        this.setLocationRelativeTo(null);
    }
    
    public showE(int userid){
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Show E");

        Jtable.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Jtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID_ADHERANT", "ID_MEDI", "DATE_EMPRUNTER", "DATE_RETOURN"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    private void showdata(){
    String req="select E.id_adherant,E.id_media,E.date_emprunter,E.date_retourn,M.name from emprunter as E, media as M where E.id_media=M.id_media and E.id_adherant='"+user+"'";
    
        try {
           Statement st1=con.createStatement();
            rs1=st1.executeQuery(req);             
            while(rs1.next()){
                String id1=rs1.getString(1);
                String id2=rs1.getString(2);;
                String dateEmp=rs1.getDate(3).toString();
                String dateRet=rs1.getDate(4).toString();
                String name=rs1.getString(5);
                String[] row={id1,id2,dateEmp,dateRet};
                DefaultTableModel mod=(DefaultTableModel) Jtable.getModel();
                mod.addRow(row);
                LocalDate date =  LocalDate.now();
                if(String.valueOf(date).equals(dateRet)){
                JOptionPane.showMessageDialog(this, name+" doit etre retourne");
                }
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
                new showE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Jtable;
    private javax.swing.JButton back;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
