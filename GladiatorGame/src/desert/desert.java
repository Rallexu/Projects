/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package desert;

import desertCity.desertCity;

import attack_system.monsters;

import static attack_system.unlockLevel.unlockDungeons;

import potwor.Persian;


import potwor.Potwor;
import potwor.Sphinx;
import potwor.bodyGuardDesert;
import potwor.bossAnubis;


/**
 *
 * @author allan
 */
public class desert extends javax.swing.JFrame {

    /** Creates new form lochy */
    public desert() {
        initComponents();
  
    }
public static Potwor Anubis = new bossAnubis();
public static Potwor bodyguardAnubis = new bodyGuardDesert();
public static Potwor sphinxDesert = new Sphinx();
public static Potwor pers = new Persian();
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        persianAttack = new javax.swing.JButton();
        SphinxAttack = new javax.swing.JButton();
        city = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        desertBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        persianAttack.setBackground(new java.awt.Color(182, 153, 111));
        persianAttack.setFont(new java.awt.Font("Papyrus", 0, 13)); // NOI18N
        persianAttack.setText("Persowie");
        persianAttack.setBorder(null);
        persianAttack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                persianAttackActionPerformed(evt);
            }
        });
        getContentPane().add(persianAttack, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 440, 90, -1));

        SphinxAttack.setBackground(new java.awt.Color(182, 153, 111));
        SphinxAttack.setFont(new java.awt.Font("Papyrus", 0, 13)); // NOI18N
        SphinxAttack.setText("Sphinx");
        SphinxAttack.setBorder(null);
        SphinxAttack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SphinxAttackActionPerformed(evt);
            }
        });
        getContentPane().add(SphinxAttack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 90, -1));

        city.setBackground(new java.awt.Color(182, 153, 111));
        city.setFont(new java.awt.Font("Papyrus", 0, 13)); // NOI18N
        city.setText("Miasto");
        city.setBorder(null);
        city.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityActionPerformed(evt);
            }
        });
        getContentPane().add(city, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 270, 90, -1));

        Back.setBackground(new java.awt.Color(182, 153, 111));
        Back.setFont(new java.awt.Font("Papyrus", 0, 13)); // NOI18N
        Back.setText("Wróć");
        Back.setBorder(null);
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        getContentPane().add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 460, 90, -1));

        desertBackground.setIcon(new javax.swing.ImageIcon("/Users/allan/Desktop/gallery_photos_game/pustynia_tlo.jpeg")); // NOI18N
        getContentPane().add(desertBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 490));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void persianAttackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_persianAttackActionPerformed
      if(unlockDungeons>0){ new persianAttack().setVisible(true);}
    }//GEN-LAST:event_persianAttackActionPerformed

    private void SphinxAttackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SphinxAttackActionPerformed
   new sphinxAttack().setVisible(true);
    }//GEN-LAST:event_SphinxAttackActionPerformed

    private void cityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityActionPerformed
if(unlockDungeons>1){this.setVisible(false);
   new desertCity().setVisible(true);
}
    }//GEN-LAST:event_cityActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
          new monsters().setVisible(true);
        this.setVisible(false);
    
    }//GEN-LAST:event_BackActionPerformed

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
            java.util.logging.Logger.getLogger(desert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(desert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(desert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(desert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new desert().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton SphinxAttack;
    private javax.swing.JButton city;
    private javax.swing.JLabel desertBackground;
    private javax.swing.JButton persianAttack;
    // End of variables declaration//GEN-END:variables

}