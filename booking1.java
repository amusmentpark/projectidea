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
public class booking1 extends javax.swing.JFrame {

    /**
     * Creates new form booking1
     */
    public booking1() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        rbmoving = new javax.swing.JRadioButton();
        rbrush = new javax.swing.JRadioButton();
        rbplay = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        combo = new javax.swing.JComboBox<String>();
        jLabel3 = new javax.swing.JLabel();
        minorlbl = new javax.swing.JLabel();
        majorlbl = new javax.swing.JLabel();
        srlbl = new javax.swing.JLabel();
        minortxt = new javax.swing.JTextField();
        majortxt = new javax.swing.JTextField();
        srtxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        pack = new javax.swing.JComboBox<String>();
        jPanel1 = new javax.swing.JPanel();
        option1 = new javax.swing.JCheckBox();
        option2 = new javax.swing.JCheckBox();
        option3 = new javax.swing.JCheckBox();
        option4 = new javax.swing.JCheckBox();
        userlb1 = new javax.swing.JLabel();
        userlb = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
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

        buttonGroup1.add(rbmoving);
        rbmoving.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        rbmoving.setForeground(new java.awt.Color(255, 255, 102));
        rbmoving.setText("Moving & Grooving ");
        rbmoving.setOpaque(false);
        rbmoving.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbmovingActionPerformed(evt);
            }
        });
        getContentPane().add(rbmoving, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 90, -1, 40));

        buttonGroup1.add(rbrush);
        rbrush.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        rbrush.setForeground(new java.awt.Color(255, 255, 102));
        rbrush.setText("Adrenaline Rush");
        rbrush.setOpaque(false);
        rbrush.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbrushActionPerformed(evt);
            }
        });
        getContentPane().add(rbrush, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 90, -1, 40));

        buttonGroup1.add(rbplay);
        rbplay.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        rbplay.setForeground(new java.awt.Color(255, 255, 102));
        rbplay.setText("Young Play");
        rbplay.setOpaque(false);
        rbplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbplayActionPerformed(evt);
            }
        });
        getContentPane().add(rbplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, -1, 40));

        jButton2.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(102, 102, 0));
        jButton2.setText("Add to cart");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(0, 204, 204), new java.awt.Color(0, 204, 204)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 370, 160, 50));

        combo.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Any One", "Family Combo", "College Days", "Stop Waiting" }));
        combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboActionPerformed(evt);
            }
        });
        getContentPane().add(combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 170, 50));

        jLabel3.setFont(new java.awt.Font("Ebrima", 1, 16)); // NOI18N
        jLabel3.setText("Choose Package Type");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 190, 30));

        minorlbl.setFont(new java.awt.Font("Poor Richard", 1, 14)); // NOI18N
        minorlbl.setForeground(new java.awt.Color(255, 255, 255));
        minorlbl.setText("Number Of Members (below 15)");
        getContentPane().add(minorlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, -1, 30));

        majorlbl.setFont(new java.awt.Font("Poor Richard", 1, 14)); // NOI18N
        majorlbl.setForeground(new java.awt.Color(255, 255, 255));
        majorlbl.setText("Number Of Members (Above 18 Below 50)");
        getContentPane().add(majorlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, -1, 30));

        srlbl.setFont(new java.awt.Font("Poor Richard", 1, 14)); // NOI18N
        srlbl.setForeground(new java.awt.Color(255, 255, 255));
        srlbl.setText("Number Of Members (Above 50)");
        getContentPane().add(srlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, -1, 30));

        minortxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minortxtActionPerformed(evt);
            }
        });
        getContentPane().add(minortxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 290, 60, -1));
        getContentPane().add(majortxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 320, 60, -1));

        srtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                srtxtActionPerformed(evt);
            }
        });
        getContentPane().add(srtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 350, 60, -1));

        jLabel6.setFont(new java.awt.Font("Ebrima", 1, 16)); // NOI18N
        jLabel6.setText("Select A Combo Plan");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        pack.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        pack.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Any One", "Customised Package", "Combo Packages" }));
        pack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                packActionPerformed(evt);
            }
        });
        getContentPane().add(pack, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 170, 50));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Select An Option", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Berlin Sans FB", 0, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setOpaque(false);

        option1.setFont(new java.awt.Font("Poor Richard", 0, 18)); // NOI18N
        option1.setOpaque(false);
        jPanel1.add(option1);

        option2.setFont(new java.awt.Font("Poor Richard", 0, 18)); // NOI18N
        option2.setOpaque(false);
        jPanel1.add(option2);

        option3.setFont(new java.awt.Font("Poor Richard", 0, 18)); // NOI18N
        option3.setOpaque(false);
        jPanel1.add(option3);

        option4.setFont(new java.awt.Font("Poor Richard", 0, 18)); // NOI18N
        option4.setOpaque(false);
        jPanel1.add(option4);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 460, 140));

        userlb1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(userlb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 130, 20));

        userlb.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(userlb, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 70, 20));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 290, 50, 20));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 320, 50, 20));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 350, 50, 20));

        jButton1.setText("+");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 350, -1, -1));

        jButton3.setText("-");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, -1, -1));

        jButton4.setText("-");
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, -1, -1));

        jButton5.setText("-");
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, -1, -1));

        jButton6.setText("+");
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 290, -1, -1));

        jButton7.setText("+");
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 320, -1, -1));

        jButton8.setText("Generate invoice");
        jButton8.setToolTipText("");
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 320, 160, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/theme.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 430));

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
    
    private void rbmovingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbmovingActionPerformed
        // TODO add your handling code here:
        option1.setText("Water Wars");
        option2.setText("Lazy Rivers");
        option3.setVisible(false);
        option4.setVisible(false);
    }//GEN-LAST:event_rbmovingActionPerformed

    private void rbrushActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbrushActionPerformed
        // TODO add your handling code here:
        option3.setVisible(true);
        option4.setVisible(true);
        option1.setText("The Trechter");
        option2.setText("Water@Speed");
        option3.setText("Xtrem");
        option4.setText("Flying Fish");
    }//GEN-LAST:event_rbrushActionPerformed

    private void rbplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbplayActionPerformed
        // TODO add your handling code here:
        option3.setVisible(true);
        option4.setVisible(true);
        option1.setSelected(true);
        option2.setSelected(true);
        option3.setSelected(true);
        option4.setSelected(true);
        option1.setText("LAF-Load Aim Fire");
        option2.setText("Pendulum_Tornedo");
        option3.setText("BumpIt Boats");
        option4.setText("Move It"); 
        minortxt.setText("1");
        majortxt.setText("1");
        srtxt.setText("1");
        //minorprice.setText("750");
        //majorprice.setText("1000");
        //srprice.setText("500");
   
    }//GEN-LAST:event_rbplayActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
