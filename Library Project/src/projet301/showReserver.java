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

public class showReserver extends javax.swing.JFrame {

    Connection con = null;
    Statement st = null;
    String url = "jdbc:mysql://localhost:3306/database301";
    String usr = "root";
    String mdp = "password";

    public showReserver() {
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
        jLabel1 = new javax.swing.JLabel();
        Id_adh = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        firsttxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lasttxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Id_m = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        nametxt = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        refrech = new javax.swing.JButton();
        cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reserver Table");

        Jtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID_ADHERANT", "ID_MEDIA", "NAME", "FIRST_NAME", "LAST_NAME"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Id_Adherant:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("First Name:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Last Name:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Id_Media:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Name:");

        back.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        back.setText("Turn It Back");
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

        refrech.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        refrech.setText("Refrech");
        refrech.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                refrechMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                refrechMouseExited(evt);
            }
        });
        refrech.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refrechActionPerformed(evt);
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
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lasttxt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(back))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Id_adh, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firsttxt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Id_m, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(refrech)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(cancel)
                        .addGap(32, 32, 32))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Id_adh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(Id_m, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(firsttxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lasttxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(refrech, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JtableMouseClicked
        DefaultTableModel mod = (DefaultTableModel) Jtable.getModel();
        String id_adh = mod.getValueAt(Jtable.getSelectedRow(), 0).toString();
        String id_m = mod.getValueAt(Jtable.getSelectedRow(), 1).toString();
        String name = mod.getValueAt(Jtable.getSelectedRow(), 2).toString();
        String firstname = mod.getValueAt(Jtable.getSelectedRow(), 3).toString();
        String lastname = mod.getValueAt(Jtable.getSelectedRow(), 4).toString();
        Id_adh.setText(id_adh);
        Id_m.setText(id_m);
        nametxt.setText(name);
        firsttxt.setText(firstname);
        lasttxt.setText(lastname);
        Id_adh.setEditable(false);
        Id_m.setEditable(false);
        nametxt.setEditable(false);
        firsttxt.setEditable(false);
        lasttxt.setEditable(false);
    }//GEN-LAST:event_JtableMouseClicked

    private void refrechActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refrechActionPerformed
        refreche();
    }//GEN-LAST:event_refrechActionPerformed

    private void refreche() {
        DefaultTableModel mod = (DefaultTableModel) Jtable.getModel();
        mod.setRowCount(0);
        showdata();
        clear();
    }


    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        DefaultTableModel mod = (DefaultTableModel) Jtable.getModel();
        if (Jtable.getSelectedRowCount() == 1) {
            int id1 = Integer.parseInt(Id_adh.getText());
            int id2 = Integer.parseInt(Id_m.getText());
            int nbr;
            String req1 = "delete from reserver where id_adherant=? and id_media=?";
            String req2 = "update media set nbr_copy=? where id_media='" + id2 + "'";
            String req3 = "select nbr_copy from media where id_media='" + id2 + "'";
            PreparedStatement pst1, pst2;
            Statement st1 = null;
            ResultSet rs1 = null;
            ResultSet rs2 = null;
            try {
                st1 = con.createStatement();
                rs1 = st1.executeQuery(req3);
                rs1.next();
                nbr = rs1.getInt(1);
                pst1 = con.prepareStatement(req1);
                pst1.setInt(1, id1);
                pst1.setInt(2, id2);
                pst1.executeUpdate();
                pst2 = con.prepareStatement(req2);
                pst2.setInt(1, nbr + 1);
                pst2.executeUpdate();
                mod.removeRow(Jtable.getSelectedRow());
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            if (Jtable.getSelectedRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Choose a row");
            } else {
                JOptionPane.showMessageDialog(this, "Choose one row");
            }
        }
        refreche();
    }//GEN-LAST:event_backActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        dispose();
    }//GEN-LAST:event_cancelActionPerformed

    private void backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseEntered
        back.setBackground(Color.black);
        back.setForeground(Color.white);
    }//GEN-LAST:event_backMouseEntered

    private void backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseExited
        back.setBackground(Color.white);
        back.setForeground(Color.black);
    }//GEN-LAST:event_backMouseExited

    private void refrechMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refrechMouseEntered
        refrech.setBackground(Color.black);
        refrech.setForeground(Color.white);
    }//GEN-LAST:event_refrechMouseEntered

    private void refrechMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refrechMouseExited
        refrech.setBackground(Color.white);
        refrech.setForeground(Color.black);
    }//GEN-LAST:event_refrechMouseExited

    private void cancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseEntered
        cancel.setBackground(Color.black);
        cancel.setForeground(Color.white);
    }//GEN-LAST:event_cancelMouseEntered

    private void cancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseExited
        cancel.setBackground(Color.white);
        cancel.setForeground(Color.black);
    }//GEN-LAST:event_cancelMouseExited
    public void clear() {
        Id_adh.setText("");
        Id_m.setText("");
        nametxt.setText("");
        firsttxt.setText("");
        lasttxt.setText("");
    }

    private void showdata() {
        String req = "select R.id_adherant,R.id_media,M.name,A.first_name,A.last_name from adherant as A,media as M,reserver as R where R.id_adherant=A.id_adherant and R.id_media=M.id_media ";
        ResultSet rs1 = null;
        try {
            Statement st1 = con.createStatement();
            rs1 = st1.executeQuery(req);
            while (rs1.next()) {
                String id1 = rs1.getString(1);
                String id2 = rs1.getString(2);
                String name = rs1.getString(3);
                String firstname = rs1.getString(4);
                String lastname = rs1.getString(5);
                String[] row = {id1, id2, name, firstname, lastname};
                DefaultTableModel mod = (DefaultTableModel) Jtable.getModel();
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
                new showReserver().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Id_adh;
    private javax.swing.JTextField Id_m;
    private javax.swing.JTable Jtable;
    private javax.swing.JButton back;
    private javax.swing.JButton cancel;
    private javax.swing.JTextField firsttxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lasttxt;
    private javax.swing.JTextField nametxt;
    private javax.swing.JButton refrech;
    // End of variables declaration//GEN-END:variables
}
