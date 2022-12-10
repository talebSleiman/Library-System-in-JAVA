package projet301;

import com.formdev.flatlaf.FlatLightLaf;
import java.sql.Connection;
import java.awt.Color;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class SubmitFormP extends javax.swing.JFrame {

    Connection con = null;
    Statement st = null;
    ResultSet rs = null;
    ResultSet rs1 = null;
    ResultSet rs2 = null;
    String url = "jdbc:mysql://localhost:3306/database301";
    String usr = "root";
    String mdp = "password";
    String select = "SELECT * FROM personnel";
    int newID;

    public SubmitFormP() {
        connecter();
        initComponents();
        this.setLocationRelativeTo(null);
    }

    private void connecter() {
        try {
            con = DriverManager.getConnection(url, usr, mdp);
            st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs = st.executeQuery(select);
            rs.last();
            newID = rs.getInt(1) + 1;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        firstname = new javax.swing.JLabel();
        firsttext = new javax.swing.JTextField();
        lastname = new javax.swing.JLabel();
        lasttext = new javax.swing.JTextField();
        email = new javax.swing.JLabel();
        emailtext = new javax.swing.JTextField();
        psswrd = new javax.swing.JLabel();
        confirm = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        psswrdtext = new javax.swing.JPasswordField();
        confirmtext = new javax.swing.JPasswordField();
        gender = new javax.swing.JLabel();
        gendertxt = new javax.swing.JComboBox<>();
        address = new javax.swing.JLabel();
        addresstxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Submit Form Personnel");
        setLocation(new java.awt.Point(300, 300));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Submit Register");

        firstname.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        firstname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        firstname.setText("First Name:");

        firsttext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                firsttextMouseClicked(evt);
            }
        });

        lastname.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lastname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lastname.setText("Last Name:");

        lasttext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lasttextMouseClicked(evt);
            }
        });

        email.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        email.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        email.setText("UserName or Email:");

        emailtext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emailtextMouseClicked(evt);
            }
        });

        psswrd.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        psswrd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        psswrd.setText("Password:");

        confirm.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        confirm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        confirm.setText("Confirm Password:");

        submit.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        submit.setText("Submit");
        submit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                submitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                submitMouseExited(evt);
            }
        });
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        reset.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        reset.setText("Reset");
        reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                resetMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                resetMouseExited(evt);
            }
        });
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
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

        psswrdtext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                psswrdtextMouseClicked(evt);
            }
        });

        confirmtext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmtextMouseClicked(evt);
            }
        });

        gender.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        gender.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gender.setText("Gender:");

        gendertxt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        gendertxt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));

        address.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        address.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        address.setText("Address:");

        addresstxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addresstxtMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(psswrd)
                                .addGap(18, 18, 18)
                                .addComponent(psswrdtext, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(confirm)
                                .addGap(18, 18, 18)
                                .addComponent(confirmtext, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(42, 42, 42)
                                    .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(email)
                                    .addGap(18, 18, 18)
                                    .addComponent(emailtext))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(firstname)
                                    .addGap(18, 18, 18)
                                    .addComponent(firsttext, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(23, 23, 23)
                                    .addComponent(lastname)
                                    .addGap(18, 18, 18)
                                    .addComponent(lasttext, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(gender)
                                .addGap(44, 44, 44)
                                .addComponent(gendertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(address)
                                .addGap(18, 18, 18)
                                .addComponent(addresstxt, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firsttext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lasttext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(psswrd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(psswrdtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gendertxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addresstxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        dispose();
    }//GEN-LAST:event_cancelActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        Clear();
    }//GEN-LAST:event_resetActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        if (fullcheck() == true) {
            add();
            Clear();
        }
    }//GEN-LAST:event_submitActionPerformed


    private void submitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitMouseEntered
        submit.setBackground(Color.black);
        submit.setForeground(Color.white);
    }//GEN-LAST:event_submitMouseEntered

    private void resetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetMouseEntered
        reset.setBackground(Color.black);
        reset.setForeground(Color.white);
    }//GEN-LAST:event_resetMouseEntered

    private void cancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseEntered
        cancel.setBackground(Color.black);
        cancel.setForeground(Color.white);
    }//GEN-LAST:event_cancelMouseEntered

    private void submitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitMouseExited
        submit.setBackground(Color.white);
        submit.setForeground(Color.black);
    }//GEN-LAST:event_submitMouseExited

    private void resetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetMouseExited
        reset.setBackground(Color.white);
        reset.setForeground(Color.black);
    }//GEN-LAST:event_resetMouseExited

    private void cancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseExited
        cancel.setBackground(Color.white);
        cancel.setForeground(Color.black);
    }//GEN-LAST:event_cancelMouseExited

    private void firsttextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_firsttextMouseClicked
        firsttext.setBackground(Color.white);
    }//GEN-LAST:event_firsttextMouseClicked

    private void lasttextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lasttextMouseClicked
        lasttext.setBackground(Color.white);
    }//GEN-LAST:event_lasttextMouseClicked

    private void emailtextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailtextMouseClicked
        emailtext.setBackground(Color.white);
    }//GEN-LAST:event_emailtextMouseClicked

    private void psswrdtextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_psswrdtextMouseClicked
        psswrdtext.setBackground(Color.white);
    }//GEN-LAST:event_psswrdtextMouseClicked

    private void confirmtextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmtextMouseClicked
        confirmtext.setBackground(Color.white);
    }//GEN-LAST:event_confirmtextMouseClicked

    private void addresstxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addresstxtMouseClicked
        addresstxt.setBackground(Color.white);
    }//GEN-LAST:event_addresstxtMouseClicked

    private void add() {
        String requet = "INSERT INTO personnel(id_personnel,first_name,last_name,email,password,gender,address) VALUES(?,?,?,?,?,?,?)";
        PreparedStatement pst;
        try {
            pst = con.prepareStatement(requet);
            pst.setInt(1, newID);
            pst.setString(2, firsttext.getText());
            pst.setString(3, lasttext.getText());
            pst.setString(4, emailtext.getText());
            pst.setString(5, psswrdtext.getText());
            pst.setString(6, gendertxt.getSelectedItem().toString());
            pst.setString(7, addresstxt.getText());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private void Clear() {
        firsttext.setText("");
        lasttext.setText("");
        emailtext.setText("");
        psswrdtext.setText("");
        confirmtext.setText("");
        addresstxt.setText("");
        gendertxt.setSelectedIndex(0);
        firsttext.setBackground(Color.white);
        lasttext.setBackground(Color.white);
        emailtext.setBackground(Color.white);
        psswrdtext.setBackground(Color.white);
        confirmtext.setBackground(Color.white);
        addresstxt.setBackground(Color.white);
    }

    private boolean fullcheck() {
        int count = 0;
        String email = emailtext.getText();
        String requet = "select email from adherant where email ='" + email + "'";
        String requet1 = "select email from personnel where email='" + email + "'";
        String p1 = psswrdtext.getText();
        String p2 = confirmtext.getText();
        try {
            Statement st = con.createStatement();
            Statement st1 = con.createStatement();
            rs1 = st.executeQuery(requet);
            rs2 = st1.executeQuery(requet1);
            if (rs1.next() || rs2.next() || email.equals("")) {
                JOptionPane.showMessageDialog(this, "Username is existe");
                emailtext.setText("");
                emailtext.setBackground(Color.red);
            } else {
                emailtext.setBackground(Color.green);
                count++;
            }
            if (firsttext.getText().equals("")) {
                firsttext.setBackground(Color.red);
                firsttext.setText("");
                JOptionPane.showMessageDialog(this, "First name is missing");
            } else {
                firsttext.setBackground(Color.green);
                count++;
            }
            if (lasttext.getText().equals("")) {
                lasttext.setBackground(Color.red);
                lasttext.setText("");
                JOptionPane.showMessageDialog(this, "Last name is missing");
            } else {
                lasttext.setBackground(Color.green);
                count++;
            }
            if (addresstxt.getText().equals("")) {
                addresstxt.setBackground(Color.red);
                addresstxt.setText("");
                JOptionPane.showMessageDialog(this, "Address is missing");
            } else {
                addresstxt.setBackground(Color.green);
                count++;
            }
            if (!p1.equals(p2) || p1.equals("") || p2.equals("")) {
                JOptionPane.showMessageDialog(this, "Not the same Password");
                psswrdtext.setText("");
                psswrdtext.setBackground(Color.red);
                confirmtext.setText("");
                confirmtext.setBackground(Color.red);
            } else {
                confirmtext.setBackground(Color.green);
                psswrdtext.setBackground(Color.green);
                count++;
            }
            if (count == 5) {
                return true;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return false;
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
                new SubmitFormP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel address;
    private javax.swing.JTextField addresstxt;
    private javax.swing.JButton cancel;
    private javax.swing.JLabel confirm;
    private javax.swing.JPasswordField confirmtext;
    private javax.swing.JLabel email;
    private javax.swing.JTextField emailtext;
    private javax.swing.JLabel firstname;
    private javax.swing.JTextField firsttext;
    private javax.swing.JLabel gender;
    private javax.swing.JComboBox<String> gendertxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lastname;
    private javax.swing.JTextField lasttext;
    private javax.swing.JLabel psswrd;
    private javax.swing.JPasswordField psswrdtext;
    private javax.swing.JButton reset;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
