/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author Chinmay
 */
public class Payment extends javax.swing.JFrame {

    /**
     * Creates new form Payment
     */
    public Payment() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        debitrb = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        maillbl = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        namelbl = new javax.swing.JLabel();
        citylbl = new javax.swing.JLabel();
        amtlbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Payment Mode", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel1.setOpaque(false);

        debitrb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        debitrb.setText("Debit/Card");
        debitrb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        debitrb.setOpaque(false);

        jRadioButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton3.setText("Net Banking");
        jRadioButton3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton3.setOpaque(false);

        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton1.setText("Cash");
        jRadioButton1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton1.setOpaque(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(debitrb)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton1)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton3))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(debitrb)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, 50));

        jLabel4.setFont(new java.awt.Font("Poor Richard", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 0));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("PAY & ENJOY");
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, -1, -1));

        maillbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        maillbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        maillbl.setText("Mail ID");
        getContentPane().add(maillbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 150, 220, 25));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Thank You For Choosing Us!");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 21, 588, 25));

        id.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        id.setText("User ID:");
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 68, 220, 25));

        namelbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        namelbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        namelbl.setText("Name");
        getContentPane().add(namelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 66, 220, 25));

        citylbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        citylbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        citylbl.setText("City");
        getContentPane().add(citylbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 107, 220, 25));

        amtlbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        amtlbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        amtlbl.setText("City");
        getContentPane().add(amtlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 107, 220, 25));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project/billing.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 330));

        jMenu6.setText("<");
        jMenu6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu6MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu6);

        jMenu4.setText("Home");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        jMenu1.setText("About Us");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Adventures");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Bookings");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        jMenu5.setText("Login");
        jMenu5.addMenuKeyListener(new javax.swing.event.MenuKeyListener() {
            public void menuKeyPressed(javax.swing.event.MenuKeyEvent evt) {
                jMenu5MenuKeyPressed(evt);
            }
            public void menuKeyReleased(javax.swing.event.MenuKeyEvent evt) {
            }
            public void menuKeyTyped(javax.swing.event.MenuKeyEvent evt) {
            }
        });
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu5);

        jMenu7.setText("Offers");
        jMenu7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu7MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu7);

        jMenu8.setText("Combo Packages");
        jMenu8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu8MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu6MouseClicked
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu6MouseClicked

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        // TODO add your handling code here:
        new Welcome().setVisible(true);
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        //new Adventure().setVisible(true); // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        // TODO add your handling code here:
        new booking1().setVisible(true);
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenu5MenuKeyPressed(javax.swing.event.MenuKeyEvent evt) {//GEN-FIRST:event_jMenu5MenuKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu5MenuKeyPressed

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        new Login().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jMenu5MouseClicked

    private void jMenu7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu7MouseClicked
        // TODO add your handling code h0re:
        new Offers().setVisible(true);
    }//GEN-LAST:event_jMenu7MouseClicked

    private void jMenu8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu8MouseClicked
        // TODO add your handling code here:
        new Combo().setVisible(true);
    }//GEN-LAST:event_jMenu8MouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        try{
            Class.forName("java.sql.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/project","chinmay","chinmay99");
            Statement stmt=con.createStatement();
            String query="select username from userlogin;";
            ResultSet rs=stmt.executeQuery(query);
            if(rs.last()){
                id.setText(rs.getString("username"));
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"EORROR");
        }
        String user=id.getText();
        try{
            Class.forName("java.sql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","chinmay","chinmay99");
            Statement stmt=con.createStatement();
            String query="select * from userinfo where userid='"+user+"';";
            ResultSet rs=stmt.executeQuery(query);
            while(rs.next()){
                namelbl.setText("Name: "+rs.getString(1)+" "+rs.getString(2));
                maillbl.setText("Mail ID: "+rs.getString(4));
                citylbl.setText("City: "+rs.getString(3));
                amtlbl.setText("Amount Payable: "+rs.getInt(7));
                }
            rs.close();stmt.close();con.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error");
        }
        debitrb.setSelected(true);

    }//GEN-LAST:event_formWindowActivated

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"You Have Successfully Booked Your Ticket!");
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Payment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amtlbl;
    private javax.swing.JLabel citylbl;
    private javax.swing.JRadioButton debitrb;
    private javax.swing.JLabel id;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JLabel maillbl;
    private javax.swing.JLabel namelbl;
    // End of variables declaration//GEN-END:variables
}