//new Billing().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void minortxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minortxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_minortxtActionPerformed

    private void srtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_srtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_srtxtActionPerformed

    private void comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_comboActionPerformed

    private void packActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_packActionPerformed
        // TODO add your handling code here:
        String Pack=(String)pack.getSelectedItem();
        if(Pack.equals("Costomised Package"))
           // hide.setVisible(true);
            rbrush.setVisible(true);
            rbplay.setVisible(true);
            rbmoving.setVisible(true);
            jPanel1.setVisible(true);
            minorlbl.setVisible(true);
            majorlbl.setVisible(true);
            srlbl.setVisible(true);
            minortxt.setVisible(true);
            majortxt.setVisible(true);
            srtxt.setVisible(true);
            jLabel6.setVisible(false);
            combo.setVisible(false);
        
             if (Pack.equals("Combo Packages"))
             {     // hide.setVisible(true);
                    rbplay.setVisible(false);
                    rbrush.setVisible(false);
                    rbmoving.setVisible(false);
                    jPanel1.setVisible(false);
                    minorlbl.setVisible(false);
                    majorlbl.setVisible(false);
                    srlbl.setVisible(false);
                    minortxt.setVisible(false);
                    majortxt.setVisible(false);
                    srtxt.setVisible(false);
                    jLabel6.setVisible(true);
                    combo.setVisible(true);
             }  
            
    }//GEN-LAST:event_packActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        rbplay.setVisible(false);
        rbrush.setVisible(false);
        rbmoving.setVisible(false);
        jPanel1.setVisible(false);
        minorlbl.setVisible(false);
        majorlbl.setVisible(false);
        srlbl.setVisible(false);
        minortxt.setVisible(false);
        majortxt.setVisible(false);
        srtxt.setVisible(false);
        jLabel6.setVisible(false);
        jButton1.setVisible(false);
        jButton3.setVisible(false);jButton4.setVisible(false);jButton5.setVisible(false);jButton6.setVisible(false);jButton7.setVisible(false);
        
                combo.setVisible(false);
                jButton2.setEnabled(false);
        try{
            Class.forName("java.sql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","chinmay","chinmay99");
            Statement stmt=con.createStatement();
            String query="Select * from userlogin;";
            ResultSet rs=stmt.executeQuery(query);
            if (rs.last()){
                String userid=rs.getString("username");
                userlb1.setText("You are Logged in as:0 ");
                userlb.setText(userid);
                                              
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "error");
            System.err.println(e);
        }

        
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(booking1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(booking1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(booking1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(booking1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new booking1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
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
    private javax.swing.JLabel majorlbl;
    private javax.swing.JTextField majortxt;
    private javax.swing.JLabel minorlbl;
    private javax.swing.JTextField minortxt;
    private javax.swing.JCheckBox option1;
    private javax.swing.JCheckBox option2;
    private javax.swing.JCheckBox option3;
    private javax.swing.JCheckBox option4;
    private javax.swing.JComboBox<String> pack;
    private javax.swing.JRadioButton rbmoving;
    private javax.swing.JRadioButton rbplay;
    private javax.swing.JRadioButton rbrush;
    private javax.swing.JLabel srlbl;
    private javax.swing.JTextField srtxt;
    private javax.swing.JLabel userlb;
    private javax.swing.JLabel userlb1;
    // End of variables declaration//GEN-END:variables
}
